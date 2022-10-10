package com.example.userservice.domain;

import javax.persistence.*;

@Entity
public class Waypoint {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "WayPointId", nullable = false, length = 50)
    private String wayPointId;
    @Basic
    @Column(name = "MovingDirectionID", nullable = true, length = 50)
    private String movingDirectionId;
    @Basic
    @Column(name = "Latitude", nullable = true, precision = 0)
    private Double latitude;
    @Basic
    @Column(name = "Longitude", nullable = true, precision = 0)
    private Double longitude;
    @Basic
    @Column(name = "OrderNumber", nullable = false)
    private short orderNumber;

    public String getWayPointId() {
        return wayPointId;
    }

    public void setWayPointId(String wayPointId) {
        this.wayPointId = wayPointId;
    }

    public String getMovingDirectionId() {
        return movingDirectionId;
    }

    public void setMovingDirectionId(String movingDirectionId) {
        this.movingDirectionId = movingDirectionId;
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

    public short getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(short orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Waypoint waypoint = (Waypoint) o;

        if (orderNumber != waypoint.orderNumber) return false;
        if (wayPointId != null ? !wayPointId.equals(waypoint.wayPointId) : waypoint.wayPointId != null) return false;
        if (movingDirectionId != null ? !movingDirectionId.equals(waypoint.movingDirectionId) : waypoint.movingDirectionId != null)
            return false;
        if (latitude != null ? !latitude.equals(waypoint.latitude) : waypoint.latitude != null) return false;
        if (longitude != null ? !longitude.equals(waypoint.longitude) : waypoint.longitude != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = wayPointId != null ? wayPointId.hashCode() : 0;
        result = 31 * result + (movingDirectionId != null ? movingDirectionId.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (int) orderNumber;
        return result;
    }
}
