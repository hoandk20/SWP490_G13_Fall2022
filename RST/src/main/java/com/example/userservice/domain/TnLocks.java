package com.example.userservice.domain;

import javax.persistence.*;

@Entity
@Table(name = "tn_locks", schema = "tnet_pro", catalog = "")
@IdClass(TnLocksPK.class)
public class TnLocks {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "SCHED_NAME", nullable = false, length = 120)
    private String schedName;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "LOCK_NAME", nullable = false, length = 40)
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

        TnLocks tnLocks = (TnLocks) o;

        if (schedName != null ? !schedName.equals(tnLocks.schedName) : tnLocks.schedName != null) return false;
        if (lockName != null ? !lockName.equals(tnLocks.lockName) : tnLocks.lockName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schedName != null ? schedName.hashCode() : 0;
        result = 31 * result + (lockName != null ? lockName.hashCode() : 0);
        return result;
    }
}
