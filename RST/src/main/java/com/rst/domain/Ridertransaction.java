package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "ridertransaction")
public class Ridertransaction {
    @Id
    @Column(name = "RiderTransactionID", nullable = false, length = 50)
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

    @Column(name = "balance", nullable = false)
    private Double balance;

    @Column(name = "Reason")
    private String reason;

    @Column(name = "Payer", length = 100)
    private String payer;

    @Column(name = "Type", nullable = false, length = 4)
    private String type;

    @Column(name = "PaymentType", nullable = false, length = 4)
    private String paymentType;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AccountTransactionID")
    private Accounttransaction accountTransactionID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RiderID", nullable = false)
    private Rider riderID;

    @Column(name = "ReasonCode", length = 35)
    private String reasonCode;

    @Column(name = "promoBalance", nullable = false)
    private Double promoBalance;

    @Column(name = "Status", length = 4)
    private String status;

    @Column(name = "Currency", length = 12)
    private String currency;

    @Column(name = "ConnectTransaction", length = 50)
    private String connectTransaction;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BankAccountId")
    private Bankaccount bankAccount;

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

    public Accounttransaction getAccountTransactionID() {
        return accountTransactionID;
    }

    public void setAccountTransactionID(Accounttransaction accountTransactionID) {
        this.accountTransactionID = accountTransactionID;
    }

    public Rider getRiderID() {
        return riderID;
    }

    public void setRiderID(Rider riderID) {
        this.riderID = riderID;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public Double getPromoBalance() {
        return promoBalance;
    }

    public void setPromoBalance(Double promoBalance) {
        this.promoBalance = promoBalance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getConnectTransaction() {
        return connectTransaction;
    }

    public void setConnectTransaction(String connectTransaction) {
        this.connectTransaction = connectTransaction;
    }

    public Bankaccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(Bankaccount bankAccount) {
        this.bankAccount = bankAccount;
    }

}