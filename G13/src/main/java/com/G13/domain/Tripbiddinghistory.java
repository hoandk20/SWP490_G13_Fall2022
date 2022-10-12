package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "tripbiddinghistory")
public class Tripbiddinghistory {
    @Id
    @Column(name = "TripBiddingHistoryId", nullable = false, length = 50)
    private String id;

    @Column(name = "PromotionTripID", nullable = false, length = 50)
    private String promotionTripID;

    @Column(name = "BidFare")
    private Float bidFare;

    @Column(name = "DriverID", nullable = false, length = 50)
    private String driverID;

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

    public String getPromotionTripID() {
        return promotionTripID;
    }

    public void setPromotionTripID(String promotionTripID) {
        this.promotionTripID = promotionTripID;
    }

    public Float getBidFare() {
        return bidFare;
    }

    public void setBidFare(Float bidFare) {
        this.bidFare = bidFare;
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
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