package lk.pickme.gateway.client.utils;

import lk.pickme.gateway.client.config.ClientConfig;
import lk.pickme.gateway.client.component.RequestHeader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;

import java.util.List;
import java.util.ArrayList;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;

import java.security.NoSuchAlgorithmException;
import java.security.KeyManagementException;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Dilanka Gamage
 */

public final class RestClient {

    private static final Logger LOG = LoggerFactory.getLogger(RestClient.class);

    public static String sendRequest(ClientConfig config, String request, RequestHeader requestHeader) throws IOException, NoSuchAlgorithmException, KeyManagementException {
        LOG.info("Request header:" + requestHeader.toString());
        LOG.info("Raw request:" + request);
        URL url = new URL(config.getServiceEndpoint());
        HttpURLConnection httpConn;
        if (config.getProxyHost() != null) {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(config.getProxyHost(), config.getProxyPort()));
            httpConn = (HttpsURLConnection) url.openConnection(proxy);
        } else if (config.isUseSSL()) {
            HttpsURLConnection httpsConn = (HttpsURLConnection) url.openConnection();
            // applies a custom socket-factory suite to the JVM
            httpsConn.setSSLSocketFactory(buildCustomSSLSocketFactory());
            httpConn = httpsConn;
        } else {
            httpConn = (HttpURLConnection) url.openConnection();
        }
        httpConn.setDoOutput(true);
        httpConn.setRequestMethod("POST");
        httpConn.setRequestProperty("Content-Type", "application/json");
        httpConn.setRequestProperty("HMAC", requestHeader.getHMAC());
        OutputStream os = httpConn.getOutputStream();
        os.write(request.getBytes());
        os.flush();
        String responseMessage;
        try {
            if (httpConn.getResponseCode() != HttpsURLConnection.HTTP_OK) {
                if (httpConn.getResponseCode() == HttpsURLConnection.HTTP_FORBIDDEN) {
                    LOG.info("Raw response: access denied");
                    responseMessage = buildAccessDeniedResponse();
                } else {
                    throw new RuntimeException("Failed : HTTP error code : " + httpConn.getResponseCode());
                }
            } else {
                responseMessage = processResponse(httpConn.getInputStream());
            }
        } finally {
            httpConn.disconnect();
        }
        LOG.info("Raw response:" + responseMessage);
        return responseMessage;
    }

    private static String processResponse(InputStream ios) throws IOException {
        StringBuilder responseMessage = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader((ios)));
        String output;
        while ((output = br.readLine()) != null) {
            responseMessage.append(output);
        }
        return responseMessage.toString();
    }

    private static String buildAccessDeniedResponse() {
        return "{\"error\" : {\"code\" : \"SE\", \"text\" : \"ACCESS-DENIED\"}}";
    }

    private static SSLSocketFactory buildCustomSSLSocketFactory() throws NoSuchAlgorithmException, KeyManagementException {
        // create an SSL-context that uses TLS
        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, null, null);
        // call supportive SSL-parameters
        SSLParameters sslParameters = sslContext.getSupportedSSLParameters();
        final List<String> enabledCiphersList = new ArrayList<String>();
        // drop excluded cipher-suites from default cipher-suites
        final String[] excludedCipherSuites = buildExcludedCipherSuites();
        for (String defaultCipher : sslParameters.getCipherSuites()) {
            boolean exclude = false;
            for (String excludedCipher : excludedCipherSuites) {
                if (defaultCipher.contains(excludedCipher)) {
                    exclude = true;
                    break;
                }
            }
            if (!exclude) {
                enabledCiphersList.add(defaultCipher);
            }
        }
        // convert enabled cipher-suites to an array
        final String[] enabledCiphersArray = new String[enabledCiphersList.size()];
        enabledCiphersList.toArray(enabledCiphersArray);
        // build a custom SSL socket-factory based on the SSL-context
        SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();
        sslSocketFactory = new CustomSSLSocketFactory(sslSocketFactory, enabledCiphersArray);
        return sslSocketFactory;
    }

    private static String[] buildExcludedCipherSuites() {
        // call running JVM version
        final String JVM = System.getProperty("java.runtime.version");
        /**
         * below cipher-suites are NOT supported by Oracle JVM6 and below versions
         * 
         * For more info, visit https://bugzilla.redhat.com/show_bug.cgi?id=CVE-2015-4000
        */
        if (JVM.startsWith("1.5") || JVM.contains("1.5") || JVM.startsWith("1.6") || JVM.contains("1.6")) {
            return new String[]{"_DHE_", "_DH_"};
        }
        return new String[]{};
    }

    /**
     * Class `CustomSSLSocketFactory` alters the default state of class
     * `SSLSocketFactory`. It ensures that only the supportive cipher-suites are
     * applied to the given SSL-context.
     *
     * The property `sslSocketFactory` holds the given SSL-context, and the
     * property `enabledCiphers` holds all supportive cipher-suites for the
     * SSL-context.
     */
    
    private static class CustomSSLSocketFactory extends SSLSocketFactory {

        private final SSLSocketFactory sslSocketFactory;
        private final String[] enabledCiphers;

        private CustomSSLSocketFactory(SSLSocketFactory sslSocketFactory, String[] enabledCiphers) {
            super();
            this.sslSocketFactory = sslSocketFactory;
            this.enabledCiphers = enabledCiphers;
        }

        private Socket getSocketWithEnabledCiphers(Socket socket) {
            if (enabledCiphers != null && socket != null && socket instanceof SSLSocket) {
                ((SSLSocket) socket).setEnabledCipherSuites(enabledCiphers);
            }
            return socket;
        }

        @Override
        public Socket createSocket(Socket socket, String host, int port, boolean autoClose) throws IOException {
            return getSocketWithEnabledCiphers(sslSocketFactory.createSocket(socket, host, port, autoClose));
        }

        @Override
        public String[] getDefaultCipherSuites() {
            return sslSocketFactory.getDefaultCipherSuites();
        }

        @Override
        public String[] getSupportedCipherSuites() {
            if (enabledCiphers == null) {
                return sslSocketFactory.getSupportedCipherSuites();
            } else {
                return enabledCiphers;
            }
        }

        @Override
        public Socket createSocket(String host, int port) throws IOException, UnknownHostException {
            return getSocketWithEnabledCiphers(sslSocketFactory.createSocket(host, port));
        }

        @Override
        public Socket createSocket(InetAddress address, int port) throws IOException {
            return getSocketWithEnabledCiphers(sslSocketFactory.createSocket(address, port));
        }

        @Override
        public Socket createSocket(String host, int port, InetAddress localAddress, int localPort) throws IOException, UnknownHostException {
            return getSocketWithEnabledCiphers(sslSocketFactory.createSocket(host, port, localAddress, localPort));
        }

        @Override
        public Socket createSocket(InetAddress address, int port, InetAddress localaddress, int localport) throws IOException {
            return getSocketWithEnabledCiphers(sslSocketFactory.createSocket(address, port, localaddress, localport));
        }
    }

}
