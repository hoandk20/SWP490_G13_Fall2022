package com.G13.domain;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TnJobDetailId implements Serializable {
    private static final long serialVersionUID = 7122793662711439028L;
    @Column(name = "SCHED_NAME", nullable = false, length = 120)
    private String schedName;

    @Column(name = "JOB_NAME", nullable = false, length = 200)
    private String jobName;

    @Column(name = "JOB_GROUP", nullable = false, length = 200)
    private String jobGroup;

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TnJobDetailId entity = (TnJobDetailId) o;
        return Objects.equals(this.jobName, entity.jobName) &&
                Objects.equals(this.schedName, entity.schedName) &&
                Objects.equals(this.jobGroup, entity.jobGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobName, schedName, jobGroup);
    }

}