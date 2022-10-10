package com.example.userservice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

public class MovingdirectionPK implements Serializable {
    @Column(name = "MovingDirectionID", nullable = false, length = 50)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String movingDirectionId;
    @Column(name = "LastModifiedDate", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Timestamp lastModifiedDate;

    public String getMovingDirectionId() {
        return movingDirectionId;
    }

    public void setMovingDirectionId(String movingDirectionId) {
        this.movingDirectionId = movingDirectionId;
    }

    public Timestamp getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MovingdirectionPK that = (MovingdirectionPK) o;

        if (movingDirectionId != null ? !movingDirectionId.equals(that.movingDirectionId) : that.movingDirectionId != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = movingDirectionId != null ? movingDirectionId.hashCode() : 0;
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        return result;
    }
}
