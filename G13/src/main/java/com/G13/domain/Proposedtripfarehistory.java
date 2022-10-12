package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "proposedtripfarehistory")
public class Proposedtripfarehistory {
    @Id
    @Column(name = "ProposedTripFareHistoryID", nullable = false)
    private Integer id;

    @Column(name = "PromotionTripID", nullable = false, length = 50)
    private String promotionTripID;

    @Column(name = "ProposedFare", nullable = false)
    private Float proposedFare;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPromotionTripID() {
        return promotionTripID;
    }

    public void setPromotionTripID(String promotionTripID) {
        this.promotionTripID = promotionTripID;
    }

    public Float getProposedFare() {
        return proposedFare;
    }

    public void setProposedFare(Float proposedFare) {
        this.proposedFare = proposedFare;
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

}