package lk.pickme.gateway.client.utils;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import java.io.UnsupportedEncodingException;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Dilanka Gamage
 */

public final class HmacUtils {

    public static String generateHmac(final String secret, final String data)
            throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, DecoderException {
        SecretKey key = new SecretKeySpec(secret.getBytes("ISO-8859-1"), "HmacSHA256");
        Mac m = Mac.getInstance("HmacSHA256");
        m.init(key);
        m.update(data.getBytes("ISO-8859-1"));
        return new String(Hex.encodeHex(m.doFinal()));
    }
}
