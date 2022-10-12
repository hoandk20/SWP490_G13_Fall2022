package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "verificationcount")
public class Verificationcount {
    @Id
    @Column(name = "VerificationCountID", nullable = false)
    private Integer id;

    @Column(name = "deviceId", length = 400)
    private String deviceId;

    @Column(name = "sentDate")
    private LocalDate sentDate;

    @Column(name = "sentCount", nullable = false)
    private Byte sentCount;

    @Column(name = "totalSentCount", nullable = false)
    private Byte totalSentCount;

    @Column(name = "createdBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "createdDate", nullable = false)
    private Instant createdDate;

    @Column(name = "lastModifiedBy", nullable = false, length = 45)
    private String lastModifiedBy;

    @Column(name = "lastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public LocalDate getSentDate() {
        return sentDate;
    }

    public void setSentDate(LocalDate sentDate) {
        this.sentDate = sentDate;
    }

    public Byte getSentCount() {
        return sentCount;
    }

    public void setSentCount(Byte sentCount) {
        this.sentCount = sentCount;
    }

    public Byte getTotalSentCount() {
        return totalSentCount;
    }

    public void setTotalSentCount(Byte totalSentCount) {
        this.totalSentCount = totalSentCount;
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