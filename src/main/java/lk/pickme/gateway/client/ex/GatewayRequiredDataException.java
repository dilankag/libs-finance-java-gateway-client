package lk.pickme.gateway.client.ex;

import lk.pickme.gateway.client.component.Error;

/**
 *
 * @author Dilanka Gamage
 */

public class GatewayRequiredDataException extends GatewayClientException {

    public GatewayRequiredDataException() {
    }

    public GatewayRequiredDataException(String msg) {
        super(msg, new Error(null, msg));
    }

    public GatewayRequiredDataException(Error err) {
        super(err.getText(), err);
    }

    public GatewayRequiredDataException(String msg, Error err) {
        super(msg, err);
    }

}
