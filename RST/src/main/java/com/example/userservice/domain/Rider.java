package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Rider {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RiderID", nullable = false, length = 50)
    private String riderId;
    @Basic
    @Column(name = "HomeAddressID", nullable = true, length = 50)
    private String homeAddressId;
    @Basic
    @Column(name = "OfficeAddressID", nullable = true, length = 50)
    private String officeAddressId;
    @Basic
    @Column(name = "InternationalCode", nullable = true, length = 4)
    private String internationalCode;
    @Basic
    @Column(name = "LanguageCode", nullable = false, length = 4)
    private String languageCode;
    @Basic
    @Column(name = "CountryCode", nullable = false, length = 4)
    private String countryCode;
    @Basic
    @Column(name = "CityID", nullable = true)
    private Integer cityId;
    @Basic
    @Column(name = "FirstName", nullable = false, length = 30)
    private String firstName;
    @Basic
    @Column(name = "LastName", nullable = false, length = 50)
    private String lastName;
    @Basic
    @Column(name = "FullName", nullable = false, length = 81)
    private String fullName;
    @Basic
    @Column(name = "PromotionBalance", nullable = false, precision = 0)
    private double promotionBalance;
    @Basic
    @Column(name = "CancelRate", nullable = false, precision = 0)
    private double cancelRate;
    @Basic
    @Column(name = "AccumulatedPoints", nullable = false)
    private int accumulatedPoints;
    @Basic
    @Column(name = "TotalCanelledTrips", nullable = false)
    private short totalCanelledTrips;
    @Basic
    @Column(name = "TotalTrips", nullable = false)
    private short totalTrips;
    @Basic
    @Column(name = "TotalRequests", nullable = false)
    private short totalRequests;
    @Basic
    @Column(name = "Image", nullable = true, length = 100)
    private String image;
    @Basic
    @Column(name = "MobileNo", nullable = true, length = 12)
    private String mobileNo;
    @Basic
    @Column(name = "Email", nullable = true, length = 50)
    private String email;
    @Basic
    @Column(name = "MobileDeviceID", nullable = true, length = -1)
    private String mobileDeviceId;
    @Basic
    @Column(name = "DeviceType", nullable = true, length = 30)
    private String deviceType;
    @Basic
    @Column(name = "PromotionCode", nullable = true, length = 40)
    private String promotionCode;
    @Basic
    @Column(name = "ActiveCode", nullable = true, length = 40)
    private String activeCode;
    @Basic
    @Column(name = "Status", nullable = false, length = 4)
    private String status;
    @Basic
    @Column(name = "CurrentTripId", nullable = true, length = 50)
    private String currentTripId;
    @Basic
    @Column(name = "Balance", nullable = false, precision = 0)
    private double balance;
    @Basic
    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;
    @Basic
    @Column(name = "CreatedDate", nullable = false)
    private Timestamp createdDate;
    @Basic
    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;
    @Basic
    @Column(name = "LastModifiedDate", nullable = false)
    private Timestamp lastModifiedDate;
    @Basic
    @Column(name = "Rate", nullable = false, precision = 0)
    private double rate;
    @Basic
    @Column(name = "FBAccount", nullable = true)
    private Boolean fbAccount;
    @Basic
    @Column(name = "PostalCode", nullable = true, length = 6)
    private String postalCode;
    @Basic
    @Column(name = "FacebookID", nullable = true, length = 50)
    private String facebookId;
    @Basic
    @Column(name = "InvitationCode", nullable = true, length = 20)
    private String invitationCode;
    @Basic
    @Column(name = "ActiveDate", nullable = true)
    private Timestamp activeDate;
    @Basic
    @Column(name = "DeactiveDate", nullable = true)
    private Timestamp deactiveDate;
    @Basic
    @Column(name = "LastResentCode", nullable = true)
    private Timestamp lastResentCode;
    @Basic
    @Column(name = "ResentCount", nullable = false)
    private byte resentCount;
    @Basic
    @Column(name = "totalTripAdjustment", nullable = false, precision = 0)
    private double totalTripAdjustment;
    @Basic
    @Column(name = "Version", nullable = true, length = 10)
    private String version;
    @Basic
    @Column(name = "MobileDeviceID2", nullable = true, length = 200)
    private String mobileDeviceId2;
    @Basic
    @Column(name = "PromoStatus", nullable = false)
    private byte promoStatus;
    @Basic
    @Column(name = "RewardedTrips", nullable = false)
    private short rewardedTrips;
    @Basic
    @Column(name = "NationalIdentifier", nullable = true, length = 15)
    private String nationalIdentifier;
    @Basic
    @Column(name = "BankID", nullable = true)
    private Integer bankId;
    @Basic
    @Column(name = "BankAccount", nullable = true, length = 15)
    private String bankAccount;
    @Basic
    @Column(name = "totalPoint", nullable = false)
    private int totalPoint;
    @Basic
    @Column(name = "VoIPToken", nullable = true, length = -1)
    private String voIpToken;
    @Basic
    @Column(name = "KeyValue", nullable = true, length = 100)
    private String keyValue;
    @Basic
    @Column(name = "AccountHolder", nullable = true, length = 100)
    private String accountHolder;
    @Basic
    @Column(name = "BranchId", nullable = true)
    private Integer branchId;

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public String getHomeAddressId() {
        return homeAddressId;
    }

    public void setHomeAddressId(String homeAddressId) {
        this.homeAddressId = homeAddressId;
    }

    public String getOfficeAddressId() {
        return officeAddressId;
    }

    public void setOfficeAddressId(String officeAddressId) {
        this.officeAddressId = officeAddressId;
    }

    public String getInternationalCode() {
        return internationalCode;
    }

    public void setInternationalCode(String internationalCode) {
        this.internationalCode = internationalCode;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getPromotionBalance() {
        return promotionBalance;
    }

    public void setPromotionBalance(double promotionBalance) {
        this.promotionBalance = promotionBalance;
    }

    public double getCancelRate() {
        return cancelRate;
    }

    public void setCancelRate(double cancelRate) {
        this.cancelRate = cancelRate;
    }

    public int getAccumulatedPoints() {
        return accumulatedPoints;
    }

    public void setAccumulatedPoints(int accumulatedPoints) {
        this.accumulatedPoints = accumulatedPoints;
    }

    public short getTotalCanelledTrips() {
        return totalCanelledTrips;
    }

    public void setTotalCanelledTrips(short totalCanelledTrips) {
        this.totalCanelledTrips = totalCanelledTrips;
    }

    public short getTotalTrips() {
        return totalTrips;
    }

    public void setTotalTrips(short totalTrips) {
        this.totalTrips = totalTrips;
    }

    public short getTotalRequests() {
        return totalRequests;
    }

    public void setTotalRequests(short totalRequests) {
        this.totalRequests = totalRequests;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileDeviceId() {
        return mobileDeviceId;
    }

    public void setMobileDeviceId(String mobileDeviceId) {
        this.mobileDeviceId = mobileDeviceId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    public String getActiveCode() {
        return activeCode;
    }

    public void setActiveCode(String activeCode) {
        this.activeCode = activeCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurrentTripId() {
        return currentTripId;
    }

    public void setCurrentTripId(String currentTripId) {
        this.currentTripId = currentTripId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Timestamp getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Boolean getFbAccount() {
        return fbAccount;
    }

    public void setFbAccount(Boolean fbAccount) {
        this.fbAccount = fbAccount;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    public Timestamp getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(Timestamp activeDate) {
        this.activeDate = activeDate;
    }

    public Timestamp getDeactiveDate() {
        return deactiveDate;
    }

    public void setDeactiveDate(Timestamp deactiveDate) {
        this.deactiveDate = deactiveDate;
    }

    public Timestamp getLastResentCode() {
        return lastResentCode;
    }

    public void setLastResentCode(Timestamp lastResentCode) {
        this.lastResentCode = lastResentCode;
    }

    public byte getResentCount() {
        return resentCount;
    }

    public void setResentCount(byte resentCount) {
        this.resentCount = resentCount;
    }

    public double getTotalTripAdjustment() {
        return totalTripAdjustment;
    }

    public void setTotalTripAdjustment(double totalTripAdjustment) {
        this.totalTripAdjustment = totalTripAdjustment;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMobileDeviceId2() {
        return mobileDeviceId2;
    }

    public void setMobileDeviceId2(String mobileDeviceId2) {
        this.mobileDeviceId2 = mobileDeviceId2;
    }

    public byte getPromoStatus() {
        return promoStatus;
    }

    public void setPromoStatus(byte promoStatus) {
        this.promoStatus = promoStatus;
    }

    public short getRewardedTrips() {
        return rewardedTrips;
    }

    public void setRewardedTrips(short rewardedTrips) {
        this.rewardedTrips = rewardedTrips;
    }

    public String getNationalIdentifier() {
        return nationalIdentifier;
    }

    public void setNationalIdentifier(String nationalIdentifier) {
        this.nationalIdentifier = nationalIdentifier;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(int totalPoint) {
        this.totalPoint = totalPoint;
    }

    public String getVoIpToken() {
        return voIpToken;
    }

    public void setVoIpToken(String voIpToken) {
        this.voIpToken = voIpToken;
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rider rider = (Rider) o;

        if (Double.compare(rider.promotionBalance, promotionBalance) != 0) return false;
        if (Double.compare(rider.cancelRate, cancelRate) != 0) return false;
        if (accumulatedPoints != rider.accumulatedPoints) return false;
        if (totalCanelledTrips != rider.totalCanelledTrips) return false;
        if (totalTrips != rider.totalTrips) return false;
        if (totalRequests != rider.totalRequests) return false;
        if (Double.compare(rider.balance, balance) != 0) return false;
        if (Double.compare(rider.rate, rate) != 0) return false;
        if (resentCount != rider.resentCount) return false;
        if (Double.compare(rider.totalTripAdjustment, totalTripAdjustment) != 0) return false;
        if (promoStatus != rider.promoStatus) return false;
        if (rewardedTrips != rider.rewardedTrips) return false;
        if (totalPoint != rider.totalPoint) return false;
        if (riderId != null ? !riderId.equals(rider.riderId) : rider.riderId != null) return false;
        if (homeAddressId != null ? !homeAddressId.equals(rider.homeAddressId) : rider.homeAddressId != null)
            return false;
        if (officeAddressId != null ? !officeAddressId.equals(rider.officeAddressId) : rider.officeAddressId != null)
            return false;
        if (internationalCode != null ? !internationalCode.equals(rider.internationalCode) : rider.internationalCode != null)
            return false;
        if (languageCode != null ? !languageCode.equals(rider.languageCode) : rider.languageCode != null) return false;
        if (countryCode != null ? !countryCode.equals(rider.countryCode) : rider.countryCode != null) return false;
        if (cityId != null ? !cityId.equals(rider.cityId) : rider.cityId != null) return false;
        if (firstName != null ? !firstName.equals(rider.firstName) : rider.firstName != null) return false;
        if (lastName != null ? !lastName.equals(rider.lastName) : rider.lastName != null) return false;
        if (fullName != null ? !fullName.equals(rider.fullName) : rider.fullName != null) return false;
        if (image != null ? !image.equals(rider.image) : rider.image != null) return false;
        if (mobileNo != null ? !mobileNo.equals(rider.mobileNo) : rider.mobileNo != null) return false;
        if (email != null ? !email.equals(rider.email) : rider.email != null) return false;
        if (mobileDeviceId != null ? !mobileDeviceId.equals(rider.mobileDeviceId) : rider.mobileDeviceId != null)
            return false;
        if (deviceType != null ? !deviceType.equals(rider.deviceType) : rider.deviceType != null) return false;
        if (promotionCode != null ? !promotionCode.equals(rider.promotionCode) : rider.promotionCode != null)
            return false;
        if (activeCode != null ? !activeCode.equals(rider.activeCode) : rider.activeCode != null) return false;
        if (status != null ? !status.equals(rider.status) : rider.status != null) return false;
        if (currentTripId != null ? !currentTripId.equals(rider.currentTripId) : rider.currentTripId != null)
            return false;
        if (createdBy != null ? !createdBy.equals(rider.createdBy) : rider.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(rider.createdDate) : rider.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(rider.lastModifiedBy) : rider.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(rider.lastModifiedDate) : rider.lastModifiedDate != null)
            return false;
        if (fbAccount != null ? !fbAccount.equals(rider.fbAccount) : rider.fbAccount != null) return false;
        if (postalCode != null ? !postalCode.equals(rider.postalCode) : rider.postalCode != null) return false;
        if (facebookId != null ? !facebookId.equals(rider.facebookId) : rider.facebookId != null) return false;
        if (invitationCode != null ? !invitationCode.equals(rider.invitationCode) : rider.invitationCode != null)
            return false;
        if (activeDate != null ? !activeDate.equals(rider.activeDate) : rider.activeDate != null) return false;
        if (deactiveDate != null ? !deactiveDate.equals(rider.deactiveDate) : rider.deactiveDate != null) return false;
        if (lastResentCode != null ? !lastResentCode.equals(rider.lastResentCode) : rider.lastResentCode != null)
            return false;
        if (version != null ? !version.equals(rider.version) : rider.version != null) return false;
        if (mobileDeviceId2 != null ? !mobileDeviceId2.equals(rider.mobileDeviceId2) : rider.mobileDeviceId2 != null)
            return false;
        if (nationalIdentifier != null ? !nationalIdentifier.equals(rider.nationalIdentifier) : rider.nationalIdentifier != null)
            return false;
        if (bankId != null ? !bankId.equals(rider.bankId) : rider.bankId != null) return false;
        if (bankAccount != null ? !bankAccount.equals(rider.bankAccount) : rider.bankAccount != null) return false;
        if (voIpToken != null ? !voIpToken.equals(rider.voIpToken) : rider.voIpToken != null) return false;
        if (keyValue != null ? !keyValue.equals(rider.keyValue) : rider.keyValue != null) return false;
        if (accountHolder != null ? !accountHolder.equals(rider.accountHolder) : rider.accountHolder != null)
            return false;
        if (branchId != null ? !branchId.equals(rider.branchId) : rider.branchId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = riderId != null ? riderId.hashCode() : 0;
        result = 31 * result + (homeAddressId != null ? homeAddressId.hashCode() : 0);
        result = 31 * result + (officeAddressId != null ? officeAddressId.hashCode() : 0);
        result = 31 * result + (internationalCode != null ? internationalCode.hashCode() : 0);
        result = 31 * result + (languageCode != null ? languageCode.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        temp = Double.doubleToLongBits(promotionBalance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cancelRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + accumulatedPoints;
        result = 31 * result + (int) totalCanelledTrips;
        result = 31 * result + (int) totalTrips;
        result = 31 * result + (int) totalRequests;
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (mobileNo != null ? mobileNo.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (mobileDeviceId != null ? mobileDeviceId.hashCode() : 0);
        result = 31 * result + (deviceType != null ? deviceType.hashCode() : 0);
        result = 31 * result + (promotionCode != null ? promotionCode.hashCode() : 0);
        result = 31 * result + (activeCode != null ? activeCode.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (currentTripId != null ? currentTripId.hashCode() : 0);
        temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        temp = Double.doubleToLongBits(rate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (fbAccount != null ? fbAccount.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (facebookId != null ? facebookId.hashCode() : 0);
        result = 31 * result + (invitationCode != null ? invitationCode.hashCode() : 0);
        result = 31 * result + (activeDate != null ? activeDate.hashCode() : 0);
        result = 31 * result + (deactiveDate != null ? deactiveDate.hashCode() : 0);
        result = 31 * result + (lastResentCode != null ? lastResentCode.hashCode() : 0);
        result = 31 * result + (int) resentCount;
        temp = Double.doubleToLongBits(totalTripAdjustment);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (mobileDeviceId2 != null ? mobileDeviceId2.hashCode() : 0);
        result = 31 * result + (int) promoStatus;
        result = 31 * result + (int) rewardedTrips;
        result = 31 * result + (nationalIdentifier != null ? nationalIdentifier.hashCode() : 0);
        result = 31 * result + (bankId != null ? bankId.hashCode() : 0);
        result = 31 * result + (bankAccount != null ? bankAccount.hashCode() : 0);
        result = 31 * result + totalPoint;
        result = 31 * result + (voIpToken != null ? voIpToken.hashCode() : 0);
        result = 31 * result + (keyValue != null ? keyValue.hashCode() : 0);
        result = 31 * result + (accountHolder != null ? accountHolder.hashCode() : 0);
        result = 31 * result + (branchId != null ? branchId.hashCode() : 0);
        return result;
    }
}
