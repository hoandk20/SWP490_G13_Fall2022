package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "monthlydriversummary")
public class Monthlydriversummary {
    @Id
    @Column(name = "MonthlyDriverSummaryId", nullable = false)
    private Integer id;

    @Column(name = "FinancialYear", nullable = false)
    private Integer financialYear;

    @Column(name = "Month", nullable = false)
    private Integer month;

    @Column(name = "CompletedTrips")
    private Short completedTrips;

    @Column(name = "NumberCreditTrips", nullable = false)
    private Short numberCreditTrips;

    @Column(name = "NUMBEROFREJECTEDTRIPS", nullable = false)
    private Short numberofrejectedtrips;

    @Column(name = "NUMBEROFNORESPONSETRIPS", nullable = false)
    private Short numberofnoresponsetrips;

    @Column(name = "NUMBERRECEIVEDTRIPS", nullable = false)
    private Short numberreceivedtrips;

    @Column(name = "NoDriverCancelledTrips", nullable = false)
    private Short noDriverCancelledTrips;

    @Column(name = "NoRiderCancelledTrips", nullable = false)
    private Short noRiderCancelledTrips;

    @Column(name = "TotalFare", nullable = false)
    private Double totalFare;

    @Column(name = "Distance", nullable = false)
    private Double distance;

    @Column(name = "AdjustAmount", nullable = false)
    private Double adjustAmount;

    @Column(name = "PromotionAmount", nullable = false)
    private Double promotionAmount;

    @Column(name = "Promotion1", nullable = false)
    private Double promotion1;

    @Column(name = "Promotion2", nullable = false)
    private Double promotion2;

    @Column(name = "PromotionCreditAmount")
    private Float promotionCreditAmount;

    @Column(name = "Payment", nullable = false)
    private Double payment;

    @Column(name = "CreditFare", nullable = false)
    private Double creditFare;

    @Column(name = "CreditFareAdjust", nullable = false)
    private Double creditFareAdjust;

    @Column(name = "ActualPayment", nullable = false)
    private Double actualPayment;

    @Column(name = "TotalFeeRDCredit")
    private Float totalFeeRDCredit;

    @Column(name = "TotalTollsTripsCredit")
    private Float totalTollsTripsCredit;

    @Column(name = "TotalPromotionRDCash")
    private Float totalPromotionRDCash;

    @Column(name = "TotalPromotionRDCredit")
    private Float totalPromotionRDCredit;

    @Column(name = "DriverDeponsitAccount")
    private Double driverDeponsitAccount;

    @Column(name = "TotalFareRDCancelTrips")
    private Float totalFareRDCancelTrips;

    @Column(name = "DriverFeeRDCredit")
    private Float driverFeeRDCredit;

    @Column(name = "ChargedAmount", nullable = false)
    private Double chargedAmount;

    @Column(name = "DiscountedAmount", nullable = false)
    private Double discountedAmount;

    @Column(name = "DriverFee", nullable = false)
    private Double driverFee;

    @Column(name = "PrepaidAmount", nullable = false)
    private Double prepaidAmount;

    @Column(name = "CompanyId", nullable = false)
    private Integer companyId;

