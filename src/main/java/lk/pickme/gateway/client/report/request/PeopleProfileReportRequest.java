package lk.pickme.gateway.client.report.request;

import lk.pickme.gateway.client.component.Sorter;

/**
 *
 * @author Dilanka Gamage
 */

public class PeopleProfileReportRequest extends BaseReportRequest {

    private Long peopleId;
    private boolean withDriverTripSummary = false;
    private boolean withoutEmptyDriverTripSummary = false;

    public PeopleProfileReportRequest() {
        pagingEnabled = true;
        setDefaultSort();
    }

    private void setDefaultSort() {
        sorters.add(new Sorter("peopleId", true)); //DESC
    }

    public Long getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(Long peopleId) {
        this.peopleId = peopleId;
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
