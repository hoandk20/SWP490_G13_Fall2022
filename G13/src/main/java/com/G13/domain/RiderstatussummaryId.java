package com.G13.domain;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RiderstatussummaryId implements Serializable {
    private static final long serialVersionUID = 307120695123834286L;
    @Column(name = "FinancialYear", nullable = false)
    private Integer financialYear;

    @Column(name = "Month", nullable = false)
    private Integer month;

    @Column(name = "CityID", nullable = false)
    private Integer cityID;

    @Column(name = "CountryCode", nullable = false, length = 4)
    private String countryCode;

    public Integer getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(Integer financialYear) {
        this.financialYear = financialYear;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
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
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RiderstatussummaryId entity = (RiderstatussummaryId) o;
        return Objects.equals(this.financialYear, entity.financialYear) &&
                Objects.equals(this.month, entity.month) &&
                Objects.equals(this.countryCode, entity.countryCode) &&
                Objects.equals(this.cityID, entity.cityID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(financialYear, month, countryCode, cityID);
    }

}