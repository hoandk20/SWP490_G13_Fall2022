package com.G13.domain;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Embeddable
public class DriveronlinetimedetailId implements Serializable {
    private static final long serialVersionUID = 425680315032580381L;
    @Column(name = "DriverID", nullable = false, length = 50)
    private String driverID;

    @Column(name = "OnlineTime", nullable = false)
    private Instant onlineTime;

    @Column(name = "OfflineLat", nullable = false)
    private Double offlineLat;

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public Instant getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Instant onlineTime) {
        this.onlineTime = onlineTime;
    }

    public Double getOfflineLat() {
        return offlineLat;
    }

    public void setOfflineLat(Double offlineLat) {
        this.offlineLat = offlineLat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DriveronlinetimedetailId entity = (DriveronlinetimedetailId) o;
        return Objects.equals(this.offlineLat, entity.offlineLat) &&
                Objects.equals(this.driverID, entity.driverID) &&
                Objects.equals(this.onlineTime, entity.onlineTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offlineLat, driverID, onlineTime);
    }

}