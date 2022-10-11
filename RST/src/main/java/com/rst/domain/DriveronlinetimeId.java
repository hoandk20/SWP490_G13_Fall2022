package com.rst.domain;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class DriveronlinetimeId implements Serializable {
    private static final long serialVersionUID = -4879528270506939018L;
    @Column(name = "DriverID", nullable = false, length = 50)
    private String driverID;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DriveronlinetimeId entity = (DriveronlinetimeId) o;
        return Objects.equals(this.date, entity.date) &&
                Objects.equals(this.driverID, entity.driverID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, driverID);
    }

}