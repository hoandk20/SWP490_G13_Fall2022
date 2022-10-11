package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "feedbacktrace")
public class Feedbacktrace {
    @Id
    @Column(name = "FeedBackTraceID", nullable = false, length = 50)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "StaffID")
    private Staff staffID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DriverID")
    private Driver driverID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RiderID")
    private Rider riderID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FeedBackID", nullable = false)
    private Feedback feedBackID;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AgentStaffID")
    private Agentstaff agentStaffID;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Staff getStaffID() {
        return staffID;
    }

    public void setStaffID(Staff staffID) {
        this.staffID = staffID;
    }

    public Driver getDriverID() {
        return driverID;
    }

    public void setDriverID(Driver driverID) {
        this.driverID = driverID;
    }

    public Rider getRiderID() {
        return riderID;
    }

    public void setRiderID(Rider riderID) {
        this.riderID = riderID;
    }

    public Feedback getFeedBackID() {
        return feedBackID;
    }

    public void setFeedBackID(Feedback feedBackID) {
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

    public Agentstaff getAgentStaffID() {
        return agentStaffID;
    }

    public void setAgentStaffID(Agentstaff agentStaffID) {
        this.agentStaffID = agentStaffID;
    }

}