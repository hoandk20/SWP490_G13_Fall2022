package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Rentvehiclefaretables {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "FareRentID", nullable = false, length = 50)
    private String fareRentId;
    @Basic
    @Column(name = "CityID", nullable = false)
    private int cityId;
    @Basic
    @Column(name = "CarTypeID", nullable = false)
    private int carTypeId;
    @Basic
    @Column(name = "CarMakerID", nullable = false)
    private int carMakerId;
    @Basic
    @Column(name = "CarLevel", nullable = false, length = 255)
    private String carLevel;
    @Basic
    @Column(name = "Status", nullable = false, length = 4)
    private String status;
    @Basic
    @Column(name = "WorkingDayFeeAutoGear", nullable = false, precision = 0)
    private double workingDayFeeAutoGear;
    @Basic
    @Column(name = "WorkingDayFeeManualGear", nullable = false, precision = 0)
    private double workingDayFeeManualGear;
    @Basic
    @Column(name = "WeekendDayFeeManualGear", nullable = false, precision = 0)
    private double weekendDayFeeManualGear;
    @Basic
    @Column(name = "WeekendDayFeeAutoGear", nullable = false, precision = 0)
    private double weekendDayFeeAutoGear;
    @Basic
    @Column(name = "OverKMFee", nullable = false, precision = 0)
    private double overKmFee;
    @Basic
    @Column(name = "OverTimeFee", nullable = false, precision = 0)
    private double overTimeFee;
    @Basic
    @Column(name = "StartDate", nullable = false)
    private Timestamp startDate;
    @Basic
    @Column(name = "LimitedTimeFrom", nullable = false)
    private byte limitedTimeFrom;
    @Basic
    @Column(name = "LimitedTimeTo", nullable = false)
    private byte limitedTimeTo;
    @Basic
    @Column(name = "LimitedKM", nullable = false, precision = 0)
    private double limitedKm;
    @Basic
    @Column(name = "RateOfCost", nullable = false, precision = 0)
    private double rateOfCost;
    @Basic
    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;
    @Basic
    @Column(name = "CreatedDate", nullable = false)
    private Timestamp createdDate;
    @Basic
    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;
    @Basic
    @Column(name = "LastModifiedDate", nullable = false)
    private Timestamp lastModifiedDate;

    public String getFareRentId() {
        return fareRentId;
    }

    public void setFareRentId(String fareRentId) {
        this.fareRentId = fareRentId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(int carTypeId) {
        this.carTypeId = carTypeId;
    }

    public int getCarMakerId() {
        return carMakerId;
    }

    public void setCarMakerId(int carMakerId) {
        this.carMakerId = carMakerId;
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

    public double getWorkingDayFeeAutoGear() {
        return workingDayFeeAutoGear;
    }

    public void setWorkingDayFeeAutoGear(double workingDayFeeAutoGear) {
        this.workingDayFeeAutoGear = workingDayFeeAutoGear;
    }

    public double getWorkingDayFeeManualGear() {
        return workingDayFeeManualGear;
    }

    public void setWorkingDayFeeManualGear(double workingDayFeeManualGear) {
        this.workingDayFeeManualGear = workingDayFeeManualGear;
    }

    public double getWeekendDayFeeManualGear() {
        return weekendDayFeeManualGear;
    }

    public void setWeekendDayFeeManualGear(double weekendDayFeeManualGear) {
        this.weekendDayFeeManualGear = weekendDayFeeManualGear;
    }

    public double getWeekendDayFeeAutoGear() {
        return weekendDayFeeAutoGear;
    }

    public void setWeekendDayFeeAutoGear(double weekendDayFeeAutoGear) {
        this.weekendDayFeeAutoGear = weekendDayFeeAutoGear;
    }

    public double getOverKmFee() {
        return overKmFee;
    }

    public void setOverKmFee(double overKmFee) {
        this.overKmFee = overKmFee;
    }

    public double getOverTimeFee() {
        return overTimeFee;
    }

    public void setOverTimeFee(double overTimeFee) {
        this.overTimeFee = overTimeFee;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public byte getLimitedTimeFrom() {
        return limitedTimeFrom;
    }

    public void setLimitedTimeFrom(byte limitedTimeFrom) {
        this.limitedTimeFrom = limitedTimeFrom;
    }

    public byte getLimitedTimeTo() {
        return limitedTimeTo;
    }

    public void setLimitedTimeTo(byte limitedTimeTo) {
        this.limitedTimeTo = limitedTimeTo;
    }

    public double getLimitedKm() {
        return limitedKm;
    }

    public void setLimitedKm(double limitedKm) {
        this.limitedKm = limitedKm;
    }

    public double getRateOfCost() {
        return rateOfCost;
    }

    public void setRateOfCost(double rateOfCost) {
        this.rateOfCost = rateOfCost;
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

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Timestamp getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rentvehiclefaretables that = (Rentvehiclefaretables) o;

        if (cityId != that.cityId) return false;
        if (carTypeId != that.carTypeId) return false;
        if (carMakerId != that.carMakerId) return false;
        if (Double.compare(that.workingDayFeeAutoGear, workingDayFeeAutoGear) != 0) return false;
        if (Double.compare(that.workingDayFeeManualGear, workingDayFeeManualGear) != 0) return false;
        if (Double.compare(that.weekendDayFeeManualGear, weekendDayFeeManualGear) != 0) return false;
        if (Double.compare(that.weekendDayFeeAutoGear, weekendDayFeeAutoGear) != 0) return false;
        if (Double.compare(that.overKmFee, overKmFee) != 0) return false;
        if (Double.compare(that.overTimeFee, overTimeFee) != 0) return false;
        if (limitedTimeFrom != that.limitedTimeFrom) return false;
        if (limitedTimeTo != that.limitedTimeTo) return false;
        if (Double.compare(that.limitedKm, limitedKm) != 0) return false;
        if (Double.compare(that.rateOfCost, rateOfCost) != 0) return false;
        if (fareRentId != null ? !fareRentId.equals(that.fareRentId) : that.fareRentId != null) return false;
        if (carLevel != null ? !carLevel.equals(that.carLevel) : that.carLevel != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = fareRentId != null ? fareRentId.hashCode() : 0;
        result = 31 * result + cityId;
        result = 31 * result + carTypeId;
        result = 31 * result + carMakerId;
        result = 31 * result + (carLevel != null ? carLevel.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        temp = Double.doubleToLongBits(workingDayFeeAutoGear);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(workingDayFeeManualGear);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weekendDayFeeManualGear);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weekendDayFeeAutoGear);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(overKmFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(overTimeFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (int) limitedTimeFrom;
        result = 31 * result + (int) limitedTimeTo;
        temp = Double.doubleToLongBits(limitedKm);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(rateOfCost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        return result;
    }
}
