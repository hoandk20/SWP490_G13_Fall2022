package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @Column(name = "PaymentID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BankID")
    private Bank bankID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UserID", nullable = false)
    private Taxinetuser userID;

    @Column(name = "CardNo", length = 16)
    private String cardNo;

    @Column(name = "ExpiredYear", length = 4)
    private String expiredYear;

    @Column(name = "ExpiredMonth", length = 2)
    private String expiredMonth;

    @Column(name = "CVV", length = 4)
    private String cvv;

    @Column(name = "Category", length = 4)
    private String category;

    @Column(name = "Type", length = 2)
    private String type;

    @Column(name = "Status", length = 2)
    private String status;

    @Column(name = "Issuer", length = 4)
    private String issuer;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "ResponseCode", length = 3)
    private String responseCode;

    @Column(name = "Email", length = 50)
    private String email;

    @Column(name = "CardHolderName", length = 50)
    private String cardHolderName;

    @Column(name = "BankCode", length = 30)
    private String bankCode;

    @Column(name = "CardLinkStatus", length = 3)
    private String cardLinkStatus;

    @Column(name = "Token", length = 50)
    private String token;

    @Column(name = "RemoveCardCode", length = 12)
    private String removeCardCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Bank getBankID() {
        return bankID;
    }

    public void setBankID(Bank bankID) {
        this.bankID = bankID;
    }

    public Taxinetuser getUserID() {
        return userID;
    }

    public void setUserID(Taxinetuser userID) {
        this.userID = userID;
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

}