package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "agenttransaction")
public class Agenttransaction {
    @Id
    @Column(name = "AgentTransactionID", nullable = false, length = 50)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UserID", nullable = false)
    private Taxinetuser userID;

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

    @Column(name = "Balance", nullable = false)
    private Double balance;

    @Column(name = "Reason")
    private String reason;

    @Column(name = "Payer", length = 100)
    private String payer;

    @Column(name = "Type", nullable = false, length = 4)
    private String type;

    @Column(name = "PaymentType", nullable = false, length = 4)
    private String paymentType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AgentInvoiceNo")
    private Agentinvoice agentInvoiceNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AgentPaymentNo")
    private Agentpayment agentPaymentNo;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AccountTransactionID")
    private Accounttransaction accountTransactionID;

    @Column(name = "Status", length = 4)
    private String status;

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

    public Agentinvoice getAgentInvoiceNo() {
        return agentInvoiceNo;
    }

    public void setAgentInvoiceNo(Agentinvoice agentInvoiceNo) {
        this.agentInvoiceNo = agentInvoiceNo;
    }

    public Agentpayment getAgentPaymentNo() {
        return agentPaymentNo;
    }

    public void setAgentPaymentNo(Agentpayment agentPaymentNo) {
        this.agentPaymentNo = agentPaymentNo;
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

    public Accounttransaction getAccountTransactionID() {
        return accountTransactionID;
    }

    public void setAccountTransactionID(Accounttransaction accountTransactionID) {
        this.accountTransactionID = accountTransactionID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}