package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "accounttransaction")
public class Accounttransaction {
    @Id
    @Column(name = "TransactionID", nullable = false, length = 50)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UserID")
    private Taxinetuser userID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DriverID")
    private Driver driverID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AgentID")
    private Agent agentID;

    @Column(name = "TransactionDate", nullable = false)
    private LocalDate transactionDate;

    @Column(name = "TransferDate")
    private LocalDate transferDate;

    @Column(name = "Amount", nullable = false)
    private Double amount;

    @Column(name = "Discount", nullable = false)
    private Double discount;

    @Column(name = "balance", nullable = false)
    private Double balance;

    @Column(name = "PromotionBalance", nullable = false)
    private Double promotionBalance;

    @Column(name = "reason", length = 500)
    private String reason;

    @Column(name = "Payer", length = 100)
    private String payer;

    @Column(name = "Type", nullable = false, length = 4)
    private String type;

    @Column(name = "PaymentType", nullable = false, length = 4)
    private String paymentType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PartnerInvoiceNo")
    private Partnerinvoice partnerInvoiceNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PartnerPaymentNo")
    private Partnerpayment partnerPaymentNo;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TripID")
    private Trip tripID;

    @Column(name = "Status", length = 4)
    private String status;

    @Column(name = "ReasonCode", length = 35)
    private String reasonCode;

    @Column(name = "Promotion1", nullable = false)
    private Double promotion1;

    @Column(name = "PromotionBalance1", nullable = false)
    private Double promotionBalance1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "programCode", referencedColumnName = "ProgramCode"),
            @JoinColumn(name = "companyCode", referencedColumnName = "CompanyCode")
    })
    private Promotionprogram promotionprogram;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PromotionTripId")
    private Promotiontrip promotionTrip;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Taxinetuser getUserID() {
        return userID;
    }

    public void setUserID(Taxinetuser userID) {
        this.userID = userID;
    }

    public Driver getDriverID() {
        return driverID;
    }

    public void setDriverID(Driver driverID) {
        this.driverID = driverID;
    }

    public Agent getAgentID() {
        return agentID;
    }

    public void setAgentID(Agent agentID) {
        this.agentID = agentID;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public LocalDate getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(LocalDate transferDate) {
        this.transferDate = transferDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getPromotionBalance() {
        return promotionBalance;
    }

    public void setPromotionBalance(Double promotionBalance) {
        this.promotionBalance = promotionBalance;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Partnerinvoice getPartnerInvoiceNo() {
        return partnerInvoiceNo;
    }

    public void setPartnerInvoiceNo(Partnerinvoice partnerInvoiceNo) {
        this.partnerInvoiceNo = partnerInvoiceNo;
    }

    public Partnerpayment getPartnerPaymentNo() {
        return partnerPaymentNo;
    }

    public void setPartnerPaymentNo(Partnerpayment partnerPaymentNo) {
        this.partnerPaymentNo = partnerPaymentNo;
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

    public Trip getTripID() {
        return tripID;
    }

    public void setTripID(Trip tripID) {
        this.tripID = tripID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public Double getPromotion1() {
        return promotion1;
    }

    public void setPromotion1(Double promotion1) {
        this.promotion1 = promotion1;
    }

    public Double getPromotionBalance1() {
        return promotionBalance1;
    }

    public void setPromotionBalance1(Double promotionBalance1) {
        this.promotionBalance1 = promotionBalance1;
    }

    public Promotionprogram getPromotionprogram() {
        return promotionprogram;
    }

    public void setPromotionprogram(Promotionprogram promotionprogram) {
        this.promotionprogram = promotionprogram;
    }

    public Promotiontrip getPromotionTrip() {
        return promotionTrip;
    }

    public void setPromotionTrip(Promotiontrip promotionTrip) {
        this.promotionTrip = promotionTrip;
    }

}