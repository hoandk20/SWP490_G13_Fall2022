package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Verificationcount {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "VerificationCountID", nullable = false)
    private int verificationCountId;
    @Basic
    @Column(name = "deviceId", nullable = true, length = 400)
    private String deviceId;
    @Basic
    @Column(name = "sentDate", nullable = true)
    private Date sentDate;
    @Basic
    @Column(name = "sentCount", nullable = false)
    private byte sentCount;
    @Basic
    @Column(name = "totalSentCount", nullable = false)
    private byte totalSentCount;
    @Basic
    @Column(name = "createdBy", nullable = false, length = 50)
    private String createdBy;
    @Basic
    @Column(name = "createdDate", nullable = false)
    private Timestamp createdDate;
    @Basic
    @Column(name = "lastModifiedBy", nullable = false, length = 45)
    private String lastModifiedBy;
    @Basic
    @Column(name = "lastModifiedDate", nullable = false)
    private Timestamp lastModifiedDate;

    public int getVerificationCountId() {
        return verificationCountId;
    }

    public void setVerificationCountId(int verificationCountId) {
        this.verificationCountId = verificationCountId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Date getSentDate() {
        return sentDate;
    }

    public void setSentDate(Date sentDate) {
        this.sentDate = sentDate;
    }

    public byte getSentCount() {
        return sentCount;
    }

    public void setSentCount(byte sentCount) {
        this.sentCount = sentCount;
    }

    public byte getTotalSentCount() {
        return totalSentCount;
    }

    public void setTotalSentCount(byte totalSentCount) {
        this.totalSentCount = totalSentCount;
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

        Verificationcount that = (Verificationcount) o;

        if (verificationCountId != that.verificationCountId) return false;
        if (sentCount != that.sentCount) return false;
        if (totalSentCount != that.totalSentCount) return false;
        if (deviceId != null ? !deviceId.equals(that.deviceId) : that.deviceId != null) return false;
        if (sentDate != null ? !sentDate.equals(that.sentDate) : that.sentDate != null) return false;
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
        int result = verificationCountId;
        result = 31 * result + (deviceId != null ? deviceId.hashCode() : 0);
        result = 31 * result + (sentDate != null ? sentDate.hashCode() : 0);
        result = 31 * result + (int) sentCount;
        result = 31 * result + (int) totalSentCount;
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        return result;
    }
}
