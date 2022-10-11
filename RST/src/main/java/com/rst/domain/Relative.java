package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "relative")
public class Relative {
    @Id
    @Column(name = "Avatar", nullable = false, length = 300)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RiderID", nullable = false)
    private Rider riderID;

    @Column(name = "FNameRelative", length = 50)
    private String fNameRelative;

    @Column(name = "LNameRelative", length = 50)
    private String lNameRelative;

    @Column(name = "MobileRelative", length = 20)
    private String mobileRelative;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CountryCode")
    private Country countryCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Rider getRiderID() {
        return riderID;
    }

    public void setRiderID(Rider riderID) {
        this.riderID = riderID;
    }

    public String getFNameRelative() {
        return fNameRelative;
    }

    public void setFNameRelative(String fNameRelative) {
        this.fNameRelative = fNameRelative;
    }

    public String getLNameRelative() {
        return lNameRelative;
    }

    public void setLNameRelative(String lNameRelative) {
        this.lNameRelative = lNameRelative;
    }

    public String getMobileRelative() {
        return mobileRelative;
    }

    public void setMobileRelative(String mobileRelative) {
        this.mobileRelative = mobileRelative;
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

    public Country getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Country countryCode) {
        this.countryCode = countryCode;
    }

}