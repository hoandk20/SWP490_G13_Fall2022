package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "transactionnote")
public class Transactionnote {
    @Id
    @Column(name = "TransactionNoteId", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PaymentNumber")
    private Partnerpayment paymentNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UserId")
    private Taxinetuser user;

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

    public Partnerpayment getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(Partnerpayment paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    public Taxinetuser getUser() {
        return user;
    }

    public void setUser(Taxinetuser user) {
        this.user = user;
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