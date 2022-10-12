package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "driveronlinetime")
public class Driveronlinetime {
    @EmbeddedId
    private DriveronlinetimeId id;

    @Column(name = "OnlineTime", nullable = false)
    private Integer onlineTime;

    @Column(name = "LastOnlineTime")
    private Instant lastOnlineTime;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "lastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "LastOnlineRecord", nullable = false)
    private Boolean lastOnlineRecord = false;

    public DriveronlinetimeId getId() {
        return id;
    }

    public void setId(DriveronlinetimeId id) {
        this.id = id;
    }

    public Integer getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Integer onlineTime) {
        this.onlineTime = onlineTime;
    }

    public Instant getLastOnlineTime() {
        return lastOnlineTime;
    }

    public void setLastOnlineTime(Instant lastOnlineTime) {
        this.lastOnlineTime = lastOnlineTime;
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

    public Boolean getLastOnlineRecord() {
        return lastOnlineRecord;
    }

    public void setLastOnlineRecord(Boolean lastOnlineRecord) {
        this.lastOnlineRecord = lastOnlineRecord;
    }

}