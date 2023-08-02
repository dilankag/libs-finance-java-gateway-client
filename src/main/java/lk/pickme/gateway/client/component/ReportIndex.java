package lk.pickme.gateway.client.component;

import lk.pickme.gateway.client.utils.JsonHelper;

/**
 *
 * @author Dilanka Gamage
 */

public class ReportIndex {

    private String name;
    private String type;

    public ReportIndex() {
    }

    public ReportIndex(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return JsonHelper.toJson(this);
    }

}
