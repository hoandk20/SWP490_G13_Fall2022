package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Suppostnote {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "NoteId", nullable = false)
    private int noteId;
    @Basic
    @Column(name = "MobileNo", nullable = false, length = 12)
    private String mobileNo;
    @Basic
    @Column(name = "CountryCode", nullable = false, length = 4)
    private String countryCode;
    @Basic
    @Column(name = "UserId", nullable = false, length = 50)
    private String userId;
    @Basic
    @Column(name = "Note", nullable = false, length = 300)
    private String note;
    @Basic
    @Column(name = "CreatedDate", nullable = false)
    private Timestamp createdDate;

    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
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

        Suppostnote that = (Suppostnote) o;

        if (noteId != that.noteId) return false;
        if (mobileNo != null ? !mobileNo.equals(that.mobileNo) : that.mobileNo != null) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = noteId;
        result = 31 * result + (mobileNo != null ? mobileNo.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        return result;
    }
}
