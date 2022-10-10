package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Proposedtripfarehistory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ProposedTripFareHistoryID", nullable = false)
    private int proposedTripFareHistoryId;
    @Basic
    @Column(name = "PromotionTripID", nullable = false, length = 50)
    private String promotionTripId;
    @Basic
    @Column(name = "ProposedFare", nullable = false, precision = 0)
    private double proposedFare;
    @Basic
    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;
    @Basic
    @Column(name = "CreatedDate", nullable = false)
    private Timestamp createdDate;

    public int getProposedTripFareHistoryId() {
        return proposedTripFareHistoryId;
    }

    public void setProposedTripFareHistoryId(int proposedTripFareHistoryId) {
        this.proposedTripFareHistoryId = proposedTripFareHistoryId;
    }

    public String getPromotionTripId() {
        return promotionTripId;
    }

    public void setPromotionTripId(String promotionTripId) {
        this.promotionTripId = promotionTripId;
    }

    public double getProposedFare() {
        return proposedFare;
    }

    public void setProposedFare(double proposedFare) {
        this.proposedFare = proposedFare;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Proposedtripfarehistory that = (Proposedtripfarehistory) o;

        if (proposedTripFareHistoryId != that.proposedTripFareHistoryId) return false;
        if (Double.compare(that.proposedFare, proposedFare) != 0) return false;
        if (promotionTripId != null ? !promotionTripId.equals(that.promotionTripId) : that.promotionTripId != null)
            return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = proposedTripFareHistoryId;
        result = 31 * result + (promotionTripId != null ? promotionTripId.hashCode() : 0);
        temp = Double.doubleToLongBits(proposedFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        return result;
    }
}
