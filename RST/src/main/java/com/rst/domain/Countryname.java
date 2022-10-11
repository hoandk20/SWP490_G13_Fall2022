package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "countryname")
public class Countryname {
    @EmbeddedId
    private CountrynameId id;

    @MapsId("code")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Code", nullable = false)
    private Country code;

    @Column(name = "CountryName", nullable = false, length = 30)
    private String countryName;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    public CountrynameId getId() {
        return id;
    }

    public void setId(CountrynameId id) {
        this.id = id;
    }

    public Country getCode() {
        return code;
    }

    public void setCode(Country code) {
        this.code = code;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
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