package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Riderpointhistory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RiderPointHistoryId", nullable = false, length = 50)
    private String riderPointHistoryId;
    @Basic
    @Column(name = "RiderID", nullable = false, length = 50)
    private String riderId;
    @Basic
    @Column(name = "Point", nullable = false)
    private int point;
    @Basic
    @Column(name = "CurrentPoint", nullable = false)
    private int currentPoint;
    @Basic
    @Column(name = "Type", nullable = false, length = 4)
    private String type;
    @Basic
    @Column(name = "OrderNumber", nullable = true, length = 50)
    private String orderNumber;
    @Basic
    @Column(name = "TripID", nullable = true, length = 50)
    private String tripId;
    @Basic
    @Column(name = "Note", nullable = true, length = 150)
    private String note;
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
    @Column(name = "VehicleLevel", nullable = true, length = 3)
    private String vehicleLevel;

    public String getRiderPointHistoryId() {
        return riderPointHistoryId;
    }

    public void setRiderPointHistoryId(String riderPointHistoryId) {
        this.riderPointHistoryId = riderPointHistoryId;
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getCurrentPoint() {
        return currentPoint;
    }

    public void setCurrentPoint(int currentPoint) {
        this.currentPoint = currentPoint;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

    public String getVehicleLevel() {
        return vehicleLevel;
    }

    public void setVehicleLevel(String vehicleLevel) {
        this.vehicleLevel = vehicleLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Riderpointhistory that = (Riderpointhistory) o;

        if (point != that.point) return false;
        if (currentPoint != that.currentPoint) return false;
        if (riderPointHistoryId != null ? !riderPointHistoryId.equals(that.riderPointHistoryId) : that.riderPointHistoryId != null)
            return false;
        if (riderId != null ? !riderId.equals(that.riderId) : that.riderId != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (orderNumber != null ? !orderNumber.equals(that.orderNumber) : that.orderNumber != null) return false;
        if (tripId != null ? !tripId.equals(that.tripId) : that.tripId != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (vehicleLevel != null ? !vehicleLevel.equals(that.vehicleLevel) : that.vehicleLevel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = riderPointHistoryId != null ? riderPointHistoryId.hashCode() : 0;
        result = 31 * result + (riderId != null ? riderId.hashCode() : 0);
        result = 31 * result + point;
        result = 31 * result + currentPoint;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (orderNumber != null ? orderNumber.hashCode() : 0);
        result = 31 * result + (tripId != null ? tripId.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (vehicleLevel != null ? vehicleLevel.hashCode() : 0);
        return result;
    }
}
