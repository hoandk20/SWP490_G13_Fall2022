package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Pickupdistanceratioschema {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PickupDistanceRatioSchemaId", nullable = false)
    private int pickupDistanceRatioSchemaId;
    @Basic
    @Column(name = "StartDate", nullable = false)
    private Date startDate;
    @Basic
    @Column(name = "EndDate", nullable = true)
    private Date endDate;
    @Basic
    @Column(name = "Distance", nullable = true, precision = 0)
    private Double distance;
    @Basic
    @Column(name = "Ratio", nullable = true, precision = 0)
    private Double ratio;
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

    public int getPickupDistanceRatioSchemaId() {
        return pickupDistanceRatioSchemaId;
    }

    public void setPickupDistanceRatioSchemaId(int pickupDistanceRatioSchemaId) {
        this.pickupDistanceRatioSchemaId = pickupDistanceRatioSchemaId;
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

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getRatio() {
        return ratio;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
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

        Pickupdistanceratioschema that = (Pickupdistanceratioschema) o;

        if (pickupDistanceRatioSchemaId != that.pickupDistanceRatioSchemaId) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (distance != null ? !distance.equals(that.distance) : that.distance != null) return false;
        if (ratio != null ? !ratio.equals(that.ratio) : that.ratio != null) return false;
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
        int result = pickupDistanceRatioSchemaId;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (distance != null ? distance.hashCode() : 0);
        result = 31 * result + (ratio != null ? ratio.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        return result;
    }
}
