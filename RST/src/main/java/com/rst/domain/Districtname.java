package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "districtname")
public class Districtname {
    @EmbeddedId
    private DistrictnameId id;

    @MapsId("districtID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DistrictID", nullable = false)
    private District districtID;

    @MapsId("languageCode")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LanguageCode", nullable = false)
    private Language languageCode;

    @Column(name = "DistrictName", length = 50)
    private String districtName;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    public DistrictnameId getId() {
        return id;
    }

    public void setId(DistrictnameId id) {
        this.id = id;
    }

    public District getDistrictID() {
        return districtID;
    }

    public void setDistrictID(District districtID) {
        this.districtID = districtID;
    }

    public Language getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(Language languageCode) {
        this.languageCode = languageCode;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
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

}