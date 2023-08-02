package lk.pickme.gateway.client.report.request;

import lk.pickme.gateway.client.enums.TransactionType;
import lk.pickme.gateway.client.enums.DateType;
import lk.pickme.gateway.client.component.Sorter;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import java.math.BigDecimal;

/**
 *
 * @author Dilanka Gamage
 */

public class DriverTripTransactionReportRequest extends BaseReportRequest {

    private Long transactionId;
    private Long driverId;
    private Long tripId;
    private List<TransactionType> transactionTypes = new ArrayList<TransactionType>();
    private List<Integer> transactionCategories = new ArrayList<Integer>();
    private BigDecimal minAmountInRupee;
    private BigDecimal maxAmountInRupee;
    private Long minAmountInCents;
    private Long maxAmountInCents;
    private String description;
    private DateType dateType = DateType.CREATE_TIME;
    private Date fromDate;
    private Date toDate;
    private List<Integer> createdBy = new ArrayList<Integer>();
    private boolean withDriverProfile = false;

    public DriverTripTransactionReportRequest() {
        pagingEnabled = true;
        setDefaultSort();
    }

    private void setDefaultSort() {
        sorters.add(new Sorter("transactionId", true)); //DESC
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public Long getTripId() {
        return tripId;
    }

    public void setTripId(Long tripId) {
        this.tripId = tripId;
    }

    public List<TransactionType> getTransactionTypes() {
        return transactionTypes;
    }

    public void setTransactionTypes(List<TransactionType> transactionTypes) {
        this.transactionTypes = transactionTypes;
    }

    public List<Integer> getTransactionCategories() {
        return transactionCategories;
    }

    public void setTransactionCategories(List<Integer> transactionCategories) {
        this.transactionCategories = transactionCategories;
    }

    public BigDecimal getMinAmountInRupee() {
        return minAmountInRupee;
    }

    public void setMinAmountInRupee(Double minAmountInRupee) {
        this.minAmountInRupee = new BigDecimal(minAmountInRupee).setScale(2, BigDecimal.ROUND_DOWN);
    }

    public BigDecimal getMaxAmountInRupee() {
        return maxAmountInRupee;
    }

    public void setMaxAmountInRupee(Double maxAmountInRupee) {
        this.maxAmountInRupee = new BigDecimal(maxAmountInRupee).setScale(2, BigDecimal.ROUND_HALF_DOWN);
    }

    public Long getMinAmountInCents() {
        return minAmountInCents;
    }

    public void setMinAmountInCents(Long minAmountInCents) {
        this.minAmountInCents = minAmountInCents;
    }

    public Long getMaxAmountInCents() {
        return maxAmountInCents;
    }

    public void setMaxAmountInCents(Long maxAmountInCents) {
        this.maxAmountInCents = maxAmountInCents;
    }

    public DateType getDateType() {
        return dateType;
    }

    public void setDateType(DateType dateType) {
        this.dateType = dateType;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Integer> getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(List<Integer> createdBy) {
        this.createdBy = createdBy;
    }

    public boolean isWithDriverProfile() {
        return withDriverProfile;
    }

    public void setWithDriverProfile(boolean withDriverProfile) {
        this.withDriverProfile = withDriverProfile;
    }

}
