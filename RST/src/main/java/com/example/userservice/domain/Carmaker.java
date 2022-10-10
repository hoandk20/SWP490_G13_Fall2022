package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Carmaker {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CarMakerID", nullable = false)
    private int carMakerId;
    @Basic
    @Column(name = "CarMaker", nullable = false, length = 20)
    private String carMaker;
    @Basic
    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;
    @Basic
    @Column(name = "CreatedDate", nullable = false)
    private Timestamp createdDate;
    @Basic
    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;
    @Basic
    @Column(name = "LastModifiedDate", nullable = false)
    private Timestamp lastModifiedDate;

    public int getCarMakerId() {
        return carMakerId;
    }

    public void setCarMakerId(int carMakerId) {
        this.carMakerId = carMakerId;
    }

    public String getCarMaker() {
        return carMaker;
    }

    public void setCarMaker(String carMaker) {
        this.carMaker = carMaker;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Carmaker carmaker = (Carmaker) o;

        if (carMakerId != carmaker.carMakerId) return false;
        if (carMaker != null ? !carMaker.equals(carmaker.carMaker) : carmaker.carMaker != null) return false;
        if (createdBy != null ? !createdBy.equals(carmaker.createdBy) : carmaker.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(carmaker.createdDate) : carmaker.createdDate != null)
            return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(carmaker.lastModifiedBy) : carmaker.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(carmaker.lastModifiedDate) : carmaker.lastModifiedDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = carMakerId;
        result = 31 * result + (carMaker != null ? carMaker.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        return result;
    }
}
