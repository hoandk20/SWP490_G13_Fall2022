package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@IdClass(CitynamePK.class)
public class Cityname {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CityID", nullable = false)
    private int cityId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "LanguageCode", nullable = false, length = 4)
    private String languageCode;
    @Basic
    @Column(name = "CityName", nullable = false, length = 30)
    private String cityName;
    @Basic
    @Column(name = "GoogleName", nullable = true, length = 60)
    private String googleName;
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

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getGoogleName() {
        return googleName;
    }

    public void setGoogleName(String googleName) {
        this.googleName = googleName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cityname cityname = (Cityname) o;

        if (cityId != cityname.cityId) return false;
        if (languageCode != null ? !languageCode.equals(cityname.languageCode) : cityname.languageCode != null)
            return false;
        if (cityName != null ? !cityName.equals(cityname.cityName) : cityname.cityName != null) return false;
        if (googleName != null ? !googleName.equals(cityname.googleName) : cityname.googleName != null) return false;
        if (createdBy != null ? !createdBy.equals(cityname.createdBy) : cityname.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(cityname.createdDate) : cityname.createdDate != null)
            return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(cityname.lastModifiedBy) : cityname.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(cityname.lastModifiedDate) : cityname.lastModifiedDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cityId;
        result = 31 * result + (languageCode != null ? languageCode.hashCode() : 0);
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        result = 31 * result + (googleName != null ? googleName.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        return result;
    }
}
