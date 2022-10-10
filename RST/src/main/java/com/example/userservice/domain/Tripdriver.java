package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Tripdriver {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TripDriverId", nullable = false, length = 50)
    private String tripDriverId;
    @Basic
    @Column(name = "TripID", nullable = false, length = 50)
    private String tripId;
    @Basic
    @Column(name = "DriverID", nullable = false, length = 50)
    private String driverId;
    @Basic
    @Column(name = "Status", nullable = false, length = 5)
    private String status;
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
    private long lastModifiedDate;
    @Basic
    @Column(name = "Lat", nullable = false, precision = 0)
    private double lat;
    @Basic
    @Column(name = "Lng", nullable = false, precision = 0)
    private double lng;

    public String getTripDriverId() {
        return tripDriverId;
    }

    public void setTripDriverId(String tripDriverId) {
        this.tripDriverId = tripDriverId;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public long getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(long lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
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

        Tripdriver that = (Tripdriver) o;

        if (lastModifiedDate != that.lastModifiedDate) return false;
        if (Double.compare(that.lat, lat) != 0) return false;
        if (Double.compare(that.lng, lng) != 0) return false;
        if (tripDriverId != null ? !tripDriverId.equals(that.tripDriverId) : that.tripDriverId != null) return false;
        if (tripId != null ? !tripId.equals(that.tripId) : that.tripId != null) return false;
        if (driverId != null ? !driverId.equals(that.driverId) : that.driverId != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = tripDriverId != null ? tripDriverId.hashCode() : 0;
        result = 31 * result + (tripId != null ? tripId.hashCode() : 0);
        result = 31 * result + (driverId != null ? driverId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (int) (lastModifiedDate ^ (lastModifiedDate >>> 32));
        temp = Double.doubleToLongBits(lat);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(lng);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
