package lk.pickme.gateway.client.report.response;

import lk.pickme.gateway.client.component.DriverTripSummary;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Dilanka Gamage
 */

public class DriverTripSummaryReportResponse extends BaseReportResponse {

    private final List<DriverTripSummary> summaries = new ArrayList<DriverTripSummary>();

    public List<DriverTripSummary> getSummaries() {
        return summaries;
    }

}
