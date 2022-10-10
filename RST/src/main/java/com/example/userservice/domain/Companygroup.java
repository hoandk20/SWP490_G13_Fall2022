package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Companygroup {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CompanyGroupID", nullable = false)
    private int companyGroupId;
    @Basic
    @Column(name = "Name", nullable = false, length = 100)
    private String name;
    @Basic
    @Column(name = "Logo", nullable = true, length = 120)
    private String logo;
    @Basic
    @Column(name = "Status", nullable = false, length = 2)
    private String status;
    @Basic
    @Column(name = "SelfControl", nullable = true)
    private Boolean selfControl;
    @Basic
    @Column(name = "AddressID", nullable = true, length = 50)
    private String addressId;
    @Basic
    @Column(name = "CountryCode", nullable = false, length = 4)
    private String countryCode;
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
    @Column(name = "Delivery", nullable = false)
    private boolean delivery;
    @Basic
    @Column(name = "pickup", nullable = false)
    private boolean pickup;
    @Basic
    @Column(name = "Bus", nullable = false)
    private boolean bus;

    public int getCompanyGroupId() {
        return companyGroupId;
    }

    public void setCompanyGroupId(int companyGroupId) {
        this.companyGroupId = companyGroupId;
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

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Companygroup that = (Companygroup) o;

        if (companyGroupId != that.companyGroupId) return false;
        if (eco != that.eco) return false;
        if (ecoHuge != that.ecoHuge) return false;
        if (biz != that.biz) return false;
        if (bizHuge != that.bizHuge) return false;
        if (lux != that.lux) return false;
        if (luxHuge != that.luxHuge) return false;
        if (saving != that.saving) return false;
        if (superSav != that.superSav) return false;
        if (bike != that.bike) return false;
        if (delivery != that.delivery) return false;
        if (pickup != that.pickup) return false;
        if (bus != that.bus) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (logo != null ? !logo.equals(that.logo) : that.logo != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (selfControl != null ? !selfControl.equals(that.selfControl) : that.selfControl != null) return false;
        if (addressId != null ? !addressId.equals(that.addressId) : that.addressId != null) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = companyGroupId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (logo != null ? logo.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (selfControl != null ? selfControl.hashCode() : 0);
        result = 31 * result + (addressId != null ? addressId.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (eco ? 1 : 0);
        result = 31 * result + (ecoHuge ? 1 : 0);
        result = 31 * result + (biz ? 1 : 0);
        result = 31 * result + (bizHuge ? 1 : 0);
        result = 31 * result + (lux ? 1 : 0);
        result = 31 * result + (luxHuge ? 1 : 0);
        result = 31 * result + (saving ? 1 : 0);
        result = 31 * result + (superSav ? 1 : 0);
        result = 31 * result + (bike ? 1 : 0);
        result = 31 * result + (delivery ? 1 : 0);
        result = 31 * result + (pickup ? 1 : 0);
        result = 31 * result + (bus ? 1 : 0);
        return result;
    }
}
