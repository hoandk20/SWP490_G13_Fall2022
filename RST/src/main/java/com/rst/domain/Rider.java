package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "rider")
public class Rider {
    @Id
    @Column(name = "RiderID", nullable = false, length = 50)
    private String id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RiderID", nullable = false)
    private Taxinetuser taxinetusers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HomeAddressID")
    private Address homeAddressID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OfficeAddressID")
    private Address officeAddressID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "InternationalCode")
    private Country internationalCode;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LanguageCode", nullable = false)
    private Language languageCode;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country countryCode;

    @Column(name = "CityID")
    private Integer cityID;

    @Column(name = "FirstName", nullable = false, length = 30)
    private String firstName;

    @Column(name = "LastName", nullable = false, length = 50)
    private String lastName;

    @Column(name = "FullName", nullable = false, length = 81)
    private String fullName;

    @Column(name = "PromotionBalance", nullable = false)
    private Float promotionBalance;

    @Column(name = "CancelRate", nullable = false)
    private Float cancelRate;

    @Column(name = "AccumulatedPoints", nullable = false)
    private Integer accumulatedPoints;

    @Column(name = "TotalCanelledTrips", nullable = false)
    private Short totalCanelledTrips;

    @Column(name = "TotalTrips", nullable = false)
    private Short totalTrips;

    @Column(name = "TotalRequests", nullable = false)
    private Short totalRequests;

    @Column(name = "Image", length = 100)
    private String image;

    @Column(name = "MobileNo", length = 12)
    private String mobileNo;

    @Column(name = "Email", length = 50)
    private String email;

    @Lob
    @Column(name = "MobileDeviceID")
    private String mobileDeviceID;

    @Column(name = "DeviceType", length = 30)
    private String deviceType;

    @Column(name = "PromotionCode", length = 40)
    private String promotionCode;

    @Column(name = "ActiveCode", length = 40)
    private String activeCode;

    @Column(name = "Status", nullable = false, length = 4)
    private String status;

    @Column(name = "CurrentTripId", length = 50)
    private String currentTripId;

    @Column(name = "Balance", nullable = false)
    private Float balance;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "Rate", nullable = false)
    private Float rate;

    @Column(name = "FBAccount")
    private Boolean fBAccount;

    @Column(name = "PostalCode", length = 6)
    private String postalCode;

    @Column(name = "FacebookID", length = 50)
    private String facebookID;

    @Column(name = "InvitationCode", length = 20)
    private String invitationCode;

    @Column(name = "ActiveDate")
    private Instant activeDate;

    @Column(name = "DeactiveDate")
    private Instant deactiveDate;

    @Column(name = "LastResentCode")
    private Instant lastResentCode;

    @Column(name = "ResentCount", nullable = false)
    private Byte resentCount;

    @Column(name = "totalTripAdjustment", nullable = false)
    private Double totalTripAdjustment;

    @Column(name = "Version", length = 10)
    private String version;

    @Column(name = "MobileDeviceID2", length = 200)
    private String mobileDeviceID2;

    @Column(name = "PromoStatus", nullable = false)
    private Byte promoStatus;

    @Column(name = "RewardedTrips", nullable = false)
    private Short rewardedTrips;

    @Column(name = "NationalIdentifier", length = 15)
    private String nationalIdentifier;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BankID")
    private Bank bankID;

    @Column(name = "BankAccount", length = 15)
    private String bankAccount;

    @Column(name = "totalPoint", nullable = false)
    private Integer totalPoint;

    @Lob
    @Column(name = "VoIPToken")
    private String voIPToken;

    @Column(name = "KeyValue", length = 100)
    private String keyValue;

    @Column(name = "AccountHolder", length = 100)
    private String accountHolder;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BranchId")
    private Bankbranch branch;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Taxinetuser getTaxinetusers() {
        return taxinetusers;
    }

    public void setTaxinetusers(Taxinetuser taxinetusers) {
        this.taxinetusers = taxinetusers;
    }

    public Address getHomeAddressID() {
        return homeAddressID;
    }

    public void setHomeAddressID(Address homeAddressID) {
        this.homeAddressID = homeAddressID;
    }

    public Address getOfficeAddressID() {
        return officeAddressID;
    }

    public void setOfficeAddressID(Address officeAddressID) {
        this.officeAddressID = officeAddressID;
    }

    public Country getInternationalCode() {
        return internationalCode;
    }

    public void setInternationalCode(Country internationalCode) {
        this.internationalCode = internationalCode;
    }

    public Language getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(Language languageCode) {
        this.languageCode = languageCode;
    }

    public Country getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Country countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
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

    public Float getPromotionBalance() {
        return promotionBalance;
    }

    public void setPromotionBalance(Float promotionBalance) {
        this.promotionBalance = promotionBalance;
    }

    public Float getCancelRate() {
        return cancelRate;
    }

    public void setCancelRate(Float cancelRate) {
        this.cancelRate = cancelRate;
    }

    public Integer getAccumulatedPoints() {
        return accumulatedPoints;
    }

    public void setAccumulatedPoints(Integer accumulatedPoints) {
        this.accumulatedPoints = accumulatedPoints;
    }

    public Short getTotalCanelledTrips() {
        return totalCanelledTrips;
    }

    public void setTotalCanelledTrips(Short totalCanelledTrips) {
        this.totalCanelledTrips = totalCanelledTrips;
    }

    public Short getTotalTrips() {
        return totalTrips;
    }

    public void setTotalTrips(Short totalTrips) {
        this.totalTrips = totalTrips;
    }

    public Short getTotalRequests() {
        return totalRequests;
    }

    public void setTotalRequests(Short totalRequests) {
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

    public String getMobileDeviceID() {
        return mobileDeviceID;
    }

    public void setMobileDeviceID(String mobileDeviceID) {
        this.mobileDeviceID = mobileDeviceID;
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

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Instant lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public Boolean getFBAccount() {
        return fBAccount;
    }

    public void setFBAccount(Boolean fBAccount) {
        this.fBAccount = fBAccount;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getFacebookID() {
        return facebookID;
    }

    public void setFacebookID(String facebookID) {
        this.facebookID = facebookID;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    public Instant getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(Instant activeDate) {
        this.activeDate = activeDate;
    }

    public Instant getDeactiveDate() {
        return deactiveDate;
    }

    public void setDeactiveDate(Instant deactiveDate) {
        this.deactiveDate = deactiveDate;
    }

    public Instant getLastResentCode() {
        return lastResentCode;
    }

    public void setLastResentCode(Instant lastResentCode) {
        this.lastResentCode = lastResentCode;
    }

    public Byte getResentCount() {
        return resentCount;
    }

    public void setResentCount(Byte resentCount) {
        this.resentCount = resentCount;
    }

    public Double getTotalTripAdjustment() {
        return totalTripAdjustment;
    }

    public void setTotalTripAdjustment(Double totalTripAdjustment) {
        this.totalTripAdjustment = totalTripAdjustment;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMobileDeviceID2() {
        return mobileDeviceID2;
    }

    public void setMobileDeviceID2(String mobileDeviceID2) {
        this.mobileDeviceID2 = mobileDeviceID2;
    }

    public Byte getPromoStatus() {
        return promoStatus;
    }

    public void setPromoStatus(Byte promoStatus) {
        this.promoStatus = promoStatus;
    }

    public Short getRewardedTrips() {
        return rewardedTrips;
    }

    public void setRewardedTrips(Short rewardedTrips) {
        this.rewardedTrips = rewardedTrips;
    }

    public String getNationalIdentifier() {
        return nationalIdentifier;
    }

    public void setNationalIdentifier(String nationalIdentifier) {
        this.nationalIdentifier = nationalIdentifier;
    }

    public Bank getBankID() {
        return bankID;
    }

    public void setBankID(Bank bankID) {
        this.bankID = bankID;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Integer getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(Integer totalPoint) {
        this.totalPoint = totalPoint;
    }

    public String getVoIPToken() {
        return voIPToken;
    }

    public void setVoIPToken(String voIPToken) {
        this.voIPToken = voIPToken;
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

    public Bankbranch getBranch() {
        return branch;
    }

    public void setBranch(Bankbranch branch) {
        this.branch = branch;
    }

}