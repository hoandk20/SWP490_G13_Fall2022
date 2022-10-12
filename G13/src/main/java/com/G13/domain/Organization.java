package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "organization")
public class Organization {
    @Id
    @Column(name = "OrganizationId", nullable = false, length = 50)
    private String id;

    @Column(name = "Code")
    private String code;

    @Column(name = "Name", nullable = false, length = 100)
    private String name;

    @Column(name = "Address", length = 50)
    private String address;

    @Column(name = "CityID", nullable = false)
    private Integer cityID;

    @Column(name = "RepresentativeName", length = 50)
    private String representativeName;

    @Column(name = "Phone", length = 15)
    private String phone;

    @Column(name = "MobileNo", length = 15)
    private String mobileNo;

    @Column(name = "VAT", length = 20)
    private String vat;

    @Column(name = "DocumentId")
    private Integer documentId;

    @Column(name = "CountryCode", nullable = false, length = 4)
    private String countryCode;

    @Column(name = "Email", length = 50)
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    public String getRepresentativeName() {
        return representativeName;
    }

    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}