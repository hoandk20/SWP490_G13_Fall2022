package com.example.userservice.domain;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "tn_triggers", schema = "tnet_pro", catalog = "")
@IdClass(TnTriggersPK.class)
public class TnTriggers {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "SCHED_NAME", nullable = false, length = 120)
    private String schedName;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TRIGGER_NAME", nullable = false, length = 200)
    private String triggerName;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TRIGGER_GROUP", nullable = false, length = 200)
    private String triggerGroup;
    @Basic
    @Column(name = "JOB_NAME", nullable = false, length = 200)
    private String jobName;
    @Basic
    @Column(name = "JOB_GROUP", nullable = false, length = 200)
    private String jobGroup;
    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 250)
    private String description;
    @Basic
    @Column(name = "NEXT_FIRE_TIME", nullable = true)
    private Long nextFireTime;
    @Basic
    @Column(name = "PREV_FIRE_TIME", nullable = true)
    private Long prevFireTime;
    @Basic
    @Column(name = "PRIORITY", nullable = true)
    private Integer priority;
    @Basic
    @Column(name = "TRIGGER_STATE", nullable = false, length = 16)
    private String triggerState;
    @Basic
    @Column(name = "TRIGGER_TYPE", nullable = false, length = 8)
    private String triggerType;
    @Basic
    @Column(name = "START_TIME", nullable = false)
    private long startTime;
    @Basic
    @Column(name = "END_TIME", nullable = true)
    private Long endTime;
    @Basic
    @Column(name = "CALENDAR_NAME", nullable = true, length = 200)
    private String calendarName;
    @Basic
    @Column(name = "MISFIRE_INSTR", nullable = true)
    private Short misfireInstr;
    @Basic
    @Column(name = "JOB_DATA", nullable = true)
    private byte[] jobData;

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
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

    public Long getNextFireTime() {
        return nextFireTime;
    }

    public void setNextFireTime(Long nextFireTime) {
        this.nextFireTime = nextFireTime;
    }

    public Long getPrevFireTime() {
        return prevFireTime;
    }

    public void setPrevFireTime(Long prevFireTime) {
        this.prevFireTime = prevFireTime;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getTriggerState() {
        return triggerState;
    }

    public void setTriggerState(String triggerState) {
        this.triggerState = triggerState;
    }

    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public String getCalendarName() {
        return calendarName;
    }

    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName;
    }

    public Short getMisfireInstr() {
        return misfireInstr;
    }

    public void setMisfireInstr(Short misfireInstr) {
        this.misfireInstr = misfireInstr;
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

        TnTriggers that = (TnTriggers) o;

        if (startTime != that.startTime) return false;
        if (schedName != null ? !schedName.equals(that.schedName) : that.schedName != null) return false;
        if (triggerName != null ? !triggerName.equals(that.triggerName) : that.triggerName != null) return false;
        if (triggerGroup != null ? !triggerGroup.equals(that.triggerGroup) : that.triggerGroup != null) return false;
        if (jobName != null ? !jobName.equals(that.jobName) : that.jobName != null) return false;
        if (jobGroup != null ? !jobGroup.equals(that.jobGroup) : that.jobGroup != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (nextFireTime != null ? !nextFireTime.equals(that.nextFireTime) : that.nextFireTime != null) return false;
        if (prevFireTime != null ? !prevFireTime.equals(that.prevFireTime) : that.prevFireTime != null) return false;
        if (priority != null ? !priority.equals(that.priority) : that.priority != null) return false;
        if (triggerState != null ? !triggerState.equals(that.triggerState) : that.triggerState != null) return false;
        if (triggerType != null ? !triggerType.equals(that.triggerType) : that.triggerType != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (calendarName != null ? !calendarName.equals(that.calendarName) : that.calendarName != null) return false;
        if (misfireInstr != null ? !misfireInstr.equals(that.misfireInstr) : that.misfireInstr != null) return false;
        if (!Arrays.equals(jobData, that.jobData)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schedName != null ? schedName.hashCode() : 0;
        result = 31 * result + (triggerName != null ? triggerName.hashCode() : 0);
        result = 31 * result + (triggerGroup != null ? triggerGroup.hashCode() : 0);
        result = 31 * result + (jobName != null ? jobName.hashCode() : 0);
        result = 31 * result + (jobGroup != null ? jobGroup.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (nextFireTime != null ? nextFireTime.hashCode() : 0);
        result = 31 * result + (prevFireTime != null ? prevFireTime.hashCode() : 0);
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        result = 31 * result + (triggerState != null ? triggerState.hashCode() : 0);
        result = 31 * result + (triggerType != null ? triggerType.hashCode() : 0);
        result = 31 * result + (int) (startTime ^ (startTime >>> 32));
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (calendarName != null ? calendarName.hashCode() : 0);
        result = 31 * result + (misfireInstr != null ? misfireInstr.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(jobData);
        return result;
    }
}
