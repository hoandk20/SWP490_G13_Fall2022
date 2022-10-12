package com.G13.domain;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TnLockId implements Serializable {
    private static final long serialVersionUID = -1086397547152667368L;
    @Column(name = "SCHED_NAME", nullable = false, length = 120)
    private String schedName;

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
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TnLockId entity = (TnLockId) o;
        return Objects.equals(this.schedName, entity.schedName) &&
                Objects.equals(this.lockName, entity.lockName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedName, lockName);
    }

}