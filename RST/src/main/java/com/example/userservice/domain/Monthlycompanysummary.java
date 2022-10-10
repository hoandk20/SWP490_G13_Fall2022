package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Monthlycompanysummary {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "MonthCompanySummaryId", nullable = false)
    private int monthCompanySummaryId;
    @Basic
    @Column(name = "CompanyID", nullable = false)
    private int companyId;
    @Basic
    @Column(name = "CityID", nullable = true)
    private Integer cityId;
    @Basic
    @Column(name = "Month", nullable = false)
    private int month;
    @Basic
    @Column(name = "FinancialYear", nullable = true)
    private Integer financialYear;
    @Basic
    @Column(name = "NumberTripsCompleted", nullable = false)
    private int numberTripsCompleted;
    @Basic
    @Column(name = "NumberOfTripRequest", nullable = false)
    private int numberOfTripRequest;
    @Basic
    @Column(name = "TotalFeeTrips", nullable = false, precision = 0)
    private double totalFeeTrips;
    @Basic
    @Column(name = "TotalCreditFee", nullable = false, precision = 0)
    private double totalCreditFee;
    @Basic
    @Column(name = "NumberDriverCancelledTrips", nullable = false)
    private int numberDriverCancelledTrips;
    @Basic
    @Column(name = "AdjustAmount", nullable = false, precision = 0)
    private double adjustAmount;
    @Basic
    @Column(name = "PromotionAmount", nullable = false, precision = 0)
    private double promotionAmount;
    @Basic
    @Column(name = "Promotion1", nullable = false, precision = 0)
    private double promotion1;
    @Basic
    @Column(name = "Promotion2", nullable = false, precision = 0)
    private double promotion2;
    @Basic
    @Column(name = "PromotionCreditAmount", nullable = false, precision = 0)
    private double promotionCreditAmount;
    @Basic
    @Column(name = "AdjustCreditFare", nullable = false, precision = 0)
    private double adjustCreditFare;
    @Basic
    @Column(name = "DriverFee", nullable = false, precision = 0)
    private double driverFee;
    @Basic
    @Column(name = "noDriverHasTrips", nullable = false)
    private int noDriverHasTrips;
    @Basic
    @Column(name = "NoDriverNoHasTrips", nullable = false)
    private int noDriverNoHasTrips;
    @Basic
    @Column(name = "creditTrips", nullable = false)
    private int creditTrips;
    @Basic
    @Column(name = "NoDriverActive", nullable = false)
    private int noDriverActive;
    @Basic
    @Column(name = "NoNewbieDriver", nullable = false)
    private int noNewbieDriver;
    @Basic
    @Column(name = "NumberOfRejectedTrips", nullable = false)
    private int numberOfRejectedTrips;
    @Basic
    @Column(name = "NumberOfNoResponseTrips", nullable = false)
    private int numberOfNoResponseTrips;
    @Basic
    @Column(name = "DriverDeponsitAccount", nullable = false, precision = 0)
    private double driverDeponsitAccount;
    @Basic
    @Column(name = "ChargedAmount", nullable = false, precision = 0)
    private double chargedAmount;
    @Basic
    @Column(name = "ActualPayment", nullable = false, precision = 0)
    private double actualPayment;
    @Basic
    @Column(name = "CancelFee", nullable = false, precision = 0)
    private double cancelFee;
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

    public int getMonthCompanySummaryId() {
        return monthCompanySummaryId;
    }

    public void setMonthCompanySummaryId(int monthCompanySummaryId) {
        this.monthCompanySummaryId = monthCompanySummaryId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public Integer getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(Integer financialYear) {
        this.financialYear = financialYear;
    }

    public int getNumberTripsCompleted() {
        return numberTripsCompleted;
    }

    public void setNumberTripsCompleted(int numberTripsCompleted) {
        this.numberTripsCompleted = numberTripsCompleted;
    }

    public int getNumberOfTripRequest() {
        return numberOfTripRequest;
    }

    public void setNumberOfTripRequest(int numberOfTripRequest) {
        this.numberOfTripRequest = numberOfTripRequest;
    }

    public double getTotalFeeTrips() {
        return totalFeeTrips;
    }

    public void setTotalFeeTrips(double totalFeeTrips) {
        this.totalFeeTrips = totalFeeTrips;
    }

    public double getTotalCreditFee() {
        return totalCreditFee;
    }

    public void setTotalCreditFee(double totalCreditFee) {
        this.totalCreditFee = totalCreditFee;
    }

    public int getNumberDriverCancelledTrips() {
        return numberDriverCancelledTrips;
    }

    public void setNumberDriverCancelledTrips(int numberDriverCancelledTrips) {
        this.numberDriverCancelledTrips = numberDriverCancelledTrips;
    }

    public double getAdjustAmount() {
        return adjustAmount;
    }

    public void setAdjustAmount(double adjustAmount) {
        this.adjustAmount = adjustAmount;
    }

    public double getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(double promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    public double getPromotion1() {
        return promotion1;
    }

    public void setPromotion1(double promotion1) {
        this.promotion1 = promotion1;
    }

    public double getPromotion2() {
        return promotion2;
    }

    public void setPromotion2(double promotion2) {
        this.promotion2 = promotion2;
    }

    public double getPromotionCreditAmount() {
        return promotionCreditAmount;
    }

    public void setPromotionCreditAmount(double promotionCreditAmount) {
        this.promotionCreditAmount = promotionCreditAmount;
    }

    public double getAdjustCreditFare() {
        return adjustCreditFare;
    }

    public void setAdjustCreditFare(double adjustCreditFare) {
        this.adjustCreditFare = adjustCreditFare;
    }

    public double getDriverFee() {
        return driverFee;
    }

    public void setDriverFee(double driverFee) {
        this.driverFee = driverFee;
    }

    public int getNoDriverHasTrips() {
        return noDriverHasTrips;
    }

    public void setNoDriverHasTrips(int noDriverHasTrips) {
        this.noDriverHasTrips = noDriverHasTrips;
    }

    public int getNoDriverNoHasTrips() {
        return noDriverNoHasTrips;
    }

    public void setNoDriverNoHasTrips(int noDriverNoHasTrips) {
        this.noDriverNoHasTrips = noDriverNoHasTrips;
    }

    public int getCreditTrips() {
        return creditTrips;
    }

    public void setCreditTrips(int creditTrips) {
        this.creditTrips = creditTrips;
    }

    public int getNoDriverActive() {
        return noDriverActive;
    }

    public void setNoDriverActive(int noDriverActive) {
        this.noDriverActive = noDriverActive;
    }

    public int getNoNewbieDriver() {
        return noNewbieDriver;
    }

    public void setNoNewbieDriver(int noNewbieDriver) {
        this.noNewbieDriver = noNewbieDriver;
    }

    public int getNumberOfRejectedTrips() {
        return numberOfRejectedTrips;
    }

    public void setNumberOfRejectedTrips(int numberOfRejectedTrips) {
        this.numberOfRejectedTrips = numberOfRejectedTrips;
    }

    public int getNumberOfNoResponseTrips() {
        return numberOfNoResponseTrips;
    }

    public void setNumberOfNoResponseTrips(int numberOfNoResponseTrips) {
        this.numberOfNoResponseTrips = numberOfNoResponseTrips;
    }

    public double getDriverDeponsitAccount() {
        return driverDeponsitAccount;
    }

    public void setDriverDeponsitAccount(double driverDeponsitAccount) {
        this.driverDeponsitAccount = driverDeponsitAccount;
    }

    public double getChargedAmount() {
        return chargedAmount;
    }

    public void setChargedAmount(double chargedAmount) {
        this.chargedAmount = chargedAmount;
    }

    public double getActualPayment() {
        return actualPayment;
    }

    public void setActualPayment(double actualPayment) {
        this.actualPayment = actualPayment;
    }

    public double getCancelFee() {
        return cancelFee;
    }

    public void setCancelFee(double cancelFee) {
        this.cancelFee = cancelFee;
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

        Monthlycompanysummary that = (Monthlycompanysummary) o;

        if (monthCompanySummaryId != that.monthCompanySummaryId) return false;
        if (companyId != that.companyId) return false;
        if (month != that.month) return false;
        if (numberTripsCompleted != that.numberTripsCompleted) return false;
        if (numberOfTripRequest != that.numberOfTripRequest) return false;
        if (Double.compare(that.totalFeeTrips, totalFeeTrips) != 0) return false;
        if (Double.compare(that.totalCreditFee, totalCreditFee) != 0) return false;
        if (numberDriverCancelledTrips != that.numberDriverCancelledTrips) return false;
        if (Double.compare(that.adjustAmount, adjustAmount) != 0) return false;
        if (Double.compare(that.promotionAmount, promotionAmount) != 0) return false;
        if (Double.compare(that.promotion1, promotion1) != 0) return false;
        if (Double.compare(that.promotion2, promotion2) != 0) return false;
        if (Double.compare(that.promotionCreditAmount, promotionCreditAmount) != 0) return false;
        if (Double.compare(that.adjustCreditFare, adjustCreditFare) != 0) return false;
        if (Double.compare(that.driverFee, driverFee) != 0) return false;
        if (noDriverHasTrips != that.noDriverHasTrips) return false;
        if (noDriverNoHasTrips != that.noDriverNoHasTrips) return false;
        if (creditTrips != that.creditTrips) return false;
        if (noDriverActive != that.noDriverActive) return false;
        if (noNewbieDriver != that.noNewbieDriver) return false;
        if (numberOfRejectedTrips != that.numberOfRejectedTrips) return false;
        if (numberOfNoResponseTrips != that.numberOfNoResponseTrips) return false;
        if (Double.compare(that.driverDeponsitAccount, driverDeponsitAccount) != 0) return false;
        if (Double.compare(that.chargedAmount, chargedAmount) != 0) return false;
        if (Double.compare(that.actualPayment, actualPayment) != 0) return false;
        if (Double.compare(that.cancelFee, cancelFee) != 0) return false;
        if (cityId != null ? !cityId.equals(that.cityId) : that.cityId != null) return false;
        if (financialYear != null ? !financialYear.equals(that.financialYear) : that.financialYear != null)
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
        result = monthCompanySummaryId;
        result = 31 * result + companyId;
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        result = 31 * result + month;
        result = 31 * result + (financialYear != null ? financialYear.hashCode() : 0);
        result = 31 * result + numberTripsCompleted;
        result = 31 * result + numberOfTripRequest;
        temp = Double.doubleToLongBits(totalFeeTrips);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(totalCreditFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + numberDriverCancelledTrips;
        temp = Double.doubleToLongBits(adjustAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(promotionAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(promotion1);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(promotion2);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(promotionCreditAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(adjustCreditFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(driverFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + noDriverHasTrips;
        result = 31 * result + noDriverNoHasTrips;
        result = 31 * result + creditTrips;
        result = 31 * result + noDriverActive;
        result = 31 * result + noNewbieDriver;
        result = 31 * result + numberOfRejectedTrips;
        result = 31 * result + numberOfNoResponseTrips;
        temp = Double.doubleToLongBits(driverDeponsitAccount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(chargedAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(actualPayment);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cancelFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        return result;
    }
}
