package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "fareratepanel")
public class Fareratepanel {
    @Id
    @Column(name = "FareRatePanelID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CountryCode")
    private Country countryCode;

    @Column(name = "FirstRiderRange", nullable = false)
    private Integer firstRiderRange;

    @Column(name = "FirstRate", nullable = false)
    private Double firstRate;

    @Column(name = "SecondRiderRange", nullable = false)
    private Integer secondRiderRange;

    @Column(name = "SecondRate", nullable = false)
    private Double secondRate;

    @Column(name = "ThirdRiderRange", nullable = false)
    private Integer thirdRiderRange;

    @Column(name = "ThirdRate", nullable = false)
    private Double thirdRate;

    @Column(name = "FourthRiderRange", nullable = false)
    private Integer fourthRiderRange;

    @Column(name = "FourthRate", nullable = false)
    private Double fourthRate;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "MinRider", nullable = false)
    private Integer minRider;

    @Column(name = "MaxRider", nullable = false)
    private Integer maxRider;

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

    public Integer getFirstRiderRange() {
        return firstRiderRange;
    }

    public void setFirstRiderRange(Integer firstRiderRange) {
        this.firstRiderRange = firstRiderRange;
    }

    public Double getFirstRate() {
        return firstRate;
    }

    public void setFirstRate(Double firstRate) {
        this.firstRate = firstRate;
    }

    public Integer getSecondRiderRange() {
        return secondRiderRange;
    }

    public void setSecondRiderRange(Integer secondRiderRange) {
        this.secondRiderRange = secondRiderRange;
    }

    public Double getSecondRate() {
        return secondRate;
    }

    public void setSecondRate(Double secondRate) {
        this.secondRate = secondRate;
    }

    public Integer getThirdRiderRange() {
        return thirdRiderRange;
    }

    public void setThirdRiderRange(Integer thirdRiderRange) {
        this.thirdRiderRange = thirdRiderRange;
    }

    public Double getThirdRate() {
        return thirdRate;
    }

    public void setThirdRate(Double thirdRate) {
        this.thirdRate = thirdRate;
    }

    public Integer getFourthRiderRange() {
        return fourthRiderRange;
    }

    public void setFourthRiderRange(Integer fourthRiderRange) {
        this.fourthRiderRange = fourthRiderRange;
    }

    public Double getFourthRate() {
        return fourthRate;
    }

    public void setFourthRate(Double fourthRate) {
        this.fourthRate = fourthRate;
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

    public Integer getMinRider() {
        return minRider;
    }

    public void setMinRider(Integer minRider) {
        this.minRider = minRider;
    }

    public Integer getMaxRider() {
        return maxRider;
    }

    public void setMaxRider(Integer maxRider) {
        this.maxRider = maxRider;
    }

}