package com.G13.domain;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CitynameId implements Serializable {
    private static final long serialVersionUID = -2419310025774156151L;
    @Column(name = "CityID", nullable = false)
    private Integer cityID;

    @Column(name = "LanguageCode", nullable = false, length = 4)
    private String languageCode;

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
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
        CitynameId entity = (CitynameId) o;
        return Objects.equals(this.cityID, entity.cityID) &&
                Objects.equals(this.languageCode, entity.languageCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityID, languageCode);
    }

}