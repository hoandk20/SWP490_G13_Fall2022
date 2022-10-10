package com.example.userservice.domain;

import javax.persistence.*;

@Entity
public class Version {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "VersionId", nullable = false)
    private int versionId;
    @Basic
    @Column(name = "AndroidRider", nullable = false)
    private short androidRider;
    @Basic
    @Column(name = "AndroidDriver", nullable = false)
    private short androidDriver;
    @Basic
    @Column(name = "IosRider", nullable = false, precision = 0)
    private double iosRider;
    @Basic
    @Column(name = "IosDriver", nullable = false, precision = 0)
    private double iosDriver;
    @Basic
    @Column(name = "Current", nullable = false)
    private short current;
    @Basic
    @Column(name = "AndroidRiderName", nullable = true, length = 45)
    private String androidRiderName;
    @Basic
    @Column(name = "AndroidDriverName", nullable = true, length = 45)
    private String androidDriverName;
    @Basic
    @Column(name = "IosRiderName", nullable = true, length = 45)
    private String iosRiderName;
    @Basic
    @Column(name = "IosDriverName", nullable = true, length = 45)
    private String iosDriverName;
    @Basic
    @Column(name = "AndroidRiderRequired", nullable = false)
    private int androidRiderRequired;
    @Basic
    @Column(name = "AndroidDriverRequired", nullable = false)
    private int androidDriverRequired;
    @Basic
    @Column(name = "IosRiderRequired", nullable = false, precision = 0)
    private double iosRiderRequired;
    @Basic
    @Column(name = "IosDriverRequired", nullable = false, precision = 0)
    private double iosDriverRequired;

    public int getVersionId() {
        return versionId;
    }

    public void setVersionId(int versionId) {
        this.versionId = versionId;
    }

    public short getAndroidRider() {
        return androidRider;
    }

    public void setAndroidRider(short androidRider) {
        this.androidRider = androidRider;
    }

    public short getAndroidDriver() {
        return androidDriver;
    }

    public void setAndroidDriver(short androidDriver) {
        this.androidDriver = androidDriver;
    }

    public double getIosRider() {
        return iosRider;
    }

    public void setIosRider(double iosRider) {
        this.iosRider = iosRider;
    }

    public double getIosDriver() {
        return iosDriver;
    }

    public void setIosDriver(double iosDriver) {
        this.iosDriver = iosDriver;
    }

    public short getCurrent() {
        return current;
    }

    public void setCurrent(short current) {
        this.current = current;
    }

    public String getAndroidRiderName() {
        return androidRiderName;
    }

    public void setAndroidRiderName(String androidRiderName) {
        this.androidRiderName = androidRiderName;
    }

    public String getAndroidDriverName() {
        return androidDriverName;
    }

    public void setAndroidDriverName(String androidDriverName) {
        this.androidDriverName = androidDriverName;
    }

    public String getIosRiderName() {
        return iosRiderName;
    }

    public void setIosRiderName(String iosRiderName) {
        this.iosRiderName = iosRiderName;
    }

    public String getIosDriverName() {
        return iosDriverName;
    }

    public void setIosDriverName(String iosDriverName) {
        this.iosDriverName = iosDriverName;
    }

    public int getAndroidRiderRequired() {
        return androidRiderRequired;
    }

    public void setAndroidRiderRequired(int androidRiderRequired) {
        this.androidRiderRequired = androidRiderRequired;
    }

    public int getAndroidDriverRequired() {
        return androidDriverRequired;
    }

    public void setAndroidDriverRequired(int androidDriverRequired) {
        this.androidDriverRequired = androidDriverRequired;
    }

    public double getIosRiderRequired() {
        return iosRiderRequired;
    }

    public void setIosRiderRequired(double iosRiderRequired) {
        this.iosRiderRequired = iosRiderRequired;
    }

    public double getIosDriverRequired() {
        return iosDriverRequired;
    }

    public void setIosDriverRequired(double iosDriverRequired) {
        this.iosDriverRequired = iosDriverRequired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Version version = (Version) o;

        if (versionId != version.versionId) return false;
        if (androidRider != version.androidRider) return false;
        if (androidDriver != version.androidDriver) return false;
        if (Double.compare(version.iosRider, iosRider) != 0) return false;
        if (Double.compare(version.iosDriver, iosDriver) != 0) return false;
        if (current != version.current) return false;
        if (androidRiderRequired != version.androidRiderRequired) return false;
        if (androidDriverRequired != version.androidDriverRequired) return false;
        if (Double.compare(version.iosRiderRequired, iosRiderRequired) != 0) return false;
        if (Double.compare(version.iosDriverRequired, iosDriverRequired) != 0) return false;
        if (androidRiderName != null ? !androidRiderName.equals(version.androidRiderName) : version.androidRiderName != null)
            return false;
        if (androidDriverName != null ? !androidDriverName.equals(version.androidDriverName) : version.androidDriverName != null)
            return false;
        if (iosRiderName != null ? !iosRiderName.equals(version.iosRiderName) : version.iosRiderName != null)
            return false;
        if (iosDriverName != null ? !iosDriverName.equals(version.iosDriverName) : version.iosDriverName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = versionId;
        result = 31 * result + (int) androidRider;
        result = 31 * result + (int) androidDriver;
        temp = Double.doubleToLongBits(iosRider);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(iosDriver);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) current;
        result = 31 * result + (androidRiderName != null ? androidRiderName.hashCode() : 0);
        result = 31 * result + (androidDriverName != null ? androidDriverName.hashCode() : 0);
        result = 31 * result + (iosRiderName != null ? iosRiderName.hashCode() : 0);
        result = 31 * result + (iosDriverName != null ? iosDriverName.hashCode() : 0);
        result = 31 * result + androidRiderRequired;
        result = 31 * result + androidDriverRequired;
        temp = Double.doubleToLongBits(iosRiderRequired);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(iosDriverRequired);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
