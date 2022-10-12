package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "businessunitsummary")
public class Businessunitsummary {
    @Id
    @Column(name = "BUSINESSUNITSUMMARYID", nullable = false)
    private Integer id;

    @Column(name = "BUSINESSUNITID")
    private Integer businessunitid;

    @Column(name = "CITYID")
    private Integer cityid;

    @Column(name = "COUNTRYID")
    private String countryid;

    @Column(name = "Level", nullable = false)
    private Integer level;

    @Column(name = "CREATEDBY")
    private String createdby;

    @Column(name = "CREATEDDATE")
    private Instant createddate;

    @Column(name = "LASTMODIFIEDBY")
    private String lastmodifiedby;

    @Column(name = "LASTMODIFIEDDATE")
    private Instant lastmodifieddate;

    @Column(name = "MONTHCOMPANYSUMMARYID")
    private Integer monthcompanysummaryid;

    @Column(name = "FinancialYear", nullable = false)
    private Integer financialYear;

    @Column(name = "MONTH")
    private Integer month;

    @Column(name = "NUMBERTRIPSCOMPLETED")
    private Float numbertripscompleted;

    @Column(name = "NUMBEROFTRIPREQUEST")
    private Float numberoftriprequest;

    @Column(name = "TOTALFEETRIPS")
    private Double totalfeetrips;

    @Column(name = "TOTALCREDITFEE")
    private Double totalcreditfee;

    @Column(name = "NODRIVERCANCELLEDTRIPS")
    private Double nodrivercancelledtrips;

    @Column(name = "ADJUSTAMOUNT")
    private Double adjustamount;

    @Column(name = "PROMOTIONAMOUNT")
    private Double promotionamount;

    @Column(name = "PROMOTIONCREDITAMOUNT")
    private Double promotioncreditamount;

    @Column(name = "ADJUSTCREDITFARE")
    private Double adjustcreditfare;

    @Column(name = "DRIVERFEE")
    private Double driverfee;

    @Column(name = "NODRIVERHASTRIPS")
    private Double nodriverhastrips;

    @Column(name = "NODRIVERACTIVE")
    private Double nodriveractive;

    @Column(name = "NONEWBIEDRIVER")
    private Double nonewbiedriver;

    @Column(name = "NUMBEROFREJECTEDTRIPS")
    private Double numberofrejectedtrips;

    @Column(name = "CHARGEDAMOUNT")
    private Double chargedamount;

    @Column(name = "CANCELFEE")
    private Double cancelfee;

    @Column(name = "CREDITTRIPS")
    private Double credittrips;

    @Column(name = "ACTUALPAYMENT")
    private Double actualpayment;

    @Column(name = "TotallPaid")
    private Double totallPaid;

    @Column(name = "NoTripDRNoResponse")
    private Double noTripDRNoResponse;

    @Column(name = "NoTripRDCancel")
    private Double noTripRDCancel;

    @Column(name = "NoDriverAcNoHasTrips")
    private Double noDriverAcNoHasTrips;

    @Column(name = "DriverPromotion")
    private Double driverPromotion;

    @Column(name = "TotalDRBalance")
    private Double totalDRBalance;

    @Column(name = "TotalDRDebt")
    private Double totalDRDebt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBusinessunitid() {
        return businessunitid;
    }

