package com.G13.domain;

import com.G13.model.ResopnseContent;
import com.G13.master.MasterStatus;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "driver")
public class Driver {
    public Driver() {
        Date date = new Date();
        Instant timeStamp= Instant.now();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        float nofloat =0;
        this.rate = nofloat;
        this.promotionBalance = 0.0;
        this.firstName = "";
        this.status = "";
        this.position = "";
        this.lastName = "";
        this.fullName = "";
        this.mobileNo = "";
        this.email = "";
        this.balance = 0.0;
        this.cancelRate = nofloat;
        this.driverCode = "";
        this.invitationCode = "";
        this.mobileDiviceID = "";
        this.deviceType = "";
        this.activatedDate = timeStamp;
        this.createdBy = "";
        this.createdDate = timeStamp;
        this.lastModifiedBy = "";
        this.lastModifiedDate = timeStamp;
        this.companyName = "";
        this.image = "";
        this.languageCode = "";
        this.countryCode = "";
        this.registrationOption = "";
        this.knownSource = "";
        this.registrationStep = 0;
        this.totalTrips = 0;
        this.proBalance1 = 0.0;
        this.promotionBalance1 = nofloat;
        this.version = "";
        this.mobileDeviceID2 = "";
        this.note = "";
        this.internal = false;
        this.point = 0;
        this.accountHolder = "";
    }

    @Id
    @Column(name = "driverid", nullable = false, length = 50)
    private String id;

    @Column(name = "driverlisense")
    private Integer driverLisense;

    @Column(name = "currentvehicle")
    private Integer currentVehicle;

    @Column(name = "rate", nullable = false)
    private Float rate;

    @Column(name = "promotionbalance", nullable = false)
    private Double promotionBalance;

    @Column(name = "companyid")
    private Integer companyID;

    @Column(name = "addressid", length = 50)
    private String addressID;

    @Column(name = "vatcode", length = 15)
    private String vATCode;

    @Column(name = "bankaccount", length = 15)
    private String bankAccount;

    @Column(name = "bankid")
    private Integer bankID;

    @Column(name = "driveexperience")
    private Integer driveExperience;

    @Column(name = "firstname", nullable = false, length = 30)
    private String firstName;

    @Column(name = "status", nullable = false, length = 4)
    private String status;

    @Column(name = "position", nullable = false, length = 3)
    private String position;

    @Column(name = "lastname", nullable = false, length = 50)
    private String lastName;

    @Column(name = "fullname", nullable = false, length = 81)
    private String fullName;

