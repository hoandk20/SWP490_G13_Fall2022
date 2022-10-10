package com.example.userservice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class TnJobDetailsPK implements Serializable {
    @Column(name = "SCHED_NAME", nullable = false, length = 120)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String schedName;
    @Column(name = "JOB_NAME", nullable = false, length = 200)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String jobName;
    @Column(name = "JOB_GROUP", nullable = false, length = 200)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
        if (o == null || getClass() != o.getClass()) return false;

        TnJobDetailsPK that = (TnJobDetailsPK) o;

        if (schedName != null ? !schedName.equals(that.schedName) : that.schedName != null) return false;
        if (jobName != null ? !jobName.equals(that.jobName) : that.jobName != null) return false;
        if (jobGroup != null ? !jobGroup.equals(that.jobGroup) : that.jobGroup != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schedName != null ? schedName.hashCode() : 0;
        result = 31 * result + (jobName != null ? jobName.hashCode() : 0);
        result = 31 * result + (jobGroup != null ? jobGroup.hashCode() : 0);
        return result;
    }
}
