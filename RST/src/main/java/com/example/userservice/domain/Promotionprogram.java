package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@IdClass(PromotionprogramPK.class)
public class Promotionprogram {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ProgramCode", nullable = false, length = 30)
    private String programCode;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CompanyCode", nullable = false, length = 15)
    private String companyCode;
    @Basic
    @Column(name = "CountryCode", nullable = false, length = 4)
    private String countryCode;
    @Basic
    @Column(name = "Title", nullable = true, length = 200)
    private String title;
    @Basic
    @Column(name = "StartDate", nullable = true)
    private Timestamp startDate;
    @Basic
    @Column(name = "EndDate", nullable = true)
    private Timestamp endDate;
    @Basic
    @Column(name = "ActualEndDate", nullable = true)
    private Timestamp actualEndDate;
    @Basic
    @Column(name = "StartTime", nullable = true)
    private Byte startTime;
    @Basic
    @Column(name = "EndTime", nullable = true)
    private Byte endTime;
    @Basic
    @Column(name = "Type", nullable = true, length = 4)
    private String type;
    @Basic
    @Column(name = "Description", nullable = true, length = 1000)
    private String description;
    @Basic
    @Column(name = "Category", nullable = true, length = 4)
    private String category;
    @Basic
    @Column(name = "TotalValue", nullable = false, precision = 0)
    private double totalValue;
    @Basic
    @Column(name = "MinValueForTrip", nullable = false, precision = 0)
    private double minValueForTrip;
    @Basic
    @Column(name = "NumberOfInviduals", nullable = false)
    private short numberOfInviduals;
    @Basic
    @Column(name = "NumberOfTrips", nullable = false)
    private short numberOfTrips;
    @Basic
    @Column(name = "ValuePerTrip", nullable = false, precision = 0)
    private double valuePerTrip;
    @Basic
    @Column(name = "MaxValuePerTrip", nullable = false, precision = 0)
    private double maxValuePerTrip;
    @Basic
    @Column(name = "InviterMaxValue", nullable = false, precision = 0)
    private double inviterMaxValue;
    @Basic
    @Column(name = "ValueForInvitee", nullable = false, precision = 0)
    private double valueForInvitee;
    @Basic
    @Column(name = "ValueForInviter", nullable = false, precision = 0)
    private double valueForInviter;
    @Basic
    @Column(name = "RequiredNumberTrips", nullable = false)
    private short requiredNumberTrips;
    @Basic
    @Column(name = "MaxInviteeTrips", nullable = false)
    private short maxInviteeTrips;
    @Basic
    @Column(name = "MaxInviterTrips", nullable = false)
    private short maxInviterTrips;
    @Basic
    @Column(name = "MaxNumberInvitees", nullable = false)
    private short maxNumberInvitees;
    @Basic
    @Column(name = "Status", nullable = false, length = 2)
    private String status;
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
    @Basic
    @Column(name = "ActualNumberOfInviduals", nullable = false)
    private short actualNumberOfInviduals;
    @Basic
    @Column(name = "ActualNumberOfTrips", nullable = false)
    private short actualNumberOfTrips;
    @Basic
    @Column(name = "ActualValue", nullable = false, precision = 0)
    private double actualValue;
    @Basic
    @Column(name = "PromotionMethod", nullable = true, length = 4)
    private String promotionMethod;
    @Basic
    @Column(name = "Unit", nullable = true, length = 4)
    private String unit;
    @Basic
    @Column(name = "BeforeDate", nullable = true)
    private Timestamp beforeDate;
    @Basic
    @Column(name = "VehicleLevel", nullable = true, length = 4)
    private String vehicleLevel;
    @Basic
    @Column(name = "FareType", nullable = true, length = 4)
    private String fareType;
    @Basic
    @Column(name = "AdditionType", nullable = true, length = 5)
    private String additionType;
    @Basic
    @Column(name = "CalculatedValue", nullable = false, precision = 0)
    private double calculatedValue;
    @Basic
    @Column(name = "CalculatedNoInviduals", nullable = false)
    private short calculatedNoInviduals;
    @Basic
    @Column(name = "NoExpiredDays", nullable = false)
    private short noExpiredDays;
    @Basic
    @Column(name = "MinDistance", nullable = false, precision = 0)
    private double minDistance;
    @Basic
    @Column(name = "MinOnlineTime", nullable = false)
    private short minOnlineTime;
    @Basic
    @Column(name = "MinAcceptRate", nullable = false, precision = 0)
    private double minAcceptRate;
    @Basic
    @Column(name = "MinCancelRate", nullable = false, precision = 0)
    private double minCancelRate;
    @Basic
    @Column(name = "MinRating", nullable = false, precision = 0)
    private double minRating;
    @Basic
    @Column(name = "Timeline", nullable = true, length = 4)
    private String timeline;
    @Basic
    @Column(name = "MaxDistance", nullable = true, precision = 0)
    private Double maxDistance;
    @Basic
    @Column(name = "PercentLevelBike", nullable = true, precision = 0)
    private Double percentLevelBike;
    @Basic
    @Column(name = "MaxNumOfNRTrips", nullable = true)
    private Byte maxNumOfNrTrips;
    @Basic
    @Column(name = "MaxValueForTrip", nullable = false, precision = 0)
    private double maxValueForTrip;
    @Basic
    @Column(name = "MaxPickupDistance", nullable = false, precision = 0)
    private double maxPickupDistance;
    @Basic
    @Column(name = "MaxTripReward", nullable = false, precision = 0)
    private double maxTripReward;
    @Basic
    @Column(name = "PaymentType", nullable = true, length = 4)
    private String paymentType;
    @Basic
    @Column(name = "NoTripPerDay", nullable = false)
    private byte noTripPerDay;

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public Timestamp getActualEndDate() {
        return actualEndDate;
    }

