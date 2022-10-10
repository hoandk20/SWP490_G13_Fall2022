package com.example.userservice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class DistrictnamePK implements Serializable {
    @Column(name = "DistrictID", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int districtId;
    @Column(name = "LanguageCode", nullable = false, length = 4)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String languageCode;

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
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

        DistrictnamePK that = (DistrictnamePK) o;

        if (districtId != that.districtId) return false;
        if (languageCode != null ? !languageCode.equals(that.languageCode) : that.languageCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = districtId;
        result = 31 * result + (languageCode != null ? languageCode.hashCode() : 0);
        return result;
    }
}
