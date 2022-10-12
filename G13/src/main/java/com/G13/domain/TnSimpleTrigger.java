package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tn_simple_triggers")
public class TnSimpleTrigger {
    @EmbeddedId
    private TnSimpleTriggerId id;

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