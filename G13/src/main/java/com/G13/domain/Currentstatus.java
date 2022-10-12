package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "currentstatus")
public class Currentstatus {
    @Id
    @Column(name = "DriverID", nullable = false, length = 50)
    private String id;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "CurrentLatitude", nullable = false)
    private Double currentLatitude;

    @Column(name = "CurrentLongtitude", nullable = false)
    private Double currentLongtitude;

    @Column(name = "CurrentStatus", nullable = false, length = 2)
    private String currentStatus;

    @Column(name = "Level", length = 4)
    private String level;

    @Column(name = "Level2", length = 4)
    private String level2;

    @Column(name = "Level3", length = 4)
    private String level3;

    @Column(name = "CurrentTripId", length = 50)
    private String currentTripId;

    @Column(name = "NoWeekTrips", nullable = false)
    private Short noWeekTrips;

    @Column(name = "NoDayTrips", nullable = false)
    private Short noDayTrips;

    @Column(name = "NoReponseDayTrips", nullable = false)
    private Short noReponseDayTrips;

    @Column(name = "NoCancelledDayTrips", nullable = false)
    private Short noCancelledDayTrips;

    @Column(name = "NoCancelledWTrips", nullable = false)
    private Short noCancelledWTrips;

    @Column(name = "NoReponseWTrips", nullable = false)
    private Short noReponseWTrips;

    @Column(name = "NoRequiredTripInWeek", nullable = false)
    private Short noRequiredTripInWeek;

    @Column(name = "WeekStartDate")
    private Instant weekStartDate;

    @Column(name = "SelfControlled")
    private Boolean selfControlled;

    @Column(name = "CompanyID", nullable = false)
    private Integer companyID;

    @Column(name = "CompanyGroupID")
    private Integer companyGroupID;

    @Column(name = "LanguageCode", length = 4)
    private String languageCode;

    @Column(name = "AutoOnline", nullable = false)
    private Boolean autoOnline = false;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Instant lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Double getCurrentLatitude() {
        return currentLatitude;
    }

    public void setCurrentLatitude(Double currentLatitude) {
        this.currentLatitude = currentLatitude;
    }

    public Double getCurrentLongtitude() {
        return currentLongtitude;
    }

    public void setCurrentLongtitude(Double currentLongtitude) {
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

    public Short getNoWeekTrips() {
        return noWeekTrips;
    }

    public void setNoWeekTrips(Short noWeekTrips) {
        this.noWeekTrips = noWeekTrips;
    }

    public Short getNoDayTrips() {
        return noDayTrips;
    }

    public void setNoDayTrips(Short noDayTrips) {
        this.noDayTrips = noDayTrips;
    }

    public Short getNoReponseDayTrips() {
        return noReponseDayTrips;
    }

    public void setNoReponseDayTrips(Short noReponseDayTrips) {
        this.noReponseDayTrips = noReponseDayTrips;
    }

    public Short getNoCancelledDayTrips() {
        return noCancelledDayTrips;
    }

    public void setNoCancelledDayTrips(Short noCancelledDayTrips) {
        this.noCancelledDayTrips = noCancelledDayTrips;
    }

    public Short getNoCancelledWTrips() {
        return noCancelledWTrips;
    }

    public void setNoCancelledWTrips(Short noCancelledWTrips) {
        this.noCancelledWTrips = noCancelledWTrips;
    }

    public Short getNoReponseWTrips() {
        return noReponseWTrips;
    }

    public void setNoReponseWTrips(Short noReponseWTrips) {
        this.noReponseWTrips = noReponseWTrips;
    }

    public Short getNoRequiredTripInWeek() {
        return noRequiredTripInWeek;
    }

    public void setNoRequiredTripInWeek(Short noRequiredTripInWeek) {
        this.noRequiredTripInWeek = noRequiredTripInWeek;
    }

    public Instant getWeekStartDate() {
        return weekStartDate;
    }

    public void setWeekStartDate(Instant weekStartDate) {
        this.weekStartDate = weekStartDate;
    }

    public Boolean getSelfControlled() {
        return selfControlled;
    }

    public void setSelfControlled(Boolean selfControlled) {
        this.selfControlled = selfControlled;
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public Integer getCompanyGroupID() {
        return companyGroupID;
    }

    public void setCompanyGroupID(Integer companyGroupID) {
        this.companyGroupID = companyGroupID;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public Boolean getAutoOnline() {
        return autoOnline;
    }

    public void setAutoOnline(Boolean autoOnline) {
        this.autoOnline = autoOnline;
    }

}