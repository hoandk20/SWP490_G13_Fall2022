package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "promotionmessages")
public class Promotionmessage {
    @Id
    @Column(name = "PromotionMessageId", nullable = false, length = 50)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country countryCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CompanyId")
    private Company company;

    @Lob
    @Column(name = "Description", nullable = false)
    private String description;

    @Column(name = "Title", nullable = false, length = 100)
    private String title;

    @Column(name = "StartDate", nullable = false)
    private LocalDate startDate;

    @Column(name = "EndDate", nullable = false)
    private LocalDate endDate;

    @Column(name = "Status", nullable = false, length = 2)
    private String status;

    @Lob
    @Column(name = "ContentUrl", nullable = false)
    private String contentUrl;

    @Column(name = "Type", nullable = false, length = 4)
    private String type;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "Display", nullable = false)
    private Byte display;

    @Column(name = "HourOfDay", nullable = false)
    private Byte hourOfDay;

    @Column(name = "AutoSend", nullable = false)
    private Byte autoSend;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Country getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Country countryCode) {
        this.countryCode = countryCode;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Byte getDisplay() {
        return display;
    }

    public void setDisplay(Byte display) {
        this.display = display;
    }

    public Byte getHourOfDay() {
        return hourOfDay;
    }

    public void setHourOfDay(Byte hourOfDay) {
        this.hourOfDay = hourOfDay;
    }

    public Byte getAutoSend() {
        return autoSend;
    }

    public void setAutoSend(Byte autoSend) {
        this.autoSend = autoSend;
    }

}