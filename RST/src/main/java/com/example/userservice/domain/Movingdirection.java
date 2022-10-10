package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@IdClass(MovingdirectionPK.class)
public class Movingdirection {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "MovingDirectionID", nullable = false, length = 50)
    private String movingDirectionId;
    @Basic
    @Column(name = "DriverID", nullable = true, length = 50)
    private String driverId;
    @Basic
    @Column(name = "FromAddress", nullable = true, length = 100)
    private String fromAddress;
    @Basic
    @Column(name = "ToAddress", nullable = true, length = 100)
    private String toAddress;
    @Basic
    @Column(name = "FromLatitude", nullable = true, precision = 0)
    private Double fromLatitude;
    @Basic
    @Column(name = "FromLongitude", nullable = true, precision = 0)
    private Double fromLongitude;
    @Basic
    @Column(name = "ToLatitude", nullable = true, precision = 0)
    private Double toLatitude;
    @Basic
    @Column(name = "ToLongitude", nullable = true, precision = 0)
    private Double toLongitude;
    @Basic
    @Column(name = "Time", nullable = false)
    private Timestamp time;
    @Basic
    @Column(name = "Status", nullable = true, length = 4)
    private String status;
    @Basic
    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "LastModifiedDate", nullable = false)
    private Timestamp lastModifiedDate;
    @Basic
    @Column(name = "EndTime", nullable = false)
    private Timestamp endTime;

    public String getMovingDirectionId() {
        return movingDirectionId;
    }

    public void setMovingDirectionId(String movingDirectionId) {
        this.movingDirectionId = movingDirectionId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public Double getFromLatitude() {
        return fromLatitude;
    }

    public void setFromLatitude(Double fromLatitude) {
        this.fromLatitude = fromLatitude;
    }

    public Double getFromLongitude() {
        return fromLongitude;
    }

    public void setFromLongitude(Double fromLongitude) {
        this.fromLongitude = fromLongitude;
    }

    public Double getToLatitude() {
        return toLatitude;
    }

    public void setToLatitude(Double toLatitude) {
        this.toLatitude = toLatitude;
    }

    public Double getToLongitude() {
        return toLongitude;
    }

    public void setToLongitude(Double toLongitude) {
        this.toLongitude = toLongitude;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Timestamp getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movingdirection that = (Movingdirection) o;

        if (movingDirectionId != null ? !movingDirectionId.equals(that.movingDirectionId) : that.movingDirectionId != null)
            return false;
        if (driverId != null ? !driverId.equals(that.driverId) : that.driverId != null) return false;
        if (fromAddress != null ? !fromAddress.equals(that.fromAddress) : that.fromAddress != null) return false;
        if (toAddress != null ? !toAddress.equals(that.toAddress) : that.toAddress != null) return false;
        if (fromLatitude != null ? !fromLatitude.equals(that.fromLatitude) : that.fromLatitude != null) return false;
        if (fromLongitude != null ? !fromLongitude.equals(that.fromLongitude) : that.fromLongitude != null)
            return false;
        if (toLatitude != null ? !toLatitude.equals(that.toLatitude) : that.toLatitude != null) return false;
        if (toLongitude != null ? !toLongitude.equals(that.toLongitude) : that.toLongitude != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = movingDirectionId != null ? movingDirectionId.hashCode() : 0;
        result = 31 * result + (driverId != null ? driverId.hashCode() : 0);
        result = 31 * result + (fromAddress != null ? fromAddress.hashCode() : 0);
        result = 31 * result + (toAddress != null ? toAddress.hashCode() : 0);
        result = 31 * result + (fromLatitude != null ? fromLatitude.hashCode() : 0);
        result = 31 * result + (fromLongitude != null ? fromLongitude.hashCode() : 0);
        result = 31 * result + (toLatitude != null ? toLatitude.hashCode() : 0);
        result = 31 * result + (toLongitude != null ? toLongitude.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        return result;
    }
}
