package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "pricepanel")
public class Pricepanel {
    @Id
    @Column(name = "PricePanelID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CompanyID")
    private Company companyID;

    @Column(name = "Tittle", length = 100)
    private String tittle;

    @Column(name = "VehicleLevel", length = 4)
    private String vehicleLevel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CityID")
    private City cityID;

    @Column(name = "StartDate", nullable = false)
    private LocalDate startDate;

    @Column(name = "EndDate")
    private LocalDate endDate;

    @Column(name = "OpenKM", nullable = false)
    private Float openKM;

    @Column(name = "OpenPrice", nullable = false)
    private Float openPrice;

    @Column(name = "FirstKM", nullable = false)
    private Float firstKM;

    @Column(name = "FirstKMPrice", nullable = false)
    private Float firstKMPrice;

    @Column(name = "SecondKM", nullable = false)
    private Float secondKM;

    @Column(name = "SecondKMPrice", nullable = false)
    private Float secondKMPrice;

    @Column(name = "ThirdKM", nullable = false)
    private Float thirdKM;

    @Column(name = "ThirdKMPrice", nullable = false)
    private Float thirdKMPrice;

    @Column(name = "FourthKM", nullable = false)
    private Float fourthKM;

    @Column(name = "FourthKMPrice", nullable = false)
    private Float fourthKMPrice;

    @Column(name = "WaitingPrice", nullable = false)
    private Float waitingPrice;

    @Column(name = "ReturnTripPrice", nullable = false)
    private Float returnTripPrice;

    @Column(name = "FarePerMin", nullable = false)
    private Float farePerMin;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "Status", nullable = false, length = 20)
    private String status;

    @Column(name = "FareType", length = 4)
    private String fareType;

    @Column(name = "Note", length = 500)
    private String note;

    @Column(name = "MinDistance", nullable = false)
    private Float minDistance;

    @Column(name = "StopFee", nullable = false)
    private Double stopFee;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Company getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Company companyID) {
        this.companyID = companyID;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getVehicleLevel() {
        return vehicleLevel;
    }

    public void setVehicleLevel(String vehicleLevel) {
        this.vehicleLevel = vehicleLevel;
    }

    public City getCityID() {
        return cityID;
    }

    public void setCityID(City cityID) {
        this.cityID = cityID;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Float getOpenKM() {
        return openKM;
    }

    public void setOpenKM(Float openKM) {
        this.openKM = openKM;
    }

    public Float getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(Float openPrice) {
        this.openPrice = openPrice;
    }

    public Float getFirstKM() {
        return firstKM;
    }

    public void setFirstKM(Float firstKM) {
        this.firstKM = firstKM;
    }

    public Float getFirstKMPrice() {
        return firstKMPrice;
    }

    public void setFirstKMPrice(Float firstKMPrice) {
        this.firstKMPrice = firstKMPrice;
    }

    public Float getSecondKM() {
        return secondKM;
    }

    public void setSecondKM(Float secondKM) {
        this.secondKM = secondKM;
    }

    public Float getSecondKMPrice() {
        return secondKMPrice;
    }

    public void setSecondKMPrice(Float secondKMPrice) {
        this.secondKMPrice = secondKMPrice;
    }

    public Float getThirdKM() {
        return thirdKM;
    }

    public void setThirdKM(Float thirdKM) {
        this.thirdKM = thirdKM;
    }

    public Float getThirdKMPrice() {
        return thirdKMPrice;
    }

    public void setThirdKMPrice(Float thirdKMPrice) {
        this.thirdKMPrice = thirdKMPrice;
    }

    public Float getFourthKM() {
        return fourthKM;
    }

    public void setFourthKM(Float fourthKM) {
        this.fourthKM = fourthKM;
    }

    public Float getFourthKMPrice() {
        return fourthKMPrice;
    }

    public void setFourthKMPrice(Float fourthKMPrice) {
        this.fourthKMPrice = fourthKMPrice;
    }

    public Float getWaitingPrice() {
        return waitingPrice;
    }

    public void setWaitingPrice(Float waitingPrice) {
        this.waitingPrice = waitingPrice;
    }

    public Float getReturnTripPrice() {
        return returnTripPrice;
    }

    public void setReturnTripPrice(Float returnTripPrice) {
        this.returnTripPrice = returnTripPrice;
    }

    public Float getFarePerMin() {
        return farePerMin;
    }

    public void setFarePerMin(Float farePerMin) {
        this.farePerMin = farePerMin;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Float getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(Float minDistance) {
        this.minDistance = minDistance;
    }

    public Double getStopFee() {
        return stopFee;
    }

    public void setStopFee(Double stopFee) {
        this.stopFee = stopFee;
    }

}