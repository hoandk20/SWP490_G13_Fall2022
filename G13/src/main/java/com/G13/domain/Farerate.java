package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "farerate")
public class Farerate {
    @Id
    @Column(name = "FareRateId", nullable = false, length = 50)
    private String id;

    @Column(name = "CountryCode", nullable = false, length = 4)
    private String countryCode;

    @Column(name = "CityID", nullable = false)
    private Integer cityID;

    @Column(name = "Company")
    private Integer company;

    @Column(name = "Content", nullable = false)
    private Double content;

    @Column(name = "Latitude", nullable = false)
    private Double latitude;

    @Column(name = "Longitude", nullable = false)
    private Double longitude;

    @Column(name = "TimeStart", nullable = false)
    private Integer timeStart;

    @Column(name = "TimeEnd", nullable = false)
    private Integer timeEnd;

    @Column(name = "dayOfWeeks", length = 20)
    private String dayOfWeeks;

    @Column(name = "CompanyID")
    private Integer companyID;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "MinStart", nullable = false)
    private Byte minStart;

    @Column(name = "MinEnd", nullable = false)
    private Byte minEnd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    public Integer getCompany() {
        return company;
    }

    public void setCompany(Integer company) {
        this.company = company;
    }

    public Double getContent() {
        return content;
    }

    public void setContent(Double content) {
        this.content = content;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Integer timeStart) {
        this.timeStart = timeStart;
    }

    public Integer getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Integer timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getDayOfWeeks() {
        return dayOfWeeks;
    }

    public void setDayOfWeeks(String dayOfWeeks) {
        this.dayOfWeeks = dayOfWeeks;
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Instant lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Byte getMinStart() {
        return minStart;
    }

    public void setMinStart(Byte minStart) {
        this.minStart = minStart;
    }

    public Byte getMinEnd() {
        return minEnd;
    }

    public void setMinEnd(Byte minEnd) {
        this.minEnd = minEnd;
    }

}