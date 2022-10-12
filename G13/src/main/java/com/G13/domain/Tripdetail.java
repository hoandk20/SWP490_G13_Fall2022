package com.G13.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "tripdetails")
public class Tripdetail {
    @Id
    @Column(name = "TripID", nullable = false, length = 50)
    private String id;

    @Lob
    @Column(name = "LatLng", nullable = false)
    private String latLng;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Long lastModifiedDate;

    @Lob
    @Column(name = "OriginalLatLng", nullable = false)
    private String originalLatLng;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLatLng() {
        return latLng;
    }

    public void setLatLng(String latLng) {
        this.latLng = latLng;
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

    public Long getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Long lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getOriginalLatLng() {
        return originalLatLng;
    }

    public void setOriginalLatLng(String originalLatLng) {
        this.originalLatLng = originalLatLng;
    }

}