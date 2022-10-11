package com.rst.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tn_job_details")
public class TnJobDetail {
    @EmbeddedId
    private TnJobDetailId id;

    @Column(name = "DESCRIPTION", length = 250)
    private String description;

    @Column(name = "JOB_CLASS_NAME", nullable = false, length = 250)
    private String jobClassName;

    @Column(name = "IS_DURABLE", nullable = false, length = 1)
    private String isDurable;

    @Column(name = "IS_NONCONCURRENT", nullable = false, length = 1)
    private String isNonconcurrent;

    @Column(name = "IS_UPDATE_DATA", nullable = false, length = 1)
    private String isUpdateData;

    @Column(name = "REQUESTS_RECOVERY", nullable = false, length = 1)
    private String requestsRecovery;

    @Column(name = "JOB_DATA")
    private byte[] jobData;

    public TnJobDetailId getId() {
        return id;
    }

    public void setId(TnJobDetailId id) {
        this.id = id;
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

}