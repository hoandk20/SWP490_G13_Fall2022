package com.example.userservice.domain;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "tn_job_details", schema = "tnet_pro", catalog = "")
@IdClass(TnJobDetailsPK.class)
public class TnJobDetails {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "SCHED_NAME", nullable = false, length = 120)
    private String schedName;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "JOB_NAME", nullable = false, length = 200)
    private String jobName;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "JOB_GROUP", nullable = false, length = 200)
    private String jobGroup;
    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 250)
    private String description;
    @Basic
    @Column(name = "JOB_CLASS_NAME", nullable = false, length = 250)
    private String jobClassName;
    @Basic
    @Column(name = "IS_DURABLE", nullable = false, length = 1)
    private String isDurable;
    @Basic
    @Column(name = "IS_NONCONCURRENT", nullable = false, length = 1)
    private String isNonconcurrent;
    @Basic
    @Column(name = "IS_UPDATE_DATA", nullable = false, length = 1)
    private String isUpdateData;
    @Basic
    @Column(name = "REQUESTS_RECOVERY", nullable = false, length = 1)
    private String requestsRecovery;
    @Basic
    @Column(name = "JOB_DATA", nullable = true)
    private byte[] jobData;

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJobClassName() {
        return jobClassName;
    }

    public void setJobClassName(String jobClassName) {
        this.jobClassName = jobClassName;
    }

    public String getIsDurable() {
        return isDurable;
    }

    public void setIsDurable(String isDurable) {
        this.isDurable = isDurable;
    }

    public String getIsNonconcurrent() {
        return isNonconcurrent;
    }

    public void setIsNonconcurrent(String isNonconcurrent) {
        this.isNonconcurrent = isNonconcurrent;
    }

    public String getIsUpdateData() {
        return isUpdateData;
    }

    public void setIsUpdateData(String isUpdateData) {
        this.isUpdateData = isUpdateData;
    }

    public String getRequestsRecovery() {
        return requestsRecovery;
    }

    public void setRequestsRecovery(String requestsRecovery) {
        this.requestsRecovery = requestsRecovery;
    }

    public byte[] getJobData() {
        return jobData;
    }

    public void setJobData(byte[] jobData) {
        this.jobData = jobData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TnJobDetails that = (TnJobDetails) o;

        if (schedName != null ? !schedName.equals(that.schedName) : that.schedName != null) return false;
        if (jobName != null ? !jobName.equals(that.jobName) : that.jobName != null) return false;
        if (jobGroup != null ? !jobGroup.equals(that.jobGroup) : that.jobGroup != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (jobClassName != null ? !jobClassName.equals(that.jobClassName) : that.jobClassName != null) return false;
        if (isDurable != null ? !isDurable.equals(that.isDurable) : that.isDurable != null) return false;
        if (isNonconcurrent != null ? !isNonconcurrent.equals(that.isNonconcurrent) : that.isNonconcurrent != null)
            return false;
        if (isUpdateData != null ? !isUpdateData.equals(that.isUpdateData) : that.isUpdateData != null) return false;
        if (requestsRecovery != null ? !requestsRecovery.equals(that.requestsRecovery) : that.requestsRecovery != null)
            return false;
        if (!Arrays.equals(jobData, that.jobData)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schedName != null ? schedName.hashCode() : 0;
        result = 31 * result + (jobName != null ? jobName.hashCode() : 0);
        result = 31 * result + (jobGroup != null ? jobGroup.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (jobClassName != null ? jobClassName.hashCode() : 0);
        result = 31 * result + (isDurable != null ? isDurable.hashCode() : 0);
        result = 31 * result + (isNonconcurrent != null ? isNonconcurrent.hashCode() : 0);
        result = 31 * result + (isUpdateData != null ? isUpdateData.hashCode() : 0);
        result = 31 * result + (requestsRecovery != null ? requestsRecovery.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(jobData);
        return result;
    }
}
