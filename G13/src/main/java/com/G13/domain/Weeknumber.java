package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "weeknumber")
public class Weeknumber {
    @Id
    @Column(name = "WEEKNUMBERID", nullable = false)
    private Long id;

    @Column(name = "WEEKNUMBER")
    private Integer weeknumber;

    @Column(name = "FINANCIALYEAR")
    private Integer financialyear;

    @Column(name = "WEEKSTARTDATE", nullable = false)
    private Instant weekstartdate;

    @Column(name = "WEEKENDDATE", nullable = false)
    private Instant weekenddate;

    @Column(name = "CREATEDBY", nullable = false, length = 50)
    private String createdby;

    @Column(name = "CREATEDDATE", nullable = false)
    private Instant createddate;

    @Column(name = "LASTMODIFIEDBY", nullable = false, length = 50)
    private String lastmodifiedby;

    @Column(name = "LASTMODIFIEDDATE", nullable = false)
    private Instant lastmodifieddate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getWeeknumber() {
        return weeknumber;
    }

    public void setWeeknumber(Integer weeknumber) {
        this.weeknumber = weeknumber;
    }

    public Integer getFinancialyear() {
        return financialyear;
    }

    public void setFinancialyear(Integer financialyear) {
        this.financialyear = financialyear;
    }

    public Instant getWeekstartdate() {
        return weekstartdate;
    }

    public void setWeekstartdate(Instant weekstartdate) {
        this.weekstartdate = weekstartdate;
    }

    public Instant getWeekenddate() {
        return weekenddate;
    }

    public void setWeekenddate(Instant weekenddate) {
        this.weekenddate = weekenddate;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public Instant getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Instant createddate) {
        this.createddate = createddate;
    }

    public String getLastmodifiedby() {
        return lastmodifiedby;
    }

    public void setLastmodifiedby(String lastmodifiedby) {
        this.lastmodifiedby = lastmodifiedby;
    }

    public Instant getLastmodifieddate() {
        return lastmodifieddate;
    }

    public void setLastmodifieddate(Instant lastmodifieddate) {
        this.lastmodifieddate = lastmodifieddate;
    }

}