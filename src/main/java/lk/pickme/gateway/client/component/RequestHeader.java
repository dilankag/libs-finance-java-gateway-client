package lk.pickme.gateway.client.component;

import lk.pickme.gateway.client.utils.JsonHelper;

public class RequestHeader {

    private String HMAC = "";
    private String AUTH = "";
    private String CSRF = "";

    public String getHMAC() {
        return HMAC;
    }

    public void setHMAC(String HMAC) {
        this.HMAC = HMAC;
    }

    public String getAUTH() {
        return AUTH;
    }

    public void setAUTH(String AUTH) {
        this.AUTH = AUTH;
    }

    public String getCSRF() {
        return CSRF;
    }

    public void setCSRF(String CSRF) {
        this.CSRF = CSRF;
    }

    @Override
    public String toString() {
        return JsonHelper.toJson(this);
    }

}
