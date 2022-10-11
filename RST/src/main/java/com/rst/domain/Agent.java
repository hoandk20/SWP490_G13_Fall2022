package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "agent")
public class Agent {
    @Id
    @Column(name = "AgentID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CityID", nullable = false)
    private City cityID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HomeAddressID")
    private Address homeAddressID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OfficeAddressId")
    private Address officeAddress;

    @Column(name = "AgentCode", nullable = false, length = 50)
    private String agentCode;

    @Column(name = "AgentName", nullable = false, length = 100)
    private String agentName;

    @Column(name = "ShareRate", nullable = false)
    private Float shareRate;

    @Column(name = "Balance", nullable = false)
    private Double balance;

    @Column(name = "MobileNo", length = 12)
    private String mobileNo;

    @Column(name = "VATNumber", length = 20)
    private String vATNumber;

    @Column(name = "PromotionCode", length = 20)
    private String promotionCode;

    @Column(name = "ParentID", length = 50)
    private String parentID;

    @Column(name = "EffectiveDate")
    private LocalDate effectiveDate;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "Status", nullable = false, length = 2)
    private String status;

    @Column(name = "BankNo", length = 20)
    private String bankNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BankID")
    private Bank bankID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BranchID")
    private Bankbranch branchID;

    @Column(name = "Email", length = 50)
    private String email;

    @Column(name = "UrlLogo", length = 100)
    private String urlLogo;

    @Column(name = "description", length = 500)
    private String description;

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

    public Address getHomeAddressID() {
        return homeAddressID;
    }

    public void setHomeAddressID(Address homeAddressID) {
        this.homeAddressID = homeAddressID;
    }

    public Address getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(Address officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public Float getShareRate() {
        return shareRate;
    }

    public void setShareRate(Float shareRate) {
        this.shareRate = shareRate;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getVATNumber() {
        return vATNumber;
    }

    public void setVATNumber(String vATNumber) {
        this.vATNumber = vATNumber;
    }

    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    public String getParentID() {
        return parentID;
    }

    public void setParentID(String parentID) {
        this.parentID = parentID;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
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

    public Bank getBankID() {
        return bankID;
    }

    public void setBankID(Bank bankID) {
        this.bankID = bankID;
    }

    public Bankbranch getBranchID() {
        return branchID;
    }

    public void setBranchID(Bankbranch branchID) {
        this.branchID = branchID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}