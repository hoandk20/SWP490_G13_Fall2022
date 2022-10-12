package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "weeklydriversummary")
public class Weeklydriversummary {
    @Id
    @Column(name = "WEEKLYDRIVERSUMMARYID", nullable = false)
    private Long id;

    @Column(name = "DRIVERID", nullable = false, length = 50)
    private String driverid;

    @Column(name = "PROCESSEDDATE")
    private LocalDate processeddate;

    @Column(name = "SHAREDFARE", nullable = false)
    private Float sharedfare;

    @Column(name = "INVOICESTATUS", nullable = false, length = 5)
    private String invoicestatus;

    @Column(name = "WEEKNO", nullable = false)
    private Short weekno;

    @Column(name = "NUMBERTRIPS", nullable = false)
    private Short numbertrips;

    @Column(name = "NUMBEROFREJECTEDTRIPS", nullable = false)
    private Short numberofrejectedtrips;

    @Column(name = "NUMBEROFNORESPONSETRIPS", nullable = false)
    private Short numberofnoresponsetrips;

    @Column(name = "NUMBERRECEIVEDTRIPS", nullable = false)
    private Short numberreceivedtrips;

    @Column(name = "NUMBERDRIVERCANCELLEDTRIPS", nullable = false)
    private Short numberdrivercancelledtrips;

    @Column(name = "NUMBERRIDERCANCELLEDTRIPS", nullable = false)
    private Short numberridercancelledtrips;

    @Column(name = "COMPANYID", nullable = false)
    private Integer companyid;

    @Column(name = "TOTALFARE", nullable = false)
    private Double totalfare;

    @Column(name = "DISTANCE", nullable = false)
    private Double distance;

    @Column(name = "ADJUSTAMOUNT", nullable = false)
    private Double adjustamount;

    @Column(name = "PROMOTIONAMOUNT", nullable = false)
    private Double promotionamount;

    @Column(name = "Promotion1", nullable = false)
    private Double promotion1;

    @Column(name = "Promotion2", nullable = false)
    private Double promotion2;

    @Column(name = "PAYMENT", nullable = false)
    private Double payment;

    @Column(name = "DriverBankFee", nullable = false)
    private Double driverBankFee;

    @Column(name = "RiderBankFee", nullable = false)
    private Double riderBankFee;

    @Column(name = "cancelFee", nullable = false)
    private Double cancelFee;

    @Column(name = "Tolls", nullable = false)
    private Double tolls;

    @Column(name = "PAYMENTDATE", nullable = false)
    private Instant paymentdate;

    @Column(name = "WEEKNUMBERID", nullable = false)
    private Long weeknumberid;

    @Column(name = "ACTUALPAYMENT", nullable = false)
    private Float actualpayment;

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

    @Column(name = "AdjustCreditFare")
    private Double adjustCreditFare;

    @Column(name = "driverFee")
    private Double driverFee;

    @Column(name = "rate")
    private Double rate;

    @Column(name = "noCreditPaidTrips")
    private Double noCreditPaidTrips;

    @Column(name = "CHARGEDAMOUNT", nullable = false)
    private Float chargedamount;

    @Column(name = "DISCOUNTEDAMOUNT", nullable = false)
    private Float discountedamount;

    @Column(name = "CREATEDBY", nullable = false, length = 50)
    private String createdby;

    @Column(name = "CREATEDDATE", nullable = false)
    private Instant createddate;

    @Column(name = "LASTMODIFIEDBY", nullable = false, length = 50)
    private String lastmodifiedby;

    @Column(name = "LASTMODIFIEDDATE", nullable = false)
    private Instant lastmodifieddate;

    @Column(name = "NoTrips", nullable = false)
    private Short noTrips;

    @Column(name = "CompletedTrips", nullable = false)
    private Short completedTrips;

    @Column(name = "TotalDRBalance")
    private Double totalDRBalance;

