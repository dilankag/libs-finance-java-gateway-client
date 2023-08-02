package lk.pickme.gateway.client.ex;

/**
 *
 * @author Dilanka Gamage
 */

public class GatewayClientException extends Exception {

    public GatewayClientException() {
    }

    public GatewayClientException(String msg) {
        super(msg);
    }

    public GatewayClientException(Throwable err) {
        super(err);
    }

    public GatewayClientException(String msg, Throwable err) {
        super(msg, err);
    }

}
