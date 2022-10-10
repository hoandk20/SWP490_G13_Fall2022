package com.example.userservice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

public class DriveronlinetimePK implements Serializable {
    @Column(name = "DriverID", nullable = false, length = 50)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String driverId;
    @Column(name = "date", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Date date;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DriveronlinetimePK that = (DriveronlinetimePK) o;

        if (driverId != null ? !driverId.equals(that.driverId) : that.driverId != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = driverId != null ? driverId.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
