package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "riderstatussummary")
public class Riderstatussummary {
    @EmbeddedId
    private RiderstatussummaryId id;

    @MapsId("financialYear")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FinancialYear", nullable = false)
    private Financialyear financialYear;

    @MapsId("cityID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CityID", nullable = false)
    private City cityID;

    @MapsId("countryCode")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country countryCode;

    @Column(name = "NumberNewRiders", nullable = false)
    private Integer numberNewRiders;

    @Column(name = "NumberActiveRiders", nullable = false)
    private Integer numberActiveRiders;

    @Column(name = "NumbernonCallRiders", nullable = false)
    private Integer numbernonCallRiders;

    @Column(name = "NumberDeactiveRiders", nullable = false)
    private Integer numberDeactiveRiders;

    @Column(name = "NumberRequests", nullable = false)
    private Integer numberRequests;

    @Column(name = "NumberTrips", nullable = false)
    private Integer numberTrips;

    @Column(name = "numberCancelledRequest", nullable = false)
    private Integer numberCancelledRequest;

    @Column(name = "AverNoTripPerRider", nullable = false)
    private Double averNoTripPerRider;

    @Column(name = "AverageFarePerTrip", nullable = false)
    private Double averageFarePerTrip;

    @Column(name = "AverageFarePerRider", nullable = false)
    private Double averageFarePerRider;

    @Column(name = "AverageDistancePerTrip", nullable = false)
    private Double averageDistancePerTrip;

    @Column(name = "UnverifiedRiderNumber")
    private Integer unverifiedRiderNumber;

    @Column(name = "FailedVerificationNumber")
    private Integer failedVerificationNumber;

    @Column(name = "RiderWithoutPhoneNumber")
    private Integer riderWithoutPhoneNumber;

    @Column(name = "AverageTripByCancelledRider", nullable = false)
    private Double averageTripByCancelledRider;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    public RiderstatussummaryId getId() {
        return id;
    }

    public void setId(RiderstatussummaryId id) {
        this.id = id;
    }

    public Financialyear getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(Financialyear financialYear) {
        this.financialYear = financialYear;
    }

    public City getCityID() {
        return cityID;
    }

    public void setCityID(City cityID) {
        this.cityID = cityID;
    }

    public Country getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Country countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getNumberNewRiders() {
        return numberNewRiders;
    }

    public void setNumberNewRiders(Integer numberNewRiders) {
        this.numberNewRiders = numberNewRiders;
    }

    public Integer getNumberActiveRiders() {
        return numberActiveRiders;
    }

    public void setNumberActiveRiders(Integer numberActiveRiders) {
        this.numberActiveRiders = numberActiveRiders;
    }

    public Integer getNumbernonCallRiders() {
        return numbernonCallRiders;
    }

    public void setNumbernonCallRiders(Integer numbernonCallRiders) {
        this.numbernonCallRiders = numbernonCallRiders;
    }

    public Integer getNumberDeactiveRiders() {
        return numberDeactiveRiders;
    }

    public void setNumberDeactiveRiders(Integer numberDeactiveRiders) {
        this.numberDeactiveRiders = numberDeactiveRiders;
    }

    public Integer getNumberRequests() {
        return numberRequests;
    }

    public void setNumberRequests(Integer numberRequests) {
        this.numberRequests = numberRequests;
    }

    public Integer getNumberTrips() {
        return numberTrips;
    }

    public void setNumberTrips(Integer numberTrips) {
        this.numberTrips = numberTrips;
    }

    public Integer getNumberCancelledRequest() {
        return numberCancelledRequest;
    }

    public void setNumberCancelledRequest(Integer numberCancelledRequest) {
        this.numberCancelledRequest = numberCancelledRequest;
    }

    public Double getAverNoTripPerRider() {
        return averNoTripPerRider;
    }

    public void setAverNoTripPerRider(Double averNoTripPerRider) {
        this.averNoTripPerRider = averNoTripPerRider;
    }

    public Double getAverageFarePerTrip() {
        return averageFarePerTrip;
    }

    public void setAverageFarePerTrip(Double averageFarePerTrip) {
        this.averageFarePerTrip = averageFarePerTrip;
    }

    public Double getAverageFarePerRider() {
        return averageFarePerRider;
    }

    public void setAverageFarePerRider(Double averageFarePerRider) {
        this.averageFarePerRider = averageFarePerRider;
    }

    public Double getAverageDistancePerTrip() {
        return averageDistancePerTrip;
    }

    public void setAverageDistancePerTrip(Double averageDistancePerTrip) {
        this.averageDistancePerTrip = averageDistancePerTrip;
    }

    public Integer getUnverifiedRiderNumber() {
        return unverifiedRiderNumber;
    }

    public void setUnverifiedRiderNumber(Integer unverifiedRiderNumber) {
        this.unverifiedRiderNumber = unverifiedRiderNumber;
    }

    public Integer getFailedVerificationNumber() {
        return failedVerificationNumber;
    }

    public void setFailedVerificationNumber(Integer failedVerificationNumber) {
        this.failedVerificationNumber = failedVerificationNumber;
    }

    public Integer getRiderWithoutPhoneNumber() {
        return riderWithoutPhoneNumber;
    }

    public void setRiderWithoutPhoneNumber(Integer riderWithoutPhoneNumber) {
        this.riderWithoutPhoneNumber = riderWithoutPhoneNumber;
    }

    public Double getAverageTripByCancelledRider() {
        return averageTripByCancelledRider;
    }

    public void setAverageTripByCancelledRider(Double averageTripByCancelledRider) {
        this.averageTripByCancelledRider = averageTripByCancelledRider;
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