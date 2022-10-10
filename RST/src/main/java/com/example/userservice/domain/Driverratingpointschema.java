package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Driverratingpointschema {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DriverRatingPointSchemaID", nullable = false)
    private int driverRatingPointSchemaId;
    @Basic
    @Column(name = "FiveStarRatio", nullable = true, precision = 0)
    private Double fiveStarRatio;
    @Basic
    @Column(name = "FourStarRatio", nullable = true, precision = 0)
    private Double fourStarRatio;
    @Basic
    @Column(name = "ThreeStarRatio", nullable = true, precision = 0)
    private Double threeStarRatio;
    @Basic
    @Column(name = "LessTwoStarRatio", nullable = true, precision = 0)
    private Double lessTwoStarRatio;
    @Basic
    @Column(name = "NoRatingRatio", nullable = true, precision = 0)
    private Double noRatingRatio;
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
    @Column(name = "LastModifiedDate", nullable = false)
    private Timestamp lastModifiedDate;
    @Basic
    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    public int getDriverRatingPointSchemaId() {
        return driverRatingPointSchemaId;
    }

    public void setDriverRatingPointSchemaId(int driverRatingPointSchemaId) {
        this.driverRatingPointSchemaId = driverRatingPointSchemaId;
    }

    public Double getFiveStarRatio() {
        return fiveStarRatio;
    }

    public void setFiveStarRatio(Double fiveStarRatio) {
        this.fiveStarRatio = fiveStarRatio;
    }

    public Double getFourStarRatio() {
        return fourStarRatio;
    }

    public void setFourStarRatio(Double fourStarRatio) {
        this.fourStarRatio = fourStarRatio;
    }

    public Double getThreeStarRatio() {
        return threeStarRatio;
    }

    public void setThreeStarRatio(Double threeStarRatio) {
        this.threeStarRatio = threeStarRatio;
    }

    public Double getLessTwoStarRatio() {
        return lessTwoStarRatio;
    }

    public void setLessTwoStarRatio(Double lessTwoStarRatio) {
        this.lessTwoStarRatio = lessTwoStarRatio;
    }

    public Double getNoRatingRatio() {
        return noRatingRatio;
    }

    public void setNoRatingRatio(Double noRatingRatio) {
        this.noRatingRatio = noRatingRatio;
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

        Driverratingpointschema that = (Driverratingpointschema) o;

        if (driverRatingPointSchemaId != that.driverRatingPointSchemaId) return false;
        if (fiveStarRatio != null ? !fiveStarRatio.equals(that.fiveStarRatio) : that.fiveStarRatio != null)
            return false;
        if (fourStarRatio != null ? !fourStarRatio.equals(that.fourStarRatio) : that.fourStarRatio != null)
            return false;
        if (threeStarRatio != null ? !threeStarRatio.equals(that.threeStarRatio) : that.threeStarRatio != null)
            return false;
        if (lessTwoStarRatio != null ? !lessTwoStarRatio.equals(that.lessTwoStarRatio) : that.lessTwoStarRatio != null)
            return false;
        if (noRatingRatio != null ? !noRatingRatio.equals(that.noRatingRatio) : that.noRatingRatio != null)
            return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
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
        int result = driverRatingPointSchemaId;
        result = 31 * result + (fiveStarRatio != null ? fiveStarRatio.hashCode() : 0);
        result = 31 * result + (fourStarRatio != null ? fourStarRatio.hashCode() : 0);
        result = 31 * result + (threeStarRatio != null ? threeStarRatio.hashCode() : 0);
        result = 31 * result + (lessTwoStarRatio != null ? lessTwoStarRatio.hashCode() : 0);
        result = 31 * result + (noRatingRatio != null ? noRatingRatio.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        return result;
    }
}
