package com.G13.domain;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DistrictnameId implements Serializable {
    private static final long serialVersionUID = 8189584605543124323L;
    @Column(name = "DistrictID", nullable = false)
    private Integer districtID;

    @Column(name = "LanguageCode", nullable = false, length = 4)
    private String languageCode;

    public Integer getDistrictID() {
        return districtID;
    }

    public void setDistrictID(Integer districtID) {
        this.districtID = districtID;
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
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DistrictnameId entity = (DistrictnameId) o;
        return Objects.equals(this.districtID, entity.districtID) &&
                Objects.equals(this.languageCode, entity.languageCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(districtID, languageCode);
    }

}