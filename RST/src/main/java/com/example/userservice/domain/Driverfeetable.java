package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Driverfeetable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DriverFeeTableID", nullable = false)
    private int driverFeeTableId;
    @Basic
    @Column(name = "VehicleLevel", nullable = true, length = 4)
    private String vehicleLevel;
    @Basic
    @Column(name = "Type", nullable = false, length = 4)
    private String type;
    @Basic
    @Column(name = "Title", nullable = false, length = 150)
    private String title;
    @Basic
    @Column(name = "Status", nullable = false, length = 4)
    private String status;
    @Basic
    @Column(name = "Fee", nullable = true, precision = 0)
    private Double fee;
    @Basic
    @Column(name = "Unit", nullable = true, length = 10)
    private String unit;
    @Basic
    @Column(name = "Note", nullable = true, length = 250)
    private String note;
    @Basic
    @Column(name = "StartDate", nullable = true)
    private Date startDate;
    @Basic
    @Column(name = "EndDate", nullable = true)
    private Date endDate;
    @Basic
    @Column(name = "CountryCode", nullable = false, length = 4)
    private String countryCode;
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

    public int getDriverFeeTableId() {
        return driverFeeTableId;
    }

    public void setDriverFeeTableId(int driverFeeTableId) {
        this.driverFeeTableId = driverFeeTableId;
    }

    public String getVehicleLevel() {
        return vehicleLevel;
    }

    public void setVehicleLevel(String vehicleLevel) {
        this.vehicleLevel = vehicleLevel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
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

        Driverfeetable that = (Driverfeetable) o;

        if (driverFeeTableId != that.driverFeeTableId) return false;
        if (vehicleLevel != null ? !vehicleLevel.equals(that.vehicleLevel) : that.vehicleLevel != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (fee != null ? !fee.equals(that.fee) : that.fee != null) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (lastModifyDate != null ? !lastModifyDate.equals(that.lastModifyDate) : that.lastModifyDate != null)
            return false;
        if (lastModifyBy != null ? !lastModifyBy.equals(that.lastModifyBy) : that.lastModifyBy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = driverFeeTableId;
        result = 31 * result + (vehicleLevel != null ? vehicleLevel.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (fee != null ? fee.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (lastModifyDate != null ? lastModifyDate.hashCode() : 0);
        result = 31 * result + (lastModifyBy != null ? lastModifyBy.hashCode() : 0);
        return result;
    }
}
