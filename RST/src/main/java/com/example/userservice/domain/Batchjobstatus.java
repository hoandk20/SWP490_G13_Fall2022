package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Batchjobstatus {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "BacthJobStatusId", nullable = false)
    private int bacthJobStatusId;
    @Basic
    @Column(name = "JobName", nullable = false, length = 100)
    private String jobName;
    @Basic
    @Column(name = "Type", nullable = false, length = 3)
    private String type;
    @Basic
    @Column(name = "Status", nullable = true, length = 3)
    private String status;
    @Basic
    @Column(name = "TimeZone", nullable = false, length = 50)
    private String timeZone;
    @Basic
    @Column(name = "JobClassName", nullable = false, length = 100)
    private String jobClassName;
    @Basic
    @Column(name = "CalculatedDate", nullable = false)
    private Date calculatedDate;
    @Basic
    @Column(name = "LastExecutedDate", nullable = false)
    private Timestamp lastExecutedDate;
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
    @Column(name = "Note", nullable = true, length = 200)
    private String note;

    public int getBacthJobStatusId() {
        return bacthJobStatusId;
    }

    public void setBacthJobStatusId(int bacthJobStatusId) {
        this.bacthJobStatusId = bacthJobStatusId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getJobClassName() {
        return jobClassName;
    }

    public void setJobClassName(String jobClassName) {
        this.jobClassName = jobClassName;
    }

    public Date getCalculatedDate() {
        return calculatedDate;
    }

    public void setCalculatedDate(Date calculatedDate) {
        this.calculatedDate = calculatedDate;
    }

    public Timestamp getLastExecutedDate() {
        return lastExecutedDate;
    }

    public void setLastExecutedDate(Timestamp lastExecutedDate) {
        this.lastExecutedDate = lastExecutedDate;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Batchjobstatus that = (Batchjobstatus) o;

        if (bacthJobStatusId != that.bacthJobStatusId) return false;
        if (jobName != null ? !jobName.equals(that.jobName) : that.jobName != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (timeZone != null ? !timeZone.equals(that.timeZone) : that.timeZone != null) return false;
        if (jobClassName != null ? !jobClassName.equals(that.jobClassName) : that.jobClassName != null) return false;
        if (calculatedDate != null ? !calculatedDate.equals(that.calculatedDate) : that.calculatedDate != null)
            return false;
        if (lastExecutedDate != null ? !lastExecutedDate.equals(that.lastExecutedDate) : that.lastExecutedDate != null)
            return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bacthJobStatusId;
        result = 31 * result + (jobName != null ? jobName.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (timeZone != null ? timeZone.hashCode() : 0);
        result = 31 * result + (jobClassName != null ? jobClassName.hashCode() : 0);
        result = 31 * result + (calculatedDate != null ? calculatedDate.hashCode() : 0);
        result = 31 * result + (lastExecutedDate != null ? lastExecutedDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
