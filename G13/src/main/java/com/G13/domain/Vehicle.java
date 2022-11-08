package com.G13.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @Column(name = "vehicleid", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    public Vehicle() {
        Instant instant = Instant.now();
        this.id = 0;
        this.insuranceCertificate = 0;
        this.companyID = 0;
        this.registrationStamp = 0;
        this.carTypeID = 0;
        this.plate = plate;
        this.interiorColor = "";
        this.exteriorColor = "";
        this.produceYear = "";
        this.lisencePlatCountry = "";
        this.lisencePlatState = "";
        this.level = "";
        this.level2 = "";
        this.level3 = "";
        this.status = "";
        this.createdBy = "";
        this.createdDate = instant;
        this.lastModifiedBy = "";
        this.lastModifiedDate = instant;
    }

    @Column(name = "insurancecertificate")
    private Integer insuranceCertificate;

    @Column(name = "companyid")
    private Integer companyID;

    @Column(name = "registrationstamp")
    private Integer registrationStamp;

    @Column(name = "cartypeid", nullable = false)
    private Integer carTypeID;

    @Column(name = "plate", nullable = false, length = 20)
    private String plate;

    @Column(name = "interiorcolor", length = 20)
    private String interiorColor;

    @Column(name = "exteriorcolor", length = 20)
    private String exteriorColor;

    @Column(name = "produceyear", length = 4)
    private String produceYear;

    @Column(name = "lisenceplatcountry", length = 4)
    private String lisencePlatCountry;

    @Column(name = "lisenceplatstate", length = 20)
    private String lisencePlatState;

    @Column(name = "level", length = 4)
    private String level;

    @Column(name = "level2", length = 4)
    private String level2;

    @Column(name = "level3", length = 4)
    private String level3;

    @Column(name = "status", nullable = false, length = 2)
    private String status;

    @Column(name = "createdby", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "createddate", nullable = false)
    private Instant createdDate;

    @Column(name = "lastmodifiedby", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "lastmodifieddate", nullable = false)
    private Instant lastModifiedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInsuranceCertificate() {
        return insuranceCertificate;
    }

    public void setInsuranceCertificate(Integer insuranceCertificate) {
        this.insuranceCertificate = insuranceCertificate;
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public Integer getRegistrationStamp() {
        return registrationStamp;
    }

    public void setRegistrationStamp(Integer registrationStamp) {
        this.registrationStamp = registrationStamp;
    }

    public Integer getCarTypeID() {
        return carTypeID;
    }

    public void setCarTypeID(Integer carTypeID) {
        this.carTypeID = carTypeID;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }

    public String getExteriorColor() {
        return exteriorColor;
    }

    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    public String getProduceYear() {
        return produceYear;
    }

    public void setProduceYear(String produceYear) {
        this.produceYear = produceYear;
    }

    public String getLisencePlatCountry() {
        return lisencePlatCountry;
    }

    public void setLisencePlatCountry(String lisencePlatCountry) {
        this.lisencePlatCountry = lisencePlatCountry;
    }

    public String getLisencePlatState() {
        return lisencePlatState;
    }

    public void setLisencePlatState(String lisencePlatState) {
        this.lisencePlatState = lisencePlatState;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLevel2() {
        return level2;
    }

    public void setLevel2(String level2) {
        this.level2 = level2;
    }

    public String getLevel3() {
        return level3;
    }

    public void setLevel3(String level3) {
        this.level3 = level3;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

}