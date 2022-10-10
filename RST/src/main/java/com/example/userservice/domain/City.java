package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class City {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CityID", nullable = false)
    private int cityId;
    @Basic
    @Column(name = "CountryCode", nullable = false, length = 4)
    private String countryCode;
    @Basic
    @Column(name = "CityCode", nullable = false, length = 4)
    private String cityCode;
    @Basic
    @Column(name = "TimeZone", nullable = false, length = 50)
    private String timeZone;
    @Basic
    @Column(name = "ZoneOffset", nullable = false)
    private int zoneOffset;
    @Basic
    @Column(name = "Latitute", nullable = false, precision = 0)
    private double latitute;
    @Basic
    @Column(name = "Longtitude", nullable = false, precision = 0)
    private double longtitude;
    @Basic
    @Column(name = "VATRate", nullable = false, precision = 0)
    private double vatRate;
    @Basic
    @Column(name = "Eco", nullable = false)
    private boolean eco;
    @Basic
    @Column(name = "EcoHuge", nullable = false)
    private boolean ecoHuge;
    @Basic
    @Column(name = "Biz", nullable = false)
    private boolean biz;
    @Basic
    @Column(name = "BizHuge", nullable = false)
    private boolean bizHuge;
    @Basic
    @Column(name = "Lux", nullable = false)
    private boolean lux;
    @Basic
    @Column(name = "LuxHuge", nullable = false)
    private boolean luxHuge;
    @Basic
    @Column(name = "Saving", nullable = false)
    private boolean saving;
    @Basic
    @Column(name = "SuperSav", nullable = false)
    private boolean superSav;
    @Basic
    @Column(name = "Bike", nullable = false)
    private boolean bike;
    @Basic
    @Column(name = "Operating", nullable = false)
    private boolean operating;
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
    @Column(name = "DriverMinRate", nullable = true, precision = 0)
    private Double driverMinRate;
    @Basic
    @Column(name = "MaxCancelRate", nullable = false, precision = 0)
    private double maxCancelRate;
    @Basic
    @Column(name = "RequestDistance", nullable = false, precision = 0)
    private double requestDistance;
    @Basic
    @Column(name = "WaitingTime", nullable = false)
    private short waitingTime;
    @Basic
    @Column(name = "Delivery", nullable = false)
    private boolean delivery;
    @Basic
    @Column(name = "pickup", nullable = false)
    private boolean pickup;
    @Basic
    @Column(name = "Bus", nullable = false)
    private boolean bus;
    @Basic
    @Column(name = "address", nullable = true, length = 150)
    private String address;
    @Basic
    @Column(name = "TimeOutLimit", nullable = false)
    private short timeOutLimit;
    @Basic
    @Column(name = "CalExtraFare", nullable = false)
    private boolean calExtraFare;
    @Basic
    @Column(name = "MinBalance", nullable = false, precision = 0)
    private double minBalance;
    @Basic
    @Column(name = "MaxNoRequestDriver", nullable = false)
    private int maxNoRequestDriver;
    @Basic
    @Column(name = "DisForCalExtraFare", nullable = false, precision = 0)
    private double disForCalExtraFare;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
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

    public int getZoneOffset() {
        return zoneOffset;
    }

    public void setZoneOffset(int zoneOffset) {
        this.zoneOffset = zoneOffset;
    }

    public double getLatitute() {
        return latitute;
    }

    public void setLatitute(double latitute) {
        this.latitute = latitute;
    }

    public double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
    }

    public double getVatRate() {
        return vatRate;
    }

    public void setVatRate(double vatRate) {
        this.vatRate = vatRate;
    }

    public boolean isEco() {
        return eco;
    }

    public void setEco(boolean eco) {
        this.eco = eco;
    }

    public boolean isEcoHuge() {
        return ecoHuge;
    }

    public void setEcoHuge(boolean ecoHuge) {
        this.ecoHuge = ecoHuge;
    }

    public boolean isBiz() {
        return biz;
    }

    public void setBiz(boolean biz) {
        this.biz = biz;
    }

    public boolean isBizHuge() {
        return bizHuge;
    }

    public void setBizHuge(boolean bizHuge) {
        this.bizHuge = bizHuge;
    }

    public boolean isLux() {
        return lux;
    }

    public void setLux(boolean lux) {
        this.lux = lux;
    }

    public boolean isLuxHuge() {
        return luxHuge;
    }

    public void setLuxHuge(boolean luxHuge) {
        this.luxHuge = luxHuge;
    }

    public boolean isSaving() {
        return saving;
    }

    public void setSaving(boolean saving) {
        this.saving = saving;
    }

    public boolean isSuperSav() {
        return superSav;
    }

    public void setSuperSav(boolean superSav) {
        this.superSav = superSav;
    }

    public boolean isBike() {
        return bike;
    }

    public void setBike(boolean bike) {
        this.bike = bike;
    }

    public boolean isOperating() {
        return operating;
    }

    public void setOperating(boolean operating) {
        this.operating = operating;
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

    public Double getDriverMinRate() {
        return driverMinRate;
    }

    public void setDriverMinRate(Double driverMinRate) {
        this.driverMinRate = driverMinRate;
    }

    public double getMaxCancelRate() {
        return maxCancelRate;
    }

    public void setMaxCancelRate(double maxCancelRate) {
        this.maxCancelRate = maxCancelRate;
    }

    public double getRequestDistance() {
        return requestDistance;
    }

    public void setRequestDistance(double requestDistance) {
        this.requestDistance = requestDistance;
    }

    public short getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(short waitingTime) {
        this.waitingTime = waitingTime;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public boolean isPickup() {
        return pickup;
    }

    public void setPickup(boolean pickup) {
        this.pickup = pickup;
    }

    public boolean isBus() {
        return bus;
    }

    public void setBus(boolean bus) {
        this.bus = bus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public short getTimeOutLimit() {
        return timeOutLimit;
    }

    public void setTimeOutLimit(short timeOutLimit) {
        this.timeOutLimit = timeOutLimit;
    }

    public boolean isCalExtraFare() {
        return calExtraFare;
    }

    public void setCalExtraFare(boolean calExtraFare) {
        this.calExtraFare = calExtraFare;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public int getMaxNoRequestDriver() {
        return maxNoRequestDriver;
    }

    public void setMaxNoRequestDriver(int maxNoRequestDriver) {
        this.maxNoRequestDriver = maxNoRequestDriver;
    }

    public double getDisForCalExtraFare() {
        return disForCalExtraFare;
    }

    public void setDisForCalExtraFare(double disForCalExtraFare) {
        this.disForCalExtraFare = disForCalExtraFare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (cityId != city.cityId) return false;
        if (zoneOffset != city.zoneOffset) return false;
        if (Double.compare(city.latitute, latitute) != 0) return false;
        if (Double.compare(city.longtitude, longtitude) != 0) return false;
        if (Double.compare(city.vatRate, vatRate) != 0) return false;
        if (eco != city.eco) return false;
        if (ecoHuge != city.ecoHuge) return false;
        if (biz != city.biz) return false;
        if (bizHuge != city.bizHuge) return false;
        if (lux != city.lux) return false;
        if (luxHuge != city.luxHuge) return false;
        if (saving != city.saving) return false;
        if (superSav != city.superSav) return false;
        if (bike != city.bike) return false;
        if (operating != city.operating) return false;
        if (Double.compare(city.maxCancelRate, maxCancelRate) != 0) return false;
        if (Double.compare(city.requestDistance, requestDistance) != 0) return false;
        if (waitingTime != city.waitingTime) return false;
        if (delivery != city.delivery) return false;
        if (pickup != city.pickup) return false;
        if (bus != city.bus) return false;
        if (timeOutLimit != city.timeOutLimit) return false;
        if (calExtraFare != city.calExtraFare) return false;
        if (Double.compare(city.minBalance, minBalance) != 0) return false;
        if (maxNoRequestDriver != city.maxNoRequestDriver) return false;
        if (Double.compare(city.disForCalExtraFare, disForCalExtraFare) != 0) return false;
        if (countryCode != null ? !countryCode.equals(city.countryCode) : city.countryCode != null) return false;
        if (cityCode != null ? !cityCode.equals(city.cityCode) : city.cityCode != null) return false;
        if (timeZone != null ? !timeZone.equals(city.timeZone) : city.timeZone != null) return false;
        if (createdBy != null ? !createdBy.equals(city.createdBy) : city.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(city.createdDate) : city.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(city.lastModifiedBy) : city.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(city.lastModifiedDate) : city.lastModifiedDate != null)
            return false;
        if (driverMinRate != null ? !driverMinRate.equals(city.driverMinRate) : city.driverMinRate != null)
            return false;
        if (address != null ? !address.equals(city.address) : city.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = cityId;
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (cityCode != null ? cityCode.hashCode() : 0);
        result = 31 * result + (timeZone != null ? timeZone.hashCode() : 0);
        result = 31 * result + zoneOffset;
        temp = Double.doubleToLongBits(latitute);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(longtitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(vatRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (eco ? 1 : 0);
        result = 31 * result + (ecoHuge ? 1 : 0);
        result = 31 * result + (biz ? 1 : 0);
        result = 31 * result + (bizHuge ? 1 : 0);
        result = 31 * result + (lux ? 1 : 0);
        result = 31 * result + (luxHuge ? 1 : 0);
        result = 31 * result + (saving ? 1 : 0);
        result = 31 * result + (superSav ? 1 : 0);
        result = 31 * result + (bike ? 1 : 0);
        result = 31 * result + (operating ? 1 : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (driverMinRate != null ? driverMinRate.hashCode() : 0);
        temp = Double.doubleToLongBits(maxCancelRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(requestDistance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) waitingTime;
        result = 31 * result + (delivery ? 1 : 0);
        result = 31 * result + (pickup ? 1 : 0);
        result = 31 * result + (bus ? 1 : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (int) timeOutLimit;
        result = 31 * result + (calExtraFare ? 1 : 0);
        temp = Double.doubleToLongBits(minBalance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + maxNoRequestDriver;
        temp = Double.doubleToLongBits(disForCalExtraFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
