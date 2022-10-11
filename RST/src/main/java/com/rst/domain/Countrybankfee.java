package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "countrybankfee")
public class Countrybankfee {
    @EmbeddedId
    private CountrybankfeeId id;

    @MapsId("bankFeeID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BankFeeID", nullable = false)
    private Bankfee bankFeeID;

    @MapsId("countryCode")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country countryCode;

    @Column(name = "FeeValue", nullable = false)
    private Float feeValue;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    public CountrybankfeeId getId() {
        return id;
    }

    public void setId(CountrybankfeeId id) {
        this.id = id;
    }

    public Bankfee getBankFeeID() {
        return bankFeeID;
    }

    public void setBankFeeID(Bankfee bankFeeID) {
        this.bankFeeID = bankFeeID;
    }

    public Country getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Country countryCode) {
        this.countryCode = countryCode;
    }

    public Float getFeeValue() {
        return feeValue;
    }

    public void setFeeValue(Float feeValue) {
        this.feeValue = feeValue;
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