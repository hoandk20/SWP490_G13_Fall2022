package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Monthlydriversummary {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "MonthlyDriverSummaryId", nullable = false)
    private int monthlyDriverSummaryId;
    @Basic
    @Column(name = "FinancialYear", nullable = false)
    private int financialYear;
    @Basic
    @Column(name = "Month", nullable = false)
    private int month;
    @Basic
    @Column(name = "CompletedTrips", nullable = true)
    private Short completedTrips;
    @Basic
    @Column(name = "NumberCreditTrips", nullable = false)
    private short numberCreditTrips;
    @Basic
    @Column(name = "NUMBEROFREJECTEDTRIPS", nullable = false)
    private short numberofrejectedtrips;
    @Basic
    @Column(name = "NUMBEROFNORESPONSETRIPS", nullable = false)
    private short numberofnoresponsetrips;
    @Basic
    @Column(name = "NUMBERRECEIVEDTRIPS", nullable = false)
    private short numberreceivedtrips;
    @Basic
    @Column(name = "NoDriverCancelledTrips", nullable = false)
    private short noDriverCancelledTrips;
    @Basic
    @Column(name = "NoRiderCancelledTrips", nullable = false)
    private short noRiderCancelledTrips;
    @Basic
    @Column(name = "TotalFare", nullable = false, precision = 0)
    private double totalFare;
    @Basic
    @Column(name = "Distance", nullable = false, precision = 0)
    private double distance;
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
    @Column(name = "PromotionCreditAmount", nullable = true, precision = 0)
    private Double promotionCreditAmount;
    @Basic
    @Column(name = "Payment", nullable = false, precision = 0)
    private double payment;
    @Basic
    @Column(name = "CreditFare", nullable = false, precision = 0)
    private double creditFare;
    @Basic
    @Column(name = "CreditFareAdjust", nullable = false, precision = 0)
    private double creditFareAdjust;
    @Basic
    @Column(name = "ActualPayment", nullable = false, precision = 0)
    private double actualPayment;
    @Basic
    @Column(name = "TotalFeeRDCredit", nullable = true, precision = 0)
    private Double totalFeeRdCredit;
    @Basic
    @Column(name = "TotalTollsTripsCredit", nullable = true, precision = 0)
    private Double totalTollsTripsCredit;
    @Basic
    @Column(name = "TotalPromotionRDCash", nullable = true, precision = 0)
    private Double totalPromotionRdCash;
    @Basic
    @Column(name = "TotalPromotionRDCredit", nullable = true, precision = 0)
    private Double totalPromotionRdCredit;
    @Basic
    @Column(name = "DriverDeponsitAccount", nullable = true, precision = 0)
    private Double driverDeponsitAccount;
    @Basic
    @Column(name = "TotalFareRDCancelTrips", nullable = true, precision = 0)
    private Double totalFareRdCancelTrips;
    @Basic
    @Column(name = "DriverFeeRDCredit", nullable = true, precision = 0)
    private Double driverFeeRdCredit;
    @Basic
    @Column(name = "ChargedAmount", nullable = false, precision = 0)
    private double chargedAmount;
    @Basic
    @Column(name = "DiscountedAmount", nullable = false, precision = 0)
    private double discountedAmount;
    @Basic
    @Column(name = "DriverFee", nullable = false, precision = 0)
    private double driverFee;
    @Basic
    @Column(name = "PrepaidAmount", nullable = false, precision = 0)
    private double prepaidAmount;
    @Basic
    @Column(name = "CompanyId", nullable = false)
    private int companyId;
    @Basic
    @Column(name = "DriverId", nullable = false, length = 50)
    private String driverId;
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
    @Column(name = "DriverBankFee", nullable = false, precision = 0)
    private double driverBankFee;
    @Basic
    @Column(name = "RiderBankFee", nullable = false, precision = 0)
    private double riderBankFee;
    @Basic
    @Column(name = "Tolls", nullable = false, precision = 0)
    private double tolls;
    @Basic
    @Column(name = "CancelFee", nullable = false, precision = 0)
    private double cancelFee;
    @Basic
    @Column(name = "AdjustCreditFare", nullable = false, precision = 0)
    private double adjustCreditFare;
    @Basic
    @Column(name = "NoCreditPaidTrips", nullable = false)
    private short noCreditPaidTrips;
    @Basic
    @Column(name = "NoTrips", nullable = false)
    private short noTrips;
    @Basic
    @Column(name = "NumberDriverCancelledTrips", nullable = false)
    private short numberDriverCancelledTrips;
    @Basic
    @Column(name = "Rate", nullable = false, precision = 0)
    private double rate;
    @Basic
    @Column(name = "NumberRiderCancelledTrips", nullable = false)
    private short numberRiderCancelledTrips;
    @Basic
    @Column(name = "TotalDRBalance", nullable = true, precision = 0)
    private Double totalDrBalance;
    @Basic
    @Column(name = "TotalDRDebt", nullable = true, precision = 0)
    private Double totalDrDebt;
    @Basic
    @Column(name = "DriverPoint", nullable = false)
    private long driverPoint;

    public int getMonthlyDriverSummaryId() {
        return monthlyDriverSummaryId;
    }

    public void setMonthlyDriverSummaryId(int monthlyDriverSummaryId) {
        this.monthlyDriverSummaryId = monthlyDriverSummaryId;
    }

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

    public Short getCompletedTrips() {
        return completedTrips;
    }

    public void setCompletedTrips(Short completedTrips) {
        this.completedTrips = completedTrips;
    }

    public short getNumberCreditTrips() {
        return numberCreditTrips;
    }

    public void setNumberCreditTrips(short numberCreditTrips) {
        this.numberCreditTrips = numberCreditTrips;
    }

    public short getNumberofrejectedtrips() {
        return numberofrejectedtrips;
    }

    public void setNumberofrejectedtrips(short numberofrejectedtrips) {
        this.numberofrejectedtrips = numberofrejectedtrips;
    }

    public short getNumberofnoresponsetrips() {
        return numberofnoresponsetrips;
    }

    public void setNumberofnoresponsetrips(short numberofnoresponsetrips) {
        this.numberofnoresponsetrips = numberofnoresponsetrips;
    }

    public short getNumberreceivedtrips() {
        return numberreceivedtrips;
    }

    public void setNumberreceivedtrips(short numberreceivedtrips) {
        this.numberreceivedtrips = numberreceivedtrips;
    }

    public short getNoDriverCancelledTrips() {
        return noDriverCancelledTrips;
    }

    public void setNoDriverCancelledTrips(short noDriverCancelledTrips) {
        this.noDriverCancelledTrips = noDriverCancelledTrips;
    }

    public short getNoRiderCancelledTrips() {
        return noRiderCancelledTrips;
    }

    public void setNoRiderCancelledTrips(short noRiderCancelledTrips) {
        this.noRiderCancelledTrips = noRiderCancelledTrips;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
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

    public Double getPromotionCreditAmount() {
        return promotionCreditAmount;
    }

    public void setPromotionCreditAmount(Double promotionCreditAmount) {
        this.promotionCreditAmount = promotionCreditAmount;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getCreditFare() {
        return creditFare;
    }

    public void setCreditFare(double creditFare) {
        this.creditFare = creditFare;
    }

    public double getCreditFareAdjust() {
        return creditFareAdjust;
    }

    public void setCreditFareAdjust(double creditFareAdjust) {
        this.creditFareAdjust = creditFareAdjust;
    }

    public double getActualPayment() {
        return actualPayment;
    }

    public void setActualPayment(double actualPayment) {
        this.actualPayment = actualPayment;
    }

    public Double getTotalFeeRdCredit() {
        return totalFeeRdCredit;
    }

    public void setTotalFeeRdCredit(Double totalFeeRdCredit) {
        this.totalFeeRdCredit = totalFeeRdCredit;
    }

    public Double getTotalTollsTripsCredit() {
        return totalTollsTripsCredit;
    }

    public void setTotalTollsTripsCredit(Double totalTollsTripsCredit) {
        this.totalTollsTripsCredit = totalTollsTripsCredit;
    }

    public Double getTotalPromotionRdCash() {
        return totalPromotionRdCash;
    }

    public void setTotalPromotionRdCash(Double totalPromotionRdCash) {
        this.totalPromotionRdCash = totalPromotionRdCash;
    }

    public Double getTotalPromotionRdCredit() {
        return totalPromotionRdCredit;
    }

    public void setTotalPromotionRdCredit(Double totalPromotionRdCredit) {
        this.totalPromotionRdCredit = totalPromotionRdCredit;
    }

    public Double getDriverDeponsitAccount() {
        return driverDeponsitAccount;
    }

    public void setDriverDeponsitAccount(Double driverDeponsitAccount) {
        this.driverDeponsitAccount = driverDeponsitAccount;
    }

    public Double getTotalFareRdCancelTrips() {
        return totalFareRdCancelTrips;
    }

    public void setTotalFareRdCancelTrips(Double totalFareRdCancelTrips) {
        this.totalFareRdCancelTrips = totalFareRdCancelTrips;
    }

    public Double getDriverFeeRdCredit() {
        return driverFeeRdCredit;
    }

    public void setDriverFeeRdCredit(Double driverFeeRdCredit) {
        this.driverFeeRdCredit = driverFeeRdCredit;
    }

    public double getChargedAmount() {
        return chargedAmount;
    }

    public void setChargedAmount(double chargedAmount) {
        this.chargedAmount = chargedAmount;
    }

    public double getDiscountedAmount() {
        return discountedAmount;
    }

    public void setDiscountedAmount(double discountedAmount) {
        this.discountedAmount = discountedAmount;
    }

    public double getDriverFee() {
        return driverFee;
    }

    public void setDriverFee(double driverFee) {
        this.driverFee = driverFee;
    }

    public double getPrepaidAmount() {
        return prepaidAmount;
    }

    public void setPrepaidAmount(double prepaidAmount) {
        this.prepaidAmount = prepaidAmount;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
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

    public double getDriverBankFee() {
        return driverBankFee;
    }

    public void setDriverBankFee(double driverBankFee) {
        this.driverBankFee = driverBankFee;
    }

    public double getRiderBankFee() {
        return riderBankFee;
    }

    public void setRiderBankFee(double riderBankFee) {
        this.riderBankFee = riderBankFee;
    }

    public double getTolls() {
        return tolls;
    }

    public void setTolls(double tolls) {
        this.tolls = tolls;
    }

    public double getCancelFee() {
        return cancelFee;
    }

    public void setCancelFee(double cancelFee) {
        this.cancelFee = cancelFee;
    }

    public double getAdjustCreditFare() {
        return adjustCreditFare;
    }

    public void setAdjustCreditFare(double adjustCreditFare) {
        this.adjustCreditFare = adjustCreditFare;
    }

    public short getNoCreditPaidTrips() {
        return noCreditPaidTrips;
    }

    public void setNoCreditPaidTrips(short noCreditPaidTrips) {
        this.noCreditPaidTrips = noCreditPaidTrips;
    }

    public short getNoTrips() {
        return noTrips;
    }

    public void setNoTrips(short noTrips) {
        this.noTrips = noTrips;
    }

    public short getNumberDriverCancelledTrips() {
        return numberDriverCancelledTrips;
    }

    public void setNumberDriverCancelledTrips(short numberDriverCancelledTrips) {
        this.numberDriverCancelledTrips = numberDriverCancelledTrips;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public short getNumberRiderCancelledTrips() {
        return numberRiderCancelledTrips;
    }

    public void setNumberRiderCancelledTrips(short numberRiderCancelledTrips) {
        this.numberRiderCancelledTrips = numberRiderCancelledTrips;
    }

    public Double getTotalDrBalance() {
        return totalDrBalance;
    }

    public void setTotalDrBalance(Double totalDrBalance) {
        this.totalDrBalance = totalDrBalance;
    }

    public Double getTotalDrDebt() {
        return totalDrDebt;
    }

    public void setTotalDrDebt(Double totalDrDebt) {
        this.totalDrDebt = totalDrDebt;
    }

    public long getDriverPoint() {
        return driverPoint;
    }

    public void setDriverPoint(long driverPoint) {
        this.driverPoint = driverPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Monthlydriversummary that = (Monthlydriversummary) o;

        if (monthlyDriverSummaryId != that.monthlyDriverSummaryId) return false;
        if (financialYear != that.financialYear) return false;
        if (month != that.month) return false;
        if (numberCreditTrips != that.numberCreditTrips) return false;
        if (numberofrejectedtrips != that.numberofrejectedtrips) return false;
        if (numberofnoresponsetrips != that.numberofnoresponsetrips) return false;
        if (numberreceivedtrips != that.numberreceivedtrips) return false;
        if (noDriverCancelledTrips != that.noDriverCancelledTrips) return false;
        if (noRiderCancelledTrips != that.noRiderCancelledTrips) return false;
        if (Double.compare(that.totalFare, totalFare) != 0) return false;
        if (Double.compare(that.distance, distance) != 0) return false;
        if (Double.compare(that.adjustAmount, adjustAmount) != 0) return false;
        if (Double.compare(that.promotionAmount, promotionAmount) != 0) return false;
        if (Double.compare(that.promotion1, promotion1) != 0) return false;
        if (Double.compare(that.promotion2, promotion2) != 0) return false;
        if (Double.compare(that.payment, payment) != 0) return false;
        if (Double.compare(that.creditFare, creditFare) != 0) return false;
        if (Double.compare(that.creditFareAdjust, creditFareAdjust) != 0) return false;
        if (Double.compare(that.actualPayment, actualPayment) != 0) return false;
        if (Double.compare(that.chargedAmount, chargedAmount) != 0) return false;
        if (Double.compare(that.discountedAmount, discountedAmount) != 0) return false;
        if (Double.compare(that.driverFee, driverFee) != 0) return false;
        if (Double.compare(that.prepaidAmount, prepaidAmount) != 0) return false;
        if (companyId != that.companyId) return false;
        if (Double.compare(that.driverBankFee, driverBankFee) != 0) return false;
        if (Double.compare(that.riderBankFee, riderBankFee) != 0) return false;
        if (Double.compare(that.tolls, tolls) != 0) return false;
        if (Double.compare(that.cancelFee, cancelFee) != 0) return false;
        if (Double.compare(that.adjustCreditFare, adjustCreditFare) != 0) return false;
        if (noCreditPaidTrips != that.noCreditPaidTrips) return false;
        if (noTrips != that.noTrips) return false;
        if (numberDriverCancelledTrips != that.numberDriverCancelledTrips) return false;
        if (Double.compare(that.rate, rate) != 0) return false;
        if (numberRiderCancelledTrips != that.numberRiderCancelledTrips) return false;
        if (driverPoint != that.driverPoint) return false;
        if (completedTrips != null ? !completedTrips.equals(that.completedTrips) : that.completedTrips != null)
            return false;
        if (promotionCreditAmount != null ? !promotionCreditAmount.equals(that.promotionCreditAmount) : that.promotionCreditAmount != null)
            return false;
        if (totalFeeRdCredit != null ? !totalFeeRdCredit.equals(that.totalFeeRdCredit) : that.totalFeeRdCredit != null)
            return false;
        if (totalTollsTripsCredit != null ? !totalTollsTripsCredit.equals(that.totalTollsTripsCredit) : that.totalTollsTripsCredit != null)
            return false;
        if (totalPromotionRdCash != null ? !totalPromotionRdCash.equals(that.totalPromotionRdCash) : that.totalPromotionRdCash != null)
            return false;
        if (totalPromotionRdCredit != null ? !totalPromotionRdCredit.equals(that.totalPromotionRdCredit) : that.totalPromotionRdCredit != null)
            return false;
        if (driverDeponsitAccount != null ? !driverDeponsitAccount.equals(that.driverDeponsitAccount) : that.driverDeponsitAccount != null)
            return false;
        if (totalFareRdCancelTrips != null ? !totalFareRdCancelTrips.equals(that.totalFareRdCancelTrips) : that.totalFareRdCancelTrips != null)
            return false;
        if (driverFeeRdCredit != null ? !driverFeeRdCredit.equals(that.driverFeeRdCredit) : that.driverFeeRdCredit != null)
            return false;
        if (driverId != null ? !driverId.equals(that.driverId) : that.driverId != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (totalDrBalance != null ? !totalDrBalance.equals(that.totalDrBalance) : that.totalDrBalance != null)
            return false;
        if (totalDrDebt != null ? !totalDrDebt.equals(that.totalDrDebt) : that.totalDrDebt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = monthlyDriverSummaryId;
        result = 31 * result + financialYear;
        result = 31 * result + month;
        result = 31 * result + (completedTrips != null ? completedTrips.hashCode() : 0);
        result = 31 * result + (int) numberCreditTrips;
        result = 31 * result + (int) numberofrejectedtrips;
        result = 31 * result + (int) numberofnoresponsetrips;
        result = 31 * result + (int) numberreceivedtrips;
        result = 31 * result + (int) noDriverCancelledTrips;
        result = 31 * result + (int) noRiderCancelledTrips;
        temp = Double.doubleToLongBits(totalFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(distance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(adjustAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(promotionAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(promotion1);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(promotion2);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (promotionCreditAmount != null ? promotionCreditAmount.hashCode() : 0);
        temp = Double.doubleToLongBits(payment);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(creditFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(creditFareAdjust);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(actualPayment);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (totalFeeRdCredit != null ? totalFeeRdCredit.hashCode() : 0);
        result = 31 * result + (totalTollsTripsCredit != null ? totalTollsTripsCredit.hashCode() : 0);
        result = 31 * result + (totalPromotionRdCash != null ? totalPromotionRdCash.hashCode() : 0);
        result = 31 * result + (totalPromotionRdCredit != null ? totalPromotionRdCredit.hashCode() : 0);
        result = 31 * result + (driverDeponsitAccount != null ? driverDeponsitAccount.hashCode() : 0);
        result = 31 * result + (totalFareRdCancelTrips != null ? totalFareRdCancelTrips.hashCode() : 0);
        result = 31 * result + (driverFeeRdCredit != null ? driverFeeRdCredit.hashCode() : 0);
        temp = Double.doubleToLongBits(chargedAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(discountedAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(driverFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(prepaidAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + companyId;
        result = 31 * result + (driverId != null ? driverId.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        temp = Double.doubleToLongBits(driverBankFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(riderBankFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(tolls);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cancelFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(adjustCreditFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) noCreditPaidTrips;
        result = 31 * result + (int) noTrips;
        result = 31 * result + (int) numberDriverCancelledTrips;
        temp = Double.doubleToLongBits(rate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) numberRiderCancelledTrips;
        result = 31 * result + (totalDrBalance != null ? totalDrBalance.hashCode() : 0);
        result = 31 * result + (totalDrDebt != null ? totalDrDebt.hashCode() : 0);
        result = 31 * result + (int) (driverPoint ^ (driverPoint >>> 32));
        return result;
    }
}
