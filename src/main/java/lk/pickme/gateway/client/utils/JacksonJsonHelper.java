package lk.pickme.gateway.client.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.IOException;
import java.util.Date;

/**
 *
 * @author Dilanka Gamage
 */

public class JacksonJsonHelper implements IJsonHelper {

    private static final ObjectMapper mapper = new ObjectMapper();

    static {
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addDeserializer(Date.class, new CustomJsonDateDeserializer());
        simpleModule.addSerializer(Date.class, new CustomJsonDateSerializer());
        mapper.registerModule(simpleModule);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public <T> T fromJson(String json, Class<T> clazz) throws IOException {
        return mapper.readValue(json, clazz);
    }

    @Override
    public String toJson(Object object) throws JsonProcessingException {
        return mapper.writeValueAsString(object);
    }

    public static <T> T fromJson(String json, JavaType type) throws IOException {
        return mapper.readValue(json, type);
    }

}
