package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Relative {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Avatar", nullable = false, length = 300)
    private String avatar;
    @Basic
    @Column(name = "RiderID", nullable = false, length = 50)
    private String riderId;
    @Basic
    @Column(name = "FNameRelative", nullable = true, length = 50)
    private String fNameRelative;
    @Basic
    @Column(name = "LNameRelative", nullable = true, length = 50)
    private String lNameRelative;
    @Basic
    @Column(name = "MobileRelative", nullable = true, length = 20)
    private String mobileRelative;
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
    @Column(name = "CountryCode", nullable = true, length = 4)
    private String countryCode;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public String getfNameRelative() {
        return fNameRelative;
    }

    public void setfNameRelative(String fNameRelative) {
        this.fNameRelative = fNameRelative;
    }

    public String getlNameRelative() {
        return lNameRelative;
    }

    public void setlNameRelative(String lNameRelative) {
        this.lNameRelative = lNameRelative;
    }

    public String getMobileRelative() {
        return mobileRelative;
    }

    public void setMobileRelative(String mobileRelative) {
        this.mobileRelative = mobileRelative;
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

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Relative relative = (Relative) o;

        if (avatar != null ? !avatar.equals(relative.avatar) : relative.avatar != null) return false;
        if (riderId != null ? !riderId.equals(relative.riderId) : relative.riderId != null) return false;
        if (fNameRelative != null ? !fNameRelative.equals(relative.fNameRelative) : relative.fNameRelative != null)
            return false;
        if (lNameRelative != null ? !lNameRelative.equals(relative.lNameRelative) : relative.lNameRelative != null)
            return false;
        if (mobileRelative != null ? !mobileRelative.equals(relative.mobileRelative) : relative.mobileRelative != null)
            return false;
        if (createdBy != null ? !createdBy.equals(relative.createdBy) : relative.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(relative.createdDate) : relative.createdDate != null)
            return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(relative.lastModifiedBy) : relative.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(relative.lastModifiedDate) : relative.lastModifiedDate != null)
            return false;
        if (countryCode != null ? !countryCode.equals(relative.countryCode) : relative.countryCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = avatar != null ? avatar.hashCode() : 0;
        result = 31 * result + (riderId != null ? riderId.hashCode() : 0);
        result = 31 * result + (fNameRelative != null ? fNameRelative.hashCode() : 0);
        result = 31 * result + (lNameRelative != null ? lNameRelative.hashCode() : 0);
        result = 31 * result + (mobileRelative != null ? mobileRelative.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        return result;
    }
}
