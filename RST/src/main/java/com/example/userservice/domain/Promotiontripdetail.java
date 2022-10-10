package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Promotiontripdetail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PromotionTripDetailID", nullable = false, length = 50)
    private String promotionTripDetailId;
    @Basic
    @Column(name = "PromotionTripID", nullable = false, length = 50)
    private String promotionTripId;
    @Basic
    @Column(name = "OrdinalNumber", nullable = true)
    private Integer ordinalNumber;
    @Basic
    @Column(name = "Latitude", nullable = true, precision = 0)
    private Double latitude;
    @Basic
    @Column(name = "Longitude", nullable = true, precision = 0)
    private Double longitude;
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
    @Basic
    @Column(name = "MaxTimeArrived", nullable = false)
    private Timestamp maxTimeArrived;
    @Basic
    @Column(name = "MinTimeArrived", nullable = false)
    private Timestamp minTimeArrived;
    @Basic
    @Column(name = "StopPoint", nullable = true)
    private Boolean stopPoint;
    @Basic
    @Column(name = "Address", nullable = true, length = -1)
    private String address;

    public String getPromotionTripDetailId() {
        return promotionTripDetailId;
    }

    public void setPromotionTripDetailId(String promotionTripDetailId) {
        this.promotionTripDetailId = promotionTripDetailId;
    }

    public String getPromotionTripId() {
        return promotionTripId;
    }

    public void setPromotionTripId(String promotionTripId) {
        this.promotionTripId = promotionTripId;
    }

    public Integer getOrdinalNumber() {
        return ordinalNumber;
    }

    public void setOrdinalNumber(Integer ordinalNumber) {
        this.ordinalNumber = ordinalNumber;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
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

    public Timestamp getMaxTimeArrived() {
        return maxTimeArrived;
    }

    public void setMaxTimeArrived(Timestamp maxTimeArrived) {
        this.maxTimeArrived = maxTimeArrived;
    }

    public Timestamp getMinTimeArrived() {
        return minTimeArrived;
    }

    public void setMinTimeArrived(Timestamp minTimeArrived) {
        this.minTimeArrived = minTimeArrived;
    }

    public Boolean getStopPoint() {
        return stopPoint;
    }

    public void setStopPoint(Boolean stopPoint) {
        this.stopPoint = stopPoint;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Promotiontripdetail that = (Promotiontripdetail) o;

        if (promotionTripDetailId != null ? !promotionTripDetailId.equals(that.promotionTripDetailId) : that.promotionTripDetailId != null)
            return false;
        if (promotionTripId != null ? !promotionTripId.equals(that.promotionTripId) : that.promotionTripId != null)
            return false;
        if (ordinalNumber != null ? !ordinalNumber.equals(that.ordinalNumber) : that.ordinalNumber != null)
            return false;
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (maxTimeArrived != null ? !maxTimeArrived.equals(that.maxTimeArrived) : that.maxTimeArrived != null)
            return false;
        if (minTimeArrived != null ? !minTimeArrived.equals(that.minTimeArrived) : that.minTimeArrived != null)
            return false;
        if (stopPoint != null ? !stopPoint.equals(that.stopPoint) : that.stopPoint != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = promotionTripDetailId != null ? promotionTripDetailId.hashCode() : 0;
        result = 31 * result + (promotionTripId != null ? promotionTripId.hashCode() : 0);
        result = 31 * result + (ordinalNumber != null ? ordinalNumber.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (maxTimeArrived != null ? maxTimeArrived.hashCode() : 0);
        result = 31 * result + (minTimeArrived != null ? minTimeArrived.hashCode() : 0);
        result = 31 * result + (stopPoint != null ? stopPoint.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
