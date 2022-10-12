package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "area")
public class Area {
    @Id
    @Column(name = "AreaID", nullable = false)
    private Integer id;

    @Column(name = "Lat")
    private Double lat;

    @Column(name = "Lng")
    private Double lng;

    @Column(name = "MaxLat")
    private Double maxLat;

    @Column(name = "MinLat")
    private Double minLat;

    @Column(name = "MaxLng")
    private Double maxLng;

    @Column(name = "MinLng")
    private Double minLng;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "TotalRider")
    private Integer totalRider;

    @Column(name = "TotalDriver")
    private Integer totalDriver;

    @Column(name = "TotalActiveRider", nullable = false)
    private Integer totalActiveRider;

    @Column(name = "totalNRRequest", nullable = false)
    private Integer totalNRRequest;

    @Column(name = "totalSavRequest", nullable = false)
    private Integer totalSavRequest;

    @Column(name = "totalEcoRequest", nullable = false)
    private Integer totalEcoRequest;

    @Column(name = "totalNREcoRequest", nullable = false)
    private Integer totalNREcoRequest;

    @Column(name = "totalEco7Request", nullable = false)
    private Integer totalEco7Request;

    @Column(name = "totalNREco7Request", nullable = false)
    private Integer totalNREco7Request;

    @Column(name = "totalBizRequest", nullable = false)
    private Integer totalBizRequest;

    @Column(name = "totalNRBizRequest", nullable = false)
    private Integer totalNRBizRequest;

    @Column(name = "totalBiz7Request", nullable = false)
    private Integer totalBiz7Request;

    @Column(name = "totalNRBiz7Request", nullable = false)
    private Integer totalNRBiz7Request;

    @Column(name = "totalBikRequest", nullable = false)
    private Integer totalBikRequest;

    @Column(name = "totalNRBikRequest", nullable = false)
    private Integer totalNRBikRequest;

    @Column(name = "totalDelRequest", nullable = false)
    private Integer totalDelRequest;

    @Column(name = "totalNRDelRequest", nullable = false)
    private Integer totalNRDelRequest;

    @Column(name = "address", length = 150)
    private String address;

    @Column(name = "savRate", nullable = false)
    private Float savRate;

    @Column(name = "bikRate", nullable = false)
    private Float bikRate;

    @Column(name = "ecoRate", nullable = false)
    private Float ecoRate;

    @Column(name = "eco7Rate", nullable = false)
    private Float eco7Rate;

    @Column(name = "bizRate", nullable = false)
    private Float bizRate;

    @Column(name = "biz7Rate", nullable = false)
    private Float biz7Rate;

    @Column(name = "delRate", nullable = false)
    private Float delRate;

    @Column(name = "countryCode", length = 4)
    private String countryCode;

    @Column(name = "JustRate", nullable = false)
    private Float justRate;

    @Column(name = "TotalJustRequest", nullable = false)
    private Integer totalJustRequest;

    @Column(name = "TotalNRJustRequest", nullable = false)
    private Integer totalNRJustRequest;

    @Column(name = "CityId", nullable = false)
    private Integer cityId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getTotalActiveRider() {
        return totalActiveRider;
    }

    public void setTotalActiveRider(Integer totalActiveRider) {
        this.totalActiveRider = totalActiveRider;
    }

    public Integer getTotalNRRequest() {
        return totalNRRequest;
    }

    public void setTotalNRRequest(Integer totalNRRequest) {
        this.totalNRRequest = totalNRRequest;
    }

    public Integer getTotalSavRequest() {
        return totalSavRequest;
    }

    public void setTotalSavRequest(Integer totalSavRequest) {
        this.totalSavRequest = totalSavRequest;
    }

    public Integer getTotalEcoRequest() {
        return totalEcoRequest;
    }

    public void setTotalEcoRequest(Integer totalEcoRequest) {
        this.totalEcoRequest = totalEcoRequest;
    }

    public Integer getTotalNREcoRequest() {
        return totalNREcoRequest;
    }

    public void setTotalNREcoRequest(Integer totalNREcoRequest) {
        this.totalNREcoRequest = totalNREcoRequest;
    }

    public Integer getTotalEco7Request() {
        return totalEco7Request;
    }

    public void setTotalEco7Request(Integer totalEco7Request) {
        this.totalEco7Request = totalEco7Request;
    }

    public Integer getTotalNREco7Request() {
        return totalNREco7Request;
    }

    public void setTotalNREco7Request(Integer totalNREco7Request) {
        this.totalNREco7Request = totalNREco7Request;
    }

    public Integer getTotalBizRequest() {
        return totalBizRequest;
    }

    public void setTotalBizRequest(Integer totalBizRequest) {
        this.totalBizRequest = totalBizRequest;
    }

    public Integer getTotalNRBizRequest() {
        return totalNRBizRequest;
    }

    public void setTotalNRBizRequest(Integer totalNRBizRequest) {
        this.totalNRBizRequest = totalNRBizRequest;
    }

    public Integer getTotalBiz7Request() {
        return totalBiz7Request;
    }

    public void setTotalBiz7Request(Integer totalBiz7Request) {
        this.totalBiz7Request = totalBiz7Request;
    }

    public Integer getTotalNRBiz7Request() {
        return totalNRBiz7Request;
    }

    public void setTotalNRBiz7Request(Integer totalNRBiz7Request) {
        this.totalNRBiz7Request = totalNRBiz7Request;
    }

    public Integer getTotalBikRequest() {
        return totalBikRequest;
    }

    public void setTotalBikRequest(Integer totalBikRequest) {
        this.totalBikRequest = totalBikRequest;
    }

    public Integer getTotalNRBikRequest() {
        return totalNRBikRequest;
    }

    public void setTotalNRBikRequest(Integer totalNRBikRequest) {
        this.totalNRBikRequest = totalNRBikRequest;
    }

    public Integer getTotalDelRequest() {
        return totalDelRequest;
    }

    public void setTotalDelRequest(Integer totalDelRequest) {
        this.totalDelRequest = totalDelRequest;
    }

    public Integer getTotalNRDelRequest() {
        return totalNRDelRequest;
    }

    public void setTotalNRDelRequest(Integer totalNRDelRequest) {
        this.totalNRDelRequest = totalNRDelRequest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getSavRate() {
        return savRate;
    }

    public void setSavRate(Float savRate) {
        this.savRate = savRate;
    }

    public Float getBikRate() {
        return bikRate;
    }

    public void setBikRate(Float bikRate) {
        this.bikRate = bikRate;
    }

    public Float getEcoRate() {
        return ecoRate;
    }

    public void setEcoRate(Float ecoRate) {
        this.ecoRate = ecoRate;
    }

    public Float getEco7Rate() {
        return eco7Rate;
    }

    public void setEco7Rate(Float eco7Rate) {
        this.eco7Rate = eco7Rate;
    }

    public Float getBizRate() {
        return bizRate;
    }

    public void setBizRate(Float bizRate) {
        this.bizRate = bizRate;
    }

    public Float getBiz7Rate() {
        return biz7Rate;
    }

    public void setBiz7Rate(Float biz7Rate) {
        this.biz7Rate = biz7Rate;
    }

    public Float getDelRate() {
        return delRate;
    }

    public void setDelRate(Float delRate) {
        this.delRate = delRate;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Float getJustRate() {
        return justRate;
    }

    public void setJustRate(Float justRate) {
        this.justRate = justRate;
    }

    public Integer getTotalJustRequest() {
        return totalJustRequest;
    }

    public void setTotalJustRequest(Integer totalJustRequest) {
        this.totalJustRequest = totalJustRequest;
    }

    public Integer getTotalNRJustRequest() {
        return totalNRJustRequest;
    }

    public void setTotalNRJustRequest(Integer totalNRJustRequest) {
        this.totalNRJustRequest = totalNRJustRequest;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

}