package lk.pickme.gateway.client.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Date;

/**
 *
 * @author Dilanka Gamage
 */

public class GsonJsonHelper implements IJsonHelper {

    private static Gson gson;

    static {
        GsonBuilder gsonbuilder = new GsonBuilder();
        gsonbuilder.registerTypeAdapter(Date.class, new DateSerializer());
        gson = gsonbuilder.create();
    }

    public <T> T fromJson(String json, Class<T> clazz) {
        return gson.fromJson(json, clazz);
    }

    public String toJson(Object object) {
        return gson.toJson(object);
    }
}
