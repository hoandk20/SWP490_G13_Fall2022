package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "promotioncode")
public class Promotioncode {
    @EmbeddedId
    private PromotioncodeId id;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "ProgramCode", referencedColumnName = "ProgramCode", nullable = false),
            @JoinColumn(name = "CompanyCode", referencedColumnName = "CompanyCode", nullable = false)
    })
    private Promotionprogram promotionprogram;

    @Column(name = "Value", nullable = false)
    private Float value;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "Note", length = 150)
    private String note;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WeekNumberId")
    private Weeknumber weekNumber;

    @Column(name = "Status", length = 4)
    private String status;

    public PromotioncodeId getId() {
        return id;
    }

    public void setId(PromotioncodeId id) {
        this.id = id;
    }

    public Promotionprogram getPromotionprogram() {
        return promotionprogram;
    }

    public void setPromotionprogram(Promotionprogram promotionprogram) {
        this.promotionprogram = promotionprogram;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Weeknumber getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(Weeknumber weekNumber) {
        this.weekNumber = weekNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}