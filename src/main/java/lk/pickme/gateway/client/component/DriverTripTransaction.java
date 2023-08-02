package lk.pickme.gateway.client.component;

import lk.pickme.gateway.client.utils.JsonHelper;

import java.math.BigDecimal;

/**
 *
 * @author Dilanka Gamage
 */

public class DriverTripTransaction implements Comparable<DriverTripTransaction> {

    private Long transactionId;
    private Long driverId;
    private DriverProfile driverProfile;
    private Long tripId;
    private String transactionType;
    private Integer transactionCategory;
    private BigDecimal amountInRupee;
    private Long amountInCents;
    private String description;
    private String createdTime;
    private String createdDate;
    private Integer createdBy;

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

    public DriverProfile getDriverProfile() {
        return driverProfile;
    }

    public void setDriverProfile(DriverProfile driverProfile) {
        this.driverProfile = driverProfile;
    }

    public Long getTripId() {
        return tripId;
    }

    public void setTripId(Long tripId) {
        this.tripId = tripId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Integer getTransactionCategory() {
        return transactionCategory;
    }

    public void setTransactionCategory(Integer transactionCategory) {
        this.transactionCategory = transactionCategory;
    }

    public BigDecimal getAmountInRupee() {
        return amountInRupee;
    }

    public void setAmountInRupee(BigDecimal amountInRupee) {
        this.amountInRupee = amountInRupee;
    }

    public Long getAmountInCents() {
        return amountInCents;
    }

    public void setAmountInCents(Long amountInCents) {
        this.amountInCents = amountInCents;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transactionId != null ? transactionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DriverTripTransaction)) {
            return false;
        }
        DriverTripTransaction other = (DriverTripTransaction) object;
        if ((this.transactionId == null && other.transactionId != null) || (this.transactionId != null && !this.transactionId.equals(other.transactionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return JsonHelper.toJson(this);
    }

    @Override
    public int compareTo(DriverTripTransaction compare) {
        return this.transactionId.compareTo(compare.transactionId);
    }

}
