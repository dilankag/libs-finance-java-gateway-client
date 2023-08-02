package lk.pickme.gateway.client.report.request;

import lk.pickme.gateway.client.component.Sorter;
import lk.pickme.gateway.client.utils.JsonHelper;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Dilanka Gamage
 */

public abstract class BaseReportRequest {

    protected static final int DEFAULT_PAGE_SIZE = 10;
    protected static final int MAXIMUM_PAGE_SIZE = 100;

    protected boolean fromStaff = false;
    protected boolean fromPortal = false;
    protected boolean pagingEnabled = true;
    protected int pageSize = DEFAULT_PAGE_SIZE;
    protected int pageIndex = 0;
    protected boolean exportEnabled;
    protected List<Sorter> sorters = new ArrayList<Sorter>();
    protected int resultsetSize = DEFAULT_PAGE_SIZE; // When no paging or scrolling is used

    public boolean isFromStaff() {
        return fromStaff;
    }

    public void setFromStaff(boolean fromStaff) {
        this.fromStaff = fromStaff;
    }

    public boolean isFromPortal() {
        return fromPortal;
    }

    public void setFromPortal(boolean fromPortal) {
        this.fromPortal = fromPortal;
    }

    public boolean isPagingEnabled() {
        return pagingEnabled;
    }

    public void setPagingEnabled(boolean pagingEnabled) {
        this.pagingEnabled = pagingEnabled;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        if (pageSize < 1 || pageSize > MAXIMUM_PAGE_SIZE) {
            return;
        }
        this.pageSize = pageSize;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        if (pageIndex < 0) {
            return;
        }
        this.pageIndex = pageIndex;
    }

    public boolean isExportEnabled() {
        return exportEnabled;
    }

    public void setExportEnabled(boolean exportEnabled) {
        this.exportEnabled = exportEnabled;
    }

    public List<Sorter> getSorters() {
        return sorters;
    }

    public void setSorters(List<Sorter> sorters) {
        this.sorters = sorters;
    }

    public int getResultsetSize() {
        return resultsetSize;
    }

    public void setResultsetSize(int resultsetSize) {
        this.resultsetSize = resultsetSize;
    }

    @Override
    public String toString() {
        return JsonHelper.toJson(this);
    }

}
