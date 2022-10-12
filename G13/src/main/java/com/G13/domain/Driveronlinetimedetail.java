package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "driveronlinetimedetail")
public class Driveronlinetimedetail {
    @EmbeddedId
    private DriveronlinetimedetailId id;

    @Column(name = "OfflineTime")
    private Instant offlineTime;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "OnlineLat", nullable = false)
    private Double onlineLat;

    @Column(name = "OnlineLng", nullable = false)
    private Double onlineLng;

    @Column(name = "OfflineLng", nullable = false)
    private Double offlineLng;

    public DriveronlinetimedetailId getId() {
        return id;
    }

    public void setId(DriveronlinetimedetailId id) {
        this.id = id;
    }

    public Instant getOfflineTime() {
        return offlineTime;
    }

    public void setOfflineTime(Instant offlineTime) {
        this.offlineTime = offlineTime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Instant lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Double getOnlineLat() {
        return onlineLat;
    }

    public void setOnlineLat(Double onlineLat) {
        this.onlineLat = onlineLat;
    }

    public Double getOnlineLng() {
        return onlineLng;
    }

    public void setOnlineLng(Double onlineLng) {
        this.onlineLng = onlineLng;
    }

    public Double getOfflineLng() {
        return offlineLng;
    }

    public void setOfflineLng(Double offlineLng) {
        this.offlineLng = offlineLng;
    }

}