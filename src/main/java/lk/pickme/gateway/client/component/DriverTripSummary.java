package lk.pickme.gateway.client.component;

import lk.pickme.gateway.client.utils.JsonHelper;

import java.util.Objects;

/**
 *
 * @author Dilanka Gamage
 */

public class DriverTripSummary implements Comparable<DriverTripSummary> {

    private Integer rowId;
    private Long driverId;
    private DriverProfile driverProfile;
    private String transactionType;
    private Long totalAmountInCents;
    private Integer rowCount;

    public Integer getRowId() {
        return rowId;
    }

    public void setRowId(Integer rowId) {
        this.rowId = rowId;
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

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Long getTotalAmountInCents() {
        return totalAmountInCents;
    }

    public void setTotalAmountInCents(Long totalAmountInCents) {
        this.totalAmountInCents = totalAmountInCents;
    }

    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.driverId);
        hash = 79 * hash + Objects.hashCode(this.transactionType);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DriverTripSummary other = (DriverTripSummary) obj;
        if (!Objects.equals(this.driverId, other.driverId)) {
            return false;
        }
        if (!Objects.equals(this.transactionType, other.transactionType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return JsonHelper.toJson(this);
    }

    @Override
    public int compareTo(DriverTripSummary compare) {
        return this.driverId.compareTo(compare.driverId);
    }

}
