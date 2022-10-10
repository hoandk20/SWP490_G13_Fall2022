package com.example.userservice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class DriverstatussummaryPK implements Serializable {
    @Column(name = "FinancialYear", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int financialYear;
    @Column(name = "Month", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int month;
    @Column(name = "CityID", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cityId;
    @Column(name = "CountryCode", nullable = false, length = 4)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String countryCode;

    public int getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(int financialYear) {
        this.financialYear = financialYear;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DriverstatussummaryPK that = (DriverstatussummaryPK) o;

        if (financialYear != that.financialYear) return false;
        if (month != that.month) return false;
        if (cityId != that.cityId) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = financialYear;
        result = 31 * result + month;
        result = 31 * result + cityId;
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        return result;
    }
}
