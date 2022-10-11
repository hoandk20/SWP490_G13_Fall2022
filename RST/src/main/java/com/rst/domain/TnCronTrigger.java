package com.rst.domain;

import javax.persistence.*;

@Entity
@Table(name = "tn_cron_triggers")
public class TnCronTrigger {
    @EmbeddedId
    private TnCronTriggerId id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "SCHED_NAME", referencedColumnName = "SCHED_NAME", nullable = false),
            @JoinColumn(name = "TRIGGER_NAME", referencedColumnName = "TRIGGER_NAME", nullable = false),
            @JoinColumn(name = "TRIGGER_GROUP", referencedColumnName = "TRIGGER_GROUP", nullable = false)
    })
    private TnTrigger tnTriggers;

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

    public TnTrigger getTnTriggers() {
        return tnTriggers;
    }

    public void setTnTriggers(TnTrigger tnTriggers) {
        this.tnTriggers = tnTriggers;
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