    @Column(name = "DriverId", nullable = false, length = 50)
    private String driverId;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "DriverBankFee", nullable = false)
    private Double driverBankFee;

    @Column(name = "RiderBankFee", nullable = false)
    private Double riderBankFee;

    @Column(name = "Tolls", nullable = false)
    private Double tolls;

    @Column(name = "CancelFee", nullable = false)
    private Double cancelFee;

    @Column(name = "AdjustCreditFare", nullable = false)
    private Double adjustCreditFare;

    @Column(name = "NoCreditPaidTrips", nullable = false)
    private Short noCreditPaidTrips;

    @Column(name = "NoTrips", nullable = false)
    private Short noTrips;

    @Column(name = "NumberDriverCancelledTrips", nullable = false)
    private Short numberDriverCancelledTrips;

    @Column(name = "Rate", nullable = false)
    private Float rate;

    @Column(name = "NumberRiderCancelledTrips", nullable = false)
    private Short numberRiderCancelledTrips;

    @Column(name = "TotalDRBalance")
    private Double totalDRBalance;

    @Column(name = "TotalDRDebt")
    private Double totalDRDebt;

    @Column(name = "DriverPoint", nullable = false)
    private Long driverPoint;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(Integer financialYear) {
        this.financialYear = financialYear;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Short getCompletedTrips() {
        return completedTrips;
    }

    public void setCompletedTrips(Short completedTrips) {
        this.completedTrips = completedTrips;
    }

    public Short getNumberCreditTrips() {
        return numberCreditTrips;
    }

    public void setNumberCreditTrips(Short numberCreditTrips) {
        this.numberCreditTrips = numberCreditTrips;
    }

    public Short getNumberofrejectedtrips() {
        return numberofrejectedtrips;
    }

    public void setNumberofrejectedtrips(Short numberofrejectedtrips) {
        this.numberofrejectedtrips = numberofrejectedtrips;
    }

    public Short getNumberofnoresponsetrips() {
        return numberofnoresponsetrips;
    }

    public void setNumberofnoresponsetrips(Short numberofnoresponsetrips) {
        this.numberofnoresponsetrips = numberofnoresponsetrips;
    }

    public Short getNumberreceivedtrips() {
        return numberreceivedtrips;
    }

    public void setNumberreceivedtrips(Short numberreceivedtrips) {
        this.numberreceivedtrips = numberreceivedtrips;
    }

    public Short getNoDriverCancelledTrips() {
        return noDriverCancelledTrips;
    }

    public void setNoDriverCancelledTrips(Short noDriverCancelledTrips) {
        this.noDriverCancelledTrips = noDriverCancelledTrips;
    }

    public Short getNoRiderCancelledTrips() {
        return noRiderCancelledTrips;
    }

    public void setNoRiderCancelledTrips(Short noRiderCancelledTrips) {
        this.noRiderCancelledTrips = noRiderCancelledTrips;
    }

    public Double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(Double totalFare) {
        this.totalFare = totalFare;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
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

    public Float getPromotionCreditAmount() {
        return promotionCreditAmount;
    }

    public void setPromotionCreditAmount(Float promotionCreditAmount) {
        this.promotionCreditAmount = promotionCreditAmount;
    }

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public Double getCreditFare() {
        return creditFare;
    }

    public void setCreditFare(Double creditFare) {
        this.creditFare = creditFare;
    }

    public Double getCreditFareAdjust() {
        return creditFareAdjust;
    }

    public void setCreditFareAdjust(Double creditFareAdjust) {
        this.creditFareAdjust = creditFareAdjust;
    }

    public Double getActualPayment() {
        return actualPayment;
    }

    public void setActualPayment(Double actualPayment) {
        this.actualPayment = actualPayment;
    }

    public Float getTotalFeeRDCredit() {
        return totalFeeRDCredit;
    }

    public void setTotalFeeRDCredit(Float totalFeeRDCredit) {
        this.totalFeeRDCredit = totalFeeRDCredit;
    }

    public Float getTotalTollsTripsCredit() {
        return totalTollsTripsCredit;
    }

    public void setTotalTollsTripsCredit(Float totalTollsTripsCredit) {
        this.totalTollsTripsCredit = totalTollsTripsCredit;
    }

    public Float getTotalPromotionRDCash() {
        return totalPromotionRDCash;
    }

    public void setTotalPromotionRDCash(Float totalPromotionRDCash) {
        this.totalPromotionRDCash = totalPromotionRDCash;
    }

    public Float getTotalPromotionRDCredit() {
        return totalPromotionRDCredit;
    }

    public void setTotalPromotionRDCredit(Float totalPromotionRDCredit) {
        this.totalPromotionRDCredit = totalPromotionRDCredit;
    }

    public Double getDriverDeponsitAccount() {
        return driverDeponsitAccount;
    }

    public void setDriverDeponsitAccount(Double driverDeponsitAccount) {
        this.driverDeponsitAccount = driverDeponsitAccount;
    }

    public Float getTotalFareRDCancelTrips() {
        return totalFareRDCancelTrips;
    }

    public void setTotalFareRDCancelTrips(Float totalFareRDCancelTrips) {
        this.totalFareRDCancelTrips = totalFareRDCancelTrips;
    }

    public Float getDriverFeeRDCredit() {
        return driverFeeRDCredit;
    }

    public void setDriverFeeRDCredit(Float driverFeeRDCredit) {
        this.driverFeeRDCredit = driverFeeRDCredit;
    }

    public Double getChargedAmount() {
        return chargedAmount;
    }

    public void setChargedAmount(Double chargedAmount) {
        this.chargedAmount = chargedAmount;
    }

    public Double getDiscountedAmount() {
        return discountedAmount;
    }

    public void setDiscountedAmount(Double discountedAmount) {
        this.discountedAmount = discountedAmount;
    }

    public Double getDriverFee() {
        return driverFee;
    }

    public void setDriverFee(Double driverFee) {
        this.driverFee = driverFee;
    }

    public Double getPrepaidAmount() {
        return prepaidAmount;
    }

    public void setPrepaidAmount(Double prepaidAmount) {
        this.prepaidAmount = prepaidAmount;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
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

    public Double getDriverBankFee() {
        return driverBankFee;
    }

    public void setDriverBankFee(Double driverBankFee) {
        this.driverBankFee = driverBankFee;
    }

    public Double getRiderBankFee() {
        return riderBankFee;
    }

    public void setRiderBankFee(Double riderBankFee) {
        this.riderBankFee = riderBankFee;
    }

    public Double getTolls() {
        return tolls;
    }

    public void setTolls(Double tolls) {
        this.tolls = tolls;
    }

    public Double getCancelFee() {
        return cancelFee;
    }

    public void setCancelFee(Double cancelFee) {
        this.cancelFee = cancelFee;
    }

    public Double getAdjustCreditFare() {
        return adjustCreditFare;
    }

    public void setAdjustCreditFare(Double adjustCreditFare) {
        this.adjustCreditFare = adjustCreditFare;
    }

    public Short getNoCreditPaidTrips() {
        return noCreditPaidTrips;
    }

    public void setNoCreditPaidTrips(Short noCreditPaidTrips) {
        this.noCreditPaidTrips = noCreditPaidTrips;
    }

    public Short getNoTrips() {
        return noTrips;
    }

    public void setNoTrips(Short noTrips) {
        this.noTrips = noTrips;
    }

    public Short getNumberDriverCancelledTrips() {
        return numberDriverCancelledTrips;
    }

    public void setNumberDriverCancelledTrips(Short numberDriverCancelledTrips) {
        this.numberDriverCancelledTrips = numberDriverCancelledTrips;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public Short getNumberRiderCancelledTrips() {
        return numberRiderCancelledTrips;
    }

    public void setNumberRiderCancelledTrips(Short numberRiderCancelledTrips) {
        this.numberRiderCancelledTrips = numberRiderCancelledTrips;
    }

    public Double getTotalDRBalance() {
        return totalDRBalance;
    }

    public void setTotalDRBalance(Double totalDRBalance) {
        this.totalDRBalance = totalDRBalance;
    }

    public Double getTotalDRDebt() {
        return totalDRDebt;
    }

    public void setTotalDRDebt(Double totalDRDebt) {
        this.totalDRDebt = totalDRDebt;
    }

    public Long getDriverPoint() {
        return driverPoint;
    }

    public void setDriverPoint(Long driverPoint) {
        this.driverPoint = driverPoint;
    }

}