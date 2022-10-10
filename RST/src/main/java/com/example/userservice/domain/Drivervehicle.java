package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Drivervehicle {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DriverVehicleID", nullable = false)
    private int driverVehicleId;
    @Basic
    @Column(name = "DriverID", nullable = false, length = 50)
    private String driverId;
    @Basic
    @Column(name = "VehicleID", nullable = false)
    private int vehicleId;
    @Basic
    @Column(name = "StartDate", nullable = false)
    private Date startDate;
    @Basic
    @Column(name = "EndDate", nullable = true)
    private Date endDate;
    @Basic
    @Column(name = "CreatedDate", nullable = false)
    private Timestamp createdDate;
    @Basic
    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;
    @Basic
    @Column(name = "LastModifyDate", nullable = false)
    private Timestamp lastModifyDate;
    @Basic
    @Column(name = "LastModifyBy", nullable = false, length = 50)
    private String lastModifyBy;

    public int getDriverVehicleId() {
        return driverVehicleId;
    }

    public void setDriverVehicleId(int driverVehicleId) {
        this.driverVehicleId = driverVehicleId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Timestamp lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public String getLastModifyBy() {
        return lastModifyBy;
    }

    public void setLastModifyBy(String lastModifyBy) {
        this.lastModifyBy = lastModifyBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Drivervehicle that = (Drivervehicle) o;

        if (driverVehicleId != that.driverVehicleId) return false;
        if (vehicleId != that.vehicleId) return false;
        if (driverId != null ? !driverId.equals(that.driverId) : that.driverId != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (lastModifyDate != null ? !lastModifyDate.equals(that.lastModifyDate) : that.lastModifyDate != null)
            return false;
        if (lastModifyBy != null ? !lastModifyBy.equals(that.lastModifyBy) : that.lastModifyBy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = driverVehicleId;
        result = 31 * result + (driverId != null ? driverId.hashCode() : 0);
        result = 31 * result + vehicleId;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (lastModifyDate != null ? lastModifyDate.hashCode() : 0);
        result = 31 * result + (lastModifyBy != null ? lastModifyBy.hashCode() : 0);
        return result;
    }
}
