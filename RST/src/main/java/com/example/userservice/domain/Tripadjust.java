package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Tripadjust {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TripadjustID", nullable = false)
    private int tripadjustId;
    @Basic
    @Column(name = "Type", nullable = false, length = 4)
    private String type;
    @Basic
    @Column(name = "RiderTransactionID", nullable = true, length = 45)
    private String riderTransactionId;
    @Basic
    @Column(name = "AccountTransactionID", nullable = true, length = 45)
    private String accountTransactionId;
    @Basic
    @Column(name = "Amount", nullable = false, precision = 0)
    private double amount;
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
    @Column(name = "AdjustAmount", nullable = false, precision = 0)
    private double adjustAmount;
    @Basic
    @Column(name = "TripId", nullable = true, length = 45)
    private String tripId;

    public int getTripadjustId() {
        return tripadjustId;
    }

    public void setTripadjustId(int tripadjustId) {
        this.tripadjustId = tripadjustId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRiderTransactionId() {
        return riderTransactionId;
    }

    public void setRiderTransactionId(String riderTransactionId) {
        this.riderTransactionId = riderTransactionId;
    }

    public String getAccountTransactionId() {
        return accountTransactionId;
    }

    public void setAccountTransactionId(String accountTransactionId) {
        this.accountTransactionId = accountTransactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
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

    public double getAdjustAmount() {
        return adjustAmount;
    }

    public void setAdjustAmount(double adjustAmount) {
        this.adjustAmount = adjustAmount;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tripadjust that = (Tripadjust) o;

        if (tripadjustId != that.tripadjustId) return false;
        if (Double.compare(that.amount, amount) != 0) return false;
        if (Double.compare(that.adjustAmount, adjustAmount) != 0) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (riderTransactionId != null ? !riderTransactionId.equals(that.riderTransactionId) : that.riderTransactionId != null)
            return false;
        if (accountTransactionId != null ? !accountTransactionId.equals(that.accountTransactionId) : that.accountTransactionId != null)
            return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (tripId != null ? !tripId.equals(that.tripId) : that.tripId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = tripadjustId;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (riderTransactionId != null ? riderTransactionId.hashCode() : 0);
        result = 31 * result + (accountTransactionId != null ? accountTransactionId.hashCode() : 0);
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        temp = Double.doubleToLongBits(adjustAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (tripId != null ? tripId.hashCode() : 0);
        return result;
    }
}
