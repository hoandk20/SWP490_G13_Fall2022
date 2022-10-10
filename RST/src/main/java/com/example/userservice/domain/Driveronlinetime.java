package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@IdClass(DriveronlinetimePK.class)
public class Driveronlinetime {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DriverID", nullable = false, length = 50)
    private String driverId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "date", nullable = false)
    private Date date;
    @Basic
    @Column(name = "OnlineTime", nullable = false)
    private int onlineTime;
    @Basic
    @Column(name = "LastOnlineTime", nullable = true)
    private Timestamp lastOnlineTime;
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
    @Column(name = "lastModifiedDate", nullable = false)
    private Timestamp lastModifiedDate;
    @Basic
    @Column(name = "LastOnlineRecord", nullable = false)
    private boolean lastOnlineRecord;

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(int onlineTime) {
        this.onlineTime = onlineTime;
    }

    public Timestamp getLastOnlineTime() {
        return lastOnlineTime;
    }

    public void setLastOnlineTime(Timestamp lastOnlineTime) {
        this.lastOnlineTime = lastOnlineTime;
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

    public boolean isLastOnlineRecord() {
        return lastOnlineRecord;
    }

    public void setLastOnlineRecord(boolean lastOnlineRecord) {
        this.lastOnlineRecord = lastOnlineRecord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driveronlinetime that = (Driveronlinetime) o;

        if (onlineTime != that.onlineTime) return false;
        if (lastOnlineRecord != that.lastOnlineRecord) return false;
        if (driverId != null ? !driverId.equals(that.driverId) : that.driverId != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (lastOnlineTime != null ? !lastOnlineTime.equals(that.lastOnlineTime) : that.lastOnlineTime != null)
            return false;
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
        int result = driverId != null ? driverId.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + onlineTime;
        result = 31 * result + (lastOnlineTime != null ? lastOnlineTime.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (lastOnlineRecord ? 1 : 0);
        return result;
    }
}
