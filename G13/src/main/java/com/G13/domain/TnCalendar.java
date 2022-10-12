package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tn_calendars")
public class TnCalendar {
    @EmbeddedId
    private TnCalendarId id;

    @Column(name = "CALENDAR", nullable = false)
    private byte[] calendar;

    public TnCalendarId getId() {
        return id;
    }

    public void setId(TnCalendarId id) {
        this.id = id;
    }

    public byte[] getCalendar() {
        return calendar;
    }

    public void setCalendar(byte[] calendar) {
        this.calendar = calendar;
    }

}