package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "rentvehiclefaretables")
public class Rentvehiclefaretable {
    @Id
    @Column(name = "FareRentID", nullable = false, length = 50)
    private String id;

    @Column(name = "CityID", nullable = false)
    private Integer cityID;

    @Column(name = "CarTypeID", nullable = false)
    private Integer carTypeID;

    @Column(name = "CarMakerID", nullable = false)
    private Integer carMakerID;

    @Column(name = "CarLevel", nullable = false)
    private String carLevel;

    @Column(name = "Status", nullable = false, length = 4)
    private String status;

    @Column(name = "WorkingDayFeeAutoGear", nullable = false)
    private Float workingDayFeeAutoGear;

    @Column(name = "WorkingDayFeeManualGear", nullable = false)
    private Float workingDayFeeManualGear;

    @Column(name = "WeekendDayFeeManualGear", nullable = false)
    private Float weekendDayFeeManualGear;

    @Column(name = "WeekendDayFeeAutoGear", nullable = false)
    private Float weekendDayFeeAutoGear;

    @Column(name = "OverKMFee", nullable = false)
    private Float overKMFee;

    @Column(name = "OverTimeFee", nullable = false)
    private Float overTimeFee;

    @Column(name = "StartDate", nullable = false)
    private Instant startDate;

    @Column(name = "LimitedTimeFrom", nullable = false)
    private Byte limitedTimeFrom;

    @Column(name = "LimitedTimeTo", nullable = false)
    private Byte limitedTimeTo;

    @Column(name = "LimitedKM", nullable = false)
    private Float limitedKM;

    @Column(name = "RateOfCost", nullable = false)
    private Float rateOfCost;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    public Integer getCarTypeID() {
        return carTypeID;
    }

    public void setCarTypeID(Integer carTypeID) {
        this.carTypeID = carTypeID;
    }

    public Integer getCarMakerID() {
        return carMakerID;
    }

    public void setCarMakerID(Integer carMakerID) {
        this.carMakerID = carMakerID;
    }

    public String getCarLevel() {
        return carLevel;
    }

    public void setCarLevel(String carLevel) {
        this.carLevel = carLevel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Float getWorkingDayFeeAutoGear() {
        return workingDayFeeAutoGear;
    }

    public void setWorkingDayFeeAutoGear(Float workingDayFeeAutoGear) {
        this.workingDayFeeAutoGear = workingDayFeeAutoGear;
    }

    public Float getWorkingDayFeeManualGear() {
        return workingDayFeeManualGear;
    }

    public void setWorkingDayFeeManualGear(Float workingDayFeeManualGear) {
        this.workingDayFeeManualGear = workingDayFeeManualGear;
    }

    public Float getWeekendDayFeeManualGear() {
        return weekendDayFeeManualGear;
    }

    public void setWeekendDayFeeManualGear(Float weekendDayFeeManualGear) {
        this.weekendDayFeeManualGear = weekendDayFeeManualGear;
    }

    public Float getWeekendDayFeeAutoGear() {
        return weekendDayFeeAutoGear;
    }

    public void setWeekendDayFeeAutoGear(Float weekendDayFeeAutoGear) {
        this.weekendDayFeeAutoGear = weekendDayFeeAutoGear;
    }

    public Float getOverKMFee() {
        return overKMFee;
    }

    public void setOverKMFee(Float overKMFee) {
        this.overKMFee = overKMFee;
    }

    public Float getOverTimeFee() {
        return overTimeFee;
    }

    public void setOverTimeFee(Float overTimeFee) {
        this.overTimeFee = overTimeFee;
    }

    public Instant getStartDate() {
        return startDate;
    }

    public void setStartDate(Instant startDate) {
        this.startDate = startDate;
    }

    public Byte getLimitedTimeFrom() {
        return limitedTimeFrom;
    }

    public void setLimitedTimeFrom(Byte limitedTimeFrom) {
        this.limitedTimeFrom = limitedTimeFrom;
    }

    public Byte getLimitedTimeTo() {
        return limitedTimeTo;
    }

    public void setLimitedTimeTo(Byte limitedTimeTo) {
        this.limitedTimeTo = limitedTimeTo;
    }

    public Float getLimitedKM() {
        return limitedKM;
    }

    public void setLimitedKM(Float limitedKM) {
        this.limitedKM = limitedKM;
    }

    public Float getRateOfCost() {
        return rateOfCost;
    }

    public void setRateOfCost(Float rateOfCost) {
        this.rateOfCost = rateOfCost;
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