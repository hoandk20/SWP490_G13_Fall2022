package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@IdClass(DriverstatussummaryPK.class)
public class Driverstatussummary {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "FinancialYear", nullable = false)
    private int financialYear;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Month", nullable = false)
    private int month;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CityID", nullable = false)
    private int cityId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CountryCode", nullable = false, length = 4)
    private String countryCode;
    @Basic
    @Column(name = "CountryID", nullable = true, length = 4)
    private String countryId;
    @Basic
    @Column(name = "NumberNewDrivers", nullable = false)
    private int numberNewDrivers;
    @Basic
    @Column(name = "noSelfControlPartner", nullable = false)
    private int noSelfControlPartner;
    @Basic
    @Column(name = "NumberActiveDrivers", nullable = false)
    private int numberActiveDrivers;
    @Basic
    @Column(name = "NumberNonCallDrivers", nullable = false)
    private int numberNonCallDrivers;
    @Basic
    @Column(name = "NumberRequests", nullable = false)
    private int numberRequests;
    @Basic
    @Column(name = "NumberTrips", nullable = false)
    private int numberTrips;
    @Basic
    @Column(name = "numberCancelledRequest", nullable = false)
    private int numberCancelledRequest;
    @Basic
    @Column(name = "NumberDeactiveDrivers", nullable = false)
    private int numberDeactiveDrivers;
    @Basic
    @Column(name = "AverNoTripPerDriver", nullable = false, precision = 0)
    private double averNoTripPerDriver;
    @Basic
    @Column(name = "AverageFarePerTrip", nullable = false, precision = 0)
    private double averageFarePerTrip;
    @Basic
    @Column(name = "AverageDistancePerTrip", nullable = false, precision = 0)
    private double averageDistancePerTrip;
    @Basic
    @Column(name = "AverDistancePerDriver", nullable = false, precision = 0)
    private double averDistancePerDriver;
    @Basic
    @Column(name = "NumRequestNoDrAccept", nullable = false, precision = 0)
    private double numRequestNoDrAccept;
    @Basic
    @Column(name = "AverTripCancelledByDr", nullable = false, precision = 0)
    private double averTripCancelledByDr;
    @Basic
    @Column(name = "AverTripCancelledByRd", nullable = false, precision = 0)
    private double averTripCancelledByRd;
    @Basic
    @Column(name = "NumTripCancelledByDr", nullable = false)
    private int numTripCancelledByDr;
    @Basic
    @Column(name = "NumTripCancelledByRd", nullable = false)
    private int numTripCancelledByRd;
    @Basic
    @Column(name = "NumTripCancelledByRdAfDRAccept", nullable = false)
    private int numTripCancelledByRdAfDrAccept;
    @Basic
    @Column(name = "NumTripCancelledByDrAfDRAccept", nullable = false)
    private int numTripCancelledByDrAfDrAccept;
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

    public int getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(int financialYear) {
        this.financialYear = financialYear;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public int getNumberNewDrivers() {
        return numberNewDrivers;
    }

    public void setNumberNewDrivers(int numberNewDrivers) {
        this.numberNewDrivers = numberNewDrivers;
    }

    public int getNoSelfControlPartner() {
        return noSelfControlPartner;
    }

    public void setNoSelfControlPartner(int noSelfControlPartner) {
        this.noSelfControlPartner = noSelfControlPartner;
    }

    public int getNumberActiveDrivers() {
        return numberActiveDrivers;
    }

    public void setNumberActiveDrivers(int numberActiveDrivers) {
        this.numberActiveDrivers = numberActiveDrivers;
    }

    public int getNumberNonCallDrivers() {
        return numberNonCallDrivers;
    }

    public void setNumberNonCallDrivers(int numberNonCallDrivers) {
        this.numberNonCallDrivers = numberNonCallDrivers;
    }

    public int getNumberRequests() {
        return numberRequests;
    }

    public void setNumberRequests(int numberRequests) {
        this.numberRequests = numberRequests;
    }

    public int getNumberTrips() {
        return numberTrips;
    }

    public void setNumberTrips(int numberTrips) {
        this.numberTrips = numberTrips;
    }

    public int getNumberCancelledRequest() {
        return numberCancelledRequest;
    }

    public void setNumberCancelledRequest(int numberCancelledRequest) {
        this.numberCancelledRequest = numberCancelledRequest;
    }

    public int getNumberDeactiveDrivers() {
        return numberDeactiveDrivers;
    }

    public void setNumberDeactiveDrivers(int numberDeactiveDrivers) {
        this.numberDeactiveDrivers = numberDeactiveDrivers;
    }

    public double getAverNoTripPerDriver() {
        return averNoTripPerDriver;
    }

    public void setAverNoTripPerDriver(double averNoTripPerDriver) {
        this.averNoTripPerDriver = averNoTripPerDriver;
    }

    public double getAverageFarePerTrip() {
        return averageFarePerTrip;
    }

    public void setAverageFarePerTrip(double averageFarePerTrip) {
        this.averageFarePerTrip = averageFarePerTrip;
    }

    public double getAverageDistancePerTrip() {
        return averageDistancePerTrip;
    }

    public void setAverageDistancePerTrip(double averageDistancePerTrip) {
        this.averageDistancePerTrip = averageDistancePerTrip;
    }

    public double getAverDistancePerDriver() {
        return averDistancePerDriver;
    }

    public void setAverDistancePerDriver(double averDistancePerDriver) {
        this.averDistancePerDriver = averDistancePerDriver;
    }

    public double getNumRequestNoDrAccept() {
        return numRequestNoDrAccept;
    }

    public void setNumRequestNoDrAccept(double numRequestNoDrAccept) {
        this.numRequestNoDrAccept = numRequestNoDrAccept;
    }

    public double getAverTripCancelledByDr() {
        return averTripCancelledByDr;
    }

    public void setAverTripCancelledByDr(double averTripCancelledByDr) {
        this.averTripCancelledByDr = averTripCancelledByDr;
    }

    public double getAverTripCancelledByRd() {
        return averTripCancelledByRd;
    }

    public void setAverTripCancelledByRd(double averTripCancelledByRd) {
        this.averTripCancelledByRd = averTripCancelledByRd;
    }

    public int getNumTripCancelledByDr() {
        return numTripCancelledByDr;
    }

    public void setNumTripCancelledByDr(int numTripCancelledByDr) {
        this.numTripCancelledByDr = numTripCancelledByDr;
    }

    public int getNumTripCancelledByRd() {
        return numTripCancelledByRd;
    }

    public void setNumTripCancelledByRd(int numTripCancelledByRd) {
        this.numTripCancelledByRd = numTripCancelledByRd;
    }

    public int getNumTripCancelledByRdAfDrAccept() {
        return numTripCancelledByRdAfDrAccept;
    }

    public void setNumTripCancelledByRdAfDrAccept(int numTripCancelledByRdAfDrAccept) {
        this.numTripCancelledByRdAfDrAccept = numTripCancelledByRdAfDrAccept;
    }

    public int getNumTripCancelledByDrAfDrAccept() {
        return numTripCancelledByDrAfDrAccept;
    }

    public void setNumTripCancelledByDrAfDrAccept(int numTripCancelledByDrAfDrAccept) {
        this.numTripCancelledByDrAfDrAccept = numTripCancelledByDrAfDrAccept;
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

        Driverstatussummary that = (Driverstatussummary) o;

        if (financialYear != that.financialYear) return false;
        if (month != that.month) return false;
        if (cityId != that.cityId) return false;
        if (numberNewDrivers != that.numberNewDrivers) return false;
        if (noSelfControlPartner != that.noSelfControlPartner) return false;
        if (numberActiveDrivers != that.numberActiveDrivers) return false;
        if (numberNonCallDrivers != that.numberNonCallDrivers) return false;
        if (numberRequests != that.numberRequests) return false;
        if (numberTrips != that.numberTrips) return false;
        if (numberCancelledRequest != that.numberCancelledRequest) return false;
        if (numberDeactiveDrivers != that.numberDeactiveDrivers) return false;
        if (Double.compare(that.averNoTripPerDriver, averNoTripPerDriver) != 0) return false;
        if (Double.compare(that.averageFarePerTrip, averageFarePerTrip) != 0) return false;
        if (Double.compare(that.averageDistancePerTrip, averageDistancePerTrip) != 0) return false;
        if (Double.compare(that.averDistancePerDriver, averDistancePerDriver) != 0) return false;
        if (Double.compare(that.numRequestNoDrAccept, numRequestNoDrAccept) != 0) return false;
        if (Double.compare(that.averTripCancelledByDr, averTripCancelledByDr) != 0) return false;
        if (Double.compare(that.averTripCancelledByRd, averTripCancelledByRd) != 0) return false;
        if (numTripCancelledByDr != that.numTripCancelledByDr) return false;
        if (numTripCancelledByRd != that.numTripCancelledByRd) return false;
        if (numTripCancelledByRdAfDrAccept != that.numTripCancelledByRdAfDrAccept) return false;
        if (numTripCancelledByDrAfDrAccept != that.numTripCancelledByDrAfDrAccept) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (countryId != null ? !countryId.equals(that.countryId) : that.countryId != null) return false;
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
        result = financialYear;
        result = 31 * result + month;
        result = 31 * result + cityId;
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (countryId != null ? countryId.hashCode() : 0);
        result = 31 * result + numberNewDrivers;
        result = 31 * result + noSelfControlPartner;
        result = 31 * result + numberActiveDrivers;
        result = 31 * result + numberNonCallDrivers;
        result = 31 * result + numberRequests;
        result = 31 * result + numberTrips;
        result = 31 * result + numberCancelledRequest;
        result = 31 * result + numberDeactiveDrivers;
        temp = Double.doubleToLongBits(averNoTripPerDriver);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(averageFarePerTrip);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(averageDistancePerTrip);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(averDistancePerDriver);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(numRequestNoDrAccept);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(averTripCancelledByDr);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(averTripCancelledByRd);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + numTripCancelledByDr;
        result = 31 * result + numTripCancelledByRd;
        result = 31 * result + numTripCancelledByRdAfDrAccept;
        result = 31 * result + numTripCancelledByDrAfDrAccept;
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        return result;
    }
}
