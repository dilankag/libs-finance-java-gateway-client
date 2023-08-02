package lk.pickme.gateway.client.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

import java.text.SimpleDateFormat;

import java.util.Date;

/**
 *
 * @author Dilanka Gamage
 */

public class CustomJsonDateSerializer extends JsonSerializer<Date> {

    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(new SimpleDateFormat(IJsonHelper.SERIALIZE_DATE_FORMAT).format(date));
    }
}
