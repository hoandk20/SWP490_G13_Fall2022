package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Bankfee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "BankFeeID", nullable = false)
    private int bankFeeId;
    @Basic
    @Column(name = "PercentageFee", nullable = false, precision = 0)
    private double percentageFee;
    @Basic
    @Column(name = "FixedFee", nullable = false, precision = 0)
    private double fixedFee;
    @Basic
    @Column(name = "StartDate", nullable = false)
    private Timestamp startDate;
    @Basic
    @Column(name = "EndDate", nullable = false)
    private Timestamp endDate;
    @Basic
    @Column(name = "Type", nullable = false, length = 4)
    private String type;
    @Basic
    @Column(name = "CreatedDate", nullable = false)
    private Timestamp createdDate;
    @Basic
    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;
    @Basic
    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;
    @Basic
    @Column(name = "LastModifiedDate", nullable = false)
    private Timestamp lastModifiedDate;
    @Basic
    @Column(name = "Currency", nullable = true, length = 4)
    private String currency;
    @Basic
    @Column(name = "HoldRate", nullable = true, precision = 0)
    private Double holdRate;

    public int getBankFeeId() {
        return bankFeeId;
    }

    public void setBankFeeId(int bankFeeId) {
        this.bankFeeId = bankFeeId;
    }

    public double getPercentageFee() {
        return percentageFee;
    }

    public void setPercentageFee(double percentageFee) {
        this.percentageFee = percentageFee;
    }

    public double getFixedFee() {
        return fixedFee;
    }

    public void setFixedFee(double fixedFee) {
        this.fixedFee = fixedFee;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getHoldRate() {
        return holdRate;
    }

    public void setHoldRate(Double holdRate) {
        this.holdRate = holdRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bankfee bankfee = (Bankfee) o;

        if (bankFeeId != bankfee.bankFeeId) return false;
        if (Double.compare(bankfee.percentageFee, percentageFee) != 0) return false;
        if (Double.compare(bankfee.fixedFee, fixedFee) != 0) return false;
        if (startDate != null ? !startDate.equals(bankfee.startDate) : bankfee.startDate != null) return false;
        if (endDate != null ? !endDate.equals(bankfee.endDate) : bankfee.endDate != null) return false;
        if (type != null ? !type.equals(bankfee.type) : bankfee.type != null) return false;
        if (createdDate != null ? !createdDate.equals(bankfee.createdDate) : bankfee.createdDate != null) return false;
        if (createdBy != null ? !createdBy.equals(bankfee.createdBy) : bankfee.createdBy != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(bankfee.lastModifiedBy) : bankfee.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(bankfee.lastModifiedDate) : bankfee.lastModifiedDate != null)
            return false;
        if (currency != null ? !currency.equals(bankfee.currency) : bankfee.currency != null) return false;
        if (holdRate != null ? !holdRate.equals(bankfee.holdRate) : bankfee.holdRate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = bankFeeId;
        temp = Double.doubleToLongBits(percentageFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(fixedFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (holdRate != null ? holdRate.hashCode() : 0);
        return result;
    }
}
