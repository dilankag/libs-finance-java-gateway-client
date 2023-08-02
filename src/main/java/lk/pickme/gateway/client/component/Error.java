package lk.pickme.gateway.client.component;

import lk.pickme.gateway.client.utils.JsonHelper;

/**
 *
 * @author Dilanka Gamage
 */

public class Error extends Throwable {

    private String code;
    private String text;

    public Error() {
    }

    public Error(String code, String text) {
        this.code = code;
        this.text = text;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return JsonHelper.toJson(this);
    }

}
