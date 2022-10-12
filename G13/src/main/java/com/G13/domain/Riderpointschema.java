package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "riderpointschema")
public class Riderpointschema {
    @Id
    @Column(name = "RiderPointSchemaID", nullable = false)
    private Integer id;

    @Column(name = "Title", length = 100)
    private String title;

    @Column(name = "StartDate", nullable = false)
    private LocalDate startDate;

    @Column(name = "EndDate")
    private Instant endDate;

    @Column(name = "FirstFare")
    private Float firstFare;

    @Column(name = "FirstPoint")
    private Float firstPoint;

    @Column(name = "SecondFare")
    private Float secondFare;

    @Column(name = "SecondPoint")
    private Float secondPoint;

    @Column(name = "ThirdFare")
    private Float thirdFare;

    @Column(name = "ThirdPoint")
    private Float thirdPoint;

    @Column(name = "FourthFare")
    private Float fourthFare;

    @Column(name = "FourthPoint")
    private Float fourthPoint;

    @Column(name = "CancelledPoint")
    private Float cancelledPoint;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "CountryCode", nullable = false, length = 4)
    private String countryCode;

    @Column(name = "Status", length = 4)
    private String status;

    @Column(name = "CancelFee", nullable = false)
    private Float cancelFee;

    @Column(name = "FifthPoint", nullable = false)
    private Float fifthPoint;

    @Column(name = "Level", length = 4)
    private String level;

    @Column(name = "RatioPointTnet")
    private Float ratioPointTnet;

    @Column(name = "RatioPointCar")
    private Float ratioPointCar;

    @Column(name = "RatioPointBike")
    private Float ratioPointBike;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Instant getEndDate() {
        return endDate;
    }

    public void setEndDate(Instant endDate) {
        this.endDate = endDate;
    }

    public Float getFirstFare() {
        return firstFare;
    }

    public void setFirstFare(Float firstFare) {
        this.firstFare = firstFare;
    }

    public Float getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Float firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Float getSecondFare() {
        return secondFare;
    }

    public void setSecondFare(Float secondFare) {
        this.secondFare = secondFare;
    }

    public Float getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Float secondPoint) {
        this.secondPoint = secondPoint;
    }

    public Float getThirdFare() {
        return thirdFare;
    }

    public void setThirdFare(Float thirdFare) {
        this.thirdFare = thirdFare;
    }

    public Float getThirdPoint() {
        return thirdPoint;
    }

    public void setThirdPoint(Float thirdPoint) {
        this.thirdPoint = thirdPoint;
    }

    public Float getFourthFare() {
        return fourthFare;
    }

    public void setFourthFare(Float fourthFare) {
        this.fourthFare = fourthFare;
    }

    public Float getFourthPoint() {
        return fourthPoint;
    }

    public void setFourthPoint(Float fourthPoint) {
        this.fourthPoint = fourthPoint;
    }

    public Float getCancelledPoint() {
        return cancelledPoint;
    }

    public void setCancelledPoint(Float cancelledPoint) {
        this.cancelledPoint = cancelledPoint;
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

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Float getCancelFee() {
        return cancelFee;
    }

    public void setCancelFee(Float cancelFee) {
        this.cancelFee = cancelFee;
    }

    public Float getFifthPoint() {
        return fifthPoint;
    }

    public void setFifthPoint(Float fifthPoint) {
        this.fifthPoint = fifthPoint;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Float getRatioPointTnet() {
        return ratioPointTnet;
    }

    public void setRatioPointTnet(Float ratioPointTnet) {
        this.ratioPointTnet = ratioPointTnet;
    }

    public Float getRatioPointCar() {
        return ratioPointCar;
    }

    public void setRatioPointCar(Float ratioPointCar) {
        this.ratioPointCar = ratioPointCar;
    }

    public Float getRatioPointBike() {
        return ratioPointBike;
    }

    public void setRatioPointBike(Float ratioPointBike) {
        this.ratioPointBike = ratioPointBike;
    }

}