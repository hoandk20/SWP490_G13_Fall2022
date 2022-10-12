package com.G13.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "promotiontripdetail")
public class Promotiontripdetail {
    @Id
    @Column(name = "PromotionTripDetailID", nullable = false, length = 50)
    private String id;

    @Column(name = "PromotionTripID", nullable = false, length = 50)
    private String promotionTripID;

    @Column(name = "OrdinalNumber")
    private Integer ordinalNumber;

    @Column(name = "Latitude")
    private Double latitude;

    @Column(name = "Longitude")
    private Double longitude;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "MaxTimeArrived", nullable = false)
    private Instant maxTimeArrived;

    @Column(name = "MinTimeArrived", nullable = false)
    private Instant minTimeArrived;

    @Column(name = "StopPoint")
    private Boolean stopPoint;

    @Lob
    @Column(name = "Address")
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPromotionTripID() {
        return promotionTripID;
    }

    public void setPromotionTripID(String promotionTripID) {
        this.promotionTripID = promotionTripID;
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

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Instant lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Instant getMaxTimeArrived() {
        return maxTimeArrived;
    }

    public void setMaxTimeArrived(Instant maxTimeArrived) {
        this.maxTimeArrived = maxTimeArrived;
    }

    public Instant getMinTimeArrived() {
        return minTimeArrived;
    }

    public void setMinTimeArrived(Instant minTimeArrived) {
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

}