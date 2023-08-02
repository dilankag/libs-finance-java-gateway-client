package lk.pickme.gateway.client.utils;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

/**
 *
 * @author Dilanka Gamage
 */

public interface IJsonHelper {

    public static final String[] DESERIALIZE_DATE_FORMAT = new String[]{
        "yyyy-MM-dd'T'HH:mm:ss.SSSZ",
        "yyyy-MM-dd HH:mm:ss", // Legacy code
        "yyyy-MM-dd",};
    public static final String SERIALIZE_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

    public <T> T fromJson(String json, Class<T> clazz) throws IOException;

    public String toJson(Object object) throws JsonProcessingException;
}
