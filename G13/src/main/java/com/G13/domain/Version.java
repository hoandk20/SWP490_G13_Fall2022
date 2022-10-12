package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "version")
public class Version {
    @Id
    @Column(name = "VersionId", nullable = false)
    private Integer id;

    @Column(name = "AndroidRider", nullable = false)
    private Short androidRider;

    @Column(name = "AndroidDriver", nullable = false)
    private Short androidDriver;

    @Column(name = "IosRider", nullable = false)
    private Float iosRider;

    @Column(name = "IosDriver", nullable = false)
    private Float iosDriver;

    @Column(name = "Current", nullable = false)
    private Short current;

    @Column(name = "AndroidRiderName", length = 45)
    private String androidRiderName;

    @Column(name = "AndroidDriverName", length = 45)
    private String androidDriverName;

    @Column(name = "IosRiderName", length = 45)
    private String iosRiderName;

    @Column(name = "IosDriverName", length = 45)
    private String iosDriverName;

    @Column(name = "AndroidRiderRequired", nullable = false)
    private Integer androidRiderRequired;

    @Column(name = "AndroidDriverRequired", nullable = false)
    private Integer androidDriverRequired;

    @Column(name = "IosRiderRequired", nullable = false)
    private Float iosRiderRequired;

    @Column(name = "IosDriverRequired", nullable = false)
    private Float iosDriverRequired;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getAndroidRider() {
        return androidRider;
    }

    public void setAndroidRider(Short androidRider) {
        this.androidRider = androidRider;
    }

    public Short getAndroidDriver() {
        return androidDriver;
    }

    public void setAndroidDriver(Short androidDriver) {
        this.androidDriver = androidDriver;
    }

    public Float getIosRider() {
        return iosRider;
    }

    public void setIosRider(Float iosRider) {
        this.iosRider = iosRider;
    }

    public Float getIosDriver() {
        return iosDriver;
    }

    public void setIosDriver(Float iosDriver) {
        this.iosDriver = iosDriver;
    }

    public Short getCurrent() {
        return current;
    }

    public void setCurrent(Short current) {
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

    public Integer getAndroidRiderRequired() {
        return androidRiderRequired;
    }

    public void setAndroidRiderRequired(Integer androidRiderRequired) {
        this.androidRiderRequired = androidRiderRequired;
    }

    public Integer getAndroidDriverRequired() {
        return androidDriverRequired;
    }

    public void setAndroidDriverRequired(Integer androidDriverRequired) {
        this.androidDriverRequired = androidDriverRequired;
    }

    public Float getIosRiderRequired() {
        return iosRiderRequired;
    }

    public void setIosRiderRequired(Float iosRiderRequired) {
        this.iosRiderRequired = iosRiderRequired;
    }

    public Float getIosDriverRequired() {
        return iosDriverRequired;
    }

    public void setIosDriverRequired(Float iosDriverRequired) {
        this.iosDriverRequired = iosDriverRequired;
    }

}