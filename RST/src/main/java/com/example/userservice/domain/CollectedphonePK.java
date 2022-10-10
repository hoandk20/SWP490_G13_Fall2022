package com.example.userservice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class CollectedphonePK implements Serializable {
    @Column(name = "CountryCode", nullable = false, length = 4)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String countryCode;
    @Column(name = "Phone", nullable = false, length = 15)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
        if (o == null || getClass() != o.getClass()) return false;

        CollectedphonePK that = (CollectedphonePK) o;

        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = countryCode != null ? countryCode.hashCode() : 0;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
