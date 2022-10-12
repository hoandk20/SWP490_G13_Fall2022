package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "transactionnote")
public class Transactionnote {
    @Id
    @Column(name = "TransactionNoteId", nullable = false)
    private Integer id;

    @Column(name = "PaymentNumber", length = 50)
    private String paymentNumber;

    @Column(name = "UserId", length = 50)
    private String userId;

    @Column(name = "Note", length = 500)
    private String note;

    @Column(name = "Action", length = 4)
    private String action;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(String paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

}