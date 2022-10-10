package com.example.userservice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class CitynamePK implements Serializable {
    @Column(name = "CityID", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cityId;
    @Column(name = "LanguageCode", nullable = false, length = 4)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String languageCode;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CitynamePK that = (CitynamePK) o;

        if (cityId != that.cityId) return false;
        if (languageCode != null ? !languageCode.equals(that.languageCode) : that.languageCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cityId;
        result = 31 * result + (languageCode != null ? languageCode.hashCode() : 0);
        return result;
    }
}
