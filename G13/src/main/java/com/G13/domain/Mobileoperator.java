package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "mobileoperator")
public class Mobileoperator {
    @Id
    @Column(name = "OperatorID", nullable = false)
    private Integer id;

    @Column(name = "CountryCode", nullable = false, length = 4)
    private String countryCode;

    @Column(name = "HeaderCode", nullable = false, length = 6)
    private String headerCode;

    @Column(name = "OperatorCode", nullable = false, length = 4)
    private String operatorCode;

    @Column(name = "Name", nullable = false, length = 50)
    private String name;

    @Column(name = "InternalPrice")
    private Float internalPrice;

    @Column(name = "ExternalPrice")
    private Float externalPrice;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "Length")
    private Integer length;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getHeaderCode() {
        return headerCode;
    }

    public void setHeaderCode(String headerCode) {
        this.headerCode = headerCode;
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getInternalPrice() {
        return internalPrice;
    }

    public void setInternalPrice(Float internalPrice) {
        this.internalPrice = internalPrice;
    }

    public Float getExternalPrice() {
        return externalPrice;
    }

    public void setExternalPrice(Float externalPrice) {
        this.externalPrice = externalPrice;
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

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

}