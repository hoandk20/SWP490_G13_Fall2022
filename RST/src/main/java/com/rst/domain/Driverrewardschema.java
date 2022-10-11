package com.rst.domain;

import javax.persistence.*;

@Entity
@Table(name = "driverrewardschema")
public class Driverrewardschema {
    @Id
    @Column(name = "RewardSchemaId", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "ProgramCode", referencedColumnName = "ProgramCode", nullable = false),
            @JoinColumn(name = "CompanyCode", referencedColumnName = "CompanyCode", nullable = false)
    })
    private Promotionprogram promotionprogram;

    @Column(name = "FareFrom", nullable = false)
    private Double fareFrom;

    @Column(name = "NoTrip", nullable = false)
    private Short noTrip;

    @Column(name = "DistanceFrom", nullable = false)
    private Float distanceFrom;

    @Column(name = "Reward", nullable = false)
    private Double reward;

    @Column(name = "FareTo", nullable = false)
    private Double fareTo;

    @Column(name = "DistanceTo")
    private Float distanceTo;

    @Column(name = "PointFrom", nullable = false)
    private Short pointFrom;

    @Column(name = "PointTo", nullable = false)
    private Short pointTo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Promotionprogram getPromotionprogram() {
        return promotionprogram;
    }

    public void setPromotionprogram(Promotionprogram promotionprogram) {
        this.promotionprogram = promotionprogram;
    }

    public Double getFareFrom() {
        return fareFrom;
    }

    public void setFareFrom(Double fareFrom) {
        this.fareFrom = fareFrom;
    }

    public Short getNoTrip() {
        return noTrip;
    }

    public void setNoTrip(Short noTrip) {
        this.noTrip = noTrip;
    }

    public Float getDistanceFrom() {
        return distanceFrom;
    }

    public void setDistanceFrom(Float distanceFrom) {
        this.distanceFrom = distanceFrom;
    }

    public Double getReward() {
        return reward;
    }

    public void setReward(Double reward) {
        this.reward = reward;
    }

    public Double getFareTo() {
        return fareTo;
    }

    public void setFareTo(Double fareTo) {
        this.fareTo = fareTo;
    }

    public Float getDistanceTo() {
        return distanceTo;
    }

    public void setDistanceTo(Float distanceTo) {
        this.distanceTo = distanceTo;
    }

    public Short getPointFrom() {
        return pointFrom;
    }

    public void setPointFrom(Short pointFrom) {
        this.pointFrom = pointFrom;
    }

    public Short getPointTo() {
        return pointTo;
    }

    public void setPointTo(Short pointTo) {
        this.pointTo = pointTo;
    }

}