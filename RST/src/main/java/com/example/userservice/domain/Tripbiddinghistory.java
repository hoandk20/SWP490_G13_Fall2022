package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Tripbiddinghistory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TripBiddingHistoryId", nullable = false, length = 50)
    private String tripBiddingHistoryId;
    @Basic
    @Column(name = "PromotionTripID", nullable = false, length = 50)
    private String promotionTripId;
    @Basic
    @Column(name = "BidFare", nullable = true, precision = 0)
    private Double bidFare;
    @Basic
    @Column(name = "DriverID", nullable = false, length = 50)
    private String driverId;
    @Basic
    @Column(name = "CreatedDate", nullable = false)
    private Timestamp createdDate;
    @Basic
    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;
    @Basic
    @Column(name = "Cancelled", nullable = true)
    private Boolean cancelled;
    @Basic
    @Column(name = "BidTime", nullable = false)
    private byte bidTime;
    @Basic
    @Column(name = "Note", nullable = true, length = 500)
    private String note;
    @Basic
    @Column(name = "ReasonCode", nullable = true, length = 2)
    private String reasonCode;

    public String getTripBiddingHistoryId() {
        return tripBiddingHistoryId;
    }

    public void setTripBiddingHistoryId(String tripBiddingHistoryId) {
        this.tripBiddingHistoryId = tripBiddingHistoryId;
    }

    public String getPromotionTripId() {
        return promotionTripId;
    }

    public void setPromotionTripId(String promotionTripId) {
        this.promotionTripId = promotionTripId;
    }

    public Double getBidFare() {
        return bidFare;
    }

    public void setBidFare(Double bidFare) {
        this.bidFare = bidFare;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
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

    public Boolean getCancelled() {
        return cancelled;
    }

    public void setCancelled(Boolean cancelled) {
        this.cancelled = cancelled;
    }

    public byte getBidTime() {
        return bidTime;
    }

    public void setBidTime(byte bidTime) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tripbiddinghistory that = (Tripbiddinghistory) o;

        if (bidTime != that.bidTime) return false;
        if (tripBiddingHistoryId != null ? !tripBiddingHistoryId.equals(that.tripBiddingHistoryId) : that.tripBiddingHistoryId != null)
            return false;
        if (promotionTripId != null ? !promotionTripId.equals(that.promotionTripId) : that.promotionTripId != null)
            return false;
        if (bidFare != null ? !bidFare.equals(that.bidFare) : that.bidFare != null) return false;
        if (driverId != null ? !driverId.equals(that.driverId) : that.driverId != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (cancelled != null ? !cancelled.equals(that.cancelled) : that.cancelled != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (reasonCode != null ? !reasonCode.equals(that.reasonCode) : that.reasonCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tripBiddingHistoryId != null ? tripBiddingHistoryId.hashCode() : 0;
        result = 31 * result + (promotionTripId != null ? promotionTripId.hashCode() : 0);
        result = 31 * result + (bidFare != null ? bidFare.hashCode() : 0);
        result = 31 * result + (driverId != null ? driverId.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (cancelled != null ? cancelled.hashCode() : 0);
        result = 31 * result + (int) bidTime;
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (reasonCode != null ? reasonCode.hashCode() : 0);
        return result;
    }
}
