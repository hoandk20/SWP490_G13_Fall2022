package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Citylocation {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CityLocationID", nullable = false)
    private int cityLocationId;
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
    @Column(name = "address", nullable = true, length = 150)
    private String address;
    @Basic
    @Column(name = "countryCode", nullable = true, length = 4)
    private String countryCode;
    @Basic
    @Column(name = "CityId", nullable = false)
    private int cityId;
    @Basic
    @Column(name = "ColNo", nullable = false)
    private int colNo;
    @Basic
    @Column(name = "RowNo", nullable = false)
    private int rowNo;

    public int getCityLocationId() {
        return cityLocationId;
    }

    public void setCityLocationId(int cityLocationId) {
        this.cityLocationId = cityLocationId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public int getColNo() {
        return colNo;
    }

    public void setColNo(int colNo) {
        this.colNo = colNo;
    }

    public int getRowNo() {
        return rowNo;
    }

    public void setRowNo(int rowNo) {
        this.rowNo = rowNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Citylocation that = (Citylocation) o;

        if (cityLocationId != that.cityLocationId) return false;
        if (cityId != that.cityId) return false;
        if (colNo != that.colNo) return false;
        if (rowNo != that.rowNo) return false;
        if (lat != null ? !lat.equals(that.lat) : that.lat != null) return false;
        if (lng != null ? !lng.equals(that.lng) : that.lng != null) return false;
        if (maxLat != null ? !maxLat.equals(that.maxLat) : that.maxLat != null) return false;
        if (minLat != null ? !minLat.equals(that.minLat) : that.minLat != null) return false;
        if (maxLng != null ? !maxLng.equals(that.maxLng) : that.maxLng != null) return false;
        if (minLng != null ? !minLng.equals(that.minLng) : that.minLng != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cityLocationId;
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
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + cityId;
        result = 31 * result + colNo;
        result = 31 * result + rowNo;
        return result;
    }
}
