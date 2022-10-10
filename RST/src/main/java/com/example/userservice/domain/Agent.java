package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Agent {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "AgentID", nullable = false)
    private int agentId;
    @Basic
    @Column(name = "CityID", nullable = false)
    private int cityId;
    @Basic
    @Column(name = "HomeAddressID", nullable = true, length = 50)
    private String homeAddressId;
    @Basic
    @Column(name = "OfficeAddressId", nullable = true, length = 50)
    private String officeAddressId;
    @Basic
    @Column(name = "AgentCode", nullable = false, length = 50)
    private String agentCode;
    @Basic
    @Column(name = "AgentName", nullable = false, length = 100)
    private String agentName;
    @Basic
    @Column(name = "ShareRate", nullable = false, precision = 0)
    private double shareRate;
    @Basic
    @Column(name = "Balance", nullable = false, precision = 0)
    private double balance;
    @Basic
    @Column(name = "MobileNo", nullable = true, length = 12)
    private String mobileNo;
    @Basic
    @Column(name = "VATNumber", nullable = true, length = 20)
    private String vatNumber;
    @Basic
    @Column(name = "PromotionCode", nullable = true, length = 20)
    private String promotionCode;
    @Basic
    @Column(name = "ParentID", nullable = true, length = 50)
    private String parentId;
    @Basic
    @Column(name = "EffectiveDate", nullable = true)
    private Date effectiveDate;
    @Basic
    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;
    @Basic
    @Column(name = "CreatedDate", nullable = false)
    private Timestamp createdDate;
    @Basic
    @Column(name = "LastModifiedBy", nullable = true, length = 50)
    private String lastModifiedBy;
    @Basic
    @Column(name = "LastModifiedDate", nullable = false)
    private Timestamp lastModifiedDate;
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
    @Column(name = "BranchID", nullable = true)
    private Integer branchId;
    @Basic
    @Column(name = "Email", nullable = true, length = 50)
    private String email;
    @Basic
    @Column(name = "UrlLogo", nullable = true, length = 100)
    private String urlLogo;
    @Basic
    @Column(name = "description", nullable = true, length = 500)
    private String description;

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
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

    public double getShareRate() {
        return shareRate;
    }

    public void setShareRate(double shareRate) {
        this.shareRate = shareRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
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

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Agent agent = (Agent) o;

        if (agentId != agent.agentId) return false;
        if (cityId != agent.cityId) return false;
        if (Double.compare(agent.shareRate, shareRate) != 0) return false;
        if (Double.compare(agent.balance, balance) != 0) return false;
        if (homeAddressId != null ? !homeAddressId.equals(agent.homeAddressId) : agent.homeAddressId != null)
            return false;
        if (officeAddressId != null ? !officeAddressId.equals(agent.officeAddressId) : agent.officeAddressId != null)
            return false;
        if (agentCode != null ? !agentCode.equals(agent.agentCode) : agent.agentCode != null) return false;
        if (agentName != null ? !agentName.equals(agent.agentName) : agent.agentName != null) return false;
        if (mobileNo != null ? !mobileNo.equals(agent.mobileNo) : agent.mobileNo != null) return false;
        if (vatNumber != null ? !vatNumber.equals(agent.vatNumber) : agent.vatNumber != null) return false;
        if (promotionCode != null ? !promotionCode.equals(agent.promotionCode) : agent.promotionCode != null)
            return false;
        if (parentId != null ? !parentId.equals(agent.parentId) : agent.parentId != null) return false;
        if (effectiveDate != null ? !effectiveDate.equals(agent.effectiveDate) : agent.effectiveDate != null)
            return false;
        if (createdBy != null ? !createdBy.equals(agent.createdBy) : agent.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(agent.createdDate) : agent.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(agent.lastModifiedBy) : agent.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(agent.lastModifiedDate) : agent.lastModifiedDate != null)
            return false;
        if (status != null ? !status.equals(agent.status) : agent.status != null) return false;
        if (bankNo != null ? !bankNo.equals(agent.bankNo) : agent.bankNo != null) return false;
        if (bankId != null ? !bankId.equals(agent.bankId) : agent.bankId != null) return false;
        if (branchId != null ? !branchId.equals(agent.branchId) : agent.branchId != null) return false;
        if (email != null ? !email.equals(agent.email) : agent.email != null) return false;
        if (urlLogo != null ? !urlLogo.equals(agent.urlLogo) : agent.urlLogo != null) return false;
        if (description != null ? !description.equals(agent.description) : agent.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = agentId;
        result = 31 * result + cityId;
        result = 31 * result + (homeAddressId != null ? homeAddressId.hashCode() : 0);
        result = 31 * result + (officeAddressId != null ? officeAddressId.hashCode() : 0);
        result = 31 * result + (agentCode != null ? agentCode.hashCode() : 0);
        result = 31 * result + (agentName != null ? agentName.hashCode() : 0);
        temp = Double.doubleToLongBits(shareRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (mobileNo != null ? mobileNo.hashCode() : 0);
        result = 31 * result + (vatNumber != null ? vatNumber.hashCode() : 0);
        result = 31 * result + (promotionCode != null ? promotionCode.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (effectiveDate != null ? effectiveDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (bankNo != null ? bankNo.hashCode() : 0);
        result = 31 * result + (bankId != null ? bankId.hashCode() : 0);
        result = 31 * result + (branchId != null ? branchId.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (urlLogo != null ? urlLogo.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
