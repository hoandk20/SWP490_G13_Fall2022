package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "giftcode")
public class Giftcode {
    @EmbeddedId
    private GiftcodeId id;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "ProgramCode", referencedColumnName = "ProgramCode", nullable = false),
            @JoinColumn(name = "CompanyCode", referencedColumnName = "CompanyCode", nullable = false)
    })
    private Promotionprogram promotionprogram;

    @Column(name = "Value", nullable = false)
    private Float value;

    @Column(name = "Title", length = 150)
    private String title;

    @Column(name = "IssuedDate", nullable = false)
    private Instant issuedDate;

    @Column(name = "Status", length = 2)
    private String status;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreadtedDate", nullable = false)
    private Instant creadtedDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "Note", length = 150)
    private String note;

    public GiftcodeId getId() {
        return id;
    }

    public void setId(GiftcodeId id) {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Instant getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Instant issuedDate) {
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

    public Instant getCreadtedDate() {
        return creadtedDate;
    }

    public void setCreadtedDate(Instant creadtedDate) {
        this.creadtedDate = creadtedDate;
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

}