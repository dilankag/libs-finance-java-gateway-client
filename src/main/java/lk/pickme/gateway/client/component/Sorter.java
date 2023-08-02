package lk.pickme.gateway.client.component;

import lk.pickme.gateway.client.utils.JsonHelper;

/**
 *
 * @author Dilanka Gamage
 */

public class Sorter {

    private String field;
    private boolean DESC;

    public Sorter() {
    }

    public Sorter(String field, boolean DESC) {
        this.field = field;
        this.DESC = DESC;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public boolean isDESC() {
        return DESC;
    }

    public void setDESC(boolean DESC) {
        this.DESC = DESC;
    }

    @Override
    public String toString() {
        return JsonHelper.toJson(this);
    }
}
