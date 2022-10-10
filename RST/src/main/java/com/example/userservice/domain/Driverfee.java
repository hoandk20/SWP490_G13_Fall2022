package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Driverfee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DriverFeeID", nullable = false)
    private int driverFeeId;
    @Basic
    @Column(name = "DriverFeeTableID", nullable = false)
    private int driverFeeTableId;
    @Basic
    @Column(name = "CompanyID", nullable = false)
    private int companyId;
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

    public int getDriverFeeId() {
        return driverFeeId;
    }

    public void setDriverFeeId(int driverFeeId) {
        this.driverFeeId = driverFeeId;
    }

    public int getDriverFeeTableId() {
        return driverFeeTableId;
    }

    public void setDriverFeeTableId(int driverFeeTableId) {
        this.driverFeeTableId = driverFeeTableId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
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

        Driverfee driverfee = (Driverfee) o;

        if (driverFeeId != driverfee.driverFeeId) return false;
        if (driverFeeTableId != driverfee.driverFeeTableId) return false;
        if (companyId != driverfee.companyId) return false;
        if (startDate != null ? !startDate.equals(driverfee.startDate) : driverfee.startDate != null) return false;
        if (endDate != null ? !endDate.equals(driverfee.endDate) : driverfee.endDate != null) return false;
        if (createdDate != null ? !createdDate.equals(driverfee.createdDate) : driverfee.createdDate != null)
            return false;
        if (createdBy != null ? !createdBy.equals(driverfee.createdBy) : driverfee.createdBy != null) return false;
        if (lastModifyDate != null ? !lastModifyDate.equals(driverfee.lastModifyDate) : driverfee.lastModifyDate != null)
            return false;
        if (lastModifyBy != null ? !lastModifyBy.equals(driverfee.lastModifyBy) : driverfee.lastModifyBy != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = driverFeeId;
        result = 31 * result + driverFeeTableId;
        result = 31 * result + companyId;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (lastModifyDate != null ? lastModifyDate.hashCode() : 0);
        result = 31 * result + (lastModifyBy != null ? lastModifyBy.hashCode() : 0);
        return result;
    }
}
