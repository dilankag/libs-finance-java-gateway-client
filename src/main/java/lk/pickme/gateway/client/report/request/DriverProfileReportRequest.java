package lk.pickme.gateway.client.report.request;

/**
 *
 * @author Dilanka Gamage
 */

public class DriverProfileReportRequest extends BaseReportRequest {

    private Long driverId;
    private boolean withDriverTripSummary = false;
    private boolean withoutEmptyDriverTripSummary = false;

    public DriverProfileReportRequest() {
        pagingEnabled = true;
    }

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public boolean isWithDriverTripSummary() {
        return withDriverTripSummary;
    }

    public void setWithDriverTripSummary(boolean withDriverTripSummary) {
        this.withDriverTripSummary = withDriverTripSummary;
    }

    public boolean isWithoutEmptyDriverTripSummary() {
        return withoutEmptyDriverTripSummary;
    }

    public void setWithoutEmptyDriverTripSummary(boolean withoutEmptyDriverTripSummary) {
        this.withoutEmptyDriverTripSummary = withoutEmptyDriverTripSummary;
    }

}
