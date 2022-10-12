package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "dailydriversummary")
public class Dailydriversummary {
    @Id
    @Column(name = "DailyDriverSummaryID", nullable = false)
    private Long id;

    @Column(name = "DriverID", nullable = false, length = 50)
    private String driverID;

    @Column(name = "ProcessedDate")
    private Instant processedDate;

    @Column(name = "DriverFee", nullable = false)
    private Double driverFee;

    @Column(name = "NoCreditPaidTrips", nullable = false)
    private Short noCreditPaidTrips;

    @Column(name = "NumberOfRejectedTrips", nullable = false)
    private Short numberOfRejectedTrips;

    @Column(name = "NumberOfNoResponseTrips", nullable = false)
    private Short numberOfNoResponseTrips;

    @Column(name = "NumberReceivedTrips", nullable = false)
    private Short numberReceivedTrips;

    @Column(name = "NumberDriverCancelledTrips", nullable = false)
    private Short numberDriverCancelledTrips;

    @Column(name = "NumberRiderCancelledTrips", nullable = false)
    private Short numberRiderCancelledTrips;

    @Column(name = "Distance", nullable = false)
    private Double distance;

    @Column(name = "AdjustCreditFare", nullable = false)
    private Double adjustCreditFare;

    @Column(name = "Rate", nullable = false)
    private Float rate;

    @Column(name = "InvoiceStatus", nullable = false, length = 3)
    private String invoiceStatus;

    @Column(name = "WeekNo")
    private Short weekNo;

    @Column(name = "NoTrips", nullable = false)
    private Short noTrips;

    @Column(name = "CompanyID")
    private Integer companyID;

    @Column(name = "PartnerInvoiceNo")
    private String partnerInvoiceNo;

    @Column(name = "TotalFare", nullable = false)
    private Double totalFare;

    @Column(name = "AdjustAmount", nullable = false)
    private Double adjustAmount;

    @Column(name = "PromotionAmount", nullable = false)
    private Double promotionAmount;

    @Column(name = "Promotion1", nullable = false)
    private Double promotion1;

    @Column(name = "Promotion2", nullable = false)
    private Double promotion2;

    @Column(name = "Payment", nullable = false)
    private Double payment;

    @Column(name = "DriverBankFee", nullable = false)
    private Double driverBankFee;

    @Column(name = "RiderBankFee", nullable = false)
    private Double riderBankFee;

    @Column(name = "cancelFee", nullable = false)
    private Double cancelFee;

    @Column(name = "Tolls", nullable = false)
    private Double tolls;

    @Column(name = "WeekNumberID")
    private Long weekNumberID;

    @Column(name = "ActualPayment", nullable = false)
    private Double actualPayment;

    @Column(name = "TotalFeeRDCredit", nullable = false)
    private Double totalFeeRDCredit;

    @Column(name = "TotalTollsTripsCredit", nullable = false)
    private Double totalTollsTripsCredit;

    @Column(name = "TotalPromotionRDCash", nullable = false)
    private Double totalPromotionRDCash;

    @Column(name = "TotalPromotionRDCredit", nullable = false)
    private Double totalPromotionRDCredit;

    @Column(name = "DriverDeponsitAccount", nullable = false)
    private Double driverDeponsitAccount;

    @Column(name = "TotalFareRDCancelTrips", nullable = false)
    private Double totalFareRDCancelTrips;

    @Column(name = "DriverFeeRDCredit", nullable = false)
    private Double driverFeeRDCredit;

