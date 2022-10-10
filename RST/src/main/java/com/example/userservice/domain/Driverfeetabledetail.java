package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Driverfeetabledetail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DriverFeeTableDetailID", nullable = false)
    private int driverFeeTableDetailId;
    @Basic
    @Column(name = "DriverFeeTableID", nullable = false)
    private int driverFeeTableId;
    @Basic
    @Column(name = "FromKM", nullable = false, precision = 0)
    private double fromKm;
    @Basic
    @Column(name = "ToKM", nullable = false, precision = 0)
    private double toKm;
    @Basic
    @Column(name = "Fee", nullable = false, precision = 0)
    private double fee;
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

    public int getDriverFeeTableDetailId() {
        return driverFeeTableDetailId;
    }

    public void setDriverFeeTableDetailId(int driverFeeTableDetailId) {
        this.driverFeeTableDetailId = driverFeeTableDetailId;
    }

    public int getDriverFeeTableId() {
        return driverFeeTableId;
    }

    public void setDriverFeeTableId(int driverFeeTableId) {
        this.driverFeeTableId = driverFeeTableId;
    }

    public double getFromKm() {
        return fromKm;
    }

    public void setFromKm(double fromKm) {
        this.fromKm = fromKm;
    }

    public double getToKm() {
        return toKm;
    }

    public void setToKm(double toKm) {
        this.toKm = toKm;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
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

        Driverfeetabledetail that = (Driverfeetabledetail) o;

        if (driverFeeTableDetailId != that.driverFeeTableDetailId) return false;
        if (driverFeeTableId != that.driverFeeTableId) return false;
        if (Double.compare(that.fromKm, fromKm) != 0) return false;
        if (Double.compare(that.toKm, toKm) != 0) return false;
        if (Double.compare(that.fee, fee) != 0) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (lastModifyDate != null ? !lastModifyDate.equals(that.lastModifyDate) : that.lastModifyDate != null)
            return false;
        if (lastModifyBy != null ? !lastModifyBy.equals(that.lastModifyBy) : that.lastModifyBy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = driverFeeTableDetailId;
        result = 31 * result + driverFeeTableId;
        temp = Double.doubleToLongBits(fromKm);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(toKm);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(fee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (lastModifyDate != null ? lastModifyDate.hashCode() : 0);
        result = 31 * result + (lastModifyBy != null ? lastModifyBy.hashCode() : 0);
        return result;
    }
}
