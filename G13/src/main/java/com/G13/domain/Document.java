package com.G13.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "document")
public class Document {
    @Id
    @Column(name = "documentid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "filename", nullable = false)
    private String fileName;

    @Column(name = "link", nullable = false)
    private String link;

    @Column(name = "expiredmonth", nullable = false, length = 2)
    private String expiredMonth;

    @Column(name = "expiredyear", nullable = false, length = 4)
    private String expiredYear;

    @Column(name = "createdby", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "status", nullable = false, length = 20)
    private String status;

    @Column(name = "effectivedate")
    private Instant effectiveDate;

    public Document() {
        Instant timeStamp= Instant.now();
        this.id = 1;
        this.fileName = "";
        this.link = "";
        this.expiredMonth = "";
        this.expiredYear = "";
        this.createdBy = "";
        this.status = "";
        this.expiredDate = timeStamp;
        this.createdDate = timeStamp;
        this.lastModifiedBy = "";
        this.lastModifiedDate = timeStamp;
    }

    @Column(name = "expireddate")
    private Instant expiredDate;

    @Column(name = "createddate", nullable = false)
    private Instant createdDate;

    @Column(name = "lastmodifiedby", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "lastmodifieddate", nullable = false)
    private Instant lastModifiedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Instant getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Instant effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Instant getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Instant expiredDate) {
        this.expiredDate = expiredDate;
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

}