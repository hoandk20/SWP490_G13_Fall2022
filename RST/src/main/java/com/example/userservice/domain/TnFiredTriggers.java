package com.example.userservice.domain;

import javax.persistence.*;

@Entity
@Table(name = "tn_fired_triggers", schema = "tnet_pro", catalog = "")
@IdClass(TnFiredTriggersPK.class)
public class TnFiredTriggers {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "SCHED_NAME", nullable = false, length = 120)
    private String schedName;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ENTRY_ID", nullable = false, length = 95)
    private String entryId;
    @Basic
    @Column(name = "TRIGGER_NAME", nullable = false, length = 200)
    private String triggerName;
    @Basic
    @Column(name = "TRIGGER_GROUP", nullable = false, length = 200)
    private String triggerGroup;
    @Basic
    @Column(name = "INSTANCE_NAME", nullable = false, length = 200)
    private String instanceName;
    @Basic
    @Column(name = "FIRED_TIME", nullable = false)
    private long firedTime;
    @Basic
    @Column(name = "SCHED_TIME", nullable = false)
    private long schedTime;
    @Basic
    @Column(name = "PRIORITY", nullable = false)
    private int priority;
    @Basic
    @Column(name = "STATE", nullable = false, length = 16)
    private String state;
    @Basic
    @Column(name = "JOB_NAME", nullable = true, length = 200)
    private String jobName;
    @Basic
    @Column(name = "JOB_GROUP", nullable = true, length = 200)
    private String jobGroup;
    @Basic
    @Column(name = "IS_NONCONCURRENT", nullable = true, length = 1)
    private String isNonconcurrent;
    @Basic
    @Column(name = "REQUESTS_RECOVERY", nullable = true, length = 1)
    private String requestsRecovery;

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getEntryId() {
        return entryId;
    }

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getTriggerGroup() {
        return triggerGroup;
    }

    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public long getFiredTime() {
        return firedTime;
    }

    public void setFiredTime(long firedTime) {
        this.firedTime = firedTime;
    }

    public long getSchedTime() {
        return schedTime;
    }

    public void setSchedTime(long schedTime) {
        this.schedTime = schedTime;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getIsNonconcurrent() {
        return isNonconcurrent;
    }

    public void setIsNonconcurrent(String isNonconcurrent) {
        this.isNonconcurrent = isNonconcurrent;
    }

    public String getRequestsRecovery() {
        return requestsRecovery;
    }

    public void setRequestsRecovery(String requestsRecovery) {
        this.requestsRecovery = requestsRecovery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TnFiredTriggers that = (TnFiredTriggers) o;

        if (firedTime != that.firedTime) return false;
        if (schedTime != that.schedTime) return false;
        if (priority != that.priority) return false;
        if (schedName != null ? !schedName.equals(that.schedName) : that.schedName != null) return false;
        if (entryId != null ? !entryId.equals(that.entryId) : that.entryId != null) return false;
        if (triggerName != null ? !triggerName.equals(that.triggerName) : that.triggerName != null) return false;
        if (triggerGroup != null ? !triggerGroup.equals(that.triggerGroup) : that.triggerGroup != null) return false;
        if (instanceName != null ? !instanceName.equals(that.instanceName) : that.instanceName != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (jobName != null ? !jobName.equals(that.jobName) : that.jobName != null) return false;
        if (jobGroup != null ? !jobGroup.equals(that.jobGroup) : that.jobGroup != null) return false;
        if (isNonconcurrent != null ? !isNonconcurrent.equals(that.isNonconcurrent) : that.isNonconcurrent != null)
            return false;
        if (requestsRecovery != null ? !requestsRecovery.equals(that.requestsRecovery) : that.requestsRecovery != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schedName != null ? schedName.hashCode() : 0;
        result = 31 * result + (entryId != null ? entryId.hashCode() : 0);
        result = 31 * result + (triggerName != null ? triggerName.hashCode() : 0);
        result = 31 * result + (triggerGroup != null ? triggerGroup.hashCode() : 0);
        result = 31 * result + (instanceName != null ? instanceName.hashCode() : 0);
        result = 31 * result + (int) (firedTime ^ (firedTime >>> 32));
        result = 31 * result + (int) (schedTime ^ (schedTime >>> 32));
        result = 31 * result + priority;
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (jobName != null ? jobName.hashCode() : 0);
        result = 31 * result + (jobGroup != null ? jobGroup.hashCode() : 0);
        result = 31 * result + (isNonconcurrent != null ? isNonconcurrent.hashCode() : 0);
        result = 31 * result + (requestsRecovery != null ? requestsRecovery.hashCode() : 0);
        return result;
    }
}
