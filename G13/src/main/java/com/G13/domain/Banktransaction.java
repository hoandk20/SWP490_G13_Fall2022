package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "banktransaction")
public class Banktransaction {
    @Id
    @Column(name = "OrderCode", nullable = false, length = 50)
    private String id;

    @Column(name = "UserId", length = 50)
    private String userId;

    @Column(name = "TransactionId", length = 50)
    private String transactionId;

    @Column(name = "RiderTransactionId", length = 50)
    private String riderTransactionId;

    @Column(name = "PaymentId")
    private Integer paymentId;

    @Column(name = "TokenCode", length = 50)
    private String tokenCode;

    @Column(name = "ResponseCode", length = 3)
    private String responseCode;

    @Column(name = "ResponseTransStatus", length = 2)
    private String responseTransStatus;

    @Column(name = "Amount", nullable = false)
    private Double amount;

    @Column(name = "BankFee", nullable = false)
    private Double bankFee;

    @Column(name = "HoldAmount")
    private Double holdAmount;

    @Column(name = "TransactionStatus", length = 4)
    private String transactionStatus;

    @Column(name = "TransactionNLId", length = 45)
    private String transactionNLId;

    @Column(name = "Currency", length = 12)
    private String currency;

    @Column(name = "Type", length = 4)
    private String type;

    @Column(name = "Category", length = 4)
    private String category;

    @Column(name = "Note")
    private String note;

    @Column(name = "ReasonCode", length = 45)
    private String reasonCode;

    @Column(name = "BuyerMobile", length = 12)
    private String buyerMobile;

    @Column(name = "BuyerEmail", length = 50)
    private String buyerEmail;

    @Column(name = "CreatedBy", length = 50)
    private String createdBy;

    @Column(name = "CreatedDate")
    private Instant createdDate;

    @Column(name = "LastModifiedBy", length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate")
    private Instant lastModifiedDate;

    @Column(name = "bankAccountId", length = 50)
    private String bankAccountId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getRiderTransactionId() {
        return riderTransactionId;
    }

    public void setRiderTransactionId(String riderTransactionId) {
        this.riderTransactionId = riderTransactionId;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public String getTokenCode() {
        return tokenCode;
    }

    public void setTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseTransStatus() {
        return responseTransStatus;
    }

    public void setResponseTransStatus(String responseTransStatus) {
        this.responseTransStatus = responseTransStatus;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getBankFee() {
        return bankFee;
    }

    public void setBankFee(Double bankFee) {
        this.bankFee = bankFee;
    }

    public Double getHoldAmount() {
        return holdAmount;
    }

    public void setHoldAmount(Double holdAmount) {
        this.holdAmount = holdAmount;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getTransactionNLId() {
        return transactionNLId;
    }

    public void setTransactionNLId(String transactionNLId) {
        this.transactionNLId = transactionNLId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getBuyerMobile() {
        return buyerMobile;
    }

    public void setBuyerMobile(String buyerMobile) {
        this.buyerMobile = buyerMobile;
    }

    public String getBuyerEmail() {
        return buyerEmail;
    }

    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
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

    public String getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(String bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

}