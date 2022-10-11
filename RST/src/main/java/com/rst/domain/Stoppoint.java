package com.rst.domain;

import javax.persistence.*;

@Entity
@Table(name = "stoppoints")
public class Stoppoint {
    @Id
    @Column(name = "StopPointId", nullable = false, length = 50)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TripId", nullable = false)
    private Trip trip;

    @Column(name = "Address", length = 500)
    private String address;

    @Column(name = "Distance", nullable = false)
    private Float distance;

    @Column(name = "Time", nullable = false)
    private Short time;

    @Column(name = "Lat", nullable = false)
    private Double lat;

    @Column(name = "Lng", nullable = false)
    private Double lng;

    @Column(name = "StopDuration", nullable = false)
    private Short stopDuration;

    @Column(name = "ActualStopLng", nullable = false)
    private Double actualStopLng;

    @Column(name = "ActualStopLat", nullable = false)
    private Double actualStopLat;

    @Column(name = "OrderNo", nullable = false)
    private Byte orderNo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public Short getTime() {
        return time;
    }

    public void setTime(Short time) {
        this.time = time;
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

    public Short getStopDuration() {
        return stopDuration;
    }

    public void setStopDuration(Short stopDuration) {
        this.stopDuration = stopDuration;
    }

    public Double getActualStopLng() {
        return actualStopLng;
    }

    public void setActualStopLng(Double actualStopLng) {
        this.actualStopLng = actualStopLng;
    }

    public Double getActualStopLat() {
        return actualStopLat;
    }

    public void setActualStopLat(Double actualStopLat) {
        this.actualStopLat = actualStopLat;
    }

    public Byte getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Byte orderNo) {
        this.orderNo = orderNo;
    }

}