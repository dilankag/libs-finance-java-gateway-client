package lk.pickme.gateway.client.validate;

import lk.pickme.gateway.client.ex.GatewayDataFormatException;
import lk.pickme.gateway.client.ex.GatewayRequiredDataException;

public interface IValidator<R> {

    void validateRequiredFields(R r) throws GatewayRequiredDataException;

    void validateDataFormat(R r) throws GatewayDataFormatException;

}
