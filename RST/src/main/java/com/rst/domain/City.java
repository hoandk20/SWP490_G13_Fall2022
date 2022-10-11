package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "city")
public class City {
    @Id
    @Column(name = "CityID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country countryCode;

    @Column(name = "CityCode", nullable = false, length = 4)
    private String cityCode;

    @Column(name = "TimeZone", nullable = false, length = 50)
    private String timeZone;

    @Column(name = "ZoneOffset", nullable = false)
    private Integer zoneOffset;

    @Column(name = "Latitute", nullable = false)
    private Double latitute;

    @Column(name = "Longtitude", nullable = false)
    private Double longtitude;

    @Column(name = "VATRate", nullable = false)
    private Float vATRate;

    @Column(name = "Eco", nullable = false)
    private Boolean eco = false;

    @Column(name = "EcoHuge", nullable = false)
    private Boolean ecoHuge = false;

    @Column(name = "Biz", nullable = false)
    private Boolean biz = false;

    @Column(name = "BizHuge", nullable = false)
    private Boolean bizHuge = false;

    @Column(name = "Lux", nullable = false)
    private Boolean lux = false;

    @Column(name = "LuxHuge", nullable = false)
    private Boolean luxHuge = false;

    @Column(name = "Saving", nullable = false)
    private Boolean saving = false;

    @Column(name = "SuperSav", nullable = false)
    private Boolean superSav = false;

    @Column(name = "Bike", nullable = false)
    private Boolean bike = false;

    @Column(name = "Operating", nullable = false)
    private Boolean operating = false;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "DriverMinRate")
    private Float driverMinRate;

    @Column(name = "MaxCancelRate", nullable = false)
    private Float maxCancelRate;

    @Column(name = "RequestDistance", nullable = false)
    private Float requestDistance;

    @Column(name = "WaitingTime", nullable = false)
    private Short waitingTime;

    @Column(name = "Delivery", nullable = false)
    private Boolean delivery = false;

    @Column(name = "pickup", nullable = false)
    private Boolean pickup = false;

    @Column(name = "Bus", nullable = false)
    private Boolean bus = false;

    @Column(name = "address", length = 150)
    private String address;

    @Column(name = "TimeOutLimit", nullable = false)
    private Short timeOutLimit;

    @Column(name = "CalExtraFare", nullable = false)
    private Boolean calExtraFare = false;

    @Column(name = "MinBalance", nullable = false)
    private Double minBalance;

    @Column(name = "MaxNoRequestDriver", nullable = false)
    private Integer maxNoRequestDriver;

    @Column(name = "DisForCalExtraFare", nullable = false)
    private Float disForCalExtraFare;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Country getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Country countryCode) {
        this.countryCode = countryCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Integer getZoneOffset() {
        return zoneOffset;
    }

    public void setZoneOffset(Integer zoneOffset) {
        this.zoneOffset = zoneOffset;
    }

    public Double getLatitute() {
        return latitute;
    }

    public void setLatitute(Double latitute) {
        this.latitute = latitute;
    }

    public Double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(Double longtitude) {
        this.longtitude = longtitude;
    }

    public Float getVATRate() {
        return vATRate;
    }

    public void setVATRate(Float vATRate) {
        this.vATRate = vATRate;
    }

    public Boolean getEco() {
        return eco;
    }

    public void setEco(Boolean eco) {
        this.eco = eco;
    }

    public Boolean getEcoHuge() {
        return ecoHuge;
    }

    public void setEcoHuge(Boolean ecoHuge) {
        this.ecoHuge = ecoHuge;
    }

    public Boolean getBiz() {
        return biz;
    }

    public void setBiz(Boolean biz) {
        this.biz = biz;
    }

    public Boolean getBizHuge() {
        return bizHuge;
    }

    public void setBizHuge(Boolean bizHuge) {
        this.bizHuge = bizHuge;
    }

    public Boolean getLux() {
        return lux;
    }

    public void setLux(Boolean lux) {
        this.lux = lux;
    }

    public Boolean getLuxHuge() {
        return luxHuge;
    }

    public void setLuxHuge(Boolean luxHuge) {
        this.luxHuge = luxHuge;
    }

    public Boolean getSaving() {
        return saving;
    }

    public void setSaving(Boolean saving) {
        this.saving = saving;
    }

    public Boolean getSuperSav() {
        return superSav;
    }

    public void setSuperSav(Boolean superSav) {
        this.superSav = superSav;
    }

    public Boolean getBike() {
        return bike;
    }

    public void setBike(Boolean bike) {
        this.bike = bike;
    }

    public Boolean getOperating() {
        return operating;
    }

    public void setOperating(Boolean operating) {
        this.operating = operating;
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

    public Float getDriverMinRate() {
        return driverMinRate;
    }

    public void setDriverMinRate(Float driverMinRate) {
        this.driverMinRate = driverMinRate;
    }

    public Float getMaxCancelRate() {
        return maxCancelRate;
    }

    public void setMaxCancelRate(Float maxCancelRate) {
        this.maxCancelRate = maxCancelRate;
    }

    public Float getRequestDistance() {
        return requestDistance;
    }

    public void setRequestDistance(Float requestDistance) {
        this.requestDistance = requestDistance;
    }

    public Short getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(Short waitingTime) {
        this.waitingTime = waitingTime;
    }

    public Boolean getDelivery() {
        return delivery;
    }

    public void setDelivery(Boolean delivery) {
        this.delivery = delivery;
    }

    public Boolean getPickup() {
        return pickup;
    }

    public void setPickup(Boolean pickup) {
        this.pickup = pickup;
    }

    public Boolean getBus() {
        return bus;
    }

    public void setBus(Boolean bus) {
        this.bus = bus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Short getTimeOutLimit() {
        return timeOutLimit;
    }

    public void setTimeOutLimit(Short timeOutLimit) {
        this.timeOutLimit = timeOutLimit;
    }

    public Boolean getCalExtraFare() {
        return calExtraFare;
    }

    public void setCalExtraFare(Boolean calExtraFare) {
        this.calExtraFare = calExtraFare;
    }

    public Double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(Double minBalance) {
        this.minBalance = minBalance;
    }

    public Integer getMaxNoRequestDriver() {
        return maxNoRequestDriver;
    }

    public void setMaxNoRequestDriver(Integer maxNoRequestDriver) {
        this.maxNoRequestDriver = maxNoRequestDriver;
    }

    public Float getDisForCalExtraFare() {
        return disForCalExtraFare;
    }

    public void setDisForCalExtraFare(Float disForCalExtraFare) {
        this.disForCalExtraFare = disForCalExtraFare;
    }

}