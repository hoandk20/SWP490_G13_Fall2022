package com.G13.domain;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Embeddable
public class MovingdirectionId implements Serializable {
    private static final long serialVersionUID = 3563951822989445276L;
    @Column(name = "MovingDirectionID", nullable = false, length = 50)
    private String movingDirectionID;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    public String getMovingDirectionID() {
        return movingDirectionID;
    }

    public void setMovingDirectionID(String movingDirectionID) {
        this.movingDirectionID = movingDirectionID;
    }

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Instant lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MovingdirectionId entity = (MovingdirectionId) o;
        return Objects.equals(this.movingDirectionID, entity.movingDirectionID) &&
                Objects.equals(this.lastModifiedDate, entity.lastModifiedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movingDirectionID, lastModifiedDate);
    }

}