package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@IdClass(GiftcodePK.class)
public class Giftcode {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Code", nullable = false, length = 20)
    private String code;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ProgramCode", nullable = false, length = 30)
    private String programCode;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CompanyCode", nullable = false, length = 11)
    private String companyCode;
    @Basic
    @Column(name = "Value", nullable = false, precision = 0)
    private double value;
    @Basic
    @Column(name = "Title", nullable = true, length = 150)
    private String title;
    @Basic
    @Column(name = "IssuedDate", nullable = false)
    private Timestamp issuedDate;
    @Basic
    @Column(name = "Status", nullable = true, length = 2)
    private String status;
    @Basic
    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;
    @Basic
    @Column(name = "CreadtedDate", nullable = false)
    private Timestamp creadtedDate;
    @Basic
    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;
    @Basic
    @Column(name = "LastModifiedDate", nullable = false)
    private Timestamp lastModifiedDate;
    @Basic
    @Column(name = "Note", nullable = true, length = 150)
    private String note;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Timestamp issuedDate) {
        this.issuedDate = issuedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreadtedDate() {
        return creadtedDate;
    }

    public void setCreadtedDate(Timestamp creadtedDate) {
        this.creadtedDate = creadtedDate;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Giftcode giftcode = (Giftcode) o;

        if (Double.compare(giftcode.value, value) != 0) return false;
        if (code != null ? !code.equals(giftcode.code) : giftcode.code != null) return false;
        if (programCode != null ? !programCode.equals(giftcode.programCode) : giftcode.programCode != null)
            return false;
        if (companyCode != null ? !companyCode.equals(giftcode.companyCode) : giftcode.companyCode != null)
            return false;
        if (title != null ? !title.equals(giftcode.title) : giftcode.title != null) return false;
        if (issuedDate != null ? !issuedDate.equals(giftcode.issuedDate) : giftcode.issuedDate != null) return false;
        if (status != null ? !status.equals(giftcode.status) : giftcode.status != null) return false;
        if (createdBy != null ? !createdBy.equals(giftcode.createdBy) : giftcode.createdBy != null) return false;
        if (creadtedDate != null ? !creadtedDate.equals(giftcode.creadtedDate) : giftcode.creadtedDate != null)
            return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(giftcode.lastModifiedBy) : giftcode.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(giftcode.lastModifiedDate) : giftcode.lastModifiedDate != null)
            return false;
        if (note != null ? !note.equals(giftcode.note) : giftcode.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = code != null ? code.hashCode() : 0;
        result = 31 * result + (programCode != null ? programCode.hashCode() : 0);
        result = 31 * result + (companyCode != null ? companyCode.hashCode() : 0);
        temp = Double.doubleToLongBits(value);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (issuedDate != null ? issuedDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (creadtedDate != null ? creadtedDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
