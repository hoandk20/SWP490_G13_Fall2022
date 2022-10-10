package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Currentstatus {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DriverID", nullable = false, length = 50)
    private String driverId;
    @Basic
    @Column(name = "LastModifiedDate", nullable = false)
    private Timestamp lastModifiedDate;
    @Basic
    @Column(name = "CurrentLatitude", nullable = false, precision = 0)
    private double currentLatitude;
    @Basic
    @Column(name = "CurrentLongtitude", nullable = false, precision = 0)
    private double currentLongtitude;
    @Basic
    @Column(name = "CurrentStatus", nullable = false, length = 2)
    private String currentStatus;
    @Basic
    @Column(name = "Level", nullable = true, length = 4)
    private String level;
    @Basic
    @Column(name = "Level2", nullable = true, length = 4)
    private String level2;
    @Basic
    @Column(name = "Level3", nullable = true, length = 4)
    private String level3;
    @Basic
    @Column(name = "CurrentTripId", nullable = true, length = 50)
    private String currentTripId;
    @Basic
    @Column(name = "NoWeekTrips", nullable = false)
    private short noWeekTrips;
    @Basic
    @Column(name = "NoDayTrips", nullable = false)
    private short noDayTrips;
    @Basic
    @Column(name = "NoReponseDayTrips", nullable = false)
    private short noReponseDayTrips;
    @Basic
    @Column(name = "NoCancelledDayTrips", nullable = false)
    private short noCancelledDayTrips;
    @Basic
    @Column(name = "NoCancelledWTrips", nullable = false)
    private short noCancelledWTrips;
    @Basic
    @Column(name = "NoReponseWTrips", nullable = false)
    private short noReponseWTrips;
    @Basic
    @Column(name = "NoRequiredTripInWeek", nullable = false)
    private short noRequiredTripInWeek;
    @Basic
    @Column(name = "WeekStartDate", nullable = true)
    private Timestamp weekStartDate;
    @Basic
    @Column(name = "SelfControlled", nullable = true)
    private Boolean selfControlled;
    @Basic
    @Column(name = "CompanyID", nullable = false)
    private int companyId;
    @Basic
    @Column(name = "CompanyGroupID", nullable = true)
    private Integer companyGroupId;
    @Basic
    @Column(name = "LanguageCode", nullable = true, length = 4)
    private String languageCode;
    @Basic
    @Column(name = "AutoOnline", nullable = false)
    private boolean autoOnline;

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public Timestamp getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public double getCurrentLatitude() {
        return currentLatitude;
    }

    public void setCurrentLatitude(double currentLatitude) {
        this.currentLatitude = currentLatitude;
    }

    public double getCurrentLongtitude() {
        return currentLongtitude;
    }

    public void setCurrentLongtitude(double currentLongtitude) {
        this.currentLongtitude = currentLongtitude;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLevel2() {
        return level2;
    }

    public void setLevel2(String level2) {
        this.level2 = level2;
    }

    public String getLevel3() {
        return level3;
    }

    public void setLevel3(String level3) {
        this.level3 = level3;
    }

    public String getCurrentTripId() {
        return currentTripId;
    }

    public void setCurrentTripId(String currentTripId) {
        this.currentTripId = currentTripId;
    }

    public short getNoWeekTrips() {
        return noWeekTrips;
    }

    public void setNoWeekTrips(short noWeekTrips) {
        this.noWeekTrips = noWeekTrips;
    }

    public short getNoDayTrips() {
        return noDayTrips;
    }

    public void setNoDayTrips(short noDayTrips) {
        this.noDayTrips = noDayTrips;
    }

    public short getNoReponseDayTrips() {
        return noReponseDayTrips;
    }

    public void setNoReponseDayTrips(short noReponseDayTrips) {
        this.noReponseDayTrips = noReponseDayTrips;
    }

    public short getNoCancelledDayTrips() {
        return noCancelledDayTrips;
    }

    public void setNoCancelledDayTrips(short noCancelledDayTrips) {
        this.noCancelledDayTrips = noCancelledDayTrips;
    }

    public short getNoCancelledWTrips() {
        return noCancelledWTrips;
    }

    public void setNoCancelledWTrips(short noCancelledWTrips) {
        this.noCancelledWTrips = noCancelledWTrips;
    }

    public short getNoReponseWTrips() {
        return noReponseWTrips;
    }

    public void setNoReponseWTrips(short noReponseWTrips) {
        this.noReponseWTrips = noReponseWTrips;
    }

    public short getNoRequiredTripInWeek() {
        return noRequiredTripInWeek;
    }

    public void setNoRequiredTripInWeek(short noRequiredTripInWeek) {
        this.noRequiredTripInWeek = noRequiredTripInWeek;
    }

    public Timestamp getWeekStartDate() {
        return weekStartDate;
    }

    public void setWeekStartDate(Timestamp weekStartDate) {
        this.weekStartDate = weekStartDate;
    }

    public Boolean getSelfControlled() {
        return selfControlled;
    }

    public void setSelfControlled(Boolean selfControlled) {
        this.selfControlled = selfControlled;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public Integer getCompanyGroupId() {
        return companyGroupId;
    }

    public void setCompanyGroupId(Integer companyGroupId) {
        this.companyGroupId = companyGroupId;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public boolean isAutoOnline() {
        return autoOnline;
    }

    public void setAutoOnline(boolean autoOnline) {
        this.autoOnline = autoOnline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Currentstatus that = (Currentstatus) o;

        if (Double.compare(that.currentLatitude, currentLatitude) != 0) return false;
        if (Double.compare(that.currentLongtitude, currentLongtitude) != 0) return false;
        if (noWeekTrips != that.noWeekTrips) return false;
        if (noDayTrips != that.noDayTrips) return false;
        if (noReponseDayTrips != that.noReponseDayTrips) return false;
        if (noCancelledDayTrips != that.noCancelledDayTrips) return false;
        if (noCancelledWTrips != that.noCancelledWTrips) return false;
        if (noReponseWTrips != that.noReponseWTrips) return false;
        if (noRequiredTripInWeek != that.noRequiredTripInWeek) return false;
        if (companyId != that.companyId) return false;
        if (autoOnline != that.autoOnline) return false;
        if (driverId != null ? !driverId.equals(that.driverId) : that.driverId != null) return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (currentStatus != null ? !currentStatus.equals(that.currentStatus) : that.currentStatus != null)
            return false;
        if (level != null ? !level.equals(that.level) : that.level != null) return false;
        if (level2 != null ? !level2.equals(that.level2) : that.level2 != null) return false;
        if (level3 != null ? !level3.equals(that.level3) : that.level3 != null) return false;
        if (currentTripId != null ? !currentTripId.equals(that.currentTripId) : that.currentTripId != null)
            return false;
        if (weekStartDate != null ? !weekStartDate.equals(that.weekStartDate) : that.weekStartDate != null)
            return false;
        if (selfControlled != null ? !selfControlled.equals(that.selfControlled) : that.selfControlled != null)
            return false;
        if (companyGroupId != null ? !companyGroupId.equals(that.companyGroupId) : that.companyGroupId != null)
            return false;
        if (languageCode != null ? !languageCode.equals(that.languageCode) : that.languageCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = driverId != null ? driverId.hashCode() : 0;
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        temp = Double.doubleToLongBits(currentLatitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(currentLongtitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (currentStatus != null ? currentStatus.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (level2 != null ? level2.hashCode() : 0);
        result = 31 * result + (level3 != null ? level3.hashCode() : 0);
        result = 31 * result + (currentTripId != null ? currentTripId.hashCode() : 0);
        result = 31 * result + (int) noWeekTrips;
        result = 31 * result + (int) noDayTrips;
        result = 31 * result + (int) noReponseDayTrips;
        result = 31 * result + (int) noCancelledDayTrips;
        result = 31 * result + (int) noCancelledWTrips;
        result = 31 * result + (int) noReponseWTrips;
        result = 31 * result + (int) noRequiredTripInWeek;
        result = 31 * result + (weekStartDate != null ? weekStartDate.hashCode() : 0);
        result = 31 * result + (selfControlled != null ? selfControlled.hashCode() : 0);
        result = 31 * result + companyId;
        result = 31 * result + (companyGroupId != null ? companyGroupId.hashCode() : 0);
        result = 31 * result + (languageCode != null ? languageCode.hashCode() : 0);
        result = 31 * result + (autoOnline ? 1 : 0);
        return result;
    }
}
