package com.rst.domain;

import javax.persistence.*;

@Entity
@Table(name = "tn_triggers")
public class TnTrigger {
    @EmbeddedId
    private TnTriggerId id;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "SCHED_NAME", referencedColumnName = "SCHED_NAME", nullable = false),
            @JoinColumn(name = "JOB_NAME", referencedColumnName = "JOB_NAME", nullable = false),
            @JoinColumn(name = "JOB_GROUP", referencedColumnName = "JOB_GROUP", nullable = false)
    })
    private TnJobDetail tnJobDetails;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "SCHED_NAME", referencedColumnName = "SCHED_NAME", nullable = false),
            @JoinColumn(name = "JOB_NAME", referencedColumnName = "JOB_NAME", nullable = false),
            @JoinColumn(name = "JOB_GROUP", referencedColumnName = "JOB_GROUP", nullable = false)
    })
    private TnJobDetail tnJobDetails1;

    @Column(name = "DESCRIPTION", length = 250)
    private String description;

    @Column(name = "NEXT_FIRE_TIME")
    private Long nextFireTime;

    @Column(name = "PREV_FIRE_TIME")
    private Long prevFireTime;

    @Column(name = "PRIORITY")
    private Integer priority;

    @Column(name = "TRIGGER_STATE", nullable = false, length = 16)
    private String triggerState;

    @Column(name = "TRIGGER_TYPE", nullable = false, length = 8)
    private String triggerType;

    @Column(name = "START_TIME", nullable = false)
    private Long startTime;

    @Column(name = "END_TIME")
    private Long endTime;

    @Column(name = "CALENDAR_NAME", length = 200)
    private String calendarName;

    @Column(name = "MISFIRE_INSTR")
    private Short misfireInstr;

    @Column(name = "JOB_DATA")
    private byte[] jobData;

    public TnTriggerId getId() {
        return id;
    }

    public void setId(TnTriggerId id) {
        this.id = id;
    }

    public TnJobDetail getTnJobDetails() {
        return tnJobDetails;
    }

    public void setTnJobDetails(TnJobDetail tnJobDetails) {
        this.tnJobDetails = tnJobDetails;
    }

    public TnJobDetail getTnJobDetails1() {
        return tnJobDetails1;
    }

    public void setTnJobDetails1(TnJobDetail tnJobDetails1) {
        this.tnJobDetails1 = tnJobDetails1;
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

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
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

}