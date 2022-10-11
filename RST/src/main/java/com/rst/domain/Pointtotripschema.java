package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "pointtotripschema")
public class Pointtotripschema {
    @Id
    @Column(name = "PointToTripSchemaId", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country countryCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CityID")
    private City cityID;

    @Column(name = "FirstPoint", nullable = false)
    private Integer firstPoint;

    @Column(name = "NoTrip1", nullable = false)
    private Integer noTrip1;

    @Column(name = "FirstReward", nullable = false)
    private Double firstReward;

    @Column(name = "SecondPoint", nullable = false)
    private Integer secondPoint;

    @Column(name = "NoTrip2", nullable = false)
    private Integer noTrip2;

    @Column(name = "SecondReward", nullable = false)
    private Double secondReward;

    @Column(name = "ThirdPoint", nullable = false)
    private Integer thirdPoint;

    @Column(name = "NoTrip3", nullable = false)
    private Integer noTrip3;

    @Column(name = "ThirdReward", nullable = false)
    private Double thirdReward;

    @Column(name = "NoTrip4", nullable = false)
    private Integer noTrip4;

    @Column(name = "FourthPoint", nullable = false)
    private Integer fourthPoint;

    @Column(name = "FourthReward", nullable = false)
    private Double fourthReward;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Country getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Country countryCode) {
        this.countryCode = countryCode;
    }

    public City getCityID() {
        return cityID;
    }

    public void setCityID(City cityID) {
        this.cityID = cityID;
    }

    public Integer getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Integer firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Integer getNoTrip1() {
        return noTrip1;
    }

    public void setNoTrip1(Integer noTrip1) {
        this.noTrip1 = noTrip1;
    }

    public Double getFirstReward() {
        return firstReward;
    }

    public void setFirstReward(Double firstReward) {
        this.firstReward = firstReward;
    }

    public Integer getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Integer secondPoint) {
        this.secondPoint = secondPoint;
    }

    public Integer getNoTrip2() {
        return noTrip2;
    }

    public void setNoTrip2(Integer noTrip2) {
        this.noTrip2 = noTrip2;
    }

    public Double getSecondReward() {
        return secondReward;
    }

    public void setSecondReward(Double secondReward) {
        this.secondReward = secondReward;
    }

    public Integer getThirdPoint() {
        return thirdPoint;
    }

    public void setThirdPoint(Integer thirdPoint) {
        this.thirdPoint = thirdPoint;
    }

    public Integer getNoTrip3() {
        return noTrip3;
    }

    public void setNoTrip3(Integer noTrip3) {
        this.noTrip3 = noTrip3;
    }

    public Double getThirdReward() {
        return thirdReward;
    }

    public void setThirdReward(Double thirdReward) {
        this.thirdReward = thirdReward;
    }

    public Integer getNoTrip4() {
        return noTrip4;
    }

    public void setNoTrip4(Integer noTrip4) {
        this.noTrip4 = noTrip4;
    }

    public Integer getFourthPoint() {
        return fourthPoint;
    }

    public void setFourthPoint(Integer fourthPoint) {
        this.fourthPoint = fourthPoint;
    }

    public Double getFourthReward() {
        return fourthReward;
    }

    public void setFourthReward(Double fourthReward) {
        this.fourthReward = fourthReward;
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

}