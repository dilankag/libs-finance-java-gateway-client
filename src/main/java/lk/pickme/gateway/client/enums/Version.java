package lk.pickme.gateway.client.enums;

/**
 *
 * @author Dilanka Gamage
 */

public enum Version {

    v2_10_0("v2.10.0");

    private final String version;

    Version(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }
}
