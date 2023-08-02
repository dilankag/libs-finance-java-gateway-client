package lk.pickme.gateway.client.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Dilanka Gamage
 */

public class CustomJsonDateDeserializer extends JsonDeserializer<Date> {

    @Override
    public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {

        String strDate = jsonParser.getText();
        for (String format : IJsonHelper.DESERIALIZE_DATE_FORMAT) {
            try {
                return new SimpleDateFormat(format).parse(strDate);
            } catch (ParseException e) {
            }
        }
        throw new IOException("Unparseable date: \"" + strDate + "\". Supported formats: "
                + Arrays.toString(IJsonHelper.DESERIALIZE_DATE_FORMAT));

    }
}
