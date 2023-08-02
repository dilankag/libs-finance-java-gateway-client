package lk.pickme.gateway.client.utils;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Dilanka Gamage
 */

public class DateSerializer implements JsonDeserializer<Date>, JsonSerializer<Date> {

    @Override
    public Date deserialize(JsonElement jsonElement, Type typeOF, JsonDeserializationContext context)
            throws JsonParseException {
        return parseDate(jsonElement.getAsString());
    }

    protected Date parseDate(String date) {

        for (String format : IJsonHelper.DESERIALIZE_DATE_FORMAT) {
            try {
                return new SimpleDateFormat(format).parse(date);
            } catch (ParseException e) {
            }
        }
        throw new JsonParseException("Unparseable date: \"" + date + "\". Supported formats: "
                + Arrays.toString(IJsonHelper.DESERIALIZE_DATE_FORMAT));
    }

    @Override
    public JsonElement serialize(Date date, Type type, JsonSerializationContext jsc) {
        return new JsonPrimitive(new SimpleDateFormat(IJsonHelper.SERIALIZE_DATE_FORMAT).format(date)); //Default
    }
}
