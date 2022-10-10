package com.example.userservice.domain;

import javax.persistence.*;

@Entity
public class Stoppoints {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "StopPointId", nullable = false, length = 50)
    private String stopPointId;
    @Basic
    @Column(name = "TripId", nullable = false, length = 50)
    private String tripId;
    @Basic
    @Column(name = "Address", nullable = true, length = 500)
    private String address;
    @Basic
    @Column(name = "Distance", nullable = false, precision = 0)
    private double distance;
    @Basic
    @Column(name = "Time", nullable = false)
    private short time;
    @Basic
    @Column(name = "Lat", nullable = false, precision = 0)
    private double lat;
    @Basic
    @Column(name = "Lng", nullable = false, precision = 0)
    private double lng;
    @Basic
    @Column(name = "StopDuration", nullable = false)
    private short stopDuration;
    @Basic
    @Column(name = "ActualStopLng", nullable = false, precision = 0)
    private double actualStopLng;
    @Basic
    @Column(name = "ActualStopLat", nullable = false, precision = 0)
    private double actualStopLat;
    @Basic
    @Column(name = "OrderNo", nullable = false)
    private byte orderNo;

    public String getStopPointId() {
        return stopPointId;
    }

    public void setStopPointId(String stopPointId) {
        this.stopPointId = stopPointId;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public short getTime() {
        return time;
    }

    public void setTime(short time) {
        this.time = time;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public short getStopDuration() {
        return stopDuration;
    }

    public void setStopDuration(short stopDuration) {
        this.stopDuration = stopDuration;
    }

    public double getActualStopLng() {
        return actualStopLng;
    }

    public void setActualStopLng(double actualStopLng) {
        this.actualStopLng = actualStopLng;
    }

    public double getActualStopLat() {
        return actualStopLat;
    }

    public void setActualStopLat(double actualStopLat) {
        this.actualStopLat = actualStopLat;
    }

    public byte getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(byte orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stoppoints that = (Stoppoints) o;

        if (Double.compare(that.distance, distance) != 0) return false;
        if (time != that.time) return false;
        if (Double.compare(that.lat, lat) != 0) return false;
        if (Double.compare(that.lng, lng) != 0) return false;
        if (stopDuration != that.stopDuration) return false;
        if (Double.compare(that.actualStopLng, actualStopLng) != 0) return false;
        if (Double.compare(that.actualStopLat, actualStopLat) != 0) return false;
        if (orderNo != that.orderNo) return false;
        if (stopPointId != null ? !stopPointId.equals(that.stopPointId) : that.stopPointId != null) return false;
        if (tripId != null ? !tripId.equals(that.tripId) : that.tripId != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = stopPointId != null ? stopPointId.hashCode() : 0;
        result = 31 * result + (tripId != null ? tripId.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        temp = Double.doubleToLongBits(distance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) time;
        temp = Double.doubleToLongBits(lat);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(lng);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) stopDuration;
        temp = Double.doubleToLongBits(actualStopLng);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(actualStopLat);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) orderNo;
        return result;
    }
}
