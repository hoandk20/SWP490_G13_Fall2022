package com.example.userservice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class TnFiredTriggersPK implements Serializable {
    @Column(name = "SCHED_NAME", nullable = false, length = 120)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String schedName;
    @Column(name = "ENTRY_ID", nullable = false, length = 95)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String entryId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TnFiredTriggersPK that = (TnFiredTriggersPK) o;

        if (schedName != null ? !schedName.equals(that.schedName) : that.schedName != null) return false;
        if (entryId != null ? !entryId.equals(that.entryId) : that.entryId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schedName != null ? schedName.hashCode() : 0;
        result = 31 * result + (entryId != null ? entryId.hashCode() : 0);
        return result;
    }
}
