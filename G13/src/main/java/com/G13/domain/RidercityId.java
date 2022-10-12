package com.G13.domain;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RidercityId implements Serializable {
    private static final long serialVersionUID = -1320025375953661104L;
    @Column(name = "CityID", nullable = false)
    private Integer cityID;

    @Column(name = "RiderID", nullable = false, length = 50)
    private String riderID;

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    public String getRiderID() {
        return riderID;
    }

    public void setRiderID(String riderID) {
        this.riderID = riderID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RidercityId entity = (RidercityId) o;
        return Objects.equals(this.riderID, entity.riderID) &&
                Objects.equals(this.cityID, entity.cityID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riderID, cityID);
    }

}