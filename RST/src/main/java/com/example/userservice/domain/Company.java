package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Company {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CompanyID", nullable = false)
    private int companyId;
    @Basic
    @Column(name = "CityID", nullable = false)
    private int cityId;
    @Basic
    @Column(name = "OperatingLisence", nullable = true)
    private Integer operatingLisence;
    @Basic
    @Column(name = "BusinessRegistration", nullable = true)
    private Integer businessRegistration;
    @Basic
    @Column(name = "OtherDocument", nullable = true)
    private Integer otherDocument;
    @Basic
    @Column(name = "ContractDocument", nullable = true)
    private Integer contractDocument;
    @Basic
    @Column(name = "AddressID", nullable = true, length = 50)
    private String addressId;
    @Basic
    @Column(name = "Name", nullable = false, length = 100)
    private String name;
    @Basic
    @Column(name = "BusinessType", nullable = false, length = 10)
    private String businessType;
    @Basic
    @Column(name = "Balance", nullable = false, precision = 0)
    private double balance;
    @Basic
    @Column(name = "RequiredBalance", nullable = false, precision = 0)
    private double requiredBalance;
    @Basic
    @Column(name = "RequiredProBalance", nullable = false, precision = 0)
    private double requiredProBalance;
    @Basic
    @Column(name = "VATNumber", nullable = true, length = 20)
    private String vatNumber;
    @Basic
    @Column(name = "PhoneNo", nullable = true, length = 15)
    private String phoneNo;
    @Basic
    @Column(name = "PostalCode", nullable = true, length = 6)
    private String postalCode;
    @Basic
    @Column(name = "StartServiceDate", nullable = true)
    private Date startServiceDate;
    @Basic
    @Column(name = "Status", nullable = false, length = 2)
    private String status;
    @Basic
    @Column(name = "BankNo", nullable = true, length = 20)
    private String bankNo;
    @Basic
    @Column(name = "BankID", nullable = true)
    private Integer bankId;
    @Basic
    @Column(name = "CurrentPromotionCode", nullable = true, length = 20)
    private String currentPromotionCode;
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
    @Column(name = "SelfControlled", nullable = true)
    private Boolean selfControlled;
    @Basic
    @Column(name = "CompanyLogo", nullable = true, length = 120)
    private String companyLogo;
    @Basic
    @Column(name = "Note", nullable = true, length = 250)
    private String note;
    @Basic
    @Column(name = "IncludedTolls", nullable = true)
    private Boolean includedTolls;
    @Basic
    @Column(name = "ChargeBankFee", nullable = true)
    private Boolean chargeBankFee;
    @Basic
    @Column(name = "CompanyGroupId", nullable = true)
    private Integer companyGroupId;
    @Basic
    @Column(name = "BranchId", nullable = true)
    private Integer branchId;
    @Basic
    @Column(name = "AccountHolder", nullable = true, length = 80)
    private String accountHolder;

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public Integer getOperatingLisence() {
        return operatingLisence;
    }

    public void setOperatingLisence(Integer operatingLisence) {
        this.operatingLisence = operatingLisence;
    }

    public Integer getBusinessRegistration() {
        return businessRegistration;
    }

    public void setBusinessRegistration(Integer businessRegistration) {
        this.businessRegistration = businessRegistration;
    }

    public Integer getOtherDocument() {
        return otherDocument;
    }

    public void setOtherDocument(Integer otherDocument) {
        this.otherDocument = otherDocument;
    }

    public Integer getContractDocument() {
        return contractDocument;
    }

    public void setContractDocument(Integer contractDocument) {
        this.contractDocument = contractDocument;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRequiredBalance() {
        return requiredBalance;
    }

    public void setRequiredBalance(double requiredBalance) {
        this.requiredBalance = requiredBalance;
    }

    public double getRequiredProBalance() {
        return requiredProBalance;
    }

    public void setRequiredProBalance(double requiredProBalance) {
        this.requiredProBalance = requiredProBalance;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Date getStartServiceDate() {
        return startServiceDate;
    }

    public void setStartServiceDate(Date startServiceDate) {
        this.startServiceDate = startServiceDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getCurrentPromotionCode() {
        return currentPromotionCode;
    }

    public void setCurrentPromotionCode(String currentPromotionCode) {
        this.currentPromotionCode = currentPromotionCode;
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

    public Boolean getSelfControlled() {
        return selfControlled;
    }

    public void setSelfControlled(Boolean selfControlled) {
        this.selfControlled = selfControlled;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getIncludedTolls() {
        return includedTolls;
    }

    public void setIncludedTolls(Boolean includedTolls) {
        this.includedTolls = includedTolls;
    }

    public Boolean getChargeBankFee() {
        return chargeBankFee;
    }

    public void setChargeBankFee(Boolean chargeBankFee) {
        this.chargeBankFee = chargeBankFee;
    }

    public Integer getCompanyGroupId() {
        return companyGroupId;
    }

    public void setCompanyGroupId(Integer companyGroupId) {
        this.companyGroupId = companyGroupId;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        if (companyId != company.companyId) return false;
        if (cityId != company.cityId) return false;
        if (Double.compare(company.balance, balance) != 0) return false;
        if (Double.compare(company.requiredBalance, requiredBalance) != 0) return false;
        if (Double.compare(company.requiredProBalance, requiredProBalance) != 0) return false;
        if (operatingLisence != null ? !operatingLisence.equals(company.operatingLisence) : company.operatingLisence != null)
            return false;
        if (businessRegistration != null ? !businessRegistration.equals(company.businessRegistration) : company.businessRegistration != null)
            return false;
        if (otherDocument != null ? !otherDocument.equals(company.otherDocument) : company.otherDocument != null)
            return false;
        if (contractDocument != null ? !contractDocument.equals(company.contractDocument) : company.contractDocument != null)
            return false;
        if (addressId != null ? !addressId.equals(company.addressId) : company.addressId != null) return false;
        if (name != null ? !name.equals(company.name) : company.name != null) return false;
        if (businessType != null ? !businessType.equals(company.businessType) : company.businessType != null)
            return false;
        if (vatNumber != null ? !vatNumber.equals(company.vatNumber) : company.vatNumber != null) return false;
        if (phoneNo != null ? !phoneNo.equals(company.phoneNo) : company.phoneNo != null) return false;
        if (postalCode != null ? !postalCode.equals(company.postalCode) : company.postalCode != null) return false;
        if (startServiceDate != null ? !startServiceDate.equals(company.startServiceDate) : company.startServiceDate != null)
            return false;
        if (status != null ? !status.equals(company.status) : company.status != null) return false;
        if (bankNo != null ? !bankNo.equals(company.bankNo) : company.bankNo != null) return false;
        if (bankId != null ? !bankId.equals(company.bankId) : company.bankId != null) return false;
        if (currentPromotionCode != null ? !currentPromotionCode.equals(company.currentPromotionCode) : company.currentPromotionCode != null)
            return false;
        if (createdBy != null ? !createdBy.equals(company.createdBy) : company.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(company.createdDate) : company.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(company.lastModifiedBy) : company.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(company.lastModifiedDate) : company.lastModifiedDate != null)
            return false;
        if (selfControlled != null ? !selfControlled.equals(company.selfControlled) : company.selfControlled != null)
            return false;
        if (companyLogo != null ? !companyLogo.equals(company.companyLogo) : company.companyLogo != null) return false;
        if (note != null ? !note.equals(company.note) : company.note != null) return false;
        if (includedTolls != null ? !includedTolls.equals(company.includedTolls) : company.includedTolls != null)
            return false;
        if (chargeBankFee != null ? !chargeBankFee.equals(company.chargeBankFee) : company.chargeBankFee != null)
            return false;
        if (companyGroupId != null ? !companyGroupId.equals(company.companyGroupId) : company.companyGroupId != null)
            return false;
        if (branchId != null ? !branchId.equals(company.branchId) : company.branchId != null) return false;
        if (accountHolder != null ? !accountHolder.equals(company.accountHolder) : company.accountHolder != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = companyId;
        result = 31 * result + cityId;
        result = 31 * result + (operatingLisence != null ? operatingLisence.hashCode() : 0);
        result = 31 * result + (businessRegistration != null ? businessRegistration.hashCode() : 0);
        result = 31 * result + (otherDocument != null ? otherDocument.hashCode() : 0);
        result = 31 * result + (contractDocument != null ? contractDocument.hashCode() : 0);
        result = 31 * result + (addressId != null ? addressId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (businessType != null ? businessType.hashCode() : 0);
        temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(requiredBalance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(requiredProBalance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (vatNumber != null ? vatNumber.hashCode() : 0);
        result = 31 * result + (phoneNo != null ? phoneNo.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (startServiceDate != null ? startServiceDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (bankNo != null ? bankNo.hashCode() : 0);
        result = 31 * result + (bankId != null ? bankId.hashCode() : 0);
        result = 31 * result + (currentPromotionCode != null ? currentPromotionCode.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (selfControlled != null ? selfControlled.hashCode() : 0);
        result = 31 * result + (companyLogo != null ? companyLogo.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (includedTolls != null ? includedTolls.hashCode() : 0);
        result = 31 * result + (chargeBankFee != null ? chargeBankFee.hashCode() : 0);
        result = 31 * result + (companyGroupId != null ? companyGroupId.hashCode() : 0);
        result = 31 * result + (branchId != null ? branchId.hashCode() : 0);
        result = 31 * result + (accountHolder != null ? accountHolder.hashCode() : 0);
        return result;
    }
}
