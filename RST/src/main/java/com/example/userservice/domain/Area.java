package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Area {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "AreaID", nullable = false)
    private int areaId;
    @Basic
    @Column(name = "Lat", nullable = true, precision = 0)
    private Double lat;
    @Basic
    @Column(name = "Lng", nullable = true, precision = 0)
    private Double lng;
    @Basic
    @Column(name = "MaxLat", nullable = true, precision = 0)
    private Double maxLat;
    @Basic
    @Column(name = "MinLat", nullable = true, precision = 0)
    private Double minLat;
    @Basic
    @Column(name = "MaxLng", nullable = true, precision = 0)
    private Double maxLng;
    @Basic
    @Column(name = "MinLng", nullable = true, precision = 0)
    private Double minLng;
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
    @Column(name = "TotalRider", nullable = true)
    private Integer totalRider;
    @Basic
    @Column(name = "TotalDriver", nullable = true)
    private Integer totalDriver;
    @Basic
    @Column(name = "TotalActiveRider", nullable = false)
    private int totalActiveRider;
    @Basic
    @Column(name = "totalNRRequest", nullable = false)
    private int totalNrRequest;
    @Basic
    @Column(name = "totalSavRequest", nullable = false)
    private int totalSavRequest;
    @Basic
    @Column(name = "totalEcoRequest", nullable = false)
    private int totalEcoRequest;
    @Basic
    @Column(name = "totalNREcoRequest", nullable = false)
    private int totalNrEcoRequest;
    @Basic
    @Column(name = "totalEco7Request", nullable = false)
    private int totalEco7Request;
    @Basic
    @Column(name = "totalNREco7Request", nullable = false)
    private int totalNrEco7Request;
    @Basic
    @Column(name = "totalBizRequest", nullable = false)
    private int totalBizRequest;
    @Basic
    @Column(name = "totalNRBizRequest", nullable = false)
    private int totalNrBizRequest;
    @Basic
    @Column(name = "totalBiz7Request", nullable = false)
    private int totalBiz7Request;
    @Basic
    @Column(name = "totalNRBiz7Request", nullable = false)
    private int totalNrBiz7Request;
    @Basic
    @Column(name = "totalBikRequest", nullable = false)
    private int totalBikRequest;
    @Basic
    @Column(name = "totalNRBikRequest", nullable = false)
    private int totalNrBikRequest;
    @Basic
    @Column(name = "totalDelRequest", nullable = false)
    private int totalDelRequest;
    @Basic
    @Column(name = "totalNRDelRequest", nullable = false)
    private int totalNrDelRequest;
    @Basic
    @Column(name = "address", nullable = true, length = 150)
    private String address;
    @Basic
    @Column(name = "savRate", nullable = false, precision = 0)
    private double savRate;
    @Basic
    @Column(name = "bikRate", nullable = false, precision = 0)
    private double bikRate;
    @Basic
    @Column(name = "ecoRate", nullable = false, precision = 0)
    private double ecoRate;
    @Basic
    @Column(name = "eco7Rate", nullable = false, precision = 0)
    private double eco7Rate;
    @Basic
    @Column(name = "bizRate", nullable = false, precision = 0)
    private double bizRate;
    @Basic
    @Column(name = "biz7Rate", nullable = false, precision = 0)
    private double biz7Rate;
    @Basic
    @Column(name = "delRate", nullable = false, precision = 0)
    private double delRate;
    @Basic
    @Column(name = "countryCode", nullable = true, length = 4)
    private String countryCode;
    @Basic
    @Column(name = "JustRate", nullable = false, precision = 0)
    private double justRate;
    @Basic
    @Column(name = "TotalJustRequest", nullable = false)
    private int totalJustRequest;
    @Basic
    @Column(name = "TotalNRJustRequest", nullable = false)
    private int totalNrJustRequest;
    @Basic
    @Column(name = "CityId", nullable = false)
    private int cityId;

    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getMaxLat() {
        return maxLat;
    }

    public void setMaxLat(Double maxLat) {
        this.maxLat = maxLat;
    }

    public Double getMinLat() {
        return minLat;
    }

    public void setMinLat(Double minLat) {
        this.minLat = minLat;
    }

    public Double getMaxLng() {
        return maxLng;
    }

    public void setMaxLng(Double maxLng) {
        this.maxLng = maxLng;
    }

    public Double getMinLng() {
        return minLng;
    }

    public void setMinLng(Double minLng) {
        this.minLng = minLng;
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

    public Integer getTotalRider() {
        return totalRider;
    }

    public void setTotalRider(Integer totalRider) {
        this.totalRider = totalRider;
    }

    public Integer getTotalDriver() {
        return totalDriver;
    }

    public void setTotalDriver(Integer totalDriver) {
        this.totalDriver = totalDriver;
    }

    public int getTotalActiveRider() {
        return totalActiveRider;
    }

    public void setTotalActiveRider(int totalActiveRider) {
        this.totalActiveRider = totalActiveRider;
    }

    public int getTotalNrRequest() {
        return totalNrRequest;
    }

    public void setTotalNrRequest(int totalNrRequest) {
        this.totalNrRequest = totalNrRequest;
    }

    public int getTotalSavRequest() {
        return totalSavRequest;
    }

    public void setTotalSavRequest(int totalSavRequest) {
        this.totalSavRequest = totalSavRequest;
    }

    public int getTotalEcoRequest() {
        return totalEcoRequest;
    }

    public void setTotalEcoRequest(int totalEcoRequest) {
        this.totalEcoRequest = totalEcoRequest;
    }

    public int getTotalNrEcoRequest() {
        return totalNrEcoRequest;
    }

    public void setTotalNrEcoRequest(int totalNrEcoRequest) {
        this.totalNrEcoRequest = totalNrEcoRequest;
    }

    public int getTotalEco7Request() {
        return totalEco7Request;
    }

    public void setTotalEco7Request(int totalEco7Request) {
        this.totalEco7Request = totalEco7Request;
    }

    public int getTotalNrEco7Request() {
        return totalNrEco7Request;
    }

    public void setTotalNrEco7Request(int totalNrEco7Request) {
        this.totalNrEco7Request = totalNrEco7Request;
    }

    public int getTotalBizRequest() {
        return totalBizRequest;
    }

    public void setTotalBizRequest(int totalBizRequest) {
        this.totalBizRequest = totalBizRequest;
    }

    public int getTotalNrBizRequest() {
        return totalNrBizRequest;
    }

    public void setTotalNrBizRequest(int totalNrBizRequest) {
        this.totalNrBizRequest = totalNrBizRequest;
    }

    public int getTotalBiz7Request() {
        return totalBiz7Request;
    }

    public void setTotalBiz7Request(int totalBiz7Request) {
        this.totalBiz7Request = totalBiz7Request;
    }

    public int getTotalNrBiz7Request() {
        return totalNrBiz7Request;
    }

    public void setTotalNrBiz7Request(int totalNrBiz7Request) {
        this.totalNrBiz7Request = totalNrBiz7Request;
    }

    public int getTotalBikRequest() {
        return totalBikRequest;
    }

    public void setTotalBikRequest(int totalBikRequest) {
        this.totalBikRequest = totalBikRequest;
    }

    public int getTotalNrBikRequest() {
        return totalNrBikRequest;
    }

    public void setTotalNrBikRequest(int totalNrBikRequest) {
        this.totalNrBikRequest = totalNrBikRequest;
    }

    public int getTotalDelRequest() {
        return totalDelRequest;
    }

    public void setTotalDelRequest(int totalDelRequest) {
        this.totalDelRequest = totalDelRequest;
    }

    public int getTotalNrDelRequest() {
        return totalNrDelRequest;
    }

    public void setTotalNrDelRequest(int totalNrDelRequest) {
        this.totalNrDelRequest = totalNrDelRequest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSavRate() {
        return savRate;
    }

    public void setSavRate(double savRate) {
        this.savRate = savRate;
    }

    public double getBikRate() {
        return bikRate;
    }

    public void setBikRate(double bikRate) {
        this.bikRate = bikRate;
    }

    public double getEcoRate() {
        return ecoRate;
    }

    public void setEcoRate(double ecoRate) {
        this.ecoRate = ecoRate;
    }

    public double getEco7Rate() {
        return eco7Rate;
    }

    public void setEco7Rate(double eco7Rate) {
        this.eco7Rate = eco7Rate;
    }

    public double getBizRate() {
        return bizRate;
    }

    public void setBizRate(double bizRate) {
        this.bizRate = bizRate;
    }

    public double getBiz7Rate() {
        return biz7Rate;
    }

    public void setBiz7Rate(double biz7Rate) {
        this.biz7Rate = biz7Rate;
    }

    public double getDelRate() {
        return delRate;
    }

    public void setDelRate(double delRate) {
        this.delRate = delRate;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public double getJustRate() {
        return justRate;
    }

    public void setJustRate(double justRate) {
        this.justRate = justRate;
    }

    public int getTotalJustRequest() {
        return totalJustRequest;
    }

    public void setTotalJustRequest(int totalJustRequest) {
        this.totalJustRequest = totalJustRequest;
    }

    public int getTotalNrJustRequest() {
        return totalNrJustRequest;
    }

    public void setTotalNrJustRequest(int totalNrJustRequest) {
        this.totalNrJustRequest = totalNrJustRequest;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Area area = (Area) o;

        if (areaId != area.areaId) return false;
        if (totalActiveRider != area.totalActiveRider) return false;
        if (totalNrRequest != area.totalNrRequest) return false;
        if (totalSavRequest != area.totalSavRequest) return false;
        if (totalEcoRequest != area.totalEcoRequest) return false;
        if (totalNrEcoRequest != area.totalNrEcoRequest) return false;
        if (totalEco7Request != area.totalEco7Request) return false;
        if (totalNrEco7Request != area.totalNrEco7Request) return false;
        if (totalBizRequest != area.totalBizRequest) return false;
        if (totalNrBizRequest != area.totalNrBizRequest) return false;
        if (totalBiz7Request != area.totalBiz7Request) return false;
        if (totalNrBiz7Request != area.totalNrBiz7Request) return false;
        if (totalBikRequest != area.totalBikRequest) return false;
        if (totalNrBikRequest != area.totalNrBikRequest) return false;
        if (totalDelRequest != area.totalDelRequest) return false;
        if (totalNrDelRequest != area.totalNrDelRequest) return false;
        if (Double.compare(area.savRate, savRate) != 0) return false;
        if (Double.compare(area.bikRate, bikRate) != 0) return false;
        if (Double.compare(area.ecoRate, ecoRate) != 0) return false;
        if (Double.compare(area.eco7Rate, eco7Rate) != 0) return false;
        if (Double.compare(area.bizRate, bizRate) != 0) return false;
        if (Double.compare(area.biz7Rate, biz7Rate) != 0) return false;
        if (Double.compare(area.delRate, delRate) != 0) return false;
        if (Double.compare(area.justRate, justRate) != 0) return false;
        if (totalJustRequest != area.totalJustRequest) return false;
        if (totalNrJustRequest != area.totalNrJustRequest) return false;
        if (cityId != area.cityId) return false;
        if (lat != null ? !lat.equals(area.lat) : area.lat != null) return false;
        if (lng != null ? !lng.equals(area.lng) : area.lng != null) return false;
        if (maxLat != null ? !maxLat.equals(area.maxLat) : area.maxLat != null) return false;
        if (minLat != null ? !minLat.equals(area.minLat) : area.minLat != null) return false;
        if (maxLng != null ? !maxLng.equals(area.maxLng) : area.maxLng != null) return false;
        if (minLng != null ? !minLng.equals(area.minLng) : area.minLng != null) return false;
        if (createdBy != null ? !createdBy.equals(area.createdBy) : area.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(area.createdDate) : area.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(area.lastModifiedBy) : area.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(area.lastModifiedDate) : area.lastModifiedDate != null)
            return false;
        if (totalRider != null ? !totalRider.equals(area.totalRider) : area.totalRider != null) return false;
        if (totalDriver != null ? !totalDriver.equals(area.totalDriver) : area.totalDriver != null) return false;
        if (address != null ? !address.equals(area.address) : area.address != null) return false;
        if (countryCode != null ? !countryCode.equals(area.countryCode) : area.countryCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = areaId;
        result = 31 * result + (lat != null ? lat.hashCode() : 0);
        result = 31 * result + (lng != null ? lng.hashCode() : 0);
        result = 31 * result + (maxLat != null ? maxLat.hashCode() : 0);
        result = 31 * result + (minLat != null ? minLat.hashCode() : 0);
        result = 31 * result + (maxLng != null ? maxLng.hashCode() : 0);
        result = 31 * result + (minLng != null ? minLng.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (totalRider != null ? totalRider.hashCode() : 0);
        result = 31 * result + (totalDriver != null ? totalDriver.hashCode() : 0);
        result = 31 * result + totalActiveRider;
        result = 31 * result + totalNrRequest;
        result = 31 * result + totalSavRequest;
        result = 31 * result + totalEcoRequest;
        result = 31 * result + totalNrEcoRequest;
        result = 31 * result + totalEco7Request;
        result = 31 * result + totalNrEco7Request;
        result = 31 * result + totalBizRequest;
        result = 31 * result + totalNrBizRequest;
        result = 31 * result + totalBiz7Request;
        result = 31 * result + totalNrBiz7Request;
        result = 31 * result + totalBikRequest;
        result = 31 * result + totalNrBikRequest;
        result = 31 * result + totalDelRequest;
        result = 31 * result + totalNrDelRequest;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        temp = Double.doubleToLongBits(savRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(bikRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(ecoRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(eco7Rate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(bizRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(biz7Rate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(delRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        temp = Double.doubleToLongBits(justRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + totalJustRequest;
        result = 31 * result + totalNrJustRequest;
        result = 31 * result + cityId;
        return result;
    }
}
