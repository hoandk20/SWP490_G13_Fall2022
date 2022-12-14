package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "drivergroupfieldpermission")
public class Drivergroupfieldpermission {
    @Id
    @Column(name = "GroupFieldPermissionId", nullable = false)
    private Integer id;

    @Column(name = "ScreenID", nullable = false)
    private Integer screenID;

    @Column(name = "UserGroup", nullable = false, length = 10)
    private String userGroup;

    @Column(name = "GroupFieldCode", nullable = false, length = 30)
    private String groupFieldCode;

    @Column(name = "CompanyID")
    private Integer companyID;

    @Column(name = "BUType", length = 10)
    private String bUType;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScreenID() {
        return screenID;
    }

    public void setScreenID(Integer screenID) {
        this.screenID = screenID;
    }

    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }

    public String getGroupFieldCode() {
        return groupFieldCode;
    }

    public void setGroupFieldCode(String groupFieldCode) {
        this.groupFieldCode = groupFieldCode;
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public String getBUType() {
        return bUType;
    }

    public void setBUType(String bUType) {
        this.bUType = bUType;
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