package lk.pickme.gateway.client.component;

import java.util.List;
import lk.pickme.gateway.client.utils.JsonHelper;

/**
 *
 * @author Dilanka Gamage
 */

public class PeopleProfile implements Comparable<PeopleProfile> {

    private Long peopleId;
    private String salutation;
    private String name;
    private String lastname;
    private String email;
    private String address;
    private String permAddress;
    private String paypalAccount;
    private String password;
    private String hashedPassword;
    private String passwordHashedBc;
    private String orgPassword;
    private String username;
    private String location;
    private String photo;
    private String deviceId;
    private String deviceToken;
    private int deviceType;
    private int pushVersion;
    private String deviceImei;
    private String createdDate;
    private String updatedDate;
    private String lastLogin;
    private String loginIp;
    private String loginCity;
    private String loginState;
    private String loginCountry;
    private int loginType;
    private String loginStatus;
    private String loginFrom;
    private String userType;
    private int accountType;
    private String timezone;
    private String description;
    private String phone;
    private String reachableMobile;
    private String secondaryMobile;
    private String emegencyMobile;
    private String gender;
    private String dob;
    private String status;
    private String blockReason;
    private int userCreatedby;
    private int companyId;
    private String driverLicenseId;
    private String profilePicture;
    private String availabilityStatus;
    private double accountBalance;
    private int bookingLimit;
    private double driverShare;
    private int notificationSetting;
    private String otp;
    private String driverReferralCode;
    private String notificationStatus;
    private Integer userUpdatedby;
    private String reachableMobileBak;
    private int onDemand;
    private List<DriverTripSummary> driverTripSummaries;

    public Long getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(Long peopleId) {
        this.peopleId = peopleId;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPermAddress() {
        return permAddress;
    }

    public void setPermAddress(String permAddress) {
        this.permAddress = permAddress;
    }

    public String getPaypalAccount() {
        return paypalAccount;
    }

    public void setPaypalAccount(String paypalAccount) {
        this.paypalAccount = paypalAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public String getPasswordHashedBc() {
        return passwordHashedBc;
    }

    public void setPasswordHashedBc(String passwordHashedBc) {
        this.passwordHashedBc = passwordHashedBc;
    }

    public String getOrgPassword() {
        return orgPassword;
    }

    public void setOrgPassword(String orgPassword) {
        this.orgPassword = orgPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public int getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(int deviceType) {
        this.deviceType = deviceType;
    }

    public int getPushVersion() {
        return pushVersion;
    }

    public void setPushVersion(int pushVersion) {
        this.pushVersion = pushVersion;
    }

    public String getDeviceImei() {
        return deviceImei;
    }

    public void setDeviceImei(String deviceImei) {
        this.deviceImei = deviceImei;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getLoginCity() {
        return loginCity;
    }

    public void setLoginCity(String loginCity) {
        this.loginCity = loginCity;
    }

    public String getLoginState() {
        return loginState;
    }

    public void setLoginState(String loginState) {
        this.loginState = loginState;
    }

    public String getLoginCountry() {
        return loginCountry;
    }

    public void setLoginCountry(String loginCountry) {
        this.loginCountry = loginCountry;
    }

    public int getLoginType() {
        return loginType;
    }

    public void setLoginType(int loginType) {
        this.loginType = loginType;
    }

    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }

    public String getLoginFrom() {
        return loginFrom;
    }

    public void setLoginFrom(String loginFrom) {
        this.loginFrom = loginFrom;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getReachableMobile() {
        return reachableMobile;
    }

    public void setReachableMobile(String reachableMobile) {
        this.reachableMobile = reachableMobile;
    }

    public String getSecondaryMobile() {
        return secondaryMobile;
    }

    public void setSecondaryMobile(String secondaryMobile) {
        this.secondaryMobile = secondaryMobile;
    }

    public String getEmegencyMobile() {
        return emegencyMobile;
    }

    public void setEmegencyMobile(String emegencyMobile) {
        this.emegencyMobile = emegencyMobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBlockReason() {
        return blockReason;
    }

    public void setBlockReason(String blockReason) {
        this.blockReason = blockReason;
    }

    public int getUserCreatedby() {
        return userCreatedby;
    }

    public void setUserCreatedby(int userCreatedby) {
        this.userCreatedby = userCreatedby;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getDriverLicenseId() {
        return driverLicenseId;
    }

    public void setDriverLicenseId(String driverLicenseId) {
        this.driverLicenseId = driverLicenseId;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getBookingLimit() {
        return bookingLimit;
    }

    public void setBookingLimit(int bookingLimit) {
        this.bookingLimit = bookingLimit;
    }

    public double getDriverShare() {
        return driverShare;
    }

    public void setDriverShare(double driverShare) {
        this.driverShare = driverShare;
    }

    public int getNotificationSetting() {
        return notificationSetting;
    }

    public void setNotificationSetting(int notificationSetting) {
        this.notificationSetting = notificationSetting;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getDriverReferralCode() {
        return driverReferralCode;
    }

    public void setDriverReferralCode(String driverReferralCode) {
        this.driverReferralCode = driverReferralCode;
    }

    public String getNotificationStatus() {
        return notificationStatus;
    }

    public void setNotificationStatus(String notificationStatus) {
        this.notificationStatus = notificationStatus;
    }

    public Integer getUserUpdatedby() {
        return userUpdatedby;
    }

    public void setUserUpdatedby(Integer userUpdatedby) {
        this.userUpdatedby = userUpdatedby;
    }

    public String getReachableMobileBak() {
        return reachableMobileBak;
    }

    public void setReachableMobileBak(String reachableMobileBak) {
        this.reachableMobileBak = reachableMobileBak;
    }

    public int getOnDemand() {
        return onDemand;
    }

    public void setOnDemand(int onDemand) {
        this.onDemand = onDemand;
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
        hash += (peopleId != null ? peopleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeopleProfile)) {
            return false;
        }
        PeopleProfile other = (PeopleProfile) object;
        if ((this.peopleId == null && other.peopleId != null) || (this.peopleId != null && !this.peopleId.equals(other.peopleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return JsonHelper.toJson(this);
    }

    @Override
    public int compareTo(PeopleProfile compare) {
        return this.peopleId.compareTo(compare.peopleId);
    }

}
