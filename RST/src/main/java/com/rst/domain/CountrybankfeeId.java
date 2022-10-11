package com.rst.domain;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Embeddable
public class CountrybankfeeId implements Serializable {
    private static final long serialVersionUID = 2487119680740450919L;
    @Column(name = "BankFeeID", nullable = false)
    private Integer bankFeeID;

    @Column(name = "CountryCode", nullable = false, length = 4)
    private String countryCode;

    @Column(name = "StartDate", nullable = false)
    private Instant startDate;

    public Integer getBankFeeID() {
        return bankFeeID;
    }

    public void setBankFeeID(Integer bankFeeID) {
        this.bankFeeID = bankFeeID;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Instant getStartDate() {
        return startDate;
    }

    public void setStartDate(Instant startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CountrybankfeeId entity = (CountrybankfeeId) o;
        return Objects.equals(this.countryCode, entity.countryCode) &&
                Objects.equals(this.bankFeeID, entity.bankFeeID) &&
                Objects.equals(this.startDate, entity.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryCode, bankFeeID, startDate);
    }

}