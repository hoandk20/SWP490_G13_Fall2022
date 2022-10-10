package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Dailydriversummary {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DailyDriverSummaryID", nullable = false)
    private long dailyDriverSummaryId;
    @Basic
    @Column(name = "DriverID", nullable = false, length = 50)
    private String driverId;
    @Basic
    @Column(name = "ProcessedDate", nullable = true)
    private Timestamp processedDate;
    @Basic
    @Column(name = "DriverFee", nullable = false, precision = 0)
    private double driverFee;
    @Basic
    @Column(name = "NoCreditPaidTrips", nullable = false)
    private short noCreditPaidTrips;
    @Basic
    @Column(name = "NumberOfRejectedTrips", nullable = false)
    private short numberOfRejectedTrips;
    @Basic
    @Column(name = "NumberOfNoResponseTrips", nullable = false)
    private short numberOfNoResponseTrips;
    @Basic
    @Column(name = "NumberReceivedTrips", nullable = false)
    private short numberReceivedTrips;
    @Basic
    @Column(name = "NumberDriverCancelledTrips", nullable = false)
    private short numberDriverCancelledTrips;
    @Basic
    @Column(name = "NumberRiderCancelledTrips", nullable = false)
    private short numberRiderCancelledTrips;
    @Basic
    @Column(name = "Distance", nullable = false, precision = 0)
    private double distance;
    @Basic
    @Column(name = "AdjustCreditFare", nullable = false, precision = 0)
    private double adjustCreditFare;
    @Basic
    @Column(name = "Rate", nullable = false, precision = 0)
    private double rate;
    @Basic
    @Column(name = "InvoiceStatus", nullable = false, length = 3)
    private String invoiceStatus;
    @Basic
    @Column(name = "WeekNo", nullable = true)
    private Short weekNo;
    @Basic
    @Column(name = "NoTrips", nullable = false)
    private short noTrips;
    @Basic
    @Column(name = "CompanyID", nullable = true)
    private Integer companyId;
    @Basic
    @Column(name = "PartnerInvoiceNo", nullable = true, length = 255)
    private String partnerInvoiceNo;
    @Basic
    @Column(name = "TotalFare", nullable = false, precision = 0)
    private double totalFare;
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
    @Column(name = "Payment", nullable = false, precision = 0)
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
    @Column(name = "WeekNumberID", nullable = true)
    private Long weekNumberId;
    @Basic
    @Column(name = "ActualPayment", nullable = false, precision = 0)
    private double actualPayment;
    @Basic
    @Column(name = "TotalFeeRDCredit", nullable = false, precision = 0)
    private double totalFeeRdCredit;
    @Basic
    @Column(name = "TotalTollsTripsCredit", nullable = false, precision = 0)
    private double totalTollsTripsCredit;
    @Basic
    @Column(name = "TotalPromotionRDCash", nullable = false, precision = 0)
    private double totalPromotionRdCash;
    @Basic
    @Column(name = "TotalPromotionRDCredit", nullable = false, precision = 0)
    private double totalPromotionRdCredit;
    @Basic
    @Column(name = "DriverDeponsitAccount", nullable = false, precision = 0)
    private double driverDeponsitAccount;
    @Basic
    @Column(name = "TotalFareRDCancelTrips", nullable = false, precision = 0)
    private double totalFareRdCancelTrips;
    @Basic
    @Column(name = "DriverFeeRDCredit", nullable = false, precision = 0)
    private double driverFeeRdCredit;
    @Basic
    @Column(name = "CreatedBy", nullable = false, length = 255)
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
    @Column(name = "Date", nullable = false)
    private Date date;
    @Basic
    @Column(name = "CompletedTrips", nullable = false)
    private short completedTrips;
    @Basic
    @Column(name = "DriverPoint", nullable = false)
    private long driverPoint;

    public long getDailyDriverSummaryId() {
        return dailyDriverSummaryId;
    }

    public void setDailyDriverSummaryId(long dailyDriverSummaryId) {
        this.dailyDriverSummaryId = dailyDriverSummaryId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public Timestamp getProcessedDate() {
        return processedDate;
    }

    public void setProcessedDate(Timestamp processedDate) {
        this.processedDate = processedDate;
    }

    public double getDriverFee() {
        return driverFee;
    }

    public void setDriverFee(double driverFee) {
        this.driverFee = driverFee;
    }

    public short getNoCreditPaidTrips() {
        return noCreditPaidTrips;
    }

    public void setNoCreditPaidTrips(short noCreditPaidTrips) {
        this.noCreditPaidTrips = noCreditPaidTrips;
    }

    public short getNumberOfRejectedTrips() {
        return numberOfRejectedTrips;
    }

    public void setNumberOfRejectedTrips(short numberOfRejectedTrips) {
        this.numberOfRejectedTrips = numberOfRejectedTrips;
    }

    public short getNumberOfNoResponseTrips() {
        return numberOfNoResponseTrips;
    }

    public void setNumberOfNoResponseTrips(short numberOfNoResponseTrips) {
        this.numberOfNoResponseTrips = numberOfNoResponseTrips;
    }

    public short getNumberReceivedTrips() {
        return numberReceivedTrips;
    }

    public void setNumberReceivedTrips(short numberReceivedTrips) {
        this.numberReceivedTrips = numberReceivedTrips;
    }

    public short getNumberDriverCancelledTrips() {
        return numberDriverCancelledTrips;
    }

    public void setNumberDriverCancelledTrips(short numberDriverCancelledTrips) {
        this.numberDriverCancelledTrips = numberDriverCancelledTrips;
    }

    public short getNumberRiderCancelledTrips() {
        return numberRiderCancelledTrips;
    }

    public void setNumberRiderCancelledTrips(short numberRiderCancelledTrips) {
        this.numberRiderCancelledTrips = numberRiderCancelledTrips;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getAdjustCreditFare() {
        return adjustCreditFare;
    }

    public void setAdjustCreditFare(double adjustCreditFare) {
        this.adjustCreditFare = adjustCreditFare;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public Short getWeekNo() {
        return weekNo;
    }

    public void setWeekNo(Short weekNo) {
        this.weekNo = weekNo;
    }

    public short getNoTrips() {
        return noTrips;
    }

    public void setNoTrips(short noTrips) {
        this.noTrips = noTrips;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getPartnerInvoiceNo() {
        return partnerInvoiceNo;
    }

    public void setPartnerInvoiceNo(String partnerInvoiceNo) {
        this.partnerInvoiceNo = partnerInvoiceNo;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
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

    public Long getWeekNumberId() {
        return weekNumberId;
    }

    public void setWeekNumberId(Long weekNumberId) {
        this.weekNumberId = weekNumberId;
    }

    public double getActualPayment() {
        return actualPayment;
    }

    public void setActualPayment(double actualPayment) {
        this.actualPayment = actualPayment;
    }

    public double getTotalFeeRdCredit() {
        return totalFeeRdCredit;
    }

    public void setTotalFeeRdCredit(double totalFeeRdCredit) {
        this.totalFeeRdCredit = totalFeeRdCredit;
    }

    public double getTotalTollsTripsCredit() {
        return totalTollsTripsCredit;
    }

    public void setTotalTollsTripsCredit(double totalTollsTripsCredit) {
        this.totalTollsTripsCredit = totalTollsTripsCredit;
    }

    public double getTotalPromotionRdCash() {
        return totalPromotionRdCash;
    }

    public void setTotalPromotionRdCash(double totalPromotionRdCash) {
        this.totalPromotionRdCash = totalPromotionRdCash;
    }

    public double getTotalPromotionRdCredit() {
        return totalPromotionRdCredit;
    }

    public void setTotalPromotionRdCredit(double totalPromotionRdCredit) {
        this.totalPromotionRdCredit = totalPromotionRdCredit;
    }

    public double getDriverDeponsitAccount() {
        return driverDeponsitAccount;
    }

    public void setDriverDeponsitAccount(double driverDeponsitAccount) {
        this.driverDeponsitAccount = driverDeponsitAccount;
    }

    public double getTotalFareRdCancelTrips() {
        return totalFareRdCancelTrips;
    }

    public void setTotalFareRdCancelTrips(double totalFareRdCancelTrips) {
        this.totalFareRdCancelTrips = totalFareRdCancelTrips;
    }

    public double getDriverFeeRdCredit() {
        return driverFeeRdCredit;
    }

    public void setDriverFeeRdCredit(double driverFeeRdCredit) {
        this.driverFeeRdCredit = driverFeeRdCredit;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public short getCompletedTrips() {
        return completedTrips;
    }

    public void setCompletedTrips(short completedTrips) {
        this.completedTrips = completedTrips;
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

        Dailydriversummary that = (Dailydriversummary) o;

        if (dailyDriverSummaryId != that.dailyDriverSummaryId) return false;
        if (Double.compare(that.driverFee, driverFee) != 0) return false;
        if (noCreditPaidTrips != that.noCreditPaidTrips) return false;
        if (numberOfRejectedTrips != that.numberOfRejectedTrips) return false;
        if (numberOfNoResponseTrips != that.numberOfNoResponseTrips) return false;
        if (numberReceivedTrips != that.numberReceivedTrips) return false;
        if (numberDriverCancelledTrips != that.numberDriverCancelledTrips) return false;
        if (numberRiderCancelledTrips != that.numberRiderCancelledTrips) return false;
        if (Double.compare(that.distance, distance) != 0) return false;
        if (Double.compare(that.adjustCreditFare, adjustCreditFare) != 0) return false;
        if (Double.compare(that.rate, rate) != 0) return false;
        if (noTrips != that.noTrips) return false;
        if (Double.compare(that.totalFare, totalFare) != 0) return false;
        if (Double.compare(that.adjustAmount, adjustAmount) != 0) return false;
        if (Double.compare(that.promotionAmount, promotionAmount) != 0) return false;
        if (Double.compare(that.promotion1, promotion1) != 0) return false;
        if (Double.compare(that.promotion2, promotion2) != 0) return false;
        if (Double.compare(that.payment, payment) != 0) return false;
        if (Double.compare(that.driverBankFee, driverBankFee) != 0) return false;
        if (Double.compare(that.riderBankFee, riderBankFee) != 0) return false;
        if (Double.compare(that.cancelFee, cancelFee) != 0) return false;
        if (Double.compare(that.tolls, tolls) != 0) return false;
        if (Double.compare(that.actualPayment, actualPayment) != 0) return false;
        if (Double.compare(that.totalFeeRdCredit, totalFeeRdCredit) != 0) return false;
        if (Double.compare(that.totalTollsTripsCredit, totalTollsTripsCredit) != 0) return false;
        if (Double.compare(that.totalPromotionRdCash, totalPromotionRdCash) != 0) return false;
        if (Double.compare(that.totalPromotionRdCredit, totalPromotionRdCredit) != 0) return false;
        if (Double.compare(that.driverDeponsitAccount, driverDeponsitAccount) != 0) return false;
        if (Double.compare(that.totalFareRdCancelTrips, totalFareRdCancelTrips) != 0) return false;
        if (Double.compare(that.driverFeeRdCredit, driverFeeRdCredit) != 0) return false;
        if (completedTrips != that.completedTrips) return false;
        if (driverPoint != that.driverPoint) return false;
        if (driverId != null ? !driverId.equals(that.driverId) : that.driverId != null) return false;
        if (processedDate != null ? !processedDate.equals(that.processedDate) : that.processedDate != null)
            return false;
        if (invoiceStatus != null ? !invoiceStatus.equals(that.invoiceStatus) : that.invoiceStatus != null)
            return false;
        if (weekNo != null ? !weekNo.equals(that.weekNo) : that.weekNo != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (partnerInvoiceNo != null ? !partnerInvoiceNo.equals(that.partnerInvoiceNo) : that.partnerInvoiceNo != null)
            return false;
        if (weekNumberId != null ? !weekNumberId.equals(that.weekNumberId) : that.weekNumberId != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (dailyDriverSummaryId ^ (dailyDriverSummaryId >>> 32));
        result = 31 * result + (driverId != null ? driverId.hashCode() : 0);
        result = 31 * result + (processedDate != null ? processedDate.hashCode() : 0);
        temp = Double.doubleToLongBits(driverFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) noCreditPaidTrips;
        result = 31 * result + (int) numberOfRejectedTrips;
        result = 31 * result + (int) numberOfNoResponseTrips;
        result = 31 * result + (int) numberReceivedTrips;
        result = 31 * result + (int) numberDriverCancelledTrips;
        result = 31 * result + (int) numberRiderCancelledTrips;
        temp = Double.doubleToLongBits(distance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(adjustCreditFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(rate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (invoiceStatus != null ? invoiceStatus.hashCode() : 0);
        result = 31 * result + (weekNo != null ? weekNo.hashCode() : 0);
        result = 31 * result + (int) noTrips;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (partnerInvoiceNo != null ? partnerInvoiceNo.hashCode() : 0);
        temp = Double.doubleToLongBits(totalFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(adjustAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(promotionAmount);
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
        result = 31 * result + (weekNumberId != null ? weekNumberId.hashCode() : 0);
        temp = Double.doubleToLongBits(actualPayment);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(totalFeeRdCredit);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(totalTollsTripsCredit);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(totalPromotionRdCash);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(totalPromotionRdCredit);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(driverDeponsitAccount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(totalFareRdCancelTrips);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(driverFeeRdCredit);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (int) completedTrips;
        result = 31 * result + (int) (driverPoint ^ (driverPoint >>> 32));
        return result;
    }
}