    public void setBusinessunitid(Integer businessunitid) {
        this.businessunitid = businessunitid;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getCountryid() {
        return countryid;
    }

    public void setCountryid(String countryid) {
        this.countryid = countryid;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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

    public Integer getMonthcompanysummaryid() {
        return monthcompanysummaryid;
    }

    public void setMonthcompanysummaryid(Integer monthcompanysummaryid) {
        this.monthcompanysummaryid = monthcompanysummaryid;
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

    public Float getNumbertripscompleted() {
        return numbertripscompleted;
    }

    public void setNumbertripscompleted(Float numbertripscompleted) {
        this.numbertripscompleted = numbertripscompleted;
    }

    public Float getNumberoftriprequest() {
        return numberoftriprequest;
    }

    public void setNumberoftriprequest(Float numberoftriprequest) {
        this.numberoftriprequest = numberoftriprequest;
    }

    public Double getTotalfeetrips() {
        return totalfeetrips;
    }

    public void setTotalfeetrips(Double totalfeetrips) {
        this.totalfeetrips = totalfeetrips;
    }

    public Double getTotalcreditfee() {
        return totalcreditfee;
    }

    public void setTotalcreditfee(Double totalcreditfee) {
        this.totalcreditfee = totalcreditfee;
    }

    public Double getNodrivercancelledtrips() {
        return nodrivercancelledtrips;
    }

    public void setNodrivercancelledtrips(Double nodrivercancelledtrips) {
        this.nodrivercancelledtrips = nodrivercancelledtrips;
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

    public Double getPromotioncreditamount() {
        return promotioncreditamount;
    }

    public void setPromotioncreditamount(Double promotioncreditamount) {
        this.promotioncreditamount = promotioncreditamount;
    }

    public Double getAdjustcreditfare() {
        return adjustcreditfare;
    }

    public void setAdjustcreditfare(Double adjustcreditfare) {
        this.adjustcreditfare = adjustcreditfare;
    }

    public Double getDriverfee() {
        return driverfee;
    }

    public void setDriverfee(Double driverfee) {
        this.driverfee = driverfee;
    }

    public Double getNodriverhastrips() {
        return nodriverhastrips;
    }

    public void setNodriverhastrips(Double nodriverhastrips) {
        this.nodriverhastrips = nodriverhastrips;
    }

    public Double getNodriveractive() {
        return nodriveractive;
    }

    public void setNodriveractive(Double nodriveractive) {
        this.nodriveractive = nodriveractive;
    }

    public Double getNonewbiedriver() {
        return nonewbiedriver;
    }

    public void setNonewbiedriver(Double nonewbiedriver) {
        this.nonewbiedriver = nonewbiedriver;
    }

    public Double getNumberofrejectedtrips() {
        return numberofrejectedtrips;
    }

    public void setNumberofrejectedtrips(Double numberofrejectedtrips) {
        this.numberofrejectedtrips = numberofrejectedtrips;
    }

    public Double getChargedamount() {
        return chargedamount;
    }

    public void setChargedamount(Double chargedamount) {
        this.chargedamount = chargedamount;
    }

    public Double getCancelfee() {
        return cancelfee;
    }

    public void setCancelfee(Double cancelfee) {
        this.cancelfee = cancelfee;
    }

    public Double getCredittrips() {
        return credittrips;
    }

    public void setCredittrips(Double credittrips) {
        this.credittrips = credittrips;
    }

    public Double getActualpayment() {
        return actualpayment;
    }

    public void setActualpayment(Double actualpayment) {
        this.actualpayment = actualpayment;
    }

    public Double getTotallPaid() {
        return totallPaid;
    }

    public void setTotallPaid(Double totallPaid) {
        this.totallPaid = totallPaid;
    }

    public Double getNoTripDRNoResponse() {
        return noTripDRNoResponse;
    }

    public void setNoTripDRNoResponse(Double noTripDRNoResponse) {
        this.noTripDRNoResponse = noTripDRNoResponse;
    }

    public Double getNoTripRDCancel() {
        return noTripRDCancel;
    }

    public void setNoTripRDCancel(Double noTripRDCancel) {
        this.noTripRDCancel = noTripRDCancel;
    }

    public Double getNoDriverAcNoHasTrips() {
        return noDriverAcNoHasTrips;
    }

    public void setNoDriverAcNoHasTrips(Double noDriverAcNoHasTrips) {
        this.noDriverAcNoHasTrips = noDriverAcNoHasTrips;
    }

    public Double getDriverPromotion() {
        return driverPromotion;
    }

    public void setDriverPromotion(Double driverPromotion) {
        this.driverPromotion = driverPromotion;
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

}