package lk.pickme.gateway.client.report.response;

import lk.pickme.gateway.client.component.PeopleProfile;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Dilanka Gamage
 */

public class PeopleProfileReportResponse extends BaseReportResponse {

    private final List<PeopleProfile> profiles = new ArrayList<PeopleProfile>();

    public List<PeopleProfile> getProfiles() {
        return profiles;
    }

}
