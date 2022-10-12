package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "monthlycompanysummary")
public class Monthlycompanysummary {
    @Id
    @Column(name = "MonthCompanySummaryId", nullable = false)
    private Integer id;

    @Column(name = "CompanyID", nullable = false)
    private Integer companyID;

    @Column(name = "CityID")
    private Integer cityID;

    @Column(name = "Month", nullable = false)
    private Integer month;

    @Column(name = "FinancialYear")
    private Integer financialYear;

    @Column(name = "NumberTripsCompleted", nullable = false)
    private Integer numberTripsCompleted;

    @Column(name = "NumberOfTripRequest", nullable = false)
    private Integer numberOfTripRequest;

    @Column(name = "TotalFeeTrips", nullable = false)
    private Double totalFeeTrips;

    @Column(name = "TotalCreditFee", nullable = false)
    private Double totalCreditFee;

    @Column(name = "NumberDriverCancelledTrips", nullable = false)
    private Integer numberDriverCancelledTrips;

    @Column(name = "AdjustAmount", nullable = false)
    private Double adjustAmount;

    @Column(name = "PromotionAmount", nullable = false)
    private Double promotionAmount;

    @Column(name = "Promotion1", nullable = false)
    private Double promotion1;

    @Column(name = "Promotion2", nullable = false)
    private Double promotion2;

    @Column(name = "PromotionCreditAmount", nullable = false)
    private Double promotionCreditAmount;

    @Column(name = "AdjustCreditFare", nullable = false)
    private Double adjustCreditFare;

    @Column(name = "DriverFee", nullable = false)
    private Double driverFee;

    @Column(name = "noDriverHasTrips", nullable = false)
    private Integer noDriverHasTrips;

    @Column(name = "NoDriverNoHasTrips", nullable = false)
    private Integer noDriverNoHasTrips;

    @Column(name = "creditTrips", nullable = false)
    private Integer creditTrips;

    @Column(name = "NoDriverActive", nullable = false)
    private Integer noDriverActive;

    @Column(name = "NoNewbieDriver", nullable = false)
    private Integer noNewbieDriver;

    @Column(name = "NumberOfRejectedTrips", nullable = false)
    private Integer numberOfRejectedTrips;

    @Column(name = "NumberOfNoResponseTrips", nullable = false)
    private Integer numberOfNoResponseTrips;

    @Column(name = "DriverDeponsitAccount", nullable = false)
    private Double driverDeponsitAccount;

    @Column(name = "ChargedAmount", nullable = false)
    private Double chargedAmount;

    @Column(name = "ActualPayment", nullable = false)
    private Double actualPayment;

    @Column(name = "CancelFee", nullable = false)
    private Double cancelFee;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(Integer financialYear) {
        this.financialYear = financialYear;
    }

    public Integer getNumberTripsCompleted() {
        return numberTripsCompleted;
    }

    public void setNumberTripsCompleted(Integer numberTripsCompleted) {
        this.numberTripsCompleted = numberTripsCompleted;
    }

    public Integer getNumberOfTripRequest() {
        return numberOfTripRequest;
    }

    public void setNumberOfTripRequest(Integer numberOfTripRequest) {
        this.numberOfTripRequest = numberOfTripRequest;
    }

    public Double getTotalFeeTrips() {
        return totalFeeTrips;
    }

    public void setTotalFeeTrips(Double totalFeeTrips) {
        this.totalFeeTrips = totalFeeTrips;
    }

    public Double getTotalCreditFee() {
        return totalCreditFee;
    }

    public void setTotalCreditFee(Double totalCreditFee) {
        this.totalCreditFee = totalCreditFee;
    }

    public Integer getNumberDriverCancelledTrips() {
        return numberDriverCancelledTrips;
    }

    public void setNumberDriverCancelledTrips(Integer numberDriverCancelledTrips) {
        this.numberDriverCancelledTrips = numberDriverCancelledTrips;
    }

    public Double getAdjustAmount() {
        return adjustAmount;
    }

    public void setAdjustAmount(Double adjustAmount) {
        this.adjustAmount = adjustAmount;
    }

    public Double getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(Double promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    public Double getPromotion1() {
        return promotion1;
    }

    public void setPromotion1(Double promotion1) {
        this.promotion1 = promotion1;
    }

    public Double getPromotion2() {
        return promotion2;
    }

    public void setPromotion2(Double promotion2) {
        this.promotion2 = promotion2;
    }

    public Double getPromotionCreditAmount() {
        return promotionCreditAmount;
    }

    public void setPromotionCreditAmount(Double promotionCreditAmount) {
        this.promotionCreditAmount = promotionCreditAmount;
    }

    public Double getAdjustCreditFare() {
        return adjustCreditFare;
    }

    public void setAdjustCreditFare(Double adjustCreditFare) {
        this.adjustCreditFare = adjustCreditFare;
    }

    public Double getDriverFee() {
        return driverFee;
    }

    public void setDriverFee(Double driverFee) {
        this.driverFee = driverFee;
    }

    public Integer getNoDriverHasTrips() {
        return noDriverHasTrips;
    }

    public void setNoDriverHasTrips(Integer noDriverHasTrips) {
        this.noDriverHasTrips = noDriverHasTrips;
    }

    public Integer getNoDriverNoHasTrips() {
        return noDriverNoHasTrips;
    }

    public void setNoDriverNoHasTrips(Integer noDriverNoHasTrips) {
        this.noDriverNoHasTrips = noDriverNoHasTrips;
    }

    public Integer getCreditTrips() {
        return creditTrips;
    }

    public void setCreditTrips(Integer creditTrips) {
        this.creditTrips = creditTrips;
    }

    public Integer getNoDriverActive() {
        return noDriverActive;
    }

    public void setNoDriverActive(Integer noDriverActive) {
        this.noDriverActive = noDriverActive;
    }

    public Integer getNoNewbieDriver() {
        return noNewbieDriver;
    }

    public void setNoNewbieDriver(Integer noNewbieDriver) {
        this.noNewbieDriver = noNewbieDriver;
    }

    public Integer getNumberOfRejectedTrips() {
        return numberOfRejectedTrips;
    }

    public void setNumberOfRejectedTrips(Integer numberOfRejectedTrips) {
        this.numberOfRejectedTrips = numberOfRejectedTrips;
    }

    public Integer getNumberOfNoResponseTrips() {
        return numberOfNoResponseTrips;
    }

    public void setNumberOfNoResponseTrips(Integer numberOfNoResponseTrips) {
        this.numberOfNoResponseTrips = numberOfNoResponseTrips;
    }

    public Double getDriverDeponsitAccount() {
        return driverDeponsitAccount;
    }

    public void setDriverDeponsitAccount(Double driverDeponsitAccount) {
        this.driverDeponsitAccount = driverDeponsitAccount;
    }

    public Double getChargedAmount() {
        return chargedAmount;
    }

    public void setChargedAmount(Double chargedAmount) {
        this.chargedAmount = chargedAmount;
    }

    public Double getActualPayment() {
        return actualPayment;
    }

    public void setActualPayment(Double actualPayment) {
        this.actualPayment = actualPayment;
    }

    public Double getCancelFee() {
        return cancelFee;
    }

    public void setCancelFee(Double cancelFee) {
        this.cancelFee = cancelFee;
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