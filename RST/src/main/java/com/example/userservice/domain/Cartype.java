package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Cartype {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CarTypeID", nullable = false)
    private int carTypeId;
    @Basic
    @Column(name = "CarMakerID", nullable = false)
    private int carMakerId;
    @Basic
    @Column(name = "CarTitle", nullable = false, length = 30)
    private String carTitle;
    @Basic
    @Column(name = "Level", nullable = true, length = 4)
    private String level;
    @Basic
    @Column(name = "Status", nullable = true, length = 2)
    private String status;
    @Basic
    @Column(name = "Capacity", nullable = false)
    private int capacity;
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

    public int getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(int carTypeId) {
        this.carTypeId = carTypeId;
    }

    public int getCarMakerId() {
        return carMakerId;
    }

    public void setCarMakerId(int carMakerId) {
        this.carMakerId = carMakerId;
    }

    public String getCarTitle() {
        return carTitle;
    }

    public void setCarTitle(String carTitle) {
        this.carTitle = carTitle;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
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

        Cartype cartype = (Cartype) o;

        if (carTypeId != cartype.carTypeId) return false;
        if (carMakerId != cartype.carMakerId) return false;
        if (capacity != cartype.capacity) return false;
        if (carTitle != null ? !carTitle.equals(cartype.carTitle) : cartype.carTitle != null) return false;
        if (level != null ? !level.equals(cartype.level) : cartype.level != null) return false;
        if (status != null ? !status.equals(cartype.status) : cartype.status != null) return false;
        if (createdBy != null ? !createdBy.equals(cartype.createdBy) : cartype.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(cartype.createdDate) : cartype.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(cartype.lastModifiedBy) : cartype.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(cartype.lastModifiedDate) : cartype.lastModifiedDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = carTypeId;
        result = 31 * result + carMakerId;
        result = 31 * result + (carTitle != null ? carTitle.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + capacity;
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        return result;
    }
}