    @Column(name = "TotalDRDebt")
    private Double totalDRDebt;

    @Column(name = "DriverPoint", nullable = false)
    private Long driverPoint;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDriverid() {
        return driverid;
    }

    public void setDriverid(String driverid) {
        this.driverid = driverid;
    }

    public LocalDate getProcesseddate() {
        return processeddate;
    }

    public void setProcesseddate(LocalDate processeddate) {
        this.processeddate = processeddate;
    }

    public Float getSharedfare() {
        return sharedfare;
    }

    public void setSharedfare(Float sharedfare) {
        this.sharedfare = sharedfare;
    }

    public String getInvoicestatus() {
        return invoicestatus;
    }

    public void setInvoicestatus(String invoicestatus) {
        this.invoicestatus = invoicestatus;
    }

    public Short getWeekno() {
        return weekno;
    }

    public void setWeekno(Short weekno) {
        this.weekno = weekno;
    }

    public Short getNumbertrips() {
        return numbertrips;
    }

    public void setNumbertrips(Short numbertrips) {
        this.numbertrips = numbertrips;
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

    public Short getNumberdrivercancelledtrips() {
        return numberdrivercancelledtrips;
    }

    public void setNumberdrivercancelledtrips(Short numberdrivercancelledtrips) {
        this.numberdrivercancelledtrips = numberdrivercancelledtrips;
    }

    public Short getNumberridercancelledtrips() {
        return numberridercancelledtrips;
    }

    public void setNumberridercancelledtrips(Short numberridercancelledtrips) {
        this.numberridercancelledtrips = numberridercancelledtrips;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Double getTotalfare() {
        return totalfare;
    }

    public void setTotalfare(Double totalfare) {
        this.totalfare = totalfare;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getAdjustamount() {
        return adjustamount;
    }

    public void setAdjustamount(Double adjustamount) {
        this.adjustamount = adjustamount;
    }

    public Double getPromotionamount() {
        return promotionamount;
    }

    public void setPromotionamount(Double promotionamount) {
        this.promotionamount = promotionamount;
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

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
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

    public Double getCancelFee() {
        return cancelFee;
    }

    public void setCancelFee(Double cancelFee) {
        this.cancelFee = cancelFee;
    }

    public Double getTolls() {
        return tolls;
    }

    public void setTolls(Double tolls) {
        this.tolls = tolls;
    }

    public Instant getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(Instant paymentdate) {
        this.paymentdate = paymentdate;
    }

    public Long getWeeknumberid() {
        return weeknumberid;
    }

    public void setWeeknumberid(Long weeknumberid) {
        this.weeknumberid = weeknumberid;
    }

    public Float getActualpayment() {
        return actualpayment;
    }

    public void setActualpayment(Float actualpayment) {
        this.actualpayment = actualpayment;
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

    public Float getChargedamount() {
        return chargedamount;
    }

    public void setChargedamount(Float chargedamount) {
        this.chargedamount = chargedamount;
    }

    public Float getDiscountedamount() {
        return discountedamount;
    }

    public void setDiscountedamount(Float discountedamount) {
        this.discountedamount = discountedamount;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public Instant getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Instant createddate) {
        this.createddate = createddate;
    }

    public String getLastmodifiedby() {
        return lastmodifiedby;
    }

    public void setLastmodifiedby(String lastmodifiedby) {
        this.lastmodifiedby = lastmodifiedby;
    }

    public Instant getLastmodifieddate() {
        return lastmodifieddate;
    }

    public void setLastmodifieddate(Instant lastmodifieddate) {
        this.lastmodifieddate = lastmodifieddate;
    }

    public Short getNoTrips() {
        return noTrips;
    }

    public void setNoTrips(Short noTrips) {
        this.noTrips = noTrips;
    }

    public Short getCompletedTrips() {
        return completedTrips;
    }

    public void setCompletedTrips(Short completedTrips) {
        this.completedTrips = completedTrips;
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