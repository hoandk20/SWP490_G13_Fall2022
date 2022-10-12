package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "tripadjust")
public class Tripadjust {
    @Id
    @Column(name = "TripadjustID", nullable = false)
    private Integer id;

    @Column(name = "Type", nullable = false, length = 4)
    private String type;

    @Column(name = "RiderTransactionID", length = 45)
    private String riderTransactionID;

    @Column(name = "AccountTransactionID", length = 45)
    private String accountTransactionID;

    @Column(name = "Amount", nullable = false)
    private Double amount;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "AdjustAmount", nullable = false)
    private Double adjustAmount;

    @Column(name = "TripId", length = 45)
    private String tripId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRiderTransactionID() {
        return riderTransactionID;
    }

    public void setRiderTransactionID(String riderTransactionID) {
        this.riderTransactionID = riderTransactionID;
    }

    public String getAccountTransactionID() {
        return accountTransactionID;
    }

    public void setAccountTransactionID(String accountTransactionID) {
        this.accountTransactionID = accountTransactionID;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
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

    public Double getAdjustAmount() {
        return adjustAmount;
    }

    public void setAdjustAmount(Double adjustAmount) {
        this.adjustAmount = adjustAmount;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

}