package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "programdescription")
public class Programdescription {
    @EmbeddedId
    private ProgramdescriptionId id;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "ProgramCode", referencedColumnName = "ProgramCode", nullable = false),
            @JoinColumn(name = "CompanyCode", referencedColumnName = "CompanyCode", nullable = false)
    })
    private Promotionprogram promotionprogram;

    @MapsId("language")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Language", nullable = false)
    private Language language;

    @Column(name = "Description", length = 500)
    private String description;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "Title", length = 200)
    private String title;

    @Lob
    @Column(name = "DescUrl")
    private String descUrl;

    @Lob
    @Column(name = "ImgUrl")
    private String imgUrl;

    public ProgramdescriptionId getId() {
        return id;
    }

    public void setId(ProgramdescriptionId id) {
        this.id = id;
    }

    public Promotionprogram getPromotionprogram() {
        return promotionprogram;
    }

    public void setPromotionprogram(Promotionprogram promotionprogram) {
        this.promotionprogram = promotionprogram;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescUrl() {
        return descUrl;
    }

    public void setDescUrl(String descUrl) {
        this.descUrl = descUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

}