    public void setActualEndDate(Timestamp actualEndDate) {
        this.actualEndDate = actualEndDate;
    }

    public Byte getStartTime() {
        return startTime;
    }

    public void setStartTime(Byte startTime) {
        this.startTime = startTime;
    }

    public Byte getEndTime() {
        return endTime;
    }

    public void setEndTime(Byte endTime) {
        this.endTime = endTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public double getMinValueForTrip() {
        return minValueForTrip;
    }

    public void setMinValueForTrip(double minValueForTrip) {
        this.minValueForTrip = minValueForTrip;
    }

    public short getNumberOfInviduals() {
        return numberOfInviduals;
    }

    public void setNumberOfInviduals(short numberOfInviduals) {
        this.numberOfInviduals = numberOfInviduals;
    }

    public short getNumberOfTrips() {
        return numberOfTrips;
    }

    public void setNumberOfTrips(short numberOfTrips) {
        this.numberOfTrips = numberOfTrips;
    }

    public double getValuePerTrip() {
        return valuePerTrip;
    }

    public void setValuePerTrip(double valuePerTrip) {
        this.valuePerTrip = valuePerTrip;
    }

    public double getMaxValuePerTrip() {
        return maxValuePerTrip;
    }

    public void setMaxValuePerTrip(double maxValuePerTrip) {
        this.maxValuePerTrip = maxValuePerTrip;
    }

    public double getInviterMaxValue() {
        return inviterMaxValue;
    }

    public void setInviterMaxValue(double inviterMaxValue) {
        this.inviterMaxValue = inviterMaxValue;
    }

    public double getValueForInvitee() {
        return valueForInvitee;
    }

    public void setValueForInvitee(double valueForInvitee) {
        this.valueForInvitee = valueForInvitee;
    }

    public double getValueForInviter() {
        return valueForInviter;
    }

    public void setValueForInviter(double valueForInviter) {
        this.valueForInviter = valueForInviter;
    }

    public short getRequiredNumberTrips() {
        return requiredNumberTrips;
    }

    public void setRequiredNumberTrips(short requiredNumberTrips) {
        this.requiredNumberTrips = requiredNumberTrips;
    }

    public short getMaxInviteeTrips() {
        return maxInviteeTrips;
    }

    public void setMaxInviteeTrips(short maxInviteeTrips) {
        this.maxInviteeTrips = maxInviteeTrips;
    }

    public short getMaxInviterTrips() {
        return maxInviterTrips;
    }

    public void setMaxInviterTrips(short maxInviterTrips) {
        this.maxInviterTrips = maxInviterTrips;
    }

    public short getMaxNumberInvitees() {
        return maxNumberInvitees;
    }

    public void setMaxNumberInvitees(short maxNumberInvitees) {
        this.maxNumberInvitees = maxNumberInvitees;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public short getActualNumberOfInviduals() {
        return actualNumberOfInviduals;
    }

    public void setActualNumberOfInviduals(short actualNumberOfInviduals) {
        this.actualNumberOfInviduals = actualNumberOfInviduals;
    }

    public short getActualNumberOfTrips() {
        return actualNumberOfTrips;
    }

    public void setActualNumberOfTrips(short actualNumberOfTrips) {
        this.actualNumberOfTrips = actualNumberOfTrips;
    }

    public double getActualValue() {
        return actualValue;
    }

    public void setActualValue(double actualValue) {
        this.actualValue = actualValue;
    }

    public String getPromotionMethod() {
        return promotionMethod;
    }

    public void setPromotionMethod(String promotionMethod) {
        this.promotionMethod = promotionMethod;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Timestamp getBeforeDate() {
        return beforeDate;
    }

    public void setBeforeDate(Timestamp beforeDate) {
        this.beforeDate = beforeDate;
    }

    public String getVehicleLevel() {
        return vehicleLevel;
    }

    public void setVehicleLevel(String vehicleLevel) {
        this.vehicleLevel = vehicleLevel;
    }

    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType;
    }

    public String getAdditionType() {
        return additionType;
    }

    public void setAdditionType(String additionType) {
        this.additionType = additionType;
    }

    public double getCalculatedValue() {
        return calculatedValue;
    }

    public void setCalculatedValue(double calculatedValue) {
        this.calculatedValue = calculatedValue;
    }

    public short getCalculatedNoInviduals() {
        return calculatedNoInviduals;
    }

    public void setCalculatedNoInviduals(short calculatedNoInviduals) {
        this.calculatedNoInviduals = calculatedNoInviduals;
    }

    public short getNoExpiredDays() {
        return noExpiredDays;
    }

    public void setNoExpiredDays(short noExpiredDays) {
        this.noExpiredDays = noExpiredDays;
    }

    public double getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }

    public short getMinOnlineTime() {
        return minOnlineTime;
    }

    public void setMinOnlineTime(short minOnlineTime) {
        this.minOnlineTime = minOnlineTime;
    }

    public double getMinAcceptRate() {
        return minAcceptRate;
    }

    public void setMinAcceptRate(double minAcceptRate) {
        this.minAcceptRate = minAcceptRate;
    }

    public double getMinCancelRate() {
        return minCancelRate;
    }

    public void setMinCancelRate(double minCancelRate) {
        this.minCancelRate = minCancelRate;
    }

    public double getMinRating() {
        return minRating;
    }

    public void setMinRating(double minRating) {
        this.minRating = minRating;
    }

    public String getTimeline() {
        return timeline;
    }

    public void setTimeline(String timeline) {
        this.timeline = timeline;
    }

    public Double getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(Double maxDistance) {
        this.maxDistance = maxDistance;
    }

    public Double getPercentLevelBike() {
        return percentLevelBike;
    }

    public void setPercentLevelBike(Double percentLevelBike) {
        this.percentLevelBike = percentLevelBike;
    }

    public Byte getMaxNumOfNrTrips() {
        return maxNumOfNrTrips;
    }

    public void setMaxNumOfNrTrips(Byte maxNumOfNrTrips) {
        this.maxNumOfNrTrips = maxNumOfNrTrips;
    }

    public double getMaxValueForTrip() {
        return maxValueForTrip;
    }

    public void setMaxValueForTrip(double maxValueForTrip) {
        this.maxValueForTrip = maxValueForTrip;
    }

    public double getMaxPickupDistance() {
        return maxPickupDistance;
    }

    public void setMaxPickupDistance(double maxPickupDistance) {
        this.maxPickupDistance = maxPickupDistance;
    }

    public double getMaxTripReward() {
        return maxTripReward;
    }

    public void setMaxTripReward(double maxTripReward) {
        this.maxTripReward = maxTripReward;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public byte getNoTripPerDay() {
        return noTripPerDay;
    }

    public void setNoTripPerDay(byte noTripPerDay) {
        this.noTripPerDay = noTripPerDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Promotionprogram that = (Promotionprogram) o;

        if (Double.compare(that.totalValue, totalValue) != 0) return false;
        if (Double.compare(that.minValueForTrip, minValueForTrip) != 0) return false;
        if (numberOfInviduals != that.numberOfInviduals) return false;
        if (numberOfTrips != that.numberOfTrips) return false;
        if (Double.compare(that.valuePerTrip, valuePerTrip) != 0) return false;
        if (Double.compare(that.maxValuePerTrip, maxValuePerTrip) != 0) return false;
        if (Double.compare(that.inviterMaxValue, inviterMaxValue) != 0) return false;
        if (Double.compare(that.valueForInvitee, valueForInvitee) != 0) return false;
        if (Double.compare(that.valueForInviter, valueForInviter) != 0) return false;
        if (requiredNumberTrips != that.requiredNumberTrips) return false;
        if (maxInviteeTrips != that.maxInviteeTrips) return false;
        if (maxInviterTrips != that.maxInviterTrips) return false;
        if (maxNumberInvitees != that.maxNumberInvitees) return false;
        if (actualNumberOfInviduals != that.actualNumberOfInviduals) return false;
        if (actualNumberOfTrips != that.actualNumberOfTrips) return false;
        if (Double.compare(that.actualValue, actualValue) != 0) return false;
        if (Double.compare(that.calculatedValue, calculatedValue) != 0) return false;
        if (calculatedNoInviduals != that.calculatedNoInviduals) return false;
        if (noExpiredDays != that.noExpiredDays) return false;
        if (Double.compare(that.minDistance, minDistance) != 0) return false;
        if (minOnlineTime != that.minOnlineTime) return false;
        if (Double.compare(that.minAcceptRate, minAcceptRate) != 0) return false;
        if (Double.compare(that.minCancelRate, minCancelRate) != 0) return false;
        if (Double.compare(that.minRating, minRating) != 0) return false;
        if (Double.compare(that.maxValueForTrip, maxValueForTrip) != 0) return false;
        if (Double.compare(that.maxPickupDistance, maxPickupDistance) != 0) return false;
        if (Double.compare(that.maxTripReward, maxTripReward) != 0) return false;
        if (noTripPerDay != that.noTripPerDay) return false;
        if (programCode != null ? !programCode.equals(that.programCode) : that.programCode != null) return false;
        if (companyCode != null ? !companyCode.equals(that.companyCode) : that.companyCode != null) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (actualEndDate != null ? !actualEndDate.equals(that.actualEndDate) : that.actualEndDate != null)
            return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (promotionMethod != null ? !promotionMethod.equals(that.promotionMethod) : that.promotionMethod != null)
            return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;
        if (beforeDate != null ? !beforeDate.equals(that.beforeDate) : that.beforeDate != null) return false;
        if (vehicleLevel != null ? !vehicleLevel.equals(that.vehicleLevel) : that.vehicleLevel != null) return false;
        if (fareType != null ? !fareType.equals(that.fareType) : that.fareType != null) return false;
        if (additionType != null ? !additionType.equals(that.additionType) : that.additionType != null) return false;
        if (timeline != null ? !timeline.equals(that.timeline) : that.timeline != null) return false;
        if (maxDistance != null ? !maxDistance.equals(that.maxDistance) : that.maxDistance != null) return false;
        if (percentLevelBike != null ? !percentLevelBike.equals(that.percentLevelBike) : that.percentLevelBike != null)
            return false;
        if (maxNumOfNrTrips != null ? !maxNumOfNrTrips.equals(that.maxNumOfNrTrips) : that.maxNumOfNrTrips != null)
            return false;
        if (paymentType != null ? !paymentType.equals(that.paymentType) : that.paymentType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = programCode != null ? programCode.hashCode() : 0;
        result = 31 * result + (companyCode != null ? companyCode.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (actualEndDate != null ? actualEndDate.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        temp = Double.doubleToLongBits(totalValue);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(minValueForTrip);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) numberOfInviduals;
        result = 31 * result + (int) numberOfTrips;
        temp = Double.doubleToLongBits(valuePerTrip);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(maxValuePerTrip);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(inviterMaxValue);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(valueForInvitee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(valueForInviter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) requiredNumberTrips;
        result = 31 * result + (int) maxInviteeTrips;
        result = 31 * result + (int) maxInviterTrips;
        result = 31 * result + (int) maxNumberInvitees;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (int) actualNumberOfInviduals;
        result = 31 * result + (int) actualNumberOfTrips;
        temp = Double.doubleToLongBits(actualValue);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (promotionMethod != null ? promotionMethod.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (beforeDate != null ? beforeDate.hashCode() : 0);
        result = 31 * result + (vehicleLevel != null ? vehicleLevel.hashCode() : 0);
        result = 31 * result + (fareType != null ? fareType.hashCode() : 0);
        result = 31 * result + (additionType != null ? additionType.hashCode() : 0);
        temp = Double.doubleToLongBits(calculatedValue);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) calculatedNoInviduals;
        result = 31 * result + (int) noExpiredDays;
        temp = Double.doubleToLongBits(minDistance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) minOnlineTime;
        temp = Double.doubleToLongBits(minAcceptRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(minCancelRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(minRating);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (timeline != null ? timeline.hashCode() : 0);
        result = 31 * result + (maxDistance != null ? maxDistance.hashCode() : 0);
        result = 31 * result + (percentLevelBike != null ? percentLevelBike.hashCode() : 0);
        result = 31 * result + (maxNumOfNrTrips != null ? maxNumOfNrTrips.hashCode() : 0);
        temp = Double.doubleToLongBits(maxValueForTrip);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(maxPickupDistance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(maxTripReward);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (paymentType != null ? paymentType.hashCode() : 0);
        result = 31 * result + (int) noTripPerDay;
        return result;
    }
}
