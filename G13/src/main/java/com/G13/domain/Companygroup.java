package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "companygroup")
public class Companygroup {
    @Id
    @Column(name = "CompanyGroupID", nullable = false)
    private Integer id;

    @Column(name = "Name", nullable = false, length = 100)
    private String name;

    @Column(name = "Logo", length = 120)
    private String logo;

    @Column(name = "Status", nullable = false, length = 2)
    private String status;

    @Column(name = "SelfControl")
    private Boolean selfControl;

    @Column(name = "AddressID", length = 50)
    private String addressID;

    @Column(name = "CountryCode", nullable = false, length = 4)
    private String countryCode;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

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

    @Column(name = "Delivery", nullable = false)
    private Boolean delivery = false;

    @Column(name = "pickup", nullable = false)
    private Boolean pickup = false;

    @Column(name = "Bus", nullable = false)
    private Boolean bus = false;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getSelfControl() {
        return selfControl;
    }

    public void setSelfControl(Boolean selfControl) {
        this.selfControl = selfControl;
    }

    public String getAddressID() {
        return addressID;
    }

    public void setAddressID(String addressID) {
        this.addressID = addressID;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
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

}