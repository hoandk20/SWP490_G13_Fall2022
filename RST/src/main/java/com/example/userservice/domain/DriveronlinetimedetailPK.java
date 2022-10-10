package com.example.userservice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

public class DriveronlinetimedetailPK implements Serializable {
    @Column(name = "DriverID", nullable = false, length = 50)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String driverId;
    @Column(name = "OnlineTime", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Timestamp onlineTime;
    @Column(name = "OfflineLat", nullable = false, precision = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double offlineLat;

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public Timestamp getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Timestamp onlineTime) {
        this.onlineTime = onlineTime;
    }

    public double getOfflineLat() {
        return offlineLat;
    }

    public void setOfflineLat(double offlineLat) {
        this.offlineLat = offlineLat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DriveronlinetimedetailPK that = (DriveronlinetimedetailPK) o;

        if (Double.compare(that.offlineLat, offlineLat) != 0) return false;
        if (driverId != null ? !driverId.equals(that.driverId) : that.driverId != null) return false;
        if (onlineTime != null ? !onlineTime.equals(that.onlineTime) : that.onlineTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = driverId != null ? driverId.hashCode() : 0;
        result = 31 * result + (onlineTime != null ? onlineTime.hashCode() : 0);
        temp = Double.doubleToLongBits(offlineLat);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
