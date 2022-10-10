package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Document {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DocumentID", nullable = false)
    private int documentId;
    @Basic
    @Column(name = "FileName", nullable = false, length = 255)
    private String fileName;
    @Basic
    @Column(name = "Link", nullable = false, length = 255)
    private String link;
    @Basic
    @Column(name = "ExpiredMonth", nullable = false, length = 2)
    private String expiredMonth;
    @Basic
    @Column(name = "ExpiredYear", nullable = false, length = 4)
    private String expiredYear;
    @Basic
    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;
    @Basic
    @Column(name = "Status", nullable = false, length = 20)
    private String status;
    @Basic
    @Column(name = "EffectiveDate", nullable = true)
    private Timestamp effectiveDate;
    @Basic
    @Column(name = "ExpiredDate", nullable = true)
    private Timestamp expiredDate;
    @Basic
    @Column(name = "CreatedDate", nullable = false)
    private Timestamp createdDate;
    @Basic
    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;
    @Basic
    @Column(name = "LastModifiedDate", nullable = false)
    private Timestamp lastModifiedDate;

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getExpiredMonth() {
        return expiredMonth;
    }

    public void setExpiredMonth(String expiredMonth) {
        this.expiredMonth = expiredMonth;
    }

    public String getExpiredYear() {
        return expiredYear;
    }

    public void setExpiredYear(String expiredYear) {
        this.expiredYear = expiredYear;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Timestamp effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Timestamp getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Timestamp expiredDate) {
        this.expiredDate = expiredDate;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Document document = (Document) o;

        if (documentId != document.documentId) return false;
        if (fileName != null ? !fileName.equals(document.fileName) : document.fileName != null) return false;
        if (link != null ? !link.equals(document.link) : document.link != null) return false;
        if (expiredMonth != null ? !expiredMonth.equals(document.expiredMonth) : document.expiredMonth != null)
            return false;
        if (expiredYear != null ? !expiredYear.equals(document.expiredYear) : document.expiredYear != null)
            return false;
        if (createdBy != null ? !createdBy.equals(document.createdBy) : document.createdBy != null) return false;
        if (status != null ? !status.equals(document.status) : document.status != null) return false;
        if (effectiveDate != null ? !effectiveDate.equals(document.effectiveDate) : document.effectiveDate != null)
            return false;
        if (expiredDate != null ? !expiredDate.equals(document.expiredDate) : document.expiredDate != null)
            return false;
        if (createdDate != null ? !createdDate.equals(document.createdDate) : document.createdDate != null)
            return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(document.lastModifiedBy) : document.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(document.lastModifiedDate) : document.lastModifiedDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = documentId;
        result = 31 * result + (fileName != null ? fileName.hashCode() : 0);
        result = 31 * result + (link != null ? link.hashCode() : 0);
        result = 31 * result + (expiredMonth != null ? expiredMonth.hashCode() : 0);
        result = 31 * result + (expiredYear != null ? expiredYear.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (effectiveDate != null ? effectiveDate.hashCode() : 0);
        result = 31 * result + (expiredDate != null ? expiredDate.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        return result;
    }
}
