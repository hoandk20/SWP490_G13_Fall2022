package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "accounttransaction")
public class Accounttransaction {
    @Id
    @Column(name = "TransactionID", nullable = false, length = 50)
    private String id;

    @Column(name = "UserID", length = 50)
    private String userID;

    @Column(name = "DriverID", length = 50)
    private String driverID;

    @Column(name = "AgentID")
    private Integer agentID;

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

    @Column(name = "PartnerInvoiceNo", length = 50)
    private String partnerInvoiceNo;

    @Column(name = "PartnerPaymentNo", length = 50)
    private String partnerPaymentNo;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "TripID", length = 50)
    private String tripID;

    @Column(name = "Status", length = 4)
    private String status;

    @Column(name = "ReasonCode", length = 35)
    private String reasonCode;

    @Column(name = "Promotion1", nullable = false)
    private Double promotion1;

    @Column(name = "PromotionBalance1", nullable = false)
    private Double promotionBalance1;

    @Column(name = "programCode", length = 30)
    private String programCode;

    @Column(name = "companyCode", length = 11)
    private String companyCode;

    @Column(name = "PromotionTripId", length = 50)
    private String promotionTripId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public Integer getAgentID() {
        return agentID;
    }

    public void setAgentID(Integer agentID) {
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

    public String getPartnerInvoiceNo() {
        return partnerInvoiceNo;
    }

    public void setPartnerInvoiceNo(String partnerInvoiceNo) {
        this.partnerInvoiceNo = partnerInvoiceNo;
    }

    public String getPartnerPaymentNo() {
        return partnerPaymentNo;
    }

    public void setPartnerPaymentNo(String partnerPaymentNo) {
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

    public String getTripID() {
        return tripID;
    }

    public void setTripID(String tripID) {
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

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getPromotionTripId() {
        return promotionTripId;
    }

    public void setPromotionTripId(String promotionTripId) {
        this.promotionTripId = promotionTripId;
    }

}