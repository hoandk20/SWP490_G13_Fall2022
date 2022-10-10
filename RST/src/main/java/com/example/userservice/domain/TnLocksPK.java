package com.example.userservice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class TnLocksPK implements Serializable {
    @Column(name = "SCHED_NAME", nullable = false, length = 120)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String schedName;
    @Column(name = "LOCK_NAME", nullable = false, length = 40)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String lockName;

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getLockName() {
        return lockName;
    }

    public void setLockName(String lockName) {
        this.lockName = lockName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TnLocksPK tnLocksPK = (TnLocksPK) o;

        if (schedName != null ? !schedName.equals(tnLocksPK.schedName) : tnLocksPK.schedName != null) return false;
        if (lockName != null ? !lockName.equals(tnLocksPK.lockName) : tnLocksPK.lockName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schedName != null ? schedName.hashCode() : 0;
        result = 31 * result + (lockName != null ? lockName.hashCode() : 0);
        return result;
    }
}
