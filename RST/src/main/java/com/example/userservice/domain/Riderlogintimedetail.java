package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Riderlogintimedetail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RiderLoginTimeDetailID", nullable = false, length = 50)
    private String riderLoginTimeDetailId;
    @Basic
    @Column(name = "RiderLoginTimeID", nullable = false, length = 50)
    private String riderLoginTimeId;
    @Basic
    @Column(name = "CompanyID", nullable = true)
    private Integer companyId;
    @Basic
    @Column(name = "CompanyGroupID", nullable = true)
    private Integer companyGroupId;
    @Basic
    @Column(name = "CompanyGroupName", nullable = false, length = 50)
    private String companyGroupName;
    @Basic
    @Column(name = "Level", nullable = false, length = 6)
    private String level;
    @Basic
    @Column(name = "NumberOfCars", nullable = false)
    private int numberOfCars;
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

    public String getRiderLoginTimeDetailId() {
        return riderLoginTimeDetailId;
    }

    public void setRiderLoginTimeDetailId(String riderLoginTimeDetailId) {
        this.riderLoginTimeDetailId = riderLoginTimeDetailId;
    }

    public String getRiderLoginTimeId() {
        return riderLoginTimeId;
    }

    public void setRiderLoginTimeId(String riderLoginTimeId) {
        this.riderLoginTimeId = riderLoginTimeId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getCompanyGroupId() {
        return companyGroupId;
    }

    public void setCompanyGroupId(Integer companyGroupId) {
        this.companyGroupId = companyGroupId;
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

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
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

        Riderlogintimedetail that = (Riderlogintimedetail) o;

        if (numberOfCars != that.numberOfCars) return false;
        if (riderLoginTimeDetailId != null ? !riderLoginTimeDetailId.equals(that.riderLoginTimeDetailId) : that.riderLoginTimeDetailId != null)
            return false;
        if (riderLoginTimeId != null ? !riderLoginTimeId.equals(that.riderLoginTimeId) : that.riderLoginTimeId != null)
            return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (companyGroupId != null ? !companyGroupId.equals(that.companyGroupId) : that.companyGroupId != null)
            return false;
        if (companyGroupName != null ? !companyGroupName.equals(that.companyGroupName) : that.companyGroupName != null)
            return false;
        if (level != null ? !level.equals(that.level) : that.level != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = riderLoginTimeDetailId != null ? riderLoginTimeDetailId.hashCode() : 0;
        result = 31 * result + (riderLoginTimeId != null ? riderLoginTimeId.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (companyGroupId != null ? companyGroupId.hashCode() : 0);
        result = 31 * result + (companyGroupName != null ? companyGroupName.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + numberOfCars;
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        return result;
    }
}
