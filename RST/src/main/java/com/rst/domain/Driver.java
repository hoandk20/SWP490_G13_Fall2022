package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "driver")
public class Driver {
    @Id
    @Column(name = "DriverID", nullable = false, length = 50)
    private String id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DriverID", nullable = false)
    private Taxinetuser taxinetusers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DriverLisense")
    private Document driverLisense;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CurrentVehicle")
    private Vehicle currentVehicle;

    @Column(name = "Rate", nullable = false)
    private Float rate;

    @Column(name = "PromotionBalance", nullable = false)
    private Double promotionBalance;

    @Column(name = "CompanyID")
    private Integer companyID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AddressID")
    private Address addressID;

    @Column(name = "VATCode", length = 15)
    private String vATCode;

    @Column(name = "BankAccount", length = 15)
    private String bankAccount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BankID")
    private Bank bankID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DriveExperience")
    private Document driveExperience;

    @Column(name = "FirstName", nullable = false, length = 30)
    private String firstName;

    @Column(name = "Status", nullable = false, length = 4)
    private String status;

    @Column(name = "Position", nullable = false, length = 3)
    private String position;

    @Column(name = "LastName", nullable = false, length = 50)
    private String lastName;

    @Column(name = "FullName", nullable = false, length = 81)
    private String fullName;

    @Column(name = "MobileNo", length = 12)
    private String mobileNo;

    @Column(name = "Email", length = 50)
    private String email;

    @Column(name = "Balance", nullable = false)
    private Double balance;

    @Column(name = "CancelRate", nullable = false)
    private Float cancelRate;

    @Column(name = "DriverCode", nullable = false, length = 16)
    private String driverCode;

    @Column(name = "InvitationCode", length = 20)
    private String invitationCode;

    @Column(name = "MobileDiviceID", length = 200)
    private String mobileDiviceID;

    @Column(name = "DeviceType", length = 3)
    private String deviceType;

    @Column(name = "DeactivatedDate")
    private Instant deactivatedDate;

    @Column(name = "ActivatedDate")
    private Instant activatedDate;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "CompanyName", nullable = false, length = 100)
    private String companyName;

    @Column(name = "Image")
    private String image;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LanguageCode", nullable = false)
    private Language languageCode;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country countryCode;

    @Column(name = "RegistrationOption", nullable = false)
    private String registrationOption;

    @Column(name = "KnownSource", nullable = false, length = 3)
    private String knownSource;

    @Column(name = "RegistrationStep")
    private Integer registrationStep;

    @Column(name = "TotalTrips", nullable = false)
    private Integer totalTrips;

    @Column(name = "ProBalance1", nullable = false)
    private Double proBalance1;

    @Column(name = "PromotionBalance1", nullable = false)
    private Float promotionBalance1;

    @Column(name = "version")
    private String version;

    @Column(name = "MobileDeviceID2", length = 200)
    private String mobileDeviceID2;

    @Column(name = "Note", length = 300)
    private String note;

    @Column(name = "Internal", nullable = false)
    private Boolean internal = false;

    @Column(name = "Point", nullable = false)
    private Integer point;

    @Column(name = "ContactTimes")
    private Byte contactTimes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BranchId")
    private Bankbranch branch;

    @Column(name = "BranchCityId")
    private Integer branchCityId;

    @Column(name = "AccountHolder", length = 80)
    private String accountHolder;

    @Column(name = "CheckContract")
    private Boolean checkContract;

    @Lob
    @Column(name = "VoIPToken")
    private String voIPToken;

    @Column(name = "KeyValue", length = 100)
    private String keyValue;

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

    public Document getDriverLisense() {
        return driverLisense;
    }

    public void setDriverLisense(Document driverLisense) {
        this.driverLisense = driverLisense;
    }

    public Vehicle getCurrentVehicle() {
        return currentVehicle;
    }

    public void setCurrentVehicle(Vehicle currentVehicle) {
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

    public Address getAddressID() {
        return addressID;
    }

    public void setAddressID(Address addressID) {
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

    public Bank getBankID() {
        return bankID;
    }

    public void setBankID(Bank bankID) {
        this.bankID = bankID;
    }

    public Document getDriveExperience() {
        return driveExperience;
    }

    public void setDriveExperience(Document driveExperience) {
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

    public Bankbranch getBranch() {
        return branch;
    }

    public void setBranch(Bankbranch branch) {
        this.branch = branch;
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