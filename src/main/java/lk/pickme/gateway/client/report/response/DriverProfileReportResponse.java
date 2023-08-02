package lk.pickme.gateway.client.report.response;

import lk.pickme.gateway.client.component.DriverProfile;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Dilanka Gamage
 */
public class DriverProfileReportResponse extends BaseReportResponse {

    private final List<DriverProfile> profiles = new ArrayList<DriverProfile>();

    public List<DriverProfile> getProfiles() {
        return profiles;
    }

}
