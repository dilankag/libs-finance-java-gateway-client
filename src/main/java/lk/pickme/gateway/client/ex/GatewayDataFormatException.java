package lk.pickme.gateway.client.ex;

/**
 *
 * @author Dilanka Gamage
 */

import lk.pickme.gateway.client.component.Error;

public class GatewayDataFormatException extends GatewayClientException {

    public GatewayDataFormatException() {
    }

    public GatewayDataFormatException(String msg) {
        super(msg, new Error(null, msg));
    }

    public GatewayDataFormatException(Error err) {
        super(err.getText(), err);
    }

    public GatewayDataFormatException(String msg, Error err) {
        super(msg, err);
    }

}
