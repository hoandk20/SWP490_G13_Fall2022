package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @Column(name = "VehicleID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "InsuranceCertificate")
    private Document insuranceCertificate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CompanyID")
    private Company companyID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RegistrationStamp")
    private Document registrationStamp;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CarTypeID", nullable = false)
    private Cartype carTypeID;

    @Column(name = "Plate", nullable = false, length = 20)
    private String plate;

    @Column(name = "InteriorColor", length = 20)
    private String interiorColor;

    @Column(name = "ExteriorColor", length = 20)
    private String exteriorColor;

    @Column(name = "ProduceYear", length = 4)
    private String produceYear;

    @Column(name = "LisencePlatCountry", length = 4)
    private String lisencePlatCountry;

    @Column(name = "LisencePlatState", length = 20)
    private String lisencePlatState;

    @Column(name = "Level", length = 4)
    private String level;

    @Column(name = "Level2", length = 4)
    private String level2;

    @Column(name = "Level3", length = 4)
    private String level3;

    @Column(name = "Status", nullable = false, length = 2)
    private String status;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Document getInsuranceCertificate() {
        return insuranceCertificate;
    }

    public void setInsuranceCertificate(Document insuranceCertificate) {
        this.insuranceCertificate = insuranceCertificate;
    }

    public Company getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Company companyID) {
        this.companyID = companyID;
    }

    public Document getRegistrationStamp() {
        return registrationStamp;
    }

    public void setRegistrationStamp(Document registrationStamp) {
        this.registrationStamp = registrationStamp;
    }

    public Cartype getCarTypeID() {
        return carTypeID;
    }

    public void setCarTypeID(Cartype carTypeID) {
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