package com.example.userservice.domain;

import javax.persistence.*;

@Entity
@Table(name = "tn_simple_triggers", schema = "tnet_pro", catalog = "")
@IdClass(TnSimpleTriggersPK.class)
public class TnSimpleTriggers {
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
    @Column(name = "REPEAT_COUNT", nullable = false)
    private long repeatCount;
    @Basic
    @Column(name = "REPEAT_INTERVAL", nullable = false)
    private long repeatInterval;
    @Basic
    @Column(name = "TIMES_TRIGGERED", nullable = false)
    private long timesTriggered;

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

    public long getRepeatCount() {
        return repeatCount;
    }

    public void setRepeatCount(long repeatCount) {
        this.repeatCount = repeatCount;
    }

    public long getRepeatInterval() {
        return repeatInterval;
    }

    public void setRepeatInterval(long repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    public long getTimesTriggered() {
        return timesTriggered;
    }

    public void setTimesTriggered(long timesTriggered) {
        this.timesTriggered = timesTriggered;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TnSimpleTriggers that = (TnSimpleTriggers) o;

        if (repeatCount != that.repeatCount) return false;
        if (repeatInterval != that.repeatInterval) return false;
        if (timesTriggered != that.timesTriggered) return false;
        if (schedName != null ? !schedName.equals(that.schedName) : that.schedName != null) return false;
        if (triggerName != null ? !triggerName.equals(that.triggerName) : that.triggerName != null) return false;
        if (triggerGroup != null ? !triggerGroup.equals(that.triggerGroup) : that.triggerGroup != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schedName != null ? schedName.hashCode() : 0;
        result = 31 * result + (triggerName != null ? triggerName.hashCode() : 0);
        result = 31 * result + (triggerGroup != null ? triggerGroup.hashCode() : 0);
        result = 31 * result + (int) (repeatCount ^ (repeatCount >>> 32));
        result = 31 * result + (int) (repeatInterval ^ (repeatInterval >>> 32));
        result = 31 * result + (int) (timesTriggered ^ (timesTriggered >>> 32));
        return result;
    }
}
