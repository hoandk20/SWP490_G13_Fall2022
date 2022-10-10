package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Payment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PaymentID", nullable = false)
    private int paymentId;
    @Basic
    @Column(name = "BankID", nullable = true)
    private Integer bankId;
    @Basic
    @Column(name = "UserID", nullable = false, length = 50)
    private String userId;
    @Basic
    @Column(name = "CardNo", nullable = true, length = 16)
    private String cardNo;
    @Basic
    @Column(name = "ExpiredYear", nullable = true, length = 4)
    private String expiredYear;
    @Basic
    @Column(name = "ExpiredMonth", nullable = true, length = 2)
    private String expiredMonth;
    @Basic
    @Column(name = "CVV", nullable = true, length = 4)
    private String cvv;
    @Basic
    @Column(name = "Category", nullable = true, length = 4)
    private String category;
    @Basic
    @Column(name = "Type", nullable = true, length = 2)
    private String type;
    @Basic
    @Column(name = "Status", nullable = true, length = 2)
    private String status;
    @Basic
    @Column(name = "Issuer", nullable = true, length = 4)
    private String issuer;
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
    @Column(name = "ResponseCode", nullable = true, length = 3)
    private String responseCode;
    @Basic
    @Column(name = "Email", nullable = true, length = 50)
    private String email;
    @Basic
    @Column(name = "CardHolderName", nullable = true, length = 50)
    private String cardHolderName;
    @Basic
    @Column(name = "BankCode", nullable = true, length = 30)
    private String bankCode;
    @Basic
    @Column(name = "CardLinkStatus", nullable = true, length = 3)
    private String cardLinkStatus;
    @Basic
    @Column(name = "Token", nullable = true, length = 50)
    private String token;
    @Basic
    @Column(name = "RemoveCardCode", nullable = true, length = 12)
    private String removeCardCode;

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getExpiredYear() {
        return expiredYear;
    }

    public void setExpiredYear(String expiredYear) {
        this.expiredYear = expiredYear;
    }

    public String getExpiredMonth() {
        return expiredMonth;
    }

    public void setExpiredMonth(String expiredMonth) {
        this.expiredMonth = expiredMonth;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
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

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getCardLinkStatus() {
        return cardLinkStatus;
    }

    public void setCardLinkStatus(String cardLinkStatus) {
        this.cardLinkStatus = cardLinkStatus;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRemoveCardCode() {
        return removeCardCode;
    }

    public void setRemoveCardCode(String removeCardCode) {
        this.removeCardCode = removeCardCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payment payment = (Payment) o;

        if (paymentId != payment.paymentId) return false;
        if (bankId != null ? !bankId.equals(payment.bankId) : payment.bankId != null) return false;
        if (userId != null ? !userId.equals(payment.userId) : payment.userId != null) return false;
        if (cardNo != null ? !cardNo.equals(payment.cardNo) : payment.cardNo != null) return false;
        if (expiredYear != null ? !expiredYear.equals(payment.expiredYear) : payment.expiredYear != null) return false;
        if (expiredMonth != null ? !expiredMonth.equals(payment.expiredMonth) : payment.expiredMonth != null)
            return false;
        if (cvv != null ? !cvv.equals(payment.cvv) : payment.cvv != null) return false;
        if (category != null ? !category.equals(payment.category) : payment.category != null) return false;
        if (type != null ? !type.equals(payment.type) : payment.type != null) return false;
        if (status != null ? !status.equals(payment.status) : payment.status != null) return false;
        if (issuer != null ? !issuer.equals(payment.issuer) : payment.issuer != null) return false;
        if (createdBy != null ? !createdBy.equals(payment.createdBy) : payment.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(payment.createdDate) : payment.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(payment.lastModifiedBy) : payment.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(payment.lastModifiedDate) : payment.lastModifiedDate != null)
            return false;
        if (responseCode != null ? !responseCode.equals(payment.responseCode) : payment.responseCode != null)
            return false;
        if (email != null ? !email.equals(payment.email) : payment.email != null) return false;
        if (cardHolderName != null ? !cardHolderName.equals(payment.cardHolderName) : payment.cardHolderName != null)
            return false;
        if (bankCode != null ? !bankCode.equals(payment.bankCode) : payment.bankCode != null) return false;
        if (cardLinkStatus != null ? !cardLinkStatus.equals(payment.cardLinkStatus) : payment.cardLinkStatus != null)
            return false;
        if (token != null ? !token.equals(payment.token) : payment.token != null) return false;
        if (removeCardCode != null ? !removeCardCode.equals(payment.removeCardCode) : payment.removeCardCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = paymentId;
        result = 31 * result + (bankId != null ? bankId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (cardNo != null ? cardNo.hashCode() : 0);
        result = 31 * result + (expiredYear != null ? expiredYear.hashCode() : 0);
        result = 31 * result + (expiredMonth != null ? expiredMonth.hashCode() : 0);
        result = 31 * result + (cvv != null ? cvv.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (issuer != null ? issuer.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (responseCode != null ? responseCode.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (cardHolderName != null ? cardHolderName.hashCode() : 0);
        result = 31 * result + (bankCode != null ? bankCode.hashCode() : 0);
        result = 31 * result + (cardLinkStatus != null ? cardLinkStatus.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + (removeCardCode != null ? removeCardCode.hashCode() : 0);
        return result;
    }
}
