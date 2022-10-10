package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Banktransaction {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "OrderCode", nullable = false, length = 50)
    private String orderCode;
    @Basic
    @Column(name = "UserId", nullable = true, length = 50)
    private String userId;
    @Basic
    @Column(name = "TransactionId", nullable = true, length = 50)
    private String transactionId;
    @Basic
    @Column(name = "RiderTransactionId", nullable = true, length = 50)
    private String riderTransactionId;
    @Basic
    @Column(name = "PaymentId", nullable = true)
    private Integer paymentId;
    @Basic
    @Column(name = "TokenCode", nullable = true, length = 50)
    private String tokenCode;
    @Basic
    @Column(name = "ResponseCode", nullable = true, length = 3)
    private String responseCode;
    @Basic
    @Column(name = "ResponseTransStatus", nullable = true, length = 2)
    private String responseTransStatus;
    @Basic
    @Column(name = "Amount", nullable = false, precision = 0)
    private double amount;
    @Basic
    @Column(name = "BankFee", nullable = false, precision = 0)
    private double bankFee;
    @Basic
    @Column(name = "HoldAmount", nullable = true, precision = 0)
    private Double holdAmount;
    @Basic
    @Column(name = "TransactionStatus", nullable = true, length = 4)
    private String transactionStatus;
    @Basic
    @Column(name = "TransactionNLId", nullable = true, length = 45)
    private String transactionNlId;
    @Basic
    @Column(name = "Currency", nullable = true, length = 12)
    private String currency;
    @Basic
    @Column(name = "Type", nullable = true, length = 4)
    private String type;
    @Basic
    @Column(name = "Category", nullable = true, length = 4)
    private String category;
    @Basic
    @Column(name = "Note", nullable = true, length = 255)
    private String note;
    @Basic
    @Column(name = "ReasonCode", nullable = true, length = 45)
    private String reasonCode;
    @Basic
    @Column(name = "BuyerMobile", nullable = true, length = 12)
    private String buyerMobile;
    @Basic
    @Column(name = "BuyerEmail", nullable = true, length = 50)
    private String buyerEmail;
    @Basic
    @Column(name = "CreatedBy", nullable = true, length = 50)
    private String createdBy;
    @Basic
    @Column(name = "CreatedDate", nullable = true)
    private Timestamp createdDate;
    @Basic
    @Column(name = "LastModifiedBy", nullable = true, length = 50)
    private String lastModifiedBy;
    @Basic
    @Column(name = "LastModifiedDate", nullable = true)
    private Timestamp lastModifiedDate;
    @Basic
    @Column(name = "bankAccountId", nullable = true, length = 50)
    private String bankAccountId;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBankFee() {
        return bankFee;
    }

    public void setBankFee(double bankFee) {
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

    public String getTransactionNlId() {
        return transactionNlId;
    }

    public void setTransactionNlId(String transactionNlId) {
        this.transactionNlId = transactionNlId;
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

        Banktransaction that = (Banktransaction) o;

        if (Double.compare(that.amount, amount) != 0) return false;
        if (Double.compare(that.bankFee, bankFee) != 0) return false;
        if (orderCode != null ? !orderCode.equals(that.orderCode) : that.orderCode != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (transactionId != null ? !transactionId.equals(that.transactionId) : that.transactionId != null)
            return false;
        if (riderTransactionId != null ? !riderTransactionId.equals(that.riderTransactionId) : that.riderTransactionId != null)
            return false;
        if (paymentId != null ? !paymentId.equals(that.paymentId) : that.paymentId != null) return false;
        if (tokenCode != null ? !tokenCode.equals(that.tokenCode) : that.tokenCode != null) return false;
        if (responseCode != null ? !responseCode.equals(that.responseCode) : that.responseCode != null) return false;
        if (responseTransStatus != null ? !responseTransStatus.equals(that.responseTransStatus) : that.responseTransStatus != null)
            return false;
        if (holdAmount != null ? !holdAmount.equals(that.holdAmount) : that.holdAmount != null) return false;
        if (transactionStatus != null ? !transactionStatus.equals(that.transactionStatus) : that.transactionStatus != null)
            return false;
        if (transactionNlId != null ? !transactionNlId.equals(that.transactionNlId) : that.transactionNlId != null)
            return false;
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (reasonCode != null ? !reasonCode.equals(that.reasonCode) : that.reasonCode != null) return false;
        if (buyerMobile != null ? !buyerMobile.equals(that.buyerMobile) : that.buyerMobile != null) return false;
        if (buyerEmail != null ? !buyerEmail.equals(that.buyerEmail) : that.buyerEmail != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (bankAccountId != null ? !bankAccountId.equals(that.bankAccountId) : that.bankAccountId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = orderCode != null ? orderCode.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (transactionId != null ? transactionId.hashCode() : 0);
        result = 31 * result + (riderTransactionId != null ? riderTransactionId.hashCode() : 0);
        result = 31 * result + (paymentId != null ? paymentId.hashCode() : 0);
        result = 31 * result + (tokenCode != null ? tokenCode.hashCode() : 0);
        result = 31 * result + (responseCode != null ? responseCode.hashCode() : 0);
        result = 31 * result + (responseTransStatus != null ? responseTransStatus.hashCode() : 0);
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(bankFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (holdAmount != null ? holdAmount.hashCode() : 0);
        result = 31 * result + (transactionStatus != null ? transactionStatus.hashCode() : 0);
        result = 31 * result + (transactionNlId != null ? transactionNlId.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (reasonCode != null ? reasonCode.hashCode() : 0);
        result = 31 * result + (buyerMobile != null ? buyerMobile.hashCode() : 0);
        result = 31 * result + (buyerEmail != null ? buyerEmail.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (bankAccountId != null ? bankAccountId.hashCode() : 0);
        return result;
    }
}
