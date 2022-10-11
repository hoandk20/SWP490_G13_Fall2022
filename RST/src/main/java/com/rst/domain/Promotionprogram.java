package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "promotionprogram")
public class Promotionprogram {
    @EmbeddedId
    private PromotionprogramId id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country countryCode;

    @Column(name = "Title", length = 200)
    private String title;

    @Column(name = "StartDate")
    private Instant startDate;

    @Column(name = "EndDate")
    private Instant endDate;

    @Column(name = "ActualEndDate")
    private Instant actualEndDate;

    @Column(name = "StartTime")
    private Byte startTime;

    @Column(name = "EndTime")
    private Byte endTime;

    @Column(name = "Type", length = 4)
    private String type;

    @Column(name = "Description", length = 1000)
    private String description;

    @Column(name = "Category", length = 4)
    private String category;

    @Column(name = "TotalValue", nullable = false)
    private Double totalValue;

    @Column(name = "MinValueForTrip", nullable = false)
    private Float minValueForTrip;

    @Column(name = "NumberOfInviduals", nullable = false)
    private Short numberOfInviduals;

    @Column(name = "NumberOfTrips", nullable = false)
    private Short numberOfTrips;

    @Column(name = "ValuePerTrip", nullable = false)
    private Float valuePerTrip;

    @Column(name = "MaxValuePerTrip", nullable = false)
    private Float maxValuePerTrip;

    @Column(name = "InviterMaxValue", nullable = false)
    private Float inviterMaxValue;

    @Column(name = "ValueForInvitee", nullable = false)
    private Float valueForInvitee;

    @Column(name = "ValueForInviter", nullable = false)
    private Float valueForInviter;

    @Column(name = "RequiredNumberTrips", nullable = false)
    private Short requiredNumberTrips;

    @Column(name = "MaxInviteeTrips", nullable = false)
    private Short maxInviteeTrips;

    @Column(name = "MaxInviterTrips", nullable = false)
    private Short maxInviterTrips;

    @Column(name = "MaxNumberInvitees", nullable = false)
    private Short maxNumberInvitees;

