package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "driverstatussummary")
public class Driverstatussummary {
    @EmbeddedId
    private DriverstatussummaryId id;

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

    @Column(name = "CountryID", length = 4)
    private String countryID;

    @Column(name = "NumberNewDrivers", nullable = false)
    private Integer numberNewDrivers;

    @Column(name = "noSelfControlPartner", nullable = false)
    private Integer noSelfControlPartner;

    @Column(name = "NumberActiveDrivers", nullable = false)
    private Integer numberActiveDrivers;

    @Column(name = "NumberNonCallDrivers", nullable = false)
    private Integer numberNonCallDrivers;

    @Column(name = "NumberRequests", nullable = false)
    private Integer numberRequests;

    @Column(name = "NumberTrips", nullable = false)
    private Integer numberTrips;

    @Column(name = "numberCancelledRequest", nullable = false)
    private Integer numberCancelledRequest;

    @Column(name = "NumberDeactiveDrivers", nullable = false)
    private Integer numberDeactiveDrivers;

    @Column(name = "AverNoTripPerDriver", nullable = false)
    private Float averNoTripPerDriver;

    @Column(name = "AverageFarePerTrip", nullable = false)
    private Double averageFarePerTrip;

    @Column(name = "AverageDistancePerTrip", nullable = false)
    private Float averageDistancePerTrip;

    @Column(name = "AverDistancePerDriver", nullable = false)
    private Double averDistancePerDriver;

    @Column(name = "NumRequestNoDrAccept", nullable = false)
    private Double numRequestNoDrAccept;

    @Column(name = "AverTripCancelledByDr", nullable = false)
    private Double averTripCancelledByDr;

    @Column(name = "AverTripCancelledByRd", nullable = false)
    private Double averTripCancelledByRd;

    @Column(name = "NumTripCancelledByDr", nullable = false)
    private Integer numTripCancelledByDr;

    @Column(name = "NumTripCancelledByRd", nullable = false)
    private Integer numTripCancelledByRd;

    @Column(name = "NumTripCancelledByRdAfDRAccept", nullable = false)
    private Integer numTripCancelledByRdAfDRAccept;

    @Column(name = "NumTripCancelledByDrAfDRAccept", nullable = false)
    private Integer numTripCancelledByDrAfDRAccept;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    public DriverstatussummaryId getId() {
        return id;
    }

    public void setId(DriverstatussummaryId id) {
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

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    public Integer getNumberNewDrivers() {
        return numberNewDrivers;
    }

    public void setNumberNewDrivers(Integer numberNewDrivers) {
        this.numberNewDrivers = numberNewDrivers;
    }

    public Integer getNoSelfControlPartner() {
        return noSelfControlPartner;
    }

    public void setNoSelfControlPartner(Integer noSelfControlPartner) {
        this.noSelfControlPartner = noSelfControlPartner;
    }

    public Integer getNumberActiveDrivers() {
        return numberActiveDrivers;
    }

    public void setNumberActiveDrivers(Integer numberActiveDrivers) {
        this.numberActiveDrivers = numberActiveDrivers;
    }

    public Integer getNumberNonCallDrivers() {
        return numberNonCallDrivers;
    }

    public void setNumberNonCallDrivers(Integer numberNonCallDrivers) {
        this.numberNonCallDrivers = numberNonCallDrivers;
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

    public Integer getNumberDeactiveDrivers() {
        return numberDeactiveDrivers;
    }

    public void setNumberDeactiveDrivers(Integer numberDeactiveDrivers) {
        this.numberDeactiveDrivers = numberDeactiveDrivers;
    }

    public Float getAverNoTripPerDriver() {
        return averNoTripPerDriver;
    }

    public void setAverNoTripPerDriver(Float averNoTripPerDriver) {
        this.averNoTripPerDriver = averNoTripPerDriver;
    }

    public Double getAverageFarePerTrip() {
        return averageFarePerTrip;
    }

    public void setAverageFarePerTrip(Double averageFarePerTrip) {
        this.averageFarePerTrip = averageFarePerTrip;
    }

    public Float getAverageDistancePerTrip() {
        return averageDistancePerTrip;
    }

    public void setAverageDistancePerTrip(Float averageDistancePerTrip) {
        this.averageDistancePerTrip = averageDistancePerTrip;
    }

    public Double getAverDistancePerDriver() {
        return averDistancePerDriver;
    }

    public void setAverDistancePerDriver(Double averDistancePerDriver) {
        this.averDistancePerDriver = averDistancePerDriver;
    }

    public Double getNumRequestNoDrAccept() {
        return numRequestNoDrAccept;
    }

    public void setNumRequestNoDrAccept(Double numRequestNoDrAccept) {
        this.numRequestNoDrAccept = numRequestNoDrAccept;
    }

    public Double getAverTripCancelledByDr() {
        return averTripCancelledByDr;
    }

    public void setAverTripCancelledByDr(Double averTripCancelledByDr) {
        this.averTripCancelledByDr = averTripCancelledByDr;
    }

    public Double getAverTripCancelledByRd() {
        return averTripCancelledByRd;
    }

    public void setAverTripCancelledByRd(Double averTripCancelledByRd) {
        this.averTripCancelledByRd = averTripCancelledByRd;
    }

    public Integer getNumTripCancelledByDr() {
        return numTripCancelledByDr;
    }

    public void setNumTripCancelledByDr(Integer numTripCancelledByDr) {
        this.numTripCancelledByDr = numTripCancelledByDr;
    }

    public Integer getNumTripCancelledByRd() {
        return numTripCancelledByRd;
    }

    public void setNumTripCancelledByRd(Integer numTripCancelledByRd) {
        this.numTripCancelledByRd = numTripCancelledByRd;
    }

    public Integer getNumTripCancelledByRdAfDRAccept() {
        return numTripCancelledByRdAfDRAccept;
    }

    public void setNumTripCancelledByRdAfDRAccept(Integer numTripCancelledByRdAfDRAccept) {
        this.numTripCancelledByRdAfDRAccept = numTripCancelledByRdAfDRAccept;
    }

    public Integer getNumTripCancelledByDrAfDRAccept() {
        return numTripCancelledByDrAfDRAccept;
    }

    public void setNumTripCancelledByDrAfDRAccept(Integer numTripCancelledByDrAfDRAccept) {
        this.numTripCancelledByDrAfDRAccept = numTripCancelledByDrAfDRAccept;
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