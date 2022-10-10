package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Driverfarepointschema {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DriverFarePointSchemaID", nullable = false)
    private int driverFarePointSchemaId;
    @Basic
    @Column(name = "CountryCode", nullable = false, length = 4)
    private String countryCode;
    @Basic
    @Column(name = "StartDate", nullable = false)
    private Date startDate;
    @Basic
    @Column(name = "EndDate", nullable = true)
    private Date endDate;
    @Basic
    @Column(name = "Fare", nullable = true, precision = 0)
    private Double fare;
    @Basic
    @Column(name = "Point", nullable = false)
    private byte point;
    @Basic
    @Column(name = "VehicleType", nullable = true, length = 4)
    private String vehicleType;
    @Basic
    @Column(name = "Note", nullable = true, length = 200)
    private String note;
    @Basic
    @Column(name = "CreatedDate", nullable = false)
    private Timestamp createdDate;
    @Basic
    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;
    @Basic
    @Column(name = "LastModifiedDate", nullable = false)
    private Timestamp lastModifiedDate;
    @Basic
    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    public int getDriverFarePointSchemaId() {
        return driverFarePointSchemaId;
    }

    public void setDriverFarePointSchemaId(int driverFarePointSchemaId) {
        this.driverFarePointSchemaId = driverFarePointSchemaId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
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

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }

    public byte getPoint() {
        return point;
    }

    public void setPoint(byte point) {
        this.point = point;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

    public Timestamp getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driverfarepointschema that = (Driverfarepointschema) o;

        if (driverFarePointSchemaId != that.driverFarePointSchemaId) return false;
        if (point != that.point) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (fare != null ? !fare.equals(that.fare) : that.fare != null) return false;
        if (vehicleType != null ? !vehicleType.equals(that.vehicleType) : that.vehicleType != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = driverFarePointSchemaId;
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (fare != null ? fare.hashCode() : 0);
        result = 31 * result + (int) point;
        result = 31 * result + (vehicleType != null ? vehicleType.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        return result;
    }
}
