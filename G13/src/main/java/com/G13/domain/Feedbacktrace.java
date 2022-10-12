package com.G13.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "feedbacktrace")
public class Feedbacktrace {
    @Id
    @Column(name = "FeedBackTraceID", nullable = false, length = 50)
    private String id;

    @Column(name = "StaffID", length = 50)
    private String staffID;

    @Column(name = "DriverID", length = 50)
    private String driverID;

    @Column(name = "RiderID", length = 50)
    private String riderID;

    @Column(name = "FeedBackID", nullable = false, length = 50)
    private String feedBackID;

    @Lob
    @Column(name = "Content")
    private String content;

    @Column(name = "Date", nullable = false)
    private Instant date;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "AgentStaffID", length = 50)
    private String agentStaffID;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public String getRiderID() {
        return riderID;
    }

    public void setRiderID(String riderID) {
        this.riderID = riderID;
    }

    public String getFeedBackID() {
        return feedBackID;
    }

    public void setFeedBackID(String feedBackID) {
        this.feedBackID = feedBackID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
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

    public String getAgentStaffID() {
        return agentStaffID;
    }

    public void setAgentStaffID(String agentStaffID) {
        this.agentStaffID = agentStaffID;
    }

}