    @Column(name = "Status", nullable = false, length = 2)
    private String status;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "ActualNumberOfInviduals", nullable = false)
    private Short actualNumberOfInviduals;

    @Column(name = "ActualNumberOfTrips", nullable = false)
    private Short actualNumberOfTrips;

    @Column(name = "ActualValue", nullable = false)
    private Double actualValue;

    @Column(name = "PromotionMethod", length = 4)
    private String promotionMethod;

    @Column(name = "Unit", length = 4)
    private String unit;

    @Column(name = "BeforeDate")
    private Instant beforeDate;

    @Column(name = "VehicleLevel", length = 4)
    private String vehicleLevel;

    @Column(name = "FareType", length = 4)
    private String fareType;

    @Column(name = "AdditionType", length = 5)
    private String additionType;

    @Column(name = "CalculatedValue", nullable = false)
    private Double calculatedValue;

    @Column(name = "CalculatedNoInviduals", nullable = false)
    private Short calculatedNoInviduals;

    @Column(name = "NoExpiredDays", nullable = false)
    private Short noExpiredDays;

    @Column(name = "MinDistance", nullable = false)
    private Float minDistance;

    @Column(name = "MinOnlineTime", nullable = false)
    private Short minOnlineTime;

    @Column(name = "MinAcceptRate", nullable = false)
    private Float minAcceptRate;

    @Column(name = "MinCancelRate", nullable = false)
    private Float minCancelRate;

    @Column(name = "MinRating", nullable = false)
    private Float minRating;

    @Column(name = "Timeline", length = 4)
    private String timeline;

    @Column(name = "MaxDistance")
    private Float maxDistance;

    @Column(name = "PercentLevelBike")
    private Float percentLevelBike;

    @Column(name = "MaxNumOfNRTrips")
    private Byte maxNumOfNRTrips;

    @Column(name = "MaxValueForTrip", nullable = false)
    private Float maxValueForTrip;

    @Column(name = "MaxPickupDistance", nullable = false)
    private Float maxPickupDistance;

    @Column(name = "MaxTripReward", nullable = false)
    private Float maxTripReward;

    @Column(name = "PaymentType", length = 4)
    private String paymentType;

    @Column(name = "NoTripPerDay", nullable = false)
    private Byte noTripPerDay;

    public PromotionprogramId getId() {
        return id;
    }

    public void setId(PromotionprogramId id) {
        this.id = id;
    }

    public Country getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Country countryCode) {
        this.countryCode = countryCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Instant getStartDate() {
        return startDate;
    }

    public void setStartDate(Instant startDate) {
        this.startDate = startDate;
    }

    public Instant getEndDate() {
        return endDate;
    }

    public void setEndDate(Instant endDate) {
        this.endDate = endDate;
    }

    public Instant getActualEndDate() {
        return actualEndDate;
    }

    public void setActualEndDate(Instant actualEndDate) {
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

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public Float getMinValueForTrip() {
        return minValueForTrip;
    }

    public void setMinValueForTrip(Float minValueForTrip) {
        this.minValueForTrip = minValueForTrip;
    }

    public Short getNumberOfInviduals() {
        return numberOfInviduals;
    }

    public void setNumberOfInviduals(Short numberOfInviduals) {
        this.numberOfInviduals = numberOfInviduals;
    }

    public Short getNumberOfTrips() {
        return numberOfTrips;
    }

    public void setNumberOfTrips(Short numberOfTrips) {
        this.numberOfTrips = numberOfTrips;
    }

    public Float getValuePerTrip() {
        return valuePerTrip;
    }

    public void setValuePerTrip(Float valuePerTrip) {
        this.valuePerTrip = valuePerTrip;
    }

    public Float getMaxValuePerTrip() {
        return maxValuePerTrip;
    }

    public void setMaxValuePerTrip(Float maxValuePerTrip) {
        this.maxValuePerTrip = maxValuePerTrip;
    }

    public Float getInviterMaxValue() {
        return inviterMaxValue;
    }

    public void setInviterMaxValue(Float inviterMaxValue) {
        this.inviterMaxValue = inviterMaxValue;
    }

    public Float getValueForInvitee() {
        return valueForInvitee;
    }

    public void setValueForInvitee(Float valueForInvitee) {
        this.valueForInvitee = valueForInvitee;
    }

    public Float getValueForInviter() {
        return valueForInviter;
    }

    public void setValueForInviter(Float valueForInviter) {
        this.valueForInviter = valueForInviter;
    }

    public Short getRequiredNumberTrips() {
        return requiredNumberTrips;
    }

    public void setRequiredNumberTrips(Short requiredNumberTrips) {
        this.requiredNumberTrips = requiredNumberTrips;
    }

    public Short getMaxInviteeTrips() {
        return maxInviteeTrips;
    }

    public void setMaxInviteeTrips(Short maxInviteeTrips) {
        this.maxInviteeTrips = maxInviteeTrips;
    }

    public Short getMaxInviterTrips() {
        return maxInviterTrips;
    }

    public void setMaxInviterTrips(Short maxInviterTrips) {
        this.maxInviterTrips = maxInviterTrips;
    }

    public Short getMaxNumberInvitees() {
        return maxNumberInvitees;
    }

    public void setMaxNumberInvitees(Short maxNumberInvitees) {
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

    public Short getActualNumberOfInviduals() {
        return actualNumberOfInviduals;
    }

    public void setActualNumberOfInviduals(Short actualNumberOfInviduals) {
        this.actualNumberOfInviduals = actualNumberOfInviduals;
    }

    public Short getActualNumberOfTrips() {
        return actualNumberOfTrips;
    }

    public void setActualNumberOfTrips(Short actualNumberOfTrips) {
        this.actualNumberOfTrips = actualNumberOfTrips;
    }

    public Double getActualValue() {
        return actualValue;
    }

    public void setActualValue(Double actualValue) {
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

    public Instant getBeforeDate() {
        return beforeDate;
    }

    public void setBeforeDate(Instant beforeDate) {
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

    public Double getCalculatedValue() {
        return calculatedValue;
    }

    public void setCalculatedValue(Double calculatedValue) {
        this.calculatedValue = calculatedValue;
    }

    public Short getCalculatedNoInviduals() {
        return calculatedNoInviduals;
    }

    public void setCalculatedNoInviduals(Short calculatedNoInviduals) {
        this.calculatedNoInviduals = calculatedNoInviduals;
    }

    public Short getNoExpiredDays() {
        return noExpiredDays;
    }

    public void setNoExpiredDays(Short noExpiredDays) {
        this.noExpiredDays = noExpiredDays;
    }

    public Float getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(Float minDistance) {
        this.minDistance = minDistance;
    }

    public Short getMinOnlineTime() {
        return minOnlineTime;
    }

    public void setMinOnlineTime(Short minOnlineTime) {
        this.minOnlineTime = minOnlineTime;
    }

    public Float getMinAcceptRate() {
        return minAcceptRate;
    }

    public void setMinAcceptRate(Float minAcceptRate) {
        this.minAcceptRate = minAcceptRate;
    }

    public Float getMinCancelRate() {
        return minCancelRate;
    }

    public void setMinCancelRate(Float minCancelRate) {
        this.minCancelRate = minCancelRate;
    }

    public Float getMinRating() {
        return minRating;
    }

    public void setMinRating(Float minRating) {
        this.minRating = minRating;
    }

    public String getTimeline() {
        return timeline;
    }

    public void setTimeline(String timeline) {
        this.timeline = timeline;
    }

    public Float getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(Float maxDistance) {
        this.maxDistance = maxDistance;
    }

    public Float getPercentLevelBike() {
        return percentLevelBike;
    }

    public void setPercentLevelBike(Float percentLevelBike) {
        this.percentLevelBike = percentLevelBike;
    }

    public Byte getMaxNumOfNRTrips() {
        return maxNumOfNRTrips;
    }

    public void setMaxNumOfNRTrips(Byte maxNumOfNRTrips) {
        this.maxNumOfNRTrips = maxNumOfNRTrips;
    }

    public Float getMaxValueForTrip() {
        return maxValueForTrip;
    }

    public void setMaxValueForTrip(Float maxValueForTrip) {
        this.maxValueForTrip = maxValueForTrip;
    }

    public Float getMaxPickupDistance() {
        return maxPickupDistance;
    }

    public void setMaxPickupDistance(Float maxPickupDistance) {
        this.maxPickupDistance = maxPickupDistance;
    }

    public Float getMaxTripReward() {
        return maxTripReward;
    }

    public void setMaxTripReward(Float maxTripReward) {
        this.maxTripReward = maxTripReward;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Byte getNoTripPerDay() {
        return noTripPerDay;
    }

    public void setNoTripPerDay(Byte noTripPerDay) {
        this.noTripPerDay = noTripPerDay;
    }

}