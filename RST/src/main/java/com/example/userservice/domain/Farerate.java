package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Farerate {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "FareRateId", nullable = false, length = 50)
    private String fareRateId;
    @Basic
    @Column(name = "CountryCode", nullable = false, length = 4)
    private String countryCode;
    @Basic
    @Column(name = "CityID", nullable = false)
    private int cityId;
    @Basic
    @Column(name = "Company", nullable = true)
    private Integer company;
    @Basic
    @Column(name = "Content", nullable = false, precision = 0)
    private double content;
    @Basic
    @Column(name = "Latitude", nullable = false, precision = 0)
    private double latitude;
    @Basic
    @Column(name = "Longitude", nullable = false, precision = 0)
    private double longitude;
    @Basic
    @Column(name = "TimeStart", nullable = false)
    private int timeStart;
    @Basic
    @Column(name = "TimeEnd", nullable = false)
    private int timeEnd;
    @Basic
    @Column(name = "dayOfWeeks", nullable = true, length = 20)
    private String dayOfWeeks;
    @Basic
    @Column(name = "CompanyID", nullable = true)
    private Integer companyId;
    @Basic
    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;
    @Basic
    @Column(name = "CreatedDate", nullable = false)
    private Timestamp createdDate;
    @Basic
    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;
    @Basic
    @Column(name = "LastModifiedDate", nullable = false)
    private Timestamp lastModifiedDate;
    @Basic
    @Column(name = "MinStart", nullable = false)
    private byte minStart;
    @Basic
    @Column(name = "MinEnd", nullable = false)
    private byte minEnd;

    public String getFareRateId() {
        return fareRateId;
    }

    public void setFareRateId(String fareRateId) {
        this.fareRateId = fareRateId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public Integer getCompany() {
        return company;
    }

    public void setCompany(Integer company) {
        this.company = company;
    }

    public double getContent() {
        return content;
    }

    public void setContent(double content) {
        this.content = content;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(int timeStart) {
        this.timeStart = timeStart;
    }

    public int getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(int timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getDayOfWeeks() {
        return dayOfWeeks;
    }

    public void setDayOfWeeks(String dayOfWeeks) {
        this.dayOfWeeks = dayOfWeeks;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Timestamp getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public byte getMinStart() {
        return minStart;
    }

    public void setMinStart(byte minStart) {
        this.minStart = minStart;
    }

    public byte getMinEnd() {
        return minEnd;
    }

    public void setMinEnd(byte minEnd) {
        this.minEnd = minEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Farerate farerate = (Farerate) o;

        if (cityId != farerate.cityId) return false;
        if (Double.compare(farerate.content, content) != 0) return false;
        if (Double.compare(farerate.latitude, latitude) != 0) return false;
        if (Double.compare(farerate.longitude, longitude) != 0) return false;
        if (timeStart != farerate.timeStart) return false;
        if (timeEnd != farerate.timeEnd) return false;
        if (minStart != farerate.minStart) return false;
        if (minEnd != farerate.minEnd) return false;
        if (fareRateId != null ? !fareRateId.equals(farerate.fareRateId) : farerate.fareRateId != null) return false;
        if (countryCode != null ? !countryCode.equals(farerate.countryCode) : farerate.countryCode != null)
            return false;
        if (company != null ? !company.equals(farerate.company) : farerate.company != null) return false;
        if (dayOfWeeks != null ? !dayOfWeeks.equals(farerate.dayOfWeeks) : farerate.dayOfWeeks != null) return false;
        if (companyId != null ? !companyId.equals(farerate.companyId) : farerate.companyId != null) return false;
        if (createdBy != null ? !createdBy.equals(farerate.createdBy) : farerate.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(farerate.createdDate) : farerate.createdDate != null)
            return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(farerate.lastModifiedBy) : farerate.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(farerate.lastModifiedDate) : farerate.lastModifiedDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = fareRateId != null ? fareRateId.hashCode() : 0;
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + cityId;
        result = 31 * result + (company != null ? company.hashCode() : 0);
        temp = Double.doubleToLongBits(content);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(latitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(longitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + timeStart;
        result = 31 * result + timeEnd;
        result = 31 * result + (dayOfWeeks != null ? dayOfWeeks.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (int) minStart;
        result = 31 * result + (int) minEnd;
        return result;
    }
}
