package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "tripbiddinghistory")
public class Tripbiddinghistory {
    @Id
    @Column(name = "TripBiddingHistoryId", nullable = false, length = 50)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PromotionTripID", nullable = false)
    private Promotiontrip promotionTripID;

    @Column(name = "BidFare")
    private Float bidFare;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DriverID", nullable = false)
    private Driver driverID;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "Cancelled")
    private Boolean cancelled;

    @Column(name = "BidTime", nullable = false)
    private Byte bidTime;

    @Column(name = "Note", length = 500)
    private String note;

    @Column(name = "ReasonCode", length = 2)
    private String reasonCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Promotiontrip getPromotionTripID() {
        return promotionTripID;
    }

    public void setPromotionTripID(Promotiontrip promotionTripID) {
        this.promotionTripID = promotionTripID;
    }

    public Float getBidFare() {
        return bidFare;
    }

    public void setBidFare(Float bidFare) {
        this.bidFare = bidFare;
    }

    public Driver getDriverID() {
        return driverID;
    }

    public void setDriverID(Driver driverID) {
        this.driverID = driverID;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Boolean getCancelled() {
        return cancelled;
    }

    public void setCancelled(Boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Byte getBidTime() {
        return bidTime;
    }

    public void setBidTime(Byte bidTime) {
        this.bidTime = bidTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

}