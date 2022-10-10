package com.example.userservice.domain;

import javax.persistence.*;

@Entity
@Table(name = "tn_scheduler_state", schema = "tnet_pro", catalog = "")
@IdClass(TnSchedulerStatePK.class)
public class TnSchedulerState {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "SCHED_NAME", nullable = false, length = 120)
    private String schedName;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "INSTANCE_NAME", nullable = false, length = 200)
    private String instanceName;
    @Basic
    @Column(name = "LAST_CHECKIN_TIME", nullable = false)
    private long lastCheckinTime;
    @Basic
    @Column(name = "CHECKIN_INTERVAL", nullable = false)
    private long checkinInterval;

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public long getLastCheckinTime() {
        return lastCheckinTime;
    }

    public void setLastCheckinTime(long lastCheckinTime) {
        this.lastCheckinTime = lastCheckinTime;
    }

    public long getCheckinInterval() {
        return checkinInterval;
    }

    public void setCheckinInterval(long checkinInterval) {
        this.checkinInterval = checkinInterval;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TnSchedulerState that = (TnSchedulerState) o;

        if (lastCheckinTime != that.lastCheckinTime) return false;
        if (checkinInterval != that.checkinInterval) return false;
        if (schedName != null ? !schedName.equals(that.schedName) : that.schedName != null) return false;
        if (instanceName != null ? !instanceName.equals(that.instanceName) : that.instanceName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schedName != null ? schedName.hashCode() : 0;
        result = 31 * result + (instanceName != null ? instanceName.hashCode() : 0);
        result = 31 * result + (int) (lastCheckinTime ^ (lastCheckinTime >>> 32));
        result = 31 * result + (int) (checkinInterval ^ (checkinInterval >>> 32));
        return result;
    }
}
