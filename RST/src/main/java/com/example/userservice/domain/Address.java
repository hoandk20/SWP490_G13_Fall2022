package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Address {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "AddressID", nullable = false, length = 50)
    private String addressId;
    @Basic
    @Column(name = "CityID", nullable = true)
    private Integer cityId;
    @Basic
    @Column(name = "CountryID", nullable = false, length = 4)
    private String countryId;
    @Basic
    @Column(name = "DistrictID", nullable = true)
    private Integer districtId;
    @Basic
    @Column(name = "AddressDetail", nullable = true, length = 150)
    private String addressDetail;
    @Basic
    @Column(name = "PostalCode", nullable = true, length = 6)
    private String postalCode;
    @Basic
    @Column(name = "Latitude", nullable = true, precision = 0)
    private Double latitude;
    @Basic
    @Column(name = "Longitude", nullable = true, precision = 0)
    private Double longitude;
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

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
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

        Address address = (Address) o;

        if (addressId != null ? !addressId.equals(address.addressId) : address.addressId != null) return false;
        if (cityId != null ? !cityId.equals(address.cityId) : address.cityId != null) return false;
        if (countryId != null ? !countryId.equals(address.countryId) : address.countryId != null) return false;
        if (districtId != null ? !districtId.equals(address.districtId) : address.districtId != null) return false;
        if (addressDetail != null ? !addressDetail.equals(address.addressDetail) : address.addressDetail != null)
            return false;
        if (postalCode != null ? !postalCode.equals(address.postalCode) : address.postalCode != null) return false;
        if (latitude != null ? !latitude.equals(address.latitude) : address.latitude != null) return false;
        if (longitude != null ? !longitude.equals(address.longitude) : address.longitude != null) return false;
        if (createdBy != null ? !createdBy.equals(address.createdBy) : address.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(address.createdDate) : address.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(address.lastModifiedBy) : address.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(address.lastModifiedDate) : address.lastModifiedDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = addressId != null ? addressId.hashCode() : 0;
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        result = 31 * result + (countryId != null ? countryId.hashCode() : 0);
        result = 31 * result + (districtId != null ? districtId.hashCode() : 0);
        result = 31 * result + (addressDetail != null ? addressDetail.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        return result;
    }
}
