package lk.pickme.gateway.client.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Dilanka Gamage
 */

public final class JsonHelper {

    private static Logger log = LoggerFactory.getLogger(JsonHelper.class);

    private static IJsonHelper jsonHelper = new GsonJsonHelper();

    public static void setJsonHelper(IJsonHelper jsonHelper) {
        JsonHelper.jsonHelper = jsonHelper;
    }

    public static <T> T fromJson(String json, Class<T> clazz) {
        T object = null;
        try {
            object = jsonHelper.fromJson(json, clazz);
        } catch (Exception e) {
            log.warn("Error while reading object as json:" + json, e);
        }
        return object;
    }

    public static String toJson(Object object) {
        String json = "";
        try {
            if (object != null) {
                json = jsonHelper.toJson(object);
            }
        } catch (Exception e) {
            log.warn("Error while writing to json string:", e);
        }
        return json;
    }
}
