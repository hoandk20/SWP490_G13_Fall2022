package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Riderlogintimetracking {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RiderLoginTimeTrackingID", nullable = false, length = 50)
    private String riderLoginTimeTrackingId;
    @Basic
    @Column(name = "RiderID", nullable = false, length = 50)
    private String riderId;
    @Basic
    @Column(name = "LoginTime", nullable = true)
    private Timestamp loginTime;
    @Basic
    @Column(name = "Lat", nullable = false, precision = 0)
    private double lat;
    @Basic
    @Column(name = "Lng", nullable = false, precision = 0)
    private double lng;

    public String getRiderLoginTimeTrackingId() {
        return riderLoginTimeTrackingId;
    }

    public void setRiderLoginTimeTrackingId(String riderLoginTimeTrackingId) {
        this.riderLoginTimeTrackingId = riderLoginTimeTrackingId;
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public Timestamp getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Riderlogintimetracking that = (Riderlogintimetracking) o;

        if (Double.compare(that.lat, lat) != 0) return false;
        if (Double.compare(that.lng, lng) != 0) return false;
        if (riderLoginTimeTrackingId != null ? !riderLoginTimeTrackingId.equals(that.riderLoginTimeTrackingId) : that.riderLoginTimeTrackingId != null)
            return false;
        if (riderId != null ? !riderId.equals(that.riderId) : that.riderId != null) return false;
        if (loginTime != null ? !loginTime.equals(that.loginTime) : that.loginTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = riderLoginTimeTrackingId != null ? riderLoginTimeTrackingId.hashCode() : 0;
        result = 31 * result + (riderId != null ? riderId.hashCode() : 0);
        result = 31 * result + (loginTime != null ? loginTime.hashCode() : 0);
        temp = Double.doubleToLongBits(lat);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(lng);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
