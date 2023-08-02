package lk.pickme.gateway.client.component;

import lk.pickme.gateway.client.utils.JsonHelper;

import java.util.List;

/**
 *
 * @author Dilanka Gamage
 */

public class DriverProfile implements Comparable<DriverProfile> {

    private Long driverId;
    private float latitude;
    private float longitude;
    private String status;
    private String currentStatus;
    private String shiftStatus;
    private String travelStatus;
    private String driverApi;
    private String shiftStartedAt;
    private String updateDate;
    private Integer currentTrip;
    private String tripAssignedAt;
    private String profileStatus;
    private Integer vehicleModel;
    private Character loginStatus;
    private boolean directionalHireEnable;
    private double bearing;
    private List<DriverTripSummary> driverTripSummaries;

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getShiftStatus() {
        return shiftStatus;
    }

    public void setShiftStatus(String shiftStatus) {
        this.shiftStatus = shiftStatus;
    }

    public String getTravelStatus() {
        return travelStatus;
    }

    public void setTravelStatus(String travelStatus) {
        this.travelStatus = travelStatus;
    }

    public String getDriverApi() {
        return driverApi;
    }

    public void setDriverApi(String driverApi) {
        this.driverApi = driverApi;
    }

    public String getShiftStartedAt() {
        return shiftStartedAt;
    }

    public void setShiftStartedAt(String shiftStartedAt) {
        this.shiftStartedAt = shiftStartedAt;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getCurrentTrip() {
        return currentTrip;
    }

    public void setCurrentTrip(Integer currentTrip) {
        this.currentTrip = currentTrip;
    }

    public String getTripAssignedAt() {
        return tripAssignedAt;
    }

    public void setTripAssignedAt(String tripAssignedAt) {
        this.tripAssignedAt = tripAssignedAt;
    }

    public String getProfileStatus() {
        return profileStatus;
    }

    public void setProfileStatus(String profileStatus) {
        this.profileStatus = profileStatus;
    }

    public Integer getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(Integer vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public Character getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Character loginStatus) {
        this.loginStatus = loginStatus;
    }

    public boolean getDirectionalHireEnable() {
        return directionalHireEnable;
    }

    public void setDirectionalHireEnable(boolean directionalHireEnable) {
        this.directionalHireEnable = directionalHireEnable;
    }

    public double getBearing() {
        return bearing;
    }

    public void setBearing(double bearing) {
        this.bearing = bearing;
    }

    public List<DriverTripSummary> getDriverTripSummaries() {
        return driverTripSummaries;
    }

    public void setDriverTripSummaries(List<DriverTripSummary> driverTripSummaries) {
        this.driverTripSummaries = driverTripSummaries;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (driverId != null ? driverId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DriverProfile)) {
            return false;
        }
        DriverProfile other = (DriverProfile) object;
        if ((this.driverId == null && other.driverId != null) || (this.driverId != null && !this.driverId.equals(other.driverId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return JsonHelper.toJson(this);
    }

    @Override
    public int compareTo(DriverProfile compare) {
        return this.driverId.compareTo(compare.driverId);
    }

}
