package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@IdClass(FavoritePK.class)
public class Favorite {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RiderID", nullable = false, length = 50)
    private String riderId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DriverID", nullable = false, length = 50)
    private String driverId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Type", nullable = false, length = 4)
    private String type;
    @Basic
    @Column(name = "Status", nullable = true, length = 20)
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
    private Timestamp lastModifiedDate;

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Timestamp getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Favorite favorite = (Favorite) o;

        if (riderId != null ? !riderId.equals(favorite.riderId) : favorite.riderId != null) return false;
        if (driverId != null ? !driverId.equals(favorite.driverId) : favorite.driverId != null) return false;
        if (type != null ? !type.equals(favorite.type) : favorite.type != null) return false;
        if (status != null ? !status.equals(favorite.status) : favorite.status != null) return false;
        if (createdBy != null ? !createdBy.equals(favorite.createdBy) : favorite.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(favorite.createdDate) : favorite.createdDate != null)
            return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(favorite.lastModifiedBy) : favorite.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(favorite.lastModifiedDate) : favorite.lastModifiedDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = riderId != null ? riderId.hashCode() : 0;
        result = 31 * result + (driverId != null ? driverId.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        return result;
    }
}
