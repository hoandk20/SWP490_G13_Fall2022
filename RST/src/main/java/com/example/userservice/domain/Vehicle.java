package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Vehicle {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "VehicleID", nullable = false)
    private int vehicleId;
    @Basic
    @Column(name = "InsuranceCertificate", nullable = true)
    private Integer insuranceCertificate;
    @Basic
    @Column(name = "CompanyID", nullable = true)
    private Integer companyId;
    @Basic
    @Column(name = "RegistrationStamp", nullable = true)
    private Integer registrationStamp;
    @Basic
    @Column(name = "CarTypeID", nullable = false)
    private int carTypeId;
    @Basic
    @Column(name = "Plate", nullable = false, length = 20)
    private String plate;
    @Basic
    @Column(name = "InteriorColor", nullable = true, length = 20)
    private String interiorColor;
    @Basic
    @Column(name = "ExteriorColor", nullable = true, length = 20)
    private String exteriorColor;
    @Basic
    @Column(name = "ProduceYear", nullable = true, length = 4)
    private String produceYear;
    @Basic
    @Column(name = "LisencePlatCountry", nullable = true, length = 4)
    private String lisencePlatCountry;
    @Basic
    @Column(name = "LisencePlatState", nullable = true, length = 20)
    private String lisencePlatState;
    @Basic
    @Column(name = "Level", nullable = true, length = 4)
    private String level;
    @Basic
    @Column(name = "Level2", nullable = true, length = 4)
    private String level2;
    @Basic
    @Column(name = "Level3", nullable = true, length = 4)
    private String level3;
    @Basic
    @Column(name = "Status", nullable = false, length = 2)
    private String status;
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

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Integer getInsuranceCertificate() {
        return insuranceCertificate;
    }

    public void setInsuranceCertificate(Integer insuranceCertificate) {
        this.insuranceCertificate = insuranceCertificate;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getRegistrationStamp() {
        return registrationStamp;
    }

    public void setRegistrationStamp(Integer registrationStamp) {
        this.registrationStamp = registrationStamp;
    }

    public int getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(int carTypeId) {
        this.carTypeId = carTypeId;
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

        Vehicle vehicle = (Vehicle) o;

        if (vehicleId != vehicle.vehicleId) return false;
        if (carTypeId != vehicle.carTypeId) return false;
        if (insuranceCertificate != null ? !insuranceCertificate.equals(vehicle.insuranceCertificate) : vehicle.insuranceCertificate != null)
            return false;
        if (companyId != null ? !companyId.equals(vehicle.companyId) : vehicle.companyId != null) return false;
        if (registrationStamp != null ? !registrationStamp.equals(vehicle.registrationStamp) : vehicle.registrationStamp != null)
            return false;
        if (plate != null ? !plate.equals(vehicle.plate) : vehicle.plate != null) return false;
        if (interiorColor != null ? !interiorColor.equals(vehicle.interiorColor) : vehicle.interiorColor != null)
            return false;
        if (exteriorColor != null ? !exteriorColor.equals(vehicle.exteriorColor) : vehicle.exteriorColor != null)
            return false;
        if (produceYear != null ? !produceYear.equals(vehicle.produceYear) : vehicle.produceYear != null) return false;
        if (lisencePlatCountry != null ? !lisencePlatCountry.equals(vehicle.lisencePlatCountry) : vehicle.lisencePlatCountry != null)
            return false;
        if (lisencePlatState != null ? !lisencePlatState.equals(vehicle.lisencePlatState) : vehicle.lisencePlatState != null)
            return false;
        if (level != null ? !level.equals(vehicle.level) : vehicle.level != null) return false;
        if (level2 != null ? !level2.equals(vehicle.level2) : vehicle.level2 != null) return false;
        if (level3 != null ? !level3.equals(vehicle.level3) : vehicle.level3 != null) return false;
        if (status != null ? !status.equals(vehicle.status) : vehicle.status != null) return false;
        if (createdBy != null ? !createdBy.equals(vehicle.createdBy) : vehicle.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(vehicle.createdDate) : vehicle.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(vehicle.lastModifiedBy) : vehicle.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(vehicle.lastModifiedDate) : vehicle.lastModifiedDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = vehicleId;
        result = 31 * result + (insuranceCertificate != null ? insuranceCertificate.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (registrationStamp != null ? registrationStamp.hashCode() : 0);
        result = 31 * result + carTypeId;
        result = 31 * result + (plate != null ? plate.hashCode() : 0);
        result = 31 * result + (interiorColor != null ? interiorColor.hashCode() : 0);
        result = 31 * result + (exteriorColor != null ? exteriorColor.hashCode() : 0);
        result = 31 * result + (produceYear != null ? produceYear.hashCode() : 0);
        result = 31 * result + (lisencePlatCountry != null ? lisencePlatCountry.hashCode() : 0);
        result = 31 * result + (lisencePlatState != null ? lisencePlatState.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (level2 != null ? level2.hashCode() : 0);
        result = 31 * result + (level3 != null ? level3.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        return result;
    }
}
