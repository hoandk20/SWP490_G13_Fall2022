package com.rst.domain;

import javax.persistence.*;

@Entity
@Table(name = "waypoint")
public class Waypoint {
    @Id
    @Column(name = "WayPointId", nullable = false, length = 50)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MovingDirectionID", referencedColumnName = "MovingDirectionID")
    private Movingdirection movingDirectionID;

    @Column(name = "Latitude")
    private Double latitude;

    @Column(name = "Longitude")
    private Double longitude;

    @Column(name = "OrderNumber", nullable = false)
    private Short orderNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Movingdirection getMovingDirectionID() {
        return movingDirectionID;
    }

    public void setMovingDirectionID(Movingdirection movingDirectionID) {
        this.movingDirectionID = movingDirectionID;
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

    public Short getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Short orderNumber) {
        this.orderNumber = orderNumber;
    }

}