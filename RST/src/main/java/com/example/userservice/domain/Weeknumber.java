package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Weeknumber {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "WEEKNUMBERID", nullable = false)
    private long weeknumberid;
    @Basic
    @Column(name = "WEEKNUMBER", nullable = true)
    private Integer weeknumber;
    @Basic
    @Column(name = "FINANCIALYEAR", nullable = true)
    private Integer financialyear;
    @Basic
    @Column(name = "WEEKSTARTDATE", nullable = false)
    private Timestamp weekstartdate;
    @Basic
    @Column(name = "WEEKENDDATE", nullable = false)
    private Timestamp weekenddate;
    @Basic
    @Column(name = "CREATEDBY", nullable = false, length = 50)
    private String createdby;
    @Basic
    @Column(name = "CREATEDDATE", nullable = false)
    private Timestamp createddate;
    @Basic
    @Column(name = "LASTMODIFIEDBY", nullable = false, length = 50)
    private String lastmodifiedby;
    @Basic
    @Column(name = "LASTMODIFIEDDATE", nullable = false)
    private Timestamp lastmodifieddate;

    public long getWeeknumberid() {
        return weeknumberid;
    }

    public void setWeeknumberid(long weeknumberid) {
        this.weeknumberid = weeknumberid;
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

    public Timestamp getWeekstartdate() {
        return weekstartdate;
    }

    public void setWeekstartdate(Timestamp weekstartdate) {
        this.weekstartdate = weekstartdate;
    }

    public Timestamp getWeekenddate() {
        return weekenddate;
    }

    public void setWeekenddate(Timestamp weekenddate) {
        this.weekenddate = weekenddate;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public Timestamp getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Timestamp createddate) {
        this.createddate = createddate;
    }

    public String getLastmodifiedby() {
        return lastmodifiedby;
    }

    public void setLastmodifiedby(String lastmodifiedby) {
        this.lastmodifiedby = lastmodifiedby;
    }

    public Timestamp getLastmodifieddate() {
        return lastmodifieddate;
    }

    public void setLastmodifieddate(Timestamp lastmodifieddate) {
        this.lastmodifieddate = lastmodifieddate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Weeknumber that = (Weeknumber) o;

        if (weeknumberid != that.weeknumberid) return false;
        if (weeknumber != null ? !weeknumber.equals(that.weeknumber) : that.weeknumber != null) return false;
        if (financialyear != null ? !financialyear.equals(that.financialyear) : that.financialyear != null)
            return false;
        if (weekstartdate != null ? !weekstartdate.equals(that.weekstartdate) : that.weekstartdate != null)
            return false;
        if (weekenddate != null ? !weekenddate.equals(that.weekenddate) : that.weekenddate != null) return false;
        if (createdby != null ? !createdby.equals(that.createdby) : that.createdby != null) return false;
        if (createddate != null ? !createddate.equals(that.createddate) : that.createddate != null) return false;
        if (lastmodifiedby != null ? !lastmodifiedby.equals(that.lastmodifiedby) : that.lastmodifiedby != null)
            return false;
        if (lastmodifieddate != null ? !lastmodifieddate.equals(that.lastmodifieddate) : that.lastmodifieddate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (weeknumberid ^ (weeknumberid >>> 32));
        result = 31 * result + (weeknumber != null ? weeknumber.hashCode() : 0);
        result = 31 * result + (financialyear != null ? financialyear.hashCode() : 0);
        result = 31 * result + (weekstartdate != null ? weekstartdate.hashCode() : 0);
        result = 31 * result + (weekenddate != null ? weekenddate.hashCode() : 0);
        result = 31 * result + (createdby != null ? createdby.hashCode() : 0);
        result = 31 * result + (createddate != null ? createddate.hashCode() : 0);
        result = 31 * result + (lastmodifiedby != null ? lastmodifiedby.hashCode() : 0);
        result = 31 * result + (lastmodifieddate != null ? lastmodifieddate.hashCode() : 0);
        return result;
    }
}
