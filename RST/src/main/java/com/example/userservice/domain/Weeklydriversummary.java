package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Weeklydriversummary {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "WEEKLYDRIVERSUMMARYID", nullable = false)
    private long weeklydriversummaryid;
    @Basic
    @Column(name = "DRIVERID", nullable = false, length = 50)
    private String driverid;
    @Basic
    @Column(name = "PROCESSEDDATE", nullable = true)
    private Date processeddate;
    @Basic
    @Column(name = "SHAREDFARE", nullable = false, precision = 0)
    private double sharedfare;
    @Basic
    @Column(name = "INVOICESTATUS", nullable = false, length = 5)
    private String invoicestatus;
    @Basic
    @Column(name = "WEEKNO", nullable = false)
    private short weekno;
    @Basic
    @Column(name = "NUMBERTRIPS", nullable = false)
    private short numbertrips;
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
    @Column(name = "NUMBERDRIVERCANCELLEDTRIPS", nullable = false)
    private short numberdrivercancelledtrips;
    @Basic
    @Column(name = "NUMBERRIDERCANCELLEDTRIPS", nullable = false)
    private short numberridercancelledtrips;
    @Basic
    @Column(name = "COMPANYID", nullable = false)
    private int companyid;
    @Basic
    @Column(name = "TOTALFARE", nullable = false, precision = 0)
    private double totalfare;
    @Basic
    @Column(name = "DISTANCE", nullable = false, precision = 0)
    private double distance;
    @Basic
    @Column(name = "ADJUSTAMOUNT", nullable = false, precision = 0)
    private double adjustamount;
    @Basic
    @Column(name = "PROMOTIONAMOUNT", nullable = false, precision = 0)
    private double promotionamount;
    @Basic
    @Column(name = "Promotion1", nullable = false, precision = 0)
    private double promotion1;
    @Basic
    @Column(name = "Promotion2", nullable = false, precision = 0)
    private double promotion2;
    @Basic
    @Column(name = "PAYMENT", nullable = false, precision = 0)
    private double payment;
    @Basic
    @Column(name = "DriverBankFee", nullable = false, precision = 0)
    private double driverBankFee;
    @Basic
    @Column(name = "RiderBankFee", nullable = false, precision = 0)
    private double riderBankFee;
    @Basic
    @Column(name = "cancelFee", nullable = false, precision = 0)
    private double cancelFee;
    @Basic
    @Column(name = "Tolls", nullable = false, precision = 0)
    private double tolls;
    @Basic
    @Column(name = "PAYMENTDATE", nullable = false)
    private Timestamp paymentdate;
    @Basic
    @Column(name = "WEEKNUMBERID", nullable = false)
    private long weeknumberid;
    @Basic
    @Column(name = "ACTUALPAYMENT", nullable = false, precision = 0)
    private double actualpayment;
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
    @Column(name = "AdjustCreditFare", nullable = true, precision = 0)
    private Double adjustCreditFare;
    @Basic
    @Column(name = "driverFee", nullable = true, precision = 0)
    private Double driverFee;
    @Basic
    @Column(name = "rate", nullable = true, precision = 0)
    private Double rate;
    @Basic
    @Column(name = "noCreditPaidTrips", nullable = true, precision = 0)
    private Double noCreditPaidTrips;
    @Basic
    @Column(name = "CHARGEDAMOUNT", nullable = false, precision = 0)
    private double chargedamount;
    @Basic
    @Column(name = "DISCOUNTEDAMOUNT", nullable = false, precision = 0)
    private double discountedamount;
    @Basic
    @Column(name = "CREATEDBY", nullable = false, length = 50)
    private String createdby;
    @Basic
    @Column(name = "CREATEDDATE", nullable = false)
    private Timestamp createddate;
    @Basic
    @Column(name = "LASTMODIFIEDBY", nullable = false, length = 50)
    private String lastmodifiedby;
    @Basic
    @Column(name = "LASTMODIFIEDDATE", nullable = false)
    private Timestamp lastmodifieddate;
    @Basic
    @Column(name = "NoTrips", nullable = false)
    private short noTrips;
    @Basic
    @Column(name = "CompletedTrips", nullable = false)
    private short completedTrips;
    @Basic
    @Column(name = "TotalDRBalance", nullable = true, precision = 0)
    private Double totalDrBalance;
    @Basic
    @Column(name = "TotalDRDebt", nullable = true, precision = 0)
    private Double totalDrDebt;
    @Basic
    @Column(name = "DriverPoint", nullable = false)
    private long driverPoint;

    public long getWeeklydriversummaryid() {
        return weeklydriversummaryid;
    }

    public void setWeeklydriversummaryid(long weeklydriversummaryid) {
        this.weeklydriversummaryid = weeklydriversummaryid;
    }

    public String getDriverid() {
        return driverid;
    }

    public void setDriverid(String driverid) {
        this.driverid = driverid;
    }

    public Date getProcesseddate() {
        return processeddate;
    }

    public void setProcesseddate(Date processeddate) {
        this.processeddate = processeddate;
    }

    public double getSharedfare() {
        return sharedfare;
    }

    public void setSharedfare(double sharedfare) {
        this.sharedfare = sharedfare;
    }

    public String getInvoicestatus() {
        return invoicestatus;
    }

    public void setInvoicestatus(String invoicestatus) {
        this.invoicestatus = invoicestatus;
    }

    public short getWeekno() {
        return weekno;
    }

    public void setWeekno(short weekno) {
        this.weekno = weekno;
    }

    public short getNumbertrips() {
        return numbertrips;
    }

    public void setNumbertrips(short numbertrips) {
        this.numbertrips = numbertrips;
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

    public short getNumberdrivercancelledtrips() {
        return numberdrivercancelledtrips;
    }

    public void setNumberdrivercancelledtrips(short numberdrivercancelledtrips) {
        this.numberdrivercancelledtrips = numberdrivercancelledtrips;
    }

    public short getNumberridercancelledtrips() {
        return numberridercancelledtrips;
    }

    public void setNumberridercancelledtrips(short numberridercancelledtrips) {
        this.numberridercancelledtrips = numberridercancelledtrips;
    }

    public int getCompanyid() {
        return companyid;
    }

    public void setCompanyid(int companyid) {
        this.companyid = companyid;
    }

    public double getTotalfare() {
        return totalfare;
    }

    public void setTotalfare(double totalfare) {
        this.totalfare = totalfare;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getAdjustamount() {
        return adjustamount;
    }

    public void setAdjustamount(double adjustamount) {
        this.adjustamount = adjustamount;
    }

    public double getPromotionamount() {
        return promotionamount;
    }

    public void setPromotionamount(double promotionamount) {
        this.promotionamount = promotionamount;
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

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
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

    public double getCancelFee() {
        return cancelFee;
    }

    public void setCancelFee(double cancelFee) {
        this.cancelFee = cancelFee;
    }

    public double getTolls() {
        return tolls;
    }

    public void setTolls(double tolls) {
        this.tolls = tolls;
    }

    public Timestamp getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(Timestamp paymentdate) {
        this.paymentdate = paymentdate;
    }

    public long getWeeknumberid() {
        return weeknumberid;
    }

    public void setWeeknumberid(long weeknumberid) {
        this.weeknumberid = weeknumberid;
    }

    public double getActualpayment() {
        return actualpayment;
    }

    public void setActualpayment(double actualpayment) {
        this.actualpayment = actualpayment;
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

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getNoCreditPaidTrips() {
        return noCreditPaidTrips;
    }

    public void setNoCreditPaidTrips(Double noCreditPaidTrips) {
        this.noCreditPaidTrips = noCreditPaidTrips;
    }

    public double getChargedamount() {
        return chargedamount;
    }

    public void setChargedamount(double chargedamount) {
        this.chargedamount = chargedamount;
    }

    public double getDiscountedamount() {
        return discountedamount;
    }

    public void setDiscountedamount(double discountedamount) {
        this.discountedamount = discountedamount;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public Timestamp getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Timestamp createddate) {
        this.createddate = createddate;
    }

    public String getLastmodifiedby() {
        return lastmodifiedby;
    }

    public void setLastmodifiedby(String lastmodifiedby) {
        this.lastmodifiedby = lastmodifiedby;
    }

    public Timestamp getLastmodifieddate() {
        return lastmodifieddate;
    }

    public void setLastmodifieddate(Timestamp lastmodifieddate) {
        this.lastmodifieddate = lastmodifieddate;
    }

    public short getNoTrips() {
        return noTrips;
    }

    public void setNoTrips(short noTrips) {
        this.noTrips = noTrips;
    }

    public short getCompletedTrips() {
        return completedTrips;
    }

    public void setCompletedTrips(short completedTrips) {
        this.completedTrips = completedTrips;
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

        Weeklydriversummary that = (Weeklydriversummary) o;

        if (weeklydriversummaryid != that.weeklydriversummaryid) return false;
        if (Double.compare(that.sharedfare, sharedfare) != 0) return false;
        if (weekno != that.weekno) return false;
        if (numbertrips != that.numbertrips) return false;
        if (numberofrejectedtrips != that.numberofrejectedtrips) return false;
        if (numberofnoresponsetrips != that.numberofnoresponsetrips) return false;
        if (numberreceivedtrips != that.numberreceivedtrips) return false;
        if (numberdrivercancelledtrips != that.numberdrivercancelledtrips) return false;
        if (numberridercancelledtrips != that.numberridercancelledtrips) return false;
        if (companyid != that.companyid) return false;
        if (Double.compare(that.totalfare, totalfare) != 0) return false;
        if (Double.compare(that.distance, distance) != 0) return false;
        if (Double.compare(that.adjustamount, adjustamount) != 0) return false;
        if (Double.compare(that.promotionamount, promotionamount) != 0) return false;
        if (Double.compare(that.promotion1, promotion1) != 0) return false;
        if (Double.compare(that.promotion2, promotion2) != 0) return false;
        if (Double.compare(that.payment, payment) != 0) return false;
        if (Double.compare(that.driverBankFee, driverBankFee) != 0) return false;
        if (Double.compare(that.riderBankFee, riderBankFee) != 0) return false;
        if (Double.compare(that.cancelFee, cancelFee) != 0) return false;
        if (Double.compare(that.tolls, tolls) != 0) return false;
        if (weeknumberid != that.weeknumberid) return false;
        if (Double.compare(that.actualpayment, actualpayment) != 0) return false;
        if (Double.compare(that.chargedamount, chargedamount) != 0) return false;
        if (Double.compare(that.discountedamount, discountedamount) != 0) return false;
        if (noTrips != that.noTrips) return false;
        if (completedTrips != that.completedTrips) return false;
        if (driverPoint != that.driverPoint) return false;
        if (driverid != null ? !driverid.equals(that.driverid) : that.driverid != null) return false;
        if (processeddate != null ? !processeddate.equals(that.processeddate) : that.processeddate != null)
            return false;
        if (invoicestatus != null ? !invoicestatus.equals(that.invoicestatus) : that.invoicestatus != null)
            return false;
        if (paymentdate != null ? !paymentdate.equals(that.paymentdate) : that.paymentdate != null) return false;
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
        if (adjustCreditFare != null ? !adjustCreditFare.equals(that.adjustCreditFare) : that.adjustCreditFare != null)
            return false;
        if (driverFee != null ? !driverFee.equals(that.driverFee) : that.driverFee != null) return false;
        if (rate != null ? !rate.equals(that.rate) : that.rate != null) return false;
        if (noCreditPaidTrips != null ? !noCreditPaidTrips.equals(that.noCreditPaidTrips) : that.noCreditPaidTrips != null)
            return false;
        if (createdby != null ? !createdby.equals(that.createdby) : that.createdby != null) return false;
        if (createddate != null ? !createddate.equals(that.createddate) : that.createddate != null) return false;
        if (lastmodifiedby != null ? !lastmodifiedby.equals(that.lastmodifiedby) : that.lastmodifiedby != null)
            return false;
        if (lastmodifieddate != null ? !lastmodifieddate.equals(that.lastmodifieddate) : that.lastmodifieddate != null)
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
        result = (int) (weeklydriversummaryid ^ (weeklydriversummaryid >>> 32));
        result = 31 * result + (driverid != null ? driverid.hashCode() : 0);
        result = 31 * result + (processeddate != null ? processeddate.hashCode() : 0);
        temp = Double.doubleToLongBits(sharedfare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (invoicestatus != null ? invoicestatus.hashCode() : 0);
        result = 31 * result + (int) weekno;
        result = 31 * result + (int) numbertrips;
        result = 31 * result + (int) numberofrejectedtrips;
        result = 31 * result + (int) numberofnoresponsetrips;
        result = 31 * result + (int) numberreceivedtrips;
        result = 31 * result + (int) numberdrivercancelledtrips;
        result = 31 * result + (int) numberridercancelledtrips;
        result = 31 * result + companyid;
        temp = Double.doubleToLongBits(totalfare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(distance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(adjustamount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(promotionamount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(promotion1);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(promotion2);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(payment);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(driverBankFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(riderBankFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cancelFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(tolls);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (paymentdate != null ? paymentdate.hashCode() : 0);
        result = 31 * result + (int) (weeknumberid ^ (weeknumberid >>> 32));
        temp = Double.doubleToLongBits(actualpayment);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (totalFeeRdCredit != null ? totalFeeRdCredit.hashCode() : 0);
        result = 31 * result + (totalTollsTripsCredit != null ? totalTollsTripsCredit.hashCode() : 0);
        result = 31 * result + (totalPromotionRdCash != null ? totalPromotionRdCash.hashCode() : 0);
        result = 31 * result + (totalPromotionRdCredit != null ? totalPromotionRdCredit.hashCode() : 0);
        result = 31 * result + (driverDeponsitAccount != null ? driverDeponsitAccount.hashCode() : 0);
        result = 31 * result + (totalFareRdCancelTrips != null ? totalFareRdCancelTrips.hashCode() : 0);
        result = 31 * result + (driverFeeRdCredit != null ? driverFeeRdCredit.hashCode() : 0);
        result = 31 * result + (adjustCreditFare != null ? adjustCreditFare.hashCode() : 0);
        result = 31 * result + (driverFee != null ? driverFee.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        result = 31 * result + (noCreditPaidTrips != null ? noCreditPaidTrips.hashCode() : 0);
        temp = Double.doubleToLongBits(chargedamount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(discountedamount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (createdby != null ? createdby.hashCode() : 0);
        result = 31 * result + (createddate != null ? createddate.hashCode() : 0);
        result = 31 * result + (lastmodifiedby != null ? lastmodifiedby.hashCode() : 0);
        result = 31 * result + (lastmodifieddate != null ? lastmodifieddate.hashCode() : 0);
        result = 31 * result + (int) noTrips;
        result = 31 * result + (int) completedTrips;
        result = 31 * result + (totalDrBalance != null ? totalDrBalance.hashCode() : 0);
        result = 31 * result + (totalDrDebt != null ? totalDrDebt.hashCode() : 0);
        result = 31 * result + (int) (driverPoint ^ (driverPoint >>> 32));
        return result;
    }
}
