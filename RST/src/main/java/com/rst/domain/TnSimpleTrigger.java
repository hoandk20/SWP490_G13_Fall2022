package com.rst.domain;

import javax.persistence.*;

@Entity
@Table(name = "tn_simple_triggers")
public class TnSimpleTrigger {
    @EmbeddedId
    private TnSimpleTriggerId id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "SCHED_NAME", referencedColumnName = "SCHED_NAME", nullable = false),
            @JoinColumn(name = "TRIGGER_NAME", referencedColumnName = "TRIGGER_NAME", nullable = false),
            @JoinColumn(name = "TRIGGER_GROUP", referencedColumnName = "TRIGGER_GROUP", nullable = false)
    })
    private TnTrigger tnTriggers;

    @Column(name = "REPEAT_COUNT", nullable = false)
    private Long repeatCount;

    @Column(name = "REPEAT_INTERVAL", nullable = false)
    private Long repeatInterval;

    @Column(name = "TIMES_TRIGGERED", nullable = false)
    private Long timesTriggered;

    public TnSimpleTriggerId getId() {
        return id;
    }

    public void setId(TnSimpleTriggerId id) {
        this.id = id;
    }

    public TnTrigger getTnTriggers() {
        return tnTriggers;
    }

    public void setTnTriggers(TnTrigger tnTriggers) {
        this.tnTriggers = tnTriggers;
    }

    public Long getRepeatCount() {
        return repeatCount;
    }

    public void setRepeatCount(Long repeatCount) {
        this.repeatCount = repeatCount;
    }

    public Long getRepeatInterval() {
        return repeatInterval;
    }

    public void setRepeatInterval(Long repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    public Long getTimesTriggered() {
        return timesTriggered;
    }

    public void setTimesTriggered(Long timesTriggered) {
        this.timesTriggered = timesTriggered;
    }

}