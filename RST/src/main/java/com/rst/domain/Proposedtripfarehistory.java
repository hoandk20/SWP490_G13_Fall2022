package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "proposedtripfarehistory")
public class Proposedtripfarehistory {
    @Id
    @Column(name = "ProposedTripFareHistoryID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PromotionTripID", nullable = false)
    private Promotiontrip promotionTripID;

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

    public Promotiontrip getPromotionTripID() {
        return promotionTripID;
    }

    public void setPromotionTripID(Promotiontrip promotionTripID) {
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