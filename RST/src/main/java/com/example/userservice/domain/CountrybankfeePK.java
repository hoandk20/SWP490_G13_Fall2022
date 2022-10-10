package com.example.userservice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

public class CountrybankfeePK implements Serializable {
    @Column(name = "BankFeeID", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bankFeeId;
    @Column(name = "CountryCode", nullable = false, length = 4)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String countryCode;
    @Column(name = "StartDate", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Timestamp startDate;

    public int getBankFeeId() {
        return bankFeeId;
    }

    public void setBankFeeId(int bankFeeId) {
        this.bankFeeId = bankFeeId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CountrybankfeePK that = (CountrybankfeePK) o;

        if (bankFeeId != that.bankFeeId) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bankFeeId;
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        return result;
    }
}
