package com.example.userservice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class TnBlobTriggersPK implements Serializable {
    @Column(name = "SCHED_NAME", nullable = false, length = 120)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String schedName;
    @Column(name = "TRIGGER_NAME", nullable = false, length = 200)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String triggerName;
    @Column(name = "TRIGGER_GROUP", nullable = false, length = 200)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String triggerGroup;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TnBlobTriggersPK that = (TnBlobTriggersPK) o;

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
        return result;
    }
}
