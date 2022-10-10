package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Driver {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DriverID", nullable = false, length = 50)
    private String driverId;
    @Basic
    @Column(name = "DriverLisense", nullable = true)
    private Integer driverLisense;
    @Basic
    @Column(name = "CurrentVehicle", nullable = true)
    private Integer currentVehicle;
    @Basic
    @Column(name = "Rate", nullable = false, precision = 0)
    private double rate;
    @Basic
    @Column(name = "PromotionBalance", nullable = false, precision = 0)
    private double promotionBalance;
    @Basic
    @Column(name = "CompanyID", nullable = true)
    private Integer companyId;
    @Basic
    @Column(name = "AddressID", nullable = true, length = 50)
    private String addressId;
    @Basic
    @Column(name = "VATCode", nullable = true, length = 15)
    private String vatCode;
    @Basic
    @Column(name = "BankAccount", nullable = true, length = 15)
    private String bankAccount;
    @Basic
    @Column(name = "BankID", nullable = true)
    private Integer bankId;
    @Basic
    @Column(name = "DriveExperience", nullable = true)
    private Integer driveExperience;
    @Basic
    @Column(name = "FirstName", nullable = false, length = 30)
    private String firstName;
    @Basic
    @Column(name = "Status", nullable = false, length = 4)
    private String status;
    @Basic
    @Column(name = "Position", nullable = false, length = 3)
    private String position;
    @Basic
    @Column(name = "LastName", nullable = false, length = 50)
    private String lastName;
    @Basic
    @Column(name = "FullName", nullable = false, length = 81)
    private String fullName;
    @Basic
    @Column(name = "MobileNo", nullable = true, length = 12)
    private String mobileNo;
    @Basic
    @Column(name = "Email", nullable = true, length = 50)
    private String email;
    @Basic
    @Column(name = "Balance", nullable = false, precision = 0)
    private double balance;
    @Basic
    @Column(name = "CancelRate", nullable = false, precision = 0)
    private double cancelRate;
    @Basic
    @Column(name = "DriverCode", nullable = false, length = 16)
    private String driverCode;
    @Basic
    @Column(name = "InvitationCode", nullable = true, length = 20)
    private String invitationCode;
    @Basic
    @Column(name = "MobileDiviceID", nullable = true, length = 200)
    private String mobileDiviceId;
    @Basic
    @Column(name = "DeviceType", nullable = true, length = 3)
    private String deviceType;
    @Basic
    @Column(name = "DeactivatedDate", nullable = true)
    private Timestamp deactivatedDate;
    @Basic
    @Column(name = "ActivatedDate", nullable = true)
    private Timestamp activatedDate;
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
    @Column(name = "CompanyName", nullable = false, length = 100)
    private String companyName;
    @Basic
    @Column(name = "Image", nullable = true, length = 255)
    private String image;
    @Basic
    @Column(name = "LanguageCode", nullable = false, length = 4)
    private String languageCode;
    @Basic
    @Column(name = "CountryCode", nullable = false, length = 4)
    private String countryCode;
    @Basic
    @Column(name = "RegistrationOption", nullable = false, length = 255)
    private String registrationOption;
    @Basic
    @Column(name = "KnownSource", nullable = false, length = 3)
    private String knownSource;
    @Basic
    @Column(name = "RegistrationStep", nullable = true)
    private Integer registrationStep;
    @Basic
    @Column(name = "TotalTrips", nullable = false)
    private int totalTrips;
    @Basic
    @Column(name = "ProBalance1", nullable = false, precision = 0)
    private double proBalance1;
    @Basic
    @Column(name = "PromotionBalance1", nullable = false, precision = 0)
    private double promotionBalance1;
    @Basic
    @Column(name = "version", nullable = true, length = 255)
    private String version;
    @Basic
    @Column(name = "MobileDeviceID2", nullable = true, length = 200)
    private String mobileDeviceId2;
    @Basic
    @Column(name = "Note", nullable = true, length = 300)
    private String note;
    @Basic
    @Column(name = "Internal", nullable = false)
    private byte internal;
    @Basic
    @Column(name = "Point", nullable = false)
    private int point;
    @Basic
    @Column(name = "ContactTimes", nullable = true)
    private Byte contactTimes;
    @Basic
    @Column(name = "BranchId", nullable = true)
    private Integer branchId;
    @Basic
    @Column(name = "BranchCityId", nullable = true)
    private Integer branchCityId;
    @Basic
    @Column(name = "AccountHolder", nullable = true, length = 80)
    private String accountHolder;
    @Basic
    @Column(name = "CheckContract", nullable = true)
    private Boolean checkContract;
    @Basic
    @Column(name = "VoIPToken", nullable = true, length = -1)
    private String voIpToken;
    @Basic
    @Column(name = "KeyValue", nullable = true, length = 100)
    private String keyValue;

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
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

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getPromotionBalance() {
        return promotionBalance;
    }

    public void setPromotionBalance(double promotionBalance) {
        this.promotionBalance = promotionBalance;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getVatCode() {
        return vatCode;
    }

    public void setVatCode(String vatCode) {
        this.vatCode = vatCode;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCancelRate() {
        return cancelRate;
    }

    public void setCancelRate(double cancelRate) {
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

    public String getMobileDiviceId() {
        return mobileDiviceId;
    }

    public void setMobileDiviceId(String mobileDiviceId) {
        this.mobileDiviceId = mobileDiviceId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public Timestamp getDeactivatedDate() {
        return deactivatedDate;
    }

    public void setDeactivatedDate(Timestamp deactivatedDate) {
        this.deactivatedDate = deactivatedDate;
    }

    public Timestamp getActivatedDate() {
        return activatedDate;
    }

    public void setActivatedDate(Timestamp activatedDate) {
        this.activatedDate = activatedDate;
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

    public int getTotalTrips() {
        return totalTrips;
    }

    public void setTotalTrips(int totalTrips) {
        this.totalTrips = totalTrips;
    }

    public double getProBalance1() {
        return proBalance1;
    }

    public void setProBalance1(double proBalance1) {
        this.proBalance1 = proBalance1;
    }

    public double getPromotionBalance1() {
        return promotionBalance1;
    }

    public void setPromotionBalance1(double promotionBalance1) {
        this.promotionBalance1 = promotionBalance1;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public byte getInternal() {
        return internal;
    }

    public void setInternal(byte internal) {
        this.internal = internal;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driver driver = (Driver) o;

        if (Double.compare(driver.rate, rate) != 0) return false;
        if (Double.compare(driver.promotionBalance, promotionBalance) != 0) return false;
        if (Double.compare(driver.balance, balance) != 0) return false;
        if (Double.compare(driver.cancelRate, cancelRate) != 0) return false;
        if (totalTrips != driver.totalTrips) return false;
        if (Double.compare(driver.proBalance1, proBalance1) != 0) return false;
        if (Double.compare(driver.promotionBalance1, promotionBalance1) != 0) return false;
        if (internal != driver.internal) return false;
        if (point != driver.point) return false;
        if (driverId != null ? !driverId.equals(driver.driverId) : driver.driverId != null) return false;
        if (driverLisense != null ? !driverLisense.equals(driver.driverLisense) : driver.driverLisense != null)
            return false;
        if (currentVehicle != null ? !currentVehicle.equals(driver.currentVehicle) : driver.currentVehicle != null)
            return false;
        if (companyId != null ? !companyId.equals(driver.companyId) : driver.companyId != null) return false;
        if (addressId != null ? !addressId.equals(driver.addressId) : driver.addressId != null) return false;
        if (vatCode != null ? !vatCode.equals(driver.vatCode) : driver.vatCode != null) return false;
        if (bankAccount != null ? !bankAccount.equals(driver.bankAccount) : driver.bankAccount != null) return false;
        if (bankId != null ? !bankId.equals(driver.bankId) : driver.bankId != null) return false;
        if (driveExperience != null ? !driveExperience.equals(driver.driveExperience) : driver.driveExperience != null)
            return false;
        if (firstName != null ? !firstName.equals(driver.firstName) : driver.firstName != null) return false;
        if (status != null ? !status.equals(driver.status) : driver.status != null) return false;
        if (position != null ? !position.equals(driver.position) : driver.position != null) return false;
        if (lastName != null ? !lastName.equals(driver.lastName) : driver.lastName != null) return false;
        if (fullName != null ? !fullName.equals(driver.fullName) : driver.fullName != null) return false;
        if (mobileNo != null ? !mobileNo.equals(driver.mobileNo) : driver.mobileNo != null) return false;
        if (email != null ? !email.equals(driver.email) : driver.email != null) return false;
        if (driverCode != null ? !driverCode.equals(driver.driverCode) : driver.driverCode != null) return false;
        if (invitationCode != null ? !invitationCode.equals(driver.invitationCode) : driver.invitationCode != null)
            return false;
        if (mobileDiviceId != null ? !mobileDiviceId.equals(driver.mobileDiviceId) : driver.mobileDiviceId != null)
            return false;
        if (deviceType != null ? !deviceType.equals(driver.deviceType) : driver.deviceType != null) return false;
        if (deactivatedDate != null ? !deactivatedDate.equals(driver.deactivatedDate) : driver.deactivatedDate != null)
            return false;
        if (activatedDate != null ? !activatedDate.equals(driver.activatedDate) : driver.activatedDate != null)
            return false;
        if (createdBy != null ? !createdBy.equals(driver.createdBy) : driver.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(driver.createdDate) : driver.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(driver.lastModifiedBy) : driver.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(driver.lastModifiedDate) : driver.lastModifiedDate != null)
            return false;
        if (companyName != null ? !companyName.equals(driver.companyName) : driver.companyName != null) return false;
        if (image != null ? !image.equals(driver.image) : driver.image != null) return false;
        if (languageCode != null ? !languageCode.equals(driver.languageCode) : driver.languageCode != null)
            return false;
        if (countryCode != null ? !countryCode.equals(driver.countryCode) : driver.countryCode != null) return false;
        if (registrationOption != null ? !registrationOption.equals(driver.registrationOption) : driver.registrationOption != null)
            return false;
        if (knownSource != null ? !knownSource.equals(driver.knownSource) : driver.knownSource != null) return false;
        if (registrationStep != null ? !registrationStep.equals(driver.registrationStep) : driver.registrationStep != null)
            return false;
        if (version != null ? !version.equals(driver.version) : driver.version != null) return false;
        if (mobileDeviceId2 != null ? !mobileDeviceId2.equals(driver.mobileDeviceId2) : driver.mobileDeviceId2 != null)
            return false;
        if (note != null ? !note.equals(driver.note) : driver.note != null) return false;
        if (contactTimes != null ? !contactTimes.equals(driver.contactTimes) : driver.contactTimes != null)
            return false;
        if (branchId != null ? !branchId.equals(driver.branchId) : driver.branchId != null) return false;
        if (branchCityId != null ? !branchCityId.equals(driver.branchCityId) : driver.branchCityId != null)
            return false;
        if (accountHolder != null ? !accountHolder.equals(driver.accountHolder) : driver.accountHolder != null)
            return false;
        if (checkContract != null ? !checkContract.equals(driver.checkContract) : driver.checkContract != null)
            return false;
        if (voIpToken != null ? !voIpToken.equals(driver.voIpToken) : driver.voIpToken != null) return false;
        if (keyValue != null ? !keyValue.equals(driver.keyValue) : driver.keyValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = driverId != null ? driverId.hashCode() : 0;
        result = 31 * result + (driverLisense != null ? driverLisense.hashCode() : 0);
        result = 31 * result + (currentVehicle != null ? currentVehicle.hashCode() : 0);
        temp = Double.doubleToLongBits(rate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(promotionBalance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (addressId != null ? addressId.hashCode() : 0);
        result = 31 * result + (vatCode != null ? vatCode.hashCode() : 0);
        result = 31 * result + (bankAccount != null ? bankAccount.hashCode() : 0);
        result = 31 * result + (bankId != null ? bankId.hashCode() : 0);
        result = 31 * result + (driveExperience != null ? driveExperience.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (mobileNo != null ? mobileNo.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cancelRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (driverCode != null ? driverCode.hashCode() : 0);
        result = 31 * result + (invitationCode != null ? invitationCode.hashCode() : 0);
        result = 31 * result + (mobileDiviceId != null ? mobileDiviceId.hashCode() : 0);
        result = 31 * result + (deviceType != null ? deviceType.hashCode() : 0);
        result = 31 * result + (deactivatedDate != null ? deactivatedDate.hashCode() : 0);
        result = 31 * result + (activatedDate != null ? activatedDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (languageCode != null ? languageCode.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (registrationOption != null ? registrationOption.hashCode() : 0);
        result = 31 * result + (knownSource != null ? knownSource.hashCode() : 0);
        result = 31 * result + (registrationStep != null ? registrationStep.hashCode() : 0);
        result = 31 * result + totalTrips;
        temp = Double.doubleToLongBits(proBalance1);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(promotionBalance1);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (mobileDeviceId2 != null ? mobileDeviceId2.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (int) internal;
        result = 31 * result + point;
        result = 31 * result + (contactTimes != null ? contactTimes.hashCode() : 0);
        result = 31 * result + (branchId != null ? branchId.hashCode() : 0);
        result = 31 * result + (branchCityId != null ? branchCityId.hashCode() : 0);
        result = 31 * result + (accountHolder != null ? accountHolder.hashCode() : 0);
        result = 31 * result + (checkContract != null ? checkContract.hashCode() : 0);
        result = 31 * result + (voIpToken != null ? voIpToken.hashCode() : 0);
        result = 31 * result + (keyValue != null ? keyValue.hashCode() : 0);
        return result;
    }
}
