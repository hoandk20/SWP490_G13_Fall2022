package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@IdClass(DriveronlinetimedetailPK.class)
public class Driveronlinetimedetail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DriverID", nullable = false, length = 50)
    private String driverId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "OnlineTime", nullable = false)
    private Timestamp onlineTime;
    @Basic
    @Column(name = "OfflineTime", nullable = true)
    private Timestamp offlineTime;
    @Basic
    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;
    @Basic
    @Column(name = "CreatedDate", nullable = false)
    private Timestamp createdDate;
    @Basic
    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;
    @Basic
    @Column(name = "LastModifiedDate", nullable = false)
    private Timestamp lastModifiedDate;
    @Basic
    @Column(name = "OnlineLat", nullable = false, precision = 0)
    private double onlineLat;
    @Basic
    @Column(name = "OnlineLng", nullable = false, precision = 0)
    private double onlineLng;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "OfflineLat", nullable = false, precision = 0)
    private double offlineLat;
    @Basic
    @Column(name = "OfflineLng", nullable = false, precision = 0)
    private double offlineLng;

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

    public Timestamp getOfflineTime() {
        return offlineTime;
    }

    public void setOfflineTime(Timestamp offlineTime) {
        this.offlineTime = offlineTime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Timestamp getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public double getOnlineLat() {
        return onlineLat;
    }

    public void setOnlineLat(double onlineLat) {
        this.onlineLat = onlineLat;
    }

    public double getOnlineLng() {
        return onlineLng;
    }

    public void setOnlineLng(double onlineLng) {
        this.onlineLng = onlineLng;
    }

    public double getOfflineLat() {
        return offlineLat;
    }

    public void setOfflineLat(double offlineLat) {
        this.offlineLat = offlineLat;
    }

    public double getOfflineLng() {
        return offlineLng;
    }

    public void setOfflineLng(double offlineLng) {
        this.offlineLng = offlineLng;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driveronlinetimedetail that = (Driveronlinetimedetail) o;

        if (Double.compare(that.onlineLat, onlineLat) != 0) return false;
        if (Double.compare(that.onlineLng, onlineLng) != 0) return false;
        if (Double.compare(that.offlineLat, offlineLat) != 0) return false;
        if (Double.compare(that.offlineLng, offlineLng) != 0) return false;
        if (driverId != null ? !driverId.equals(that.driverId) : that.driverId != null) return false;
        if (onlineTime != null ? !onlineTime.equals(that.onlineTime) : that.onlineTime != null) return false;
        if (offlineTime != null ? !offlineTime.equals(that.offlineTime) : that.offlineTime != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = driverId != null ? driverId.hashCode() : 0;
        result = 31 * result + (onlineTime != null ? onlineTime.hashCode() : 0);
        result = 31 * result + (offlineTime != null ? offlineTime.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        temp = Double.doubleToLongBits(onlineLat);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(onlineLng);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(offlineLat);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(offlineLng);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
