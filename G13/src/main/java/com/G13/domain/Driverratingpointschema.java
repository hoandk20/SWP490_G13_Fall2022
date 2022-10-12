package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "driverratingpointschema")
public class Driverratingpointschema {
    @Id
    @Column(name = "DriverRatingPointSchemaID", nullable = false)
    private Integer id;

    @Column(name = "FiveStarRatio")
    private Float fiveStarRatio;

    @Column(name = "FourStarRatio")
    private Float fourStarRatio;

    @Column(name = "ThreeStarRatio")
    private Float threeStarRatio;

    @Column(name = "LessTwoStarRatio")
    private Float lessTwoStarRatio;

    @Column(name = "NoRatingRatio")
    private Float noRatingRatio;

    @Column(name = "StartDate", nullable = false)
    private LocalDate startDate;

    @Column(name = "EndDate")
    private LocalDate endDate;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getFiveStarRatio() {
        return fiveStarRatio;
    }

    public void setFiveStarRatio(Float fiveStarRatio) {
        this.fiveStarRatio = fiveStarRatio;
    }

    public Float getFourStarRatio() {
        return fourStarRatio;
    }

    public void setFourStarRatio(Float fourStarRatio) {
        this.fourStarRatio = fourStarRatio;
    }

    public Float getThreeStarRatio() {
        return threeStarRatio;
    }

    public void setThreeStarRatio(Float threeStarRatio) {
        this.threeStarRatio = threeStarRatio;
    }

    public Float getLessTwoStarRatio() {
        return lessTwoStarRatio;
    }

    public void setLessTwoStarRatio(Float lessTwoStarRatio) {
        this.lessTwoStarRatio = lessTwoStarRatio;
    }

    public Float getNoRatingRatio() {
        return noRatingRatio;
    }

    public void setNoRatingRatio(Float noRatingRatio) {
        this.noRatingRatio = noRatingRatio;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
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

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Instant lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

}