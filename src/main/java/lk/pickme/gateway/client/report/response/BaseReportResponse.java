package lk.pickme.gateway.client.report.response;

import lk.pickme.gateway.client.component.ReportIndex;
import lk.pickme.gateway.client.utils.JsonHelper;

import java.util.Date;

/**
 *
 * @author Dilanka Gamage
 */

public abstract class BaseReportResponse {

    protected Date responseDate = new Date();
    protected ReportIndex reportIndex;
    protected int pageSize;
    protected int pageIndex;
    protected long totalSize;
    protected String errorText;

    protected BaseReportResponse() {
    }

    protected BaseReportResponse(BaseReportResponse baseReportResponse) {
        this.responseDate = baseReportResponse.getResponseDate();
        this.reportIndex = baseReportResponse.getReportIndex();
        this.pageSize = baseReportResponse.getPageSize();
        this.pageIndex = baseReportResponse.getPageIndex();
        this.totalSize = baseReportResponse.getTotalSize();
        this.errorText = baseReportResponse.getErrorText();
    }

    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }

    public ReportIndex getReportIndex() {
        return reportIndex;
    }

    public void setReportIndex(ReportIndex reportIndex) {
        this.reportIndex = reportIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(long totalSize) {
        this.totalSize = totalSize;
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    @Override
    public String toString() {
        return JsonHelper.toJson(this);
    }

}
