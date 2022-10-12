package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tn_cron_triggers")
public class TnCronTrigger {
    @EmbeddedId
    private TnCronTriggerId id;

    @Column(name = "CRON_EXPRESSION", nullable = false, length = 200)
    private String cronExpression;

    @Column(name = "TIME_ZONE_ID", length = 80)
    private String timeZoneId;

    public TnCronTriggerId getId() {
        return id;
    }

    public void setId(TnCronTriggerId id) {
        this.id = id;
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

}