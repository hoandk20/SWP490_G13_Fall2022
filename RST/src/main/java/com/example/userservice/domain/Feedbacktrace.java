package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Feedbacktrace {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "FeedBackTraceID", nullable = false, length = 50)
    private String feedBackTraceId;
    @Basic
    @Column(name = "StaffID", nullable = true, length = 50)
    private String staffId;
    @Basic
    @Column(name = "DriverID", nullable = true, length = 50)
    private String driverId;
    @Basic
    @Column(name = "RiderID", nullable = true, length = 50)
    private String riderId;
    @Basic
    @Column(name = "FeedBackID", nullable = false, length = 50)
    private String feedBackId;
    @Basic
    @Column(name = "Content", nullable = true, length = -1)
    private String content;
    @Basic
    @Column(name = "Date", nullable = false)
    private Timestamp date;
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
    @Basic
    @Column(name = "AgentStaffID", nullable = true, length = 50)
    private String agentStaffId;

    public String getFeedBackTraceId() {
        return feedBackTraceId;
    }

    public void setFeedBackTraceId(String feedBackTraceId) {
        this.feedBackTraceId = feedBackTraceId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public String getFeedBackId() {
        return feedBackId;
    }

    public void setFeedBackId(String feedBackId) {
        this.feedBackId = feedBackId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
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

    public String getAgentStaffId() {
        return agentStaffId;
    }

    public void setAgentStaffId(String agentStaffId) {
        this.agentStaffId = agentStaffId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Feedbacktrace that = (Feedbacktrace) o;

        if (feedBackTraceId != null ? !feedBackTraceId.equals(that.feedBackTraceId) : that.feedBackTraceId != null)
            return false;
        if (staffId != null ? !staffId.equals(that.staffId) : that.staffId != null) return false;
        if (driverId != null ? !driverId.equals(that.driverId) : that.driverId != null) return false;
        if (riderId != null ? !riderId.equals(that.riderId) : that.riderId != null) return false;
        if (feedBackId != null ? !feedBackId.equals(that.feedBackId) : that.feedBackId != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (agentStaffId != null ? !agentStaffId.equals(that.agentStaffId) : that.agentStaffId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = feedBackTraceId != null ? feedBackTraceId.hashCode() : 0;
        result = 31 * result + (staffId != null ? staffId.hashCode() : 0);
        result = 31 * result + (driverId != null ? driverId.hashCode() : 0);
        result = 31 * result + (riderId != null ? riderId.hashCode() : 0);
        result = 31 * result + (feedBackId != null ? feedBackId.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (agentStaffId != null ? agentStaffId.hashCode() : 0);
        return result;
    }
}
