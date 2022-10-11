package com.rst.domain;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CollectedphoneId implements Serializable {
    private static final long serialVersionUID = 3512041669774852879L;
    @Column(name = "CountryCode", nullable = false, length = 4)
    private String countryCode;

    @Column(name = "Phone", nullable = false, length = 15)
    private String phone;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CollectedphoneId entity = (CollectedphoneId) o;
        return Objects.equals(this.phone, entity.phone) &&
                Objects.equals(this.countryCode, entity.countryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone, countryCode);
    }

}