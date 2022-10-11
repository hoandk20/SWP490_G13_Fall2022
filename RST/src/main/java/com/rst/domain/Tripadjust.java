package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "tripadjust")
public class Tripadjust {
    @Id
    @Column(name = "TripadjustID", nullable = false)
    private Integer id;

    @Column(name = "Type", nullable = false, length = 4)
    private String type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RiderTransactionID")
    private Ridertransaction riderTransactionID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AccountTransactionID")
    private Accounttransaction accountTransactionID;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TripId")
    private Trip trip;

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

    public Ridertransaction getRiderTransactionID() {
        return riderTransactionID;
    }

    public void setRiderTransactionID(Ridertransaction riderTransactionID) {
        this.riderTransactionID = riderTransactionID;
    }

    public Accounttransaction getAccountTransactionID() {
        return accountTransactionID;
    }

    public void setAccountTransactionID(Accounttransaction accountTransactionID) {
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

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

}