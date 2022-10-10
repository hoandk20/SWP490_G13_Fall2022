package com.example.userservice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class TnCalendarsPK implements Serializable {
    @Column(name = "SCHED_NAME", nullable = false, length = 120)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String schedName;
    @Column(name = "CALENDAR_NAME", nullable = false, length = 200)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String calendarName;

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getCalendarName() {
        return calendarName;
    }

    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TnCalendarsPK that = (TnCalendarsPK) o;

        if (schedName != null ? !schedName.equals(that.schedName) : that.schedName != null) return false;
        if (calendarName != null ? !calendarName.equals(that.calendarName) : that.calendarName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schedName != null ? schedName.hashCode() : 0;
        result = 31 * result + (calendarName != null ? calendarName.hashCode() : 0);
        return result;
    }
}
