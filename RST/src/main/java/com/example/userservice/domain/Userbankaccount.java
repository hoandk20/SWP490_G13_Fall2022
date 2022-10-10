package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Userbankaccount {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "userBankAccountId", nullable = false, length = 50)
    private String userBankAccountId;
    @Basic
    @Column(name = "UserID", nullable = false, length = 50)
    private String userId;
    @Basic
    @Column(name = "BankAccountId", nullable = false, length = 50)
    private String bankAccountId;
    @Basic
    @Column(name = "IsOwner", nullable = true)
    private Boolean isOwner;
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
    @Column(name = "IsUsed", nullable = true)
    private Boolean isUsed;

    public String getUserBankAccountId() {
        return userBankAccountId;
    }

    public void setUserBankAccountId(String userBankAccountId) {
        this.userBankAccountId = userBankAccountId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(String bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public Boolean getOwner() {
        return isOwner;
    }

    public void setOwner(Boolean owner) {
        isOwner = owner;
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

    public Boolean getUsed() {
        return isUsed;
    }

    public void setUsed(Boolean used) {
        isUsed = used;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Userbankaccount that = (Userbankaccount) o;

        if (userBankAccountId != null ? !userBankAccountId.equals(that.userBankAccountId) : that.userBankAccountId != null)
            return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (bankAccountId != null ? !bankAccountId.equals(that.bankAccountId) : that.bankAccountId != null)
            return false;
        if (isOwner != null ? !isOwner.equals(that.isOwner) : that.isOwner != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (isUsed != null ? !isUsed.equals(that.isUsed) : that.isUsed != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userBankAccountId != null ? userBankAccountId.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (bankAccountId != null ? bankAccountId.hashCode() : 0);
        result = 31 * result + (isOwner != null ? isOwner.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (isUsed != null ? isUsed.hashCode() : 0);
        return result;
    }
}
