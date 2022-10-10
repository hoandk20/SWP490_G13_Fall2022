package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Bank {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "BankID", nullable = false)
    private int bankId;
    @Basic
    @Column(name = "BankName", nullable = true, length = 100)
    private String bankName;
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
    @Column(name = "ShortName", nullable = true, length = 10)
    private String shortName;

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
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

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bank bank = (Bank) o;

        if (bankId != bank.bankId) return false;
        if (bankName != null ? !bankName.equals(bank.bankName) : bank.bankName != null) return false;
        if (createdBy != null ? !createdBy.equals(bank.createdBy) : bank.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(bank.createdDate) : bank.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(bank.lastModifiedBy) : bank.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(bank.lastModifiedDate) : bank.lastModifiedDate != null)
            return false;
        if (shortName != null ? !shortName.equals(bank.shortName) : bank.shortName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bankId;
        result = 31 * result + (bankName != null ? bankName.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (shortName != null ? shortName.hashCode() : 0);
        return result;
    }
}
