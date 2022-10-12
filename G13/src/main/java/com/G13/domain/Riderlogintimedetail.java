package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "riderlogintimedetail")
public class Riderlogintimedetail {
    @Id
    @Column(name = "RiderLoginTimeDetailID", nullable = false, length = 50)
    private String id;

    @Column(name = "RiderLoginTimeID", nullable = false, length = 50)
    private String riderLoginTimeID;

    @Column(name = "CompanyID")
    private Integer companyID;

    @Column(name = "CompanyGroupID")
    private Integer companyGroupID;

    @Column(name = "CompanyGroupName", nullable = false, length = 50)
    private String companyGroupName;

    @Column(name = "Level", nullable = false, length = 6)
    private String level;

    @Column(name = "NumberOfCars", nullable = false)
    private Integer numberOfCars;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRiderLoginTimeID() {
        return riderLoginTimeID;
    }

    public void setRiderLoginTimeID(String riderLoginTimeID) {
        this.riderLoginTimeID = riderLoginTimeID;
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public Integer getCompanyGroupID() {
        return companyGroupID;
    }

    public void setCompanyGroupID(Integer companyGroupID) {
        this.companyGroupID = companyGroupID;
    }

    public String getCompanyGroupName() {
        return companyGroupName;
    }

    public void setCompanyGroupName(String companyGroupName) {
        this.companyGroupName = companyGroupName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(Integer numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Instant lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

}