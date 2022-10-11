package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "riderlogintimetracking")
public class Riderlogintimetracking {
    @Id
    @Column(name = "RiderLoginTimeTrackingID", nullable = false, length = 50)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RiderID", nullable = false)
    private Rider riderID;

    @Column(name = "LoginTime")
    private Instant loginTime;

    @Column(name = "Lat", nullable = false)
    private Double lat;

    @Column(name = "Lng", nullable = false)
    private Double lng;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Rider getRiderID() {
        return riderID;
    }

    public void setRiderID(Rider riderID) {
        this.riderID = riderID;
    }

    public Instant getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Instant loginTime) {
        this.loginTime = loginTime;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

}