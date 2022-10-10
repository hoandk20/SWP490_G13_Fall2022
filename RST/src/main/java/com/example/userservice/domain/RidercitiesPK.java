package com.example.userservice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class RidercitiesPK implements Serializable {
    @Column(name = "CityID", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cityId;
    @Column(name = "RiderID", nullable = false, length = 50)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String riderId;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RidercitiesPK that = (RidercitiesPK) o;

        if (cityId != that.cityId) return false;
        if (riderId != null ? !riderId.equals(that.riderId) : that.riderId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cityId;
        result = 31 * result + (riderId != null ? riderId.hashCode() : 0);
        return result;
    }
}
