package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Businessunitsummary {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "BUSINESSUNITSUMMARYID", nullable = false)
    private int businessunitsummaryid;
    @Basic
    @Column(name = "BUSINESSUNITID", nullable = true)
    private Integer businessunitid;
    @Basic
    @Column(name = "CITYID", nullable = true)
    private Integer cityid;
    @Basic
    @Column(name = "COUNTRYID", nullable = true, length = 255)
    private String countryid;
    @Basic
    @Column(name = "Level", nullable = false)
    private int level;
    @Basic
    @Column(name = "CREATEDBY", nullable = true, length = 255)
    private String createdby;
    @Basic
    @Column(name = "CREATEDDATE", nullable = true)
    private Timestamp createddate;
    @Basic
    @Column(name = "LASTMODIFIEDBY", nullable = true, length = 255)
    private String lastmodifiedby;
    @Basic
    @Column(name = "LASTMODIFIEDDATE", nullable = true)
    private Timestamp lastmodifieddate;
    @Basic
    @Column(name = "MONTHCOMPANYSUMMARYID", nullable = true)
    private Integer monthcompanysummaryid;
    @Basic
    @Column(name = "FinancialYear", nullable = false)
    private int financialYear;
    @Basic
    @Column(name = "MONTH", nullable = true)
    private Integer month;
    @Basic
    @Column(name = "NUMBERTRIPSCOMPLETED", nullable = true, precision = 0)
    private Double numbertripscompleted;
    @Basic
    @Column(name = "NUMBEROFTRIPREQUEST", nullable = true, precision = 0)
    private Double numberoftriprequest;
    @Basic
    @Column(name = "TOTALFEETRIPS", nullable = true, precision = 0)
    private Double totalfeetrips;
    @Basic
    @Column(name = "TOTALCREDITFEE", nullable = true, precision = 0)
    private Double totalcreditfee;
    @Basic
    @Column(name = "NODRIVERCANCELLEDTRIPS", nullable = true, precision = 0)
    private Double nodrivercancelledtrips;
    @Basic
    @Column(name = "ADJUSTAMOUNT", nullable = true, precision = 0)
    private Double adjustamount;
    @Basic
    @Column(name = "PROMOTIONAMOUNT", nullable = true, precision = 0)
    private Double promotionamount;
    @Basic
    @Column(name = "PROMOTIONCREDITAMOUNT", nullable = true, precision = 0)
    private Double promotioncreditamount;
    @Basic
    @Column(name = "ADJUSTCREDITFARE", nullable = true, precision = 0)
    private Double adjustcreditfare;
    @Basic
    @Column(name = "DRIVERFEE", nullable = true, precision = 0)
    private Double driverfee;
    @Basic
    @Column(name = "NODRIVERHASTRIPS", nullable = true, precision = 0)
    private Double nodriverhastrips;
    @Basic
    @Column(name = "NODRIVERACTIVE", nullable = true, precision = 0)
    private Double nodriveractive;
    @Basic
    @Column(name = "NONEWBIEDRIVER", nullable = true, precision = 0)
    private Double nonewbiedriver;
    @Basic
    @Column(name = "NUMBEROFREJECTEDTRIPS", nullable = true, precision = 0)
    private Double numberofrejectedtrips;
    @Basic
    @Column(name = "CHARGEDAMOUNT", nullable = true, precision = 0)
    private Double chargedamount;
    @Basic
    @Column(name = "CANCELFEE", nullable = true, precision = 0)
    private Double cancelfee;
    @Basic
    @Column(name = "CREDITTRIPS", nullable = true, precision = 0)
    private Double credittrips;
    @Basic
    @Column(name = "ACTUALPAYMENT", nullable = true, precision = 0)
    private Double actualpayment;
    @Basic
    @Column(name = "TotallPaid", nullable = true, precision = 0)
    private Double totallPaid;
    @Basic
    @Column(name = "NoTripDRNoResponse", nullable = true, precision = 0)
    private Double noTripDrNoResponse;
    @Basic
    @Column(name = "NoTripRDCancel", nullable = true, precision = 0)
    private Double noTripRdCancel;
    @Basic
    @Column(name = "NoDriverAcNoHasTrips", nullable = true, precision = 0)
    private Double noDriverAcNoHasTrips;
    @Basic
    @Column(name = "DriverPromotion", nullable = true, precision = 0)
    private Double driverPromotion;
    @Basic
    @Column(name = "TotalDRBalance", nullable = true, precision = 0)
    private Double totalDrBalance;
    @Basic
    @Column(name = "TotalDRDebt", nullable = true, precision = 0)
    private Double totalDrDebt;

    public int getBusinessunitsummaryid() {
        return businessunitsummaryid;
    }

    public void setBusinessunitsummaryid(int businessunitsummaryid) {
        this.businessunitsummaryid = businessunitsummaryid;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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

    public Integer getMonthcompanysummaryid() {
        return monthcompanysummaryid;
    }

    public void setMonthcompanysummaryid(Integer monthcompanysummaryid) {
        this.monthcompanysummaryid = monthcompanysummaryid;
    }

    public int getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(int financialYear) {
        this.financialYear = financialYear;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Double getNumbertripscompleted() {
        return numbertripscompleted;
    }

    public void setNumbertripscompleted(Double numbertripscompleted) {
        this.numbertripscompleted = numbertripscompleted;
    }

    public Double getNumberoftriprequest() {
        return numberoftriprequest;
    }

    public void setNumberoftriprequest(Double numberoftriprequest) {
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

    public Double getNoTripDrNoResponse() {
        return noTripDrNoResponse;
    }

    public void setNoTripDrNoResponse(Double noTripDrNoResponse) {
        this.noTripDrNoResponse = noTripDrNoResponse;
    }

    public Double getNoTripRdCancel() {
        return noTripRdCancel;
    }

    public void setNoTripRdCancel(Double noTripRdCancel) {
        this.noTripRdCancel = noTripRdCancel;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Businessunitsummary that = (Businessunitsummary) o;

        if (businessunitsummaryid != that.businessunitsummaryid) return false;
        if (level != that.level) return false;
        if (financialYear != that.financialYear) return false;
        if (businessunitid != null ? !businessunitid.equals(that.businessunitid) : that.businessunitid != null)
            return false;
        if (cityid != null ? !cityid.equals(that.cityid) : that.cityid != null) return false;
        if (countryid != null ? !countryid.equals(that.countryid) : that.countryid != null) return false;
        if (createdby != null ? !createdby.equals(that.createdby) : that.createdby != null) return false;
        if (createddate != null ? !createddate.equals(that.createddate) : that.createddate != null) return false;
        if (lastmodifiedby != null ? !lastmodifiedby.equals(that.lastmodifiedby) : that.lastmodifiedby != null)
            return false;
        if (lastmodifieddate != null ? !lastmodifieddate.equals(that.lastmodifieddate) : that.lastmodifieddate != null)
            return false;
        if (monthcompanysummaryid != null ? !monthcompanysummaryid.equals(that.monthcompanysummaryid) : that.monthcompanysummaryid != null)
            return false;
        if (month != null ? !month.equals(that.month) : that.month != null) return false;
        if (numbertripscompleted != null ? !numbertripscompleted.equals(that.numbertripscompleted) : that.numbertripscompleted != null)
            return false;
        if (numberoftriprequest != null ? !numberoftriprequest.equals(that.numberoftriprequest) : that.numberoftriprequest != null)
            return false;
        if (totalfeetrips != null ? !totalfeetrips.equals(that.totalfeetrips) : that.totalfeetrips != null)
            return false;
        if (totalcreditfee != null ? !totalcreditfee.equals(that.totalcreditfee) : that.totalcreditfee != null)
            return false;
        if (nodrivercancelledtrips != null ? !nodrivercancelledtrips.equals(that.nodrivercancelledtrips) : that.nodrivercancelledtrips != null)
            return false;
        if (adjustamount != null ? !adjustamount.equals(that.adjustamount) : that.adjustamount != null) return false;
        if (promotionamount != null ? !promotionamount.equals(that.promotionamount) : that.promotionamount != null)
            return false;
        if (promotioncreditamount != null ? !promotioncreditamount.equals(that.promotioncreditamount) : that.promotioncreditamount != null)
            return false;
        if (adjustcreditfare != null ? !adjustcreditfare.equals(that.adjustcreditfare) : that.adjustcreditfare != null)
            return false;
        if (driverfee != null ? !driverfee.equals(that.driverfee) : that.driverfee != null) return false;
        if (nodriverhastrips != null ? !nodriverhastrips.equals(that.nodriverhastrips) : that.nodriverhastrips != null)
            return false;
        if (nodriveractive != null ? !nodriveractive.equals(that.nodriveractive) : that.nodriveractive != null)
            return false;
        if (nonewbiedriver != null ? !nonewbiedriver.equals(that.nonewbiedriver) : that.nonewbiedriver != null)
            return false;
        if (numberofrejectedtrips != null ? !numberofrejectedtrips.equals(that.numberofrejectedtrips) : that.numberofrejectedtrips != null)
            return false;
        if (chargedamount != null ? !chargedamount.equals(that.chargedamount) : that.chargedamount != null)
            return false;
        if (cancelfee != null ? !cancelfee.equals(that.cancelfee) : that.cancelfee != null) return false;
        if (credittrips != null ? !credittrips.equals(that.credittrips) : that.credittrips != null) return false;
        if (actualpayment != null ? !actualpayment.equals(that.actualpayment) : that.actualpayment != null)
            return false;
        if (totallPaid != null ? !totallPaid.equals(that.totallPaid) : that.totallPaid != null) return false;
        if (noTripDrNoResponse != null ? !noTripDrNoResponse.equals(that.noTripDrNoResponse) : that.noTripDrNoResponse != null)
            return false;
        if (noTripRdCancel != null ? !noTripRdCancel.equals(that.noTripRdCancel) : that.noTripRdCancel != null)
            return false;
        if (noDriverAcNoHasTrips != null ? !noDriverAcNoHasTrips.equals(that.noDriverAcNoHasTrips) : that.noDriverAcNoHasTrips != null)
            return false;
        if (driverPromotion != null ? !driverPromotion.equals(that.driverPromotion) : that.driverPromotion != null)
            return false;
        if (totalDrBalance != null ? !totalDrBalance.equals(that.totalDrBalance) : that.totalDrBalance != null)
            return false;
        if (totalDrDebt != null ? !totalDrDebt.equals(that.totalDrDebt) : that.totalDrDebt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = businessunitsummaryid;
        result = 31 * result + (businessunitid != null ? businessunitid.hashCode() : 0);
        result = 31 * result + (cityid != null ? cityid.hashCode() : 0);
        result = 31 * result + (countryid != null ? countryid.hashCode() : 0);
        result = 31 * result + level;
        result = 31 * result + (createdby != null ? createdby.hashCode() : 0);
        result = 31 * result + (createddate != null ? createddate.hashCode() : 0);
        result = 31 * result + (lastmodifiedby != null ? lastmodifiedby.hashCode() : 0);
        result = 31 * result + (lastmodifieddate != null ? lastmodifieddate.hashCode() : 0);
        result = 31 * result + (monthcompanysummaryid != null ? monthcompanysummaryid.hashCode() : 0);
        result = 31 * result + financialYear;
        result = 31 * result + (month != null ? month.hashCode() : 0);
        result = 31 * result + (numbertripscompleted != null ? numbertripscompleted.hashCode() : 0);
        result = 31 * result + (numberoftriprequest != null ? numberoftriprequest.hashCode() : 0);
        result = 31 * result + (totalfeetrips != null ? totalfeetrips.hashCode() : 0);
        result = 31 * result + (totalcreditfee != null ? totalcreditfee.hashCode() : 0);
        result = 31 * result + (nodrivercancelledtrips != null ? nodrivercancelledtrips.hashCode() : 0);
        result = 31 * result + (adjustamount != null ? adjustamount.hashCode() : 0);
        result = 31 * result + (promotionamount != null ? promotionamount.hashCode() : 0);
        result = 31 * result + (promotioncreditamount != null ? promotioncreditamount.hashCode() : 0);
        result = 31 * result + (adjustcreditfare != null ? adjustcreditfare.hashCode() : 0);
        result = 31 * result + (driverfee != null ? driverfee.hashCode() : 0);
        result = 31 * result + (nodriverhastrips != null ? nodriverhastrips.hashCode() : 0);
        result = 31 * result + (nodriveractive != null ? nodriveractive.hashCode() : 0);
        result = 31 * result + (nonewbiedriver != null ? nonewbiedriver.hashCode() : 0);
        result = 31 * result + (numberofrejectedtrips != null ? numberofrejectedtrips.hashCode() : 0);
        result = 31 * result + (chargedamount != null ? chargedamount.hashCode() : 0);
        result = 31 * result + (cancelfee != null ? cancelfee.hashCode() : 0);
        result = 31 * result + (credittrips != null ? credittrips.hashCode() : 0);
        result = 31 * result + (actualpayment != null ? actualpayment.hashCode() : 0);
        result = 31 * result + (totallPaid != null ? totallPaid.hashCode() : 0);
        result = 31 * result + (noTripDrNoResponse != null ? noTripDrNoResponse.hashCode() : 0);
        result = 31 * result + (noTripRdCancel != null ? noTripRdCancel.hashCode() : 0);
        result = 31 * result + (noDriverAcNoHasTrips != null ? noDriverAcNoHasTrips.hashCode() : 0);
        result = 31 * result + (driverPromotion != null ? driverPromotion.hashCode() : 0);
        result = 31 * result + (totalDrBalance != null ? totalDrBalance.hashCode() : 0);
        result = 31 * result + (totalDrDebt != null ? totalDrDebt.hashCode() : 0);
        return result;
    }
}
