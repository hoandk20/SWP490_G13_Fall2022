package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Bankaccount {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "bankAccountId", nullable = false, length = 50)
    private String bankAccountId;
    @Basic
    @Column(name = "UserID", nullable = true, length = 50)
    private String userId;
    @Basic
    @Column(name = "BankBranchId", nullable = false)
    private int bankBranchId;
    @Basic
    @Column(name = "AccountNumber", nullable = false, length = 30)
    private String accountNumber;
    @Basic
    @Column(name = "HolderName", nullable = true, length = 50)
    private String holderName;
    @Basic
    @Column(name = "category", nullable = true, length = 2)
    private String category;
    @Basic
    @Column(name = "currency", nullable = true, length = 4)
    private String currency;
    @Basic
    @Column(name = "HolderEmail", nullable = true, length = 50)
    private String holderEmail;
    @Basic
    @Column(name = "HolderPhone", nullable = true, length = 15)
    private String holderPhone;
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
    @Column(name = "verified", nullable = true)
    private Boolean verified;

    public String getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(String bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getBankBranchId() {
        return bankBranchId;
    }

    public void setBankBranchId(int bankBranchId) {
        this.bankBranchId = bankBranchId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getHolderEmail() {
        return holderEmail;
    }

    public void setHolderEmail(String holderEmail) {
        this.holderEmail = holderEmail;
    }

    public String getHolderPhone() {
        return holderPhone;
    }

    public void setHolderPhone(String holderPhone) {
        this.holderPhone = holderPhone;
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

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bankaccount that = (Bankaccount) o;

        if (bankBranchId != that.bankBranchId) return false;
        if (bankAccountId != null ? !bankAccountId.equals(that.bankAccountId) : that.bankAccountId != null)
            return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (accountNumber != null ? !accountNumber.equals(that.accountNumber) : that.accountNumber != null)
            return false;
        if (holderName != null ? !holderName.equals(that.holderName) : that.holderName != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;
        if (holderEmail != null ? !holderEmail.equals(that.holderEmail) : that.holderEmail != null) return false;
        if (holderPhone != null ? !holderPhone.equals(that.holderPhone) : that.holderPhone != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (verified != null ? !verified.equals(that.verified) : that.verified != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bankAccountId != null ? bankAccountId.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + bankBranchId;
        result = 31 * result + (accountNumber != null ? accountNumber.hashCode() : 0);
        result = 31 * result + (holderName != null ? holderName.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (holderEmail != null ? holderEmail.hashCode() : 0);
        result = 31 * result + (holderPhone != null ? holderPhone.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (verified != null ? verified.hashCode() : 0);
        return result;
    }
}
