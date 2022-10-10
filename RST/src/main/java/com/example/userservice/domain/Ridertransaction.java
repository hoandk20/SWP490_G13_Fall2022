package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Ridertransaction {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RiderTransactionID", nullable = false, length = 50)
    private String riderTransactionId;
    @Basic
    @Column(name = "UserID", nullable = false, length = 50)
    private String userId;
    @Basic
    @Column(name = "AgentID", nullable = true)
    private Integer agentId;
    @Basic
    @Column(name = "TransactionDate", nullable = false)
    private Date transactionDate;
    @Basic
    @Column(name = "TransferDate", nullable = true)
    private Date transferDate;
    @Basic
    @Column(name = "Amount", nullable = false, precision = 0)
    private double amount;
    @Basic
    @Column(name = "Discount", nullable = false, precision = 0)
    private double discount;
    @Basic
    @Column(name = "balance", nullable = false, precision = 0)
    private double balance;
    @Basic
    @Column(name = "Reason", nullable = true, length = 255)
    private String reason;
    @Basic
    @Column(name = "Payer", nullable = true, length = 100)
    private String payer;
    @Basic
    @Column(name = "Type", nullable = false, length = 4)
    private String type;
    @Basic
    @Column(name = "PaymentType", nullable = false, length = 4)
    private String paymentType;
    @Basic
    @Column(name = "CreatedBy", nullable = false, length = 50)
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
    @Column(name = "TripID", nullable = true, length = 50)
    private String tripId;
    @Basic
    @Column(name = "AccountTransactionID", nullable = true, length = 50)
    private String accountTransactionId;
    @Basic
    @Column(name = "RiderID", nullable = false, length = 50)
    private String riderId;
    @Basic
    @Column(name = "ReasonCode", nullable = true, length = 35)
    private String reasonCode;
    @Basic
    @Column(name = "promoBalance", nullable = false, precision = 0)
    private double promoBalance;
    @Basic
    @Column(name = "Status", nullable = true, length = 4)
    private String status;
    @Basic
    @Column(name = "Currency", nullable = true, length = 12)
    private String currency;
    @Basic
    @Column(name = "ConnectTransaction", nullable = true, length = 50)
    private String connectTransaction;
    @Basic
    @Column(name = "BankAccountId", nullable = true, length = 50)
    private String bankAccountId;

    public String getRiderTransactionId() {
        return riderTransactionId;
    }

    public void setRiderTransactionId(String riderTransactionId) {
        this.riderTransactionId = riderTransactionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Date getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(Date transferDate) {
        this.transferDate = transferDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
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

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getAccountTransactionId() {
        return accountTransactionId;
    }

    public void setAccountTransactionId(String accountTransactionId) {
        this.accountTransactionId = accountTransactionId;
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public double getPromoBalance() {
        return promoBalance;
    }

    public void setPromoBalance(double promoBalance) {
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

    public String getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(String bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ridertransaction that = (Ridertransaction) o;

        if (Double.compare(that.amount, amount) != 0) return false;
        if (Double.compare(that.discount, discount) != 0) return false;
        if (Double.compare(that.balance, balance) != 0) return false;
        if (Double.compare(that.promoBalance, promoBalance) != 0) return false;
        if (riderTransactionId != null ? !riderTransactionId.equals(that.riderTransactionId) : that.riderTransactionId != null)
            return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (agentId != null ? !agentId.equals(that.agentId) : that.agentId != null) return false;
        if (transactionDate != null ? !transactionDate.equals(that.transactionDate) : that.transactionDate != null)
            return false;
        if (transferDate != null ? !transferDate.equals(that.transferDate) : that.transferDate != null) return false;
        if (reason != null ? !reason.equals(that.reason) : that.reason != null) return false;
        if (payer != null ? !payer.equals(that.payer) : that.payer != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (paymentType != null ? !paymentType.equals(that.paymentType) : that.paymentType != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (tripId != null ? !tripId.equals(that.tripId) : that.tripId != null) return false;
        if (accountTransactionId != null ? !accountTransactionId.equals(that.accountTransactionId) : that.accountTransactionId != null)
            return false;
        if (riderId != null ? !riderId.equals(that.riderId) : that.riderId != null) return false;
        if (reasonCode != null ? !reasonCode.equals(that.reasonCode) : that.reasonCode != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;
        if (connectTransaction != null ? !connectTransaction.equals(that.connectTransaction) : that.connectTransaction != null)
            return false;
        if (bankAccountId != null ? !bankAccountId.equals(that.bankAccountId) : that.bankAccountId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = riderTransactionId != null ? riderTransactionId.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (agentId != null ? agentId.hashCode() : 0);
        result = 31 * result + (transactionDate != null ? transactionDate.hashCode() : 0);
        result = 31 * result + (transferDate != null ? transferDate.hashCode() : 0);
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(discount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (reason != null ? reason.hashCode() : 0);
        result = 31 * result + (payer != null ? payer.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (paymentType != null ? paymentType.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (tripId != null ? tripId.hashCode() : 0);
        result = 31 * result + (accountTransactionId != null ? accountTransactionId.hashCode() : 0);
        result = 31 * result + (riderId != null ? riderId.hashCode() : 0);
        result = 31 * result + (reasonCode != null ? reasonCode.hashCode() : 0);
        temp = Double.doubleToLongBits(promoBalance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (connectTransaction != null ? connectTransaction.hashCode() : 0);
        result = 31 * result + (bankAccountId != null ? bankAccountId.hashCode() : 0);
        return result;
    }
}
