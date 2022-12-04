package com.G13.domain;

import com.G13.model.ResopnseContent;
import com.G13.master.MasterStatus;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "company")
public class Company {
    public Company() {
        Date date = new Date();
        Instant timeStamp= Instant.now();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        float nofloat =0;

        this.cityID = 0;
        this.operatingLisence = 0;
        this.businessRegistration = 0;
        this.otherDocument = 0;
        this.contractDocument = 0;
        this.addressID = "";
        this.name = "";
        this.businessType = "";
        this.balance = 0.0;
        this.requiredBalance = 0.0;
        this.requiredProBalance = 0.0;
        this.vATNumber = "";
        this.phoneNo = "";
        this.postalCode = "";
        this.status = "";
        this.bankNo = "";
        this.bankID = 0;
        this.currentPromotionCode = "";
        this.createdBy = "";
        this.createdDate = timeStamp;
        this.lastModifiedBy = "";
        this.lastModifiedDate = timeStamp;
        this.companyLogo = "";
        this.note = "";
        this.accountHolder = "";
    }

    @Id
    @Column(name = "companyid", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cityid", nullable = false)
    private Integer cityID;

    @Column(name = "operatinglisence")
    private Integer operatingLisence;

    @Column(name = "businessregistration")
    private Integer businessRegistration;

    @Column(name = "otherdocument")
    private Integer otherDocument;

    @Column(name = "contractdocument")
    private Integer contractDocument;

    @Column(name = "addressid", length = 50)
    private String addressID;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "businesstype", nullable = false, length = 10)
    private String businessType;

    @Column(name = "balance", nullable = false)
    private Double balance;

    @Column(name = "requiredbalance", nullable = false)
    private Double requiredBalance;

    @Column(name = "requiredprobalance", nullable = false)
    private Double requiredProBalance;

    @Column(name = "vatnumber", length = 20)
    private String vATNumber;

    @Column(name = "phoneno", length = 15)
    private String phoneNo;

    @Column(name = "postalcode", length = 6)
    private String postalCode;

    @Column(name = "startservicedate")
    private LocalDate startServiceDate;

    @Column(name = "status", nullable = false, length = 2)
    private String status;

    @Column(name = "bankno", length = 20)
    private String bankNo;

    @Column(name = "bankid")
    private Integer bankID;

    @Column(name = "currentpromotioncode", length = 20)
    private String currentPromotionCode;

    @Column(name = "createdby", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "createddate", nullable = false)
    private Instant createdDate;

    @Column(name = "lastmodifiedby", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "lastmodifieddate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "selfcontrolled")
    private Boolean selfControlled;

    @Column(name = "companylogo", length = 120)
    private String companyLogo;

    @Column(name = "note", length = 250)
    private String note;

    @Column(name = "includedtolls")
    private Boolean includedTolls;

    @Column(name = "chargebankfee")
    private Boolean chargeBankFee;

    @Column(name = "companygroupid")
    private Integer companyGroupId;

    @Column(name = "branchid")
    private Integer branchId;

    @Column(name = "accountholder", length = 80)
    private String accountHolder;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
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

    public String getAddressID() {
        return addressID;
    }

    public void setAddressID(String addressID) {
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

}