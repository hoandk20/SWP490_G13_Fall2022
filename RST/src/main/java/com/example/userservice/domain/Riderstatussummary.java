package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@IdClass(RiderstatussummaryPK.class)
public class Riderstatussummary {
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
    @Column(name = "NumberNewRiders", nullable = false)
    private int numberNewRiders;
    @Basic
    @Column(name = "NumberActiveRiders", nullable = false)
    private int numberActiveRiders;
    @Basic
    @Column(name = "NumbernonCallRiders", nullable = false)
    private int numbernonCallRiders;
    @Basic
    @Column(name = "NumberDeactiveRiders", nullable = false)
    private int numberDeactiveRiders;
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
    @Column(name = "AverNoTripPerRider", nullable = false, precision = 0)
    private double averNoTripPerRider;
    @Basic
    @Column(name = "AverageFarePerTrip", nullable = false, precision = 0)
    private double averageFarePerTrip;
    @Basic
    @Column(name = "AverageFarePerRider", nullable = false, precision = 0)
    private double averageFarePerRider;
    @Basic
    @Column(name = "AverageDistancePerTrip", nullable = false, precision = 0)
    private double averageDistancePerTrip;
    @Basic
    @Column(name = "UnverifiedRiderNumber", nullable = true)
    private Integer unverifiedRiderNumber;
    @Basic
    @Column(name = "FailedVerificationNumber", nullable = true)
    private Integer failedVerificationNumber;
    @Basic
    @Column(name = "RiderWithoutPhoneNumber", nullable = true)
    private Integer riderWithoutPhoneNumber;
    @Basic
    @Column(name = "AverageTripByCancelledRider", nullable = false, precision = 0)
    private double averageTripByCancelledRider;
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

    public int getNumberNewRiders() {
        return numberNewRiders;
    }

    public void setNumberNewRiders(int numberNewRiders) {
        this.numberNewRiders = numberNewRiders;
    }

    public int getNumberActiveRiders() {
        return numberActiveRiders;
    }

    public void setNumberActiveRiders(int numberActiveRiders) {
        this.numberActiveRiders = numberActiveRiders;
    }

    public int getNumbernonCallRiders() {
        return numbernonCallRiders;
    }

    public void setNumbernonCallRiders(int numbernonCallRiders) {
        this.numbernonCallRiders = numbernonCallRiders;
    }

    public int getNumberDeactiveRiders() {
        return numberDeactiveRiders;
    }

    public void setNumberDeactiveRiders(int numberDeactiveRiders) {
        this.numberDeactiveRiders = numberDeactiveRiders;
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

    public double getAverNoTripPerRider() {
        return averNoTripPerRider;
    }

    public void setAverNoTripPerRider(double averNoTripPerRider) {
        this.averNoTripPerRider = averNoTripPerRider;
    }

    public double getAverageFarePerTrip() {
        return averageFarePerTrip;
    }

    public void setAverageFarePerTrip(double averageFarePerTrip) {
        this.averageFarePerTrip = averageFarePerTrip;
    }

    public double getAverageFarePerRider() {
        return averageFarePerRider;
    }

    public void setAverageFarePerRider(double averageFarePerRider) {
        this.averageFarePerRider = averageFarePerRider;
    }

    public double getAverageDistancePerTrip() {
        return averageDistancePerTrip;
    }

    public void setAverageDistancePerTrip(double averageDistancePerTrip) {
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

    public double getAverageTripByCancelledRider() {
        return averageTripByCancelledRider;
    }

    public void setAverageTripByCancelledRider(double averageTripByCancelledRider) {
        this.averageTripByCancelledRider = averageTripByCancelledRider;
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

        Riderstatussummary that = (Riderstatussummary) o;

        if (financialYear != that.financialYear) return false;
        if (month != that.month) return false;
        if (cityId != that.cityId) return false;
        if (numberNewRiders != that.numberNewRiders) return false;
        if (numberActiveRiders != that.numberActiveRiders) return false;
        if (numbernonCallRiders != that.numbernonCallRiders) return false;
        if (numberDeactiveRiders != that.numberDeactiveRiders) return false;
        if (numberRequests != that.numberRequests) return false;
        if (numberTrips != that.numberTrips) return false;
        if (numberCancelledRequest != that.numberCancelledRequest) return false;
        if (Double.compare(that.averNoTripPerRider, averNoTripPerRider) != 0) return false;
        if (Double.compare(that.averageFarePerTrip, averageFarePerTrip) != 0) return false;
        if (Double.compare(that.averageFarePerRider, averageFarePerRider) != 0) return false;
        if (Double.compare(that.averageDistancePerTrip, averageDistancePerTrip) != 0) return false;
        if (Double.compare(that.averageTripByCancelledRider, averageTripByCancelledRider) != 0) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (unverifiedRiderNumber != null ? !unverifiedRiderNumber.equals(that.unverifiedRiderNumber) : that.unverifiedRiderNumber != null)
            return false;
        if (failedVerificationNumber != null ? !failedVerificationNumber.equals(that.failedVerificationNumber) : that.failedVerificationNumber != null)
            return false;
        if (riderWithoutPhoneNumber != null ? !riderWithoutPhoneNumber.equals(that.riderWithoutPhoneNumber) : that.riderWithoutPhoneNumber != null)
            return false;
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
        result = 31 * result + numberNewRiders;
        result = 31 * result + numberActiveRiders;
        result = 31 * result + numbernonCallRiders;
        result = 31 * result + numberDeactiveRiders;
        result = 31 * result + numberRequests;
        result = 31 * result + numberTrips;
        result = 31 * result + numberCancelledRequest;
        temp = Double.doubleToLongBits(averNoTripPerRider);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(averageFarePerTrip);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(averageFarePerRider);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(averageDistancePerTrip);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (unverifiedRiderNumber != null ? unverifiedRiderNumber.hashCode() : 0);
        result = 31 * result + (failedVerificationNumber != null ? failedVerificationNumber.hashCode() : 0);
        result = 31 * result + (riderWithoutPhoneNumber != null ? riderWithoutPhoneNumber.hashCode() : 0);
        temp = Double.doubleToLongBits(averageTripByCancelledRider);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        return result;
    }
}
