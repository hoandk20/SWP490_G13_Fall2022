package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Feedback {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "FeedBackID", nullable = false, length = 50)
    private String feedBackId;
    @Basic
    @Column(name = "UserID", nullable = true, length = 50)
    private String userId;
    @Basic
    @Column(name = "TripID", nullable = true, length = 50)
    private String tripId;
    @Basic
    @Column(name = "Title", nullable = false, length = 100)
    private String title;
    @Basic
    @Column(name = "Date", nullable = false)
    private Date date;
    @Basic
    @Column(name = "Status", nullable = false, length = 2)
    private String status;
    @Basic
    @Column(name = "Content", nullable = false, length = -1)
    private String content;
    @Basic
    @Column(name = "Type", nullable = false, length = 4)
    private String type;
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
    @Column(name = "UnRead", nullable = false)
    private byte unRead;
    @Basic
    @Column(name = "CityId", nullable = false)
    private int cityId;

    public String getFeedBackId() {
        return feedBackId;
    }

    public void setFeedBackId(String feedBackId) {
        this.feedBackId = feedBackId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public byte getUnRead() {
        return unRead;
    }

    public void setUnRead(byte unRead) {
        this.unRead = unRead;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Feedback feedback = (Feedback) o;

        if (unRead != feedback.unRead) return false;
        if (cityId != feedback.cityId) return false;
        if (feedBackId != null ? !feedBackId.equals(feedback.feedBackId) : feedback.feedBackId != null) return false;
        if (userId != null ? !userId.equals(feedback.userId) : feedback.userId != null) return false;
        if (tripId != null ? !tripId.equals(feedback.tripId) : feedback.tripId != null) return false;
        if (title != null ? !title.equals(feedback.title) : feedback.title != null) return false;
        if (date != null ? !date.equals(feedback.date) : feedback.date != null) return false;
        if (status != null ? !status.equals(feedback.status) : feedback.status != null) return false;
        if (content != null ? !content.equals(feedback.content) : feedback.content != null) return false;
        if (type != null ? !type.equals(feedback.type) : feedback.type != null) return false;
        if (createdBy != null ? !createdBy.equals(feedback.createdBy) : feedback.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(feedback.createdDate) : feedback.createdDate != null)
            return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(feedback.lastModifiedBy) : feedback.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(feedback.lastModifiedDate) : feedback.lastModifiedDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = feedBackId != null ? feedBackId.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (tripId != null ? tripId.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (int) unRead;
        result = 31 * result + cityId;
        return result;
    }
}
