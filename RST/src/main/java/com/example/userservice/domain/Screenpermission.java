package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Screenpermission {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ScreenPermissionId", nullable = false)
    private int screenPermissionId;
    @Basic
    @Column(name = "ScreenID", nullable = false)
    private int screenId;
    @Basic
    @Column(name = "BuLevel", nullable = false)
    private int buLevel;
    @Basic
    @Column(name = "UserGroup", nullable = false, length = 10)
    private String userGroup;
    @Basic
    @Column(name = "BUType", nullable = false, length = 10)
    private String buType;
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

    public int getScreenPermissionId() {
        return screenPermissionId;
    }

    public void setScreenPermissionId(int screenPermissionId) {
        this.screenPermissionId = screenPermissionId;
    }

    public int getScreenId() {
        return screenId;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }

    public int getBuLevel() {
        return buLevel;
    }

    public void setBuLevel(int buLevel) {
        this.buLevel = buLevel;
    }

    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }

    public String getBuType() {
        return buType;
    }

    public void setBuType(String buType) {
        this.buType = buType;
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

        Screenpermission that = (Screenpermission) o;

        if (screenPermissionId != that.screenPermissionId) return false;
        if (screenId != that.screenId) return false;
        if (buLevel != that.buLevel) return false;
        if (userGroup != null ? !userGroup.equals(that.userGroup) : that.userGroup != null) return false;
        if (buType != null ? !buType.equals(that.buType) : that.buType != null) return false;
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
        int result = screenPermissionId;
        result = 31 * result + screenId;
        result = 31 * result + buLevel;
        result = 31 * result + (userGroup != null ? userGroup.hashCode() : 0);
        result = 31 * result + (buType != null ? buType.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        return result;
    }
}
