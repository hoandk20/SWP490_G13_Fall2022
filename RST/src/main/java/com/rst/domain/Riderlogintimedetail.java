package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "riderlogintimedetail")
public class Riderlogintimedetail {
    @Id
    @Column(name = "RiderLoginTimeDetailID", nullable = false, length = 50)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RiderLoginTimeID", nullable = false)
    private Riderlogintime riderLoginTimeID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CompanyID")
    private Company companyID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CompanyGroupID")
    private Companygroup companyGroupID;

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

    public Riderlogintime getRiderLoginTimeID() {
        return riderLoginTimeID;
    }

    public void setRiderLoginTimeID(Riderlogintime riderLoginTimeID) {
        this.riderLoginTimeID = riderLoginTimeID;
    }

    public Company getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Company companyID) {
        this.companyID = companyID;
    }

    public Companygroup getCompanyGroupID() {
        return companyGroupID;
    }

    public void setCompanyGroupID(Companygroup companyGroupID) {
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