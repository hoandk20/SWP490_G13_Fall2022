package com.example.userservice.domain;

import javax.persistence.*;

@Entity
@Table(name = "tn_cron_triggers", schema = "tnet_pro", catalog = "")
@IdClass(TnCronTriggersPK.class)
public class TnCronTriggers {
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
    @Column(name = "CRON_EXPRESSION", nullable = false, length = 200)
    private String cronExpression;
    @Basic
    @Column(name = "TIME_ZONE_ID", nullable = true, length = 80)
    private String timeZoneId;

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

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public String getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TnCronTriggers that = (TnCronTriggers) o;

        if (schedName != null ? !schedName.equals(that.schedName) : that.schedName != null) return false;
        if (triggerName != null ? !triggerName.equals(that.triggerName) : that.triggerName != null) return false;
        if (triggerGroup != null ? !triggerGroup.equals(that.triggerGroup) : that.triggerGroup != null) return false;
        if (cronExpression != null ? !cronExpression.equals(that.cronExpression) : that.cronExpression != null)
            return false;
        if (timeZoneId != null ? !timeZoneId.equals(that.timeZoneId) : that.timeZoneId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schedName != null ? schedName.hashCode() : 0;
        result = 31 * result + (triggerName != null ? triggerName.hashCode() : 0);
        result = 31 * result + (triggerGroup != null ? triggerGroup.hashCode() : 0);
        result = 31 * result + (cronExpression != null ? cronExpression.hashCode() : 0);
        result = 31 * result + (timeZoneId != null ? timeZoneId.hashCode() : 0);
        return result;
    }
}
