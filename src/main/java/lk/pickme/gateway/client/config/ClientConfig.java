package lk.pickme.gateway.client.config;

import lk.pickme.gateway.client.utils.JsonHelper;

/**
 *
 * @author Dilanka Gamage
 */

public class ClientConfig {

    private String serviceEndpoint;
    private String proxyHost;
    private int proxyPort;
    private String hmacSecret;
    private String authToken;
    private String csrfToken;
    private boolean useSSL = false;
    private boolean useJackson = false;
    private boolean validateOnly = false;

    public String getServiceEndpoint() {
        return serviceEndpoint;
    }

    public void setServiceEndpoint(String serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public int getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }

    public String getHmacSecret() {
        return hmacSecret;
    }

    public void setHmacSecret(String hmacSecret) {
        this.hmacSecret = hmacSecret;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getCsrfToken() {
        return csrfToken;
    }

    public void setCsrfToken(String csrfToken) {
        this.csrfToken = csrfToken;
    }

    public boolean isUseSSL() {
        return useSSL;
    }

    public void setUseSSL(boolean useSSL) {
        this.useSSL = useSSL;
    }

    public boolean isUseJackson() {
        return useJackson;
    }

    public void setUseJackson(boolean useJackson) {
        this.useJackson = useJackson;
    }

    public boolean isValidateOnly() {
        return validateOnly;
    }

    public void setValidateOnly(boolean validateOnly) {
        this.validateOnly = validateOnly;
    }

    @Override
    public String toString() {
        return JsonHelper.toJson(this);
    }
}
