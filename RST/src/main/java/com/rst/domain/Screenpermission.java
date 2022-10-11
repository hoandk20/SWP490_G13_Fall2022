package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "screenpermission")
public class Screenpermission {
    @Id
    @Column(name = "ScreenPermissionId", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ScreenID", nullable = false)
    private Screen screenID;

    @Column(name = "BuLevel", nullable = false)
    private Integer buLevel;

    @Column(name = "UserGroup", nullable = false, length = 10)
    private String userGroup;

    @Column(name = "BUType", nullable = false, length = 10)
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

    public Screen getScreenID() {
        return screenID;
    }

    public void setScreenID(Screen screenID) {
        this.screenID = screenID;
    }

    public Integer getBuLevel() {
        return buLevel;
    }

    public void setBuLevel(Integer buLevel) {
        this.buLevel = buLevel;
    }

    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
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