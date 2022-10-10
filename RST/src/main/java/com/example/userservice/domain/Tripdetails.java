package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Tripdetails {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TripID", nullable = false, length = 50)
    private String tripId;
    @Basic
    @Column(name = "LatLng", nullable = false, length = -1)
    private String latLng;
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
    @Column(name = "OriginalLatLng", nullable = false, length = -1)
    private String originalLatLng;

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getLatLng() {
        return latLng;
    }

    public void setLatLng(String latLng) {
        this.latLng = latLng;
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

    public String getOriginalLatLng() {
        return originalLatLng;
    }

    public void setOriginalLatLng(String originalLatLng) {
        this.originalLatLng = originalLatLng;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tripdetails that = (Tripdetails) o;

        if (lastModifiedDate != that.lastModifiedDate) return false;
        if (tripId != null ? !tripId.equals(that.tripId) : that.tripId != null) return false;
        if (latLng != null ? !latLng.equals(that.latLng) : that.latLng != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (originalLatLng != null ? !originalLatLng.equals(that.originalLatLng) : that.originalLatLng != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tripId != null ? tripId.hashCode() : 0;
        result = 31 * result + (latLng != null ? latLng.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (int) (lastModifiedDate ^ (lastModifiedDate >>> 32));
        result = 31 * result + (originalLatLng != null ? originalLatLng.hashCode() : 0);
        return result;
    }
}
