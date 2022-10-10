package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Transactionnote {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TransactionNoteId", nullable = false)
    private int transactionNoteId;
    @Basic
    @Column(name = "PaymentNumber", nullable = true, length = 50)
    private String paymentNumber;
    @Basic
    @Column(name = "UserId", nullable = true, length = 50)
    private String userId;
    @Basic
    @Column(name = "Note", nullable = true, length = 500)
    private String note;
    @Basic
    @Column(name = "Action", nullable = true, length = 4)
    private String action;
    @Basic
    @Column(name = "CreatedDate", nullable = false)
    private Timestamp createdDate;

    public int getTransactionNoteId() {
        return transactionNoteId;
    }

    public void setTransactionNoteId(int transactionNoteId) {
        this.transactionNoteId = transactionNoteId;
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

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transactionnote that = (Transactionnote) o;

        if (transactionNoteId != that.transactionNoteId) return false;
        if (paymentNumber != null ? !paymentNumber.equals(that.paymentNumber) : that.paymentNumber != null)
            return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (action != null ? !action.equals(that.action) : that.action != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = transactionNoteId;
        result = 31 * result + (paymentNumber != null ? paymentNumber.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (action != null ? action.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        return result;
    }
}