    @Column(name = "mobileno", length = 12)
    private String mobileNo;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "balance", nullable = false)
    private Double balance;

    @Column(name = "cancelrate", nullable = false)
    private Float cancelRate;

    @Column(name = "drivercode", nullable = false, length = 16)
    private String driverCode;

    @Column(name = "invitationcode", length = 20)
    private String invitationCode;

    @Column(name = "mobilediviceid", length = 200)
    private String mobileDiviceID;

    @Column(name = "devicetype", length = 3)
    private String deviceType;

    @Column(name = "deactivateddate")
    private Instant deactivatedDate;

    @Column(name = "activateddate")
    private Instant activatedDate;

    @Column(name = "createdby", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "createddate", nullable = false)
    private Instant createdDate;

    @Column(name = "lastmodifiedby", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "lastmodifieddate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "companyname", nullable = false, length = 100)
    private String companyName;

    @Column(name = "image")
    private String image;

    @Column(name = "languagecode", nullable = false, length = 4)
    private String languageCode;

    @Column(name = "countrycode", nullable = false, length = 4)
    private String countryCode;

    @Column(name = "registrationoption", nullable = false)
    private String registrationOption;

    @Column(name = "knownsource", nullable = false, length = 3)
    private String knownSource;

    @Column(name = "registrationstep")
    private Integer registrationStep;

    @Column(name = "totaltrips", nullable = false)
    private Integer totalTrips;

    @Column(name = "probalance1", nullable = false)
    private Double proBalance1;

    @Column(name = "promotionbalance1", nullable = false)
    private Float promotionBalance1;

    @Column(name = "version")
    private String version;

    @Column(name = "mobiledeviceid2", length = 200)
    private String mobileDeviceID2;

    @Column(name = "note", length = 300)
    private String note;

    @Column(name = "internal", nullable = false)
    private Boolean internal = false;

    @Column(name = "point", nullable = false)
    private Integer point;

    @Column(name = "contacttimes")
    private Byte contactTimes;

    @Column(name = "branchid")
    private Integer branchId;

    @Column(name = "branchcityid")
    private Integer branchCityId;

    @Column(name = "accountholder", length = 80)
    private String accountHolder;

    @Column(name = "checkcontract")
    private Boolean checkContract;

    @Lob
    @Column(name = "voiptoken")
    private String voIPToken;

    @Column(name = "keyvalue", length = 100)
    private String keyValue;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getDriverLisense() {
        return driverLisense;
    }

    public void setDriverLisense(Integer driverLisense) {
        this.driverLisense = driverLisense;
    }

    public Integer getCurrentVehicle() {
        return currentVehicle;
    }

    public void setCurrentVehicle(Integer currentVehicle) {
        this.currentVehicle = currentVehicle;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public Double getPromotionBalance() {
        return promotionBalance;
    }

    public void setPromotionBalance(Double promotionBalance) {
        this.promotionBalance = promotionBalance;
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public String getAddressID() {
        return addressID;
    }

    public void setAddressID(String addressID) {
        this.addressID = addressID;
    }

    public String getVATCode() {
        return vATCode;
    }

    public void setVATCode(String vATCode) {
        this.vATCode = vATCode;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Integer getBankID() {
        return bankID;
    }

    public void setBankID(Integer bankID) {
        this.bankID = bankID;
    }

    public Integer getDriveExperience() {
        return driveExperience;
    }

    public void setDriveExperience(Integer driveExperience) {
        this.driveExperience = driveExperience;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Float getCancelRate() {
        return cancelRate;
    }

    public void setCancelRate(Float cancelRate) {
        this.cancelRate = cancelRate;
    }

    public String getDriverCode() {
        return driverCode;
    }

    public void setDriverCode(String driverCode) {
        this.driverCode = driverCode;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    public String getMobileDiviceID() {
        return mobileDiviceID;
    }

    public void setMobileDiviceID(String mobileDiviceID) {
        this.mobileDiviceID = mobileDiviceID;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public Instant getDeactivatedDate() {
        return deactivatedDate;
    }

    public void setDeactivatedDate(Instant deactivatedDate) {
        this.deactivatedDate = deactivatedDate;
    }

    public Instant getActivatedDate() {
        return activatedDate;
    }

    public void setActivatedDate(Instant activatedDate) {
        this.activatedDate = activatedDate;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public String getRegistrationOption() {
        return registrationOption;
    }

    public void setRegistrationOption(String registrationOption) {
        this.registrationOption = registrationOption;
    }

    public String getKnownSource() {
        return knownSource;
    }

    public void setKnownSource(String knownSource) {
        this.knownSource = knownSource;
    }

    public Integer getRegistrationStep() {
        return registrationStep;
    }

    public void setRegistrationStep(Integer registrationStep) {
        this.registrationStep = registrationStep;
    }

    public Integer getTotalTrips() {
        return totalTrips;
    }

    public void setTotalTrips(Integer totalTrips) {
        this.totalTrips = totalTrips;
    }

    public Double getProBalance1() {
        return proBalance1;
    }

    public void setProBalance1(Double proBalance1) {
        this.proBalance1 = proBalance1;
    }

    public Float getPromotionBalance1() {
        return promotionBalance1;
    }

    public void setPromotionBalance1(Float promotionBalance1) {
        this.promotionBalance1 = promotionBalance1;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getInternal() {
        return internal;
    }

    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Byte getContactTimes() {
        return contactTimes;
    }

    public void setContactTimes(Byte contactTimes) {
        this.contactTimes = contactTimes;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public Integer getBranchCityId() {
        return branchCityId;
    }

    public void setBranchCityId(Integer branchCityId) {
        this.branchCityId = branchCityId;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public Boolean getCheckContract() {
        return checkContract;
    }

    public void setCheckContract(Boolean checkContract) {
        this.checkContract = checkContract;
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

}