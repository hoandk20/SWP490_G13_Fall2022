package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @Column(name = "CompanyID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CityID", nullable = false)
    private City cityID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OperatingLisence")
    private Document operatingLisence;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BusinessRegistration")
    private Document businessRegistration;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OtherDocument")
    private Document otherDocument;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ContractDocument")
    private Document contractDocument;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AddressID")
    private Address addressID;

    @Column(name = "Name", nullable = false, length = 100)
    private String name;

    @Column(name = "BusinessType", nullable = false, length = 10)
    private String businessType;

    @Column(name = "Balance", nullable = false)
    private Double balance;

    @Column(name = "RequiredBalance", nullable = false)
    private Double requiredBalance;

    @Column(name = "RequiredProBalance", nullable = false)
    private Double requiredProBalance;

    @Column(name = "VATNumber", length = 20)
    private String vATNumber;

    @Column(name = "PhoneNo", length = 15)
    private String phoneNo;

    @Column(name = "PostalCode", length = 6)
    private String postalCode;

    @Column(name = "StartServiceDate")
    private LocalDate startServiceDate;

    @Column(name = "Status", nullable = false, length = 2)
    private String status;

    @Column(name = "BankNo", length = 20)
    private String bankNo;

    @Column(name = "BankID")
    private Integer bankID;

    @Column(name = "CurrentPromotionCode", length = 20)
    private String currentPromotionCode;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "SelfControlled")
    private Boolean selfControlled;

    @Column(name = "CompanyLogo", length = 120)
    private String companyLogo;

    @Column(name = "Note", length = 250)
    private String note;

    @Column(name = "IncludedTolls")
    private Boolean includedTolls;

    @Column(name = "ChargeBankFee")
    private Boolean chargeBankFee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CompanyGroupId")
    private Companygroup companyGroup;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BranchId")
    private Bankbranch branch;

    @Column(name = "AccountHolder", length = 80)
    private String accountHolder;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public City getCityID() {
        return cityID;
    }

    public void setCityID(City cityID) {
        this.cityID = cityID;
    }

    public Document getOperatingLisence() {
        return operatingLisence;
    }

    public void setOperatingLisence(Document operatingLisence) {
        this.operatingLisence = operatingLisence;
    }

    public Document getBusinessRegistration() {
        return businessRegistration;
    }

    public void setBusinessRegistration(Document businessRegistration) {
        this.businessRegistration = businessRegistration;
    }

    public Document getOtherDocument() {
        return otherDocument;
    }

    public void setOtherDocument(Document otherDocument) {
        this.otherDocument = otherDocument;
    }

    public Document getContractDocument() {
        return contractDocument;
    }

    public void setContractDocument(Document contractDocument) {
        this.contractDocument = contractDocument;
    }

    public Address getAddressID() {
        return addressID;
    }

    public void setAddressID(Address addressID) {
        this.addressID = addressID;
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

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getRequiredBalance() {
        return requiredBalance;
    }

    public void setRequiredBalance(Double requiredBalance) {
        this.requiredBalance = requiredBalance;
    }

    public Double getRequiredProBalance() {
        return requiredProBalance;
    }

    public void setRequiredProBalance(Double requiredProBalance) {
        this.requiredProBalance = requiredProBalance;
    }

    public String getVATNumber() {
        return vATNumber;
    }

    public void setVATNumber(String vATNumber) {
        this.vATNumber = vATNumber;
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

    public LocalDate getStartServiceDate() {
        return startServiceDate;
    }

    public void setStartServiceDate(LocalDate startServiceDate) {
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

    public Integer getBankID() {
        return bankID;
    }

    public void setBankID(Integer bankID) {
        this.bankID = bankID;
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

    public Companygroup getCompanyGroup() {
        return companyGroup;
    }

    public void setCompanyGroup(Companygroup companyGroup) {
        this.companyGroup = companyGroup;
    }

    public Bankbranch getBranch() {
        return branch;
    }

    public void setBranch(Bankbranch branch) {
        this.branch = branch;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

}