    @Column(name = "CreatedBy", nullable = false)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "Date", nullable = false)
    private LocalDate date;

    @Column(name = "CompletedTrips", nullable = false)
    private Short completedTrips;

    @Column(name = "DriverPoint", nullable = false)
    private Long driverPoint;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public Instant getProcessedDate() {
        return processedDate;
    }

    public void setProcessedDate(Instant processedDate) {
        this.processedDate = processedDate;
    }

    public Double getDriverFee() {
        return driverFee;
    }

    public void setDriverFee(Double driverFee) {
        this.driverFee = driverFee;
    }

    public Short getNoCreditPaidTrips() {
        return noCreditPaidTrips;
    }

    public void setNoCreditPaidTrips(Short noCreditPaidTrips) {
        this.noCreditPaidTrips = noCreditPaidTrips;
    }

    public Short getNumberOfRejectedTrips() {
        return numberOfRejectedTrips;
    }

    public void setNumberOfRejectedTrips(Short numberOfRejectedTrips) {
        this.numberOfRejectedTrips = numberOfRejectedTrips;
    }

    public Short getNumberOfNoResponseTrips() {
        return numberOfNoResponseTrips;
    }

    public void setNumberOfNoResponseTrips(Short numberOfNoResponseTrips) {
        this.numberOfNoResponseTrips = numberOfNoResponseTrips;
    }

    public Short getNumberReceivedTrips() {
        return numberReceivedTrips;
    }

    public void setNumberReceivedTrips(Short numberReceivedTrips) {
        this.numberReceivedTrips = numberReceivedTrips;
    }

    public Short getNumberDriverCancelledTrips() {
        return numberDriverCancelledTrips;
    }

    public void setNumberDriverCancelledTrips(Short numberDriverCancelledTrips) {
        this.numberDriverCancelledTrips = numberDriverCancelledTrips;
    }

    public Short getNumberRiderCancelledTrips() {
        return numberRiderCancelledTrips;
    }

    public void setNumberRiderCancelledTrips(Short numberRiderCancelledTrips) {
        this.numberRiderCancelledTrips = numberRiderCancelledTrips;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getAdjustCreditFare() {
        return adjustCreditFare;
    }

    public void setAdjustCreditFare(Double adjustCreditFare) {
        this.adjustCreditFare = adjustCreditFare;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
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

    public Short getNoTrips() {
        return noTrips;
    }

    public void setNoTrips(Short noTrips) {
        this.noTrips = noTrips;
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public String getPartnerInvoiceNo() {
        return partnerInvoiceNo;
    }

    public void setPartnerInvoiceNo(String partnerInvoiceNo) {
        this.partnerInvoiceNo = partnerInvoiceNo;
    }

    public Double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(Double totalFare) {
        this.totalFare = totalFare;
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

    public Long getWeekNumberID() {
        return weekNumberID;
    }

    public void setWeekNumberID(Long weekNumberID) {
        this.weekNumberID = weekNumberID;
    }

    public Double getActualPayment() {
        return actualPayment;
    }

    public void setActualPayment(Double actualPayment) {
        this.actualPayment = actualPayment;
    }

    public Double getTotalFeeRDCredit() {
        return totalFeeRDCredit;
    }

    public void setTotalFeeRDCredit(Double totalFeeRDCredit) {
        this.totalFeeRDCredit = totalFeeRDCredit;
    }

    public Double getTotalTollsTripsCredit() {
        return totalTollsTripsCredit;
    }

    public void setTotalTollsTripsCredit(Double totalTollsTripsCredit) {
        this.totalTollsTripsCredit = totalTollsTripsCredit;
    }

    public Double getTotalPromotionRDCash() {
        return totalPromotionRDCash;
    }

    public void setTotalPromotionRDCash(Double totalPromotionRDCash) {
        this.totalPromotionRDCash = totalPromotionRDCash;
    }

    public Double getTotalPromotionRDCredit() {
        return totalPromotionRDCredit;
    }

    public void setTotalPromotionRDCredit(Double totalPromotionRDCredit) {
        this.totalPromotionRDCredit = totalPromotionRDCredit;
    }

    public Double getDriverDeponsitAccount() {
        return driverDeponsitAccount;
    }

    public void setDriverDeponsitAccount(Double driverDeponsitAccount) {
        this.driverDeponsitAccount = driverDeponsitAccount;
    }

    public Double getTotalFareRDCancelTrips() {
        return totalFareRDCancelTrips;
    }

    public void setTotalFareRDCancelTrips(Double totalFareRDCancelTrips) {
        this.totalFareRDCancelTrips = totalFareRDCancelTrips;
    }

    public Double getDriverFeeRDCredit() {
        return driverFeeRDCredit;
    }

    public void setDriverFeeRDCredit(Double driverFeeRDCredit) {
        this.driverFeeRDCredit = driverFeeRDCredit;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Short getCompletedTrips() {
        return completedTrips;
    }

    public void setCompletedTrips(Short completedTrips) {
        this.completedTrips = completedTrips;
    }

    public Long getDriverPoint() {
        return driverPoint;
    }

    public void setDriverPoint(Long driverPoint) {
        this.driverPoint = driverPoint;
    }

}