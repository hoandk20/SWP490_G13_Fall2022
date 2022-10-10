package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Proposedfaresateschema {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ProposedFareRateSchemaId", nullable = false)
    private int proposedFareRateSchemaId;
    @Basic
    @Column(name = "FareTo", nullable = false, precision = 0)
    private double fareTo;
    @Basic
    @Column(name = "FareFrom", nullable = false, precision = 0)
    private double fareFrom;
    @Basic
    @Column(name = "Rate", nullable = false, precision = 0)
    private double rate;
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
    @Column(name = "Status", nullable = false, length = 5)
    private String status;

    public int getProposedFareRateSchemaId() {
        return proposedFareRateSchemaId;
    }

    public void setProposedFareRateSchemaId(int proposedFareRateSchemaId) {
        this.proposedFareRateSchemaId = proposedFareRateSchemaId;
    }

    public double getFareTo() {
        return fareTo;
    }

    public void setFareTo(double fareTo) {
        this.fareTo = fareTo;
    }

    public double getFareFrom() {
        return fareFrom;
    }

    public void setFareFrom(double fareFrom) {
        this.fareFrom = fareFrom;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Proposedfaresateschema that = (Proposedfaresateschema) o;

        if (proposedFareRateSchemaId != that.proposedFareRateSchemaId) return false;
        if (Double.compare(that.fareTo, fareTo) != 0) return false;
        if (Double.compare(that.fareFrom, fareFrom) != 0) return false;
        if (Double.compare(that.rate, rate) != 0) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = proposedFareRateSchemaId;
        temp = Double.doubleToLongBits(fareTo);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(fareFrom);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(rate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
