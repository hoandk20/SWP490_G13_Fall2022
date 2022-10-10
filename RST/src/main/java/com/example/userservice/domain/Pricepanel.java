package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Pricepanel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PricePanelID", nullable = false)
    private int pricePanelId;
    @Basic
    @Column(name = "CompanyID", nullable = true)
    private Integer companyId;
    @Basic
    @Column(name = "Tittle", nullable = true, length = 100)
    private String tittle;
    @Basic
    @Column(name = "VehicleLevel", nullable = true, length = 4)
    private String vehicleLevel;
    @Basic
    @Column(name = "CityID", nullable = true)
    private Integer cityId;
    @Basic
    @Column(name = "StartDate", nullable = false)
    private Date startDate;
    @Basic
    @Column(name = "EndDate", nullable = true)
    private Date endDate;
    @Basic
    @Column(name = "OpenKM", nullable = false, precision = 0)
    private double openKm;
    @Basic
    @Column(name = "OpenPrice", nullable = false, precision = 0)
    private double openPrice;
    @Basic
    @Column(name = "FirstKM", nullable = false, precision = 0)
    private double firstKm;
    @Basic
    @Column(name = "FirstKMPrice", nullable = false, precision = 0)
    private double firstKmPrice;
    @Basic
    @Column(name = "SecondKM", nullable = false, precision = 0)
    private double secondKm;
    @Basic
    @Column(name = "SecondKMPrice", nullable = false, precision = 0)
    private double secondKmPrice;
    @Basic
    @Column(name = "ThirdKM", nullable = false, precision = 0)
    private double thirdKm;
    @Basic
    @Column(name = "ThirdKMPrice", nullable = false, precision = 0)
    private double thirdKmPrice;
    @Basic
    @Column(name = "FourthKM", nullable = false, precision = 0)
    private double fourthKm;
    @Basic
    @Column(name = "FourthKMPrice", nullable = false, precision = 0)
    private double fourthKmPrice;
    @Basic
    @Column(name = "WaitingPrice", nullable = false, precision = 0)
    private double waitingPrice;
    @Basic
    @Column(name = "ReturnTripPrice", nullable = false, precision = 0)
    private double returnTripPrice;
    @Basic
    @Column(name = "FarePerMin", nullable = false, precision = 0)
    private double farePerMin;
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
    @Column(name = "Status", nullable = false, length = 20)
    private String status;
    @Basic
    @Column(name = "FareType", nullable = true, length = 4)
    private String fareType;
    @Basic
    @Column(name = "Note", nullable = true, length = 500)
    private String note;
    @Basic
    @Column(name = "MinDistance", nullable = false, precision = 0)
    private double minDistance;
    @Basic
    @Column(name = "StopFee", nullable = false, precision = 0)
    private double stopFee;

    public int getPricePanelId() {
        return pricePanelId;
    }

    public void setPricePanelId(int pricePanelId) {
        this.pricePanelId = pricePanelId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
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

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getOpenKm() {
        return openKm;
    }

    public void setOpenKm(double openKm) {
        this.openKm = openKm;
    }

    public double getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(double openPrice) {
        this.openPrice = openPrice;
    }

    public double getFirstKm() {
        return firstKm;
    }

    public void setFirstKm(double firstKm) {
        this.firstKm = firstKm;
    }

    public double getFirstKmPrice() {
        return firstKmPrice;
    }

    public void setFirstKmPrice(double firstKmPrice) {
        this.firstKmPrice = firstKmPrice;
    }

    public double getSecondKm() {
        return secondKm;
    }

    public void setSecondKm(double secondKm) {
        this.secondKm = secondKm;
    }

    public double getSecondKmPrice() {
        return secondKmPrice;
    }

    public void setSecondKmPrice(double secondKmPrice) {
        this.secondKmPrice = secondKmPrice;
    }

    public double getThirdKm() {
        return thirdKm;
    }

    public void setThirdKm(double thirdKm) {
        this.thirdKm = thirdKm;
    }

    public double getThirdKmPrice() {
        return thirdKmPrice;
    }

    public void setThirdKmPrice(double thirdKmPrice) {
        this.thirdKmPrice = thirdKmPrice;
    }

    public double getFourthKm() {
        return fourthKm;
    }

    public void setFourthKm(double fourthKm) {
        this.fourthKm = fourthKm;
    }

    public double getFourthKmPrice() {
        return fourthKmPrice;
    }

    public void setFourthKmPrice(double fourthKmPrice) {
        this.fourthKmPrice = fourthKmPrice;
    }

    public double getWaitingPrice() {
        return waitingPrice;
    }

    public void setWaitingPrice(double waitingPrice) {
        this.waitingPrice = waitingPrice;
    }

    public double getReturnTripPrice() {
        return returnTripPrice;
    }

    public void setReturnTripPrice(double returnTripPrice) {
        this.returnTripPrice = returnTripPrice;
    }

    public double getFarePerMin() {
        return farePerMin;
    }

    public void setFarePerMin(double farePerMin) {
        this.farePerMin = farePerMin;
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

    public double getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }

    public double getStopFee() {
        return stopFee;
    }

    public void setStopFee(double stopFee) {
        this.stopFee = stopFee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pricepanel that = (Pricepanel) o;

        if (pricePanelId != that.pricePanelId) return false;
        if (Double.compare(that.openKm, openKm) != 0) return false;
        if (Double.compare(that.openPrice, openPrice) != 0) return false;
        if (Double.compare(that.firstKm, firstKm) != 0) return false;
        if (Double.compare(that.firstKmPrice, firstKmPrice) != 0) return false;
        if (Double.compare(that.secondKm, secondKm) != 0) return false;
        if (Double.compare(that.secondKmPrice, secondKmPrice) != 0) return false;
        if (Double.compare(that.thirdKm, thirdKm) != 0) return false;
        if (Double.compare(that.thirdKmPrice, thirdKmPrice) != 0) return false;
        if (Double.compare(that.fourthKm, fourthKm) != 0) return false;
        if (Double.compare(that.fourthKmPrice, fourthKmPrice) != 0) return false;
        if (Double.compare(that.waitingPrice, waitingPrice) != 0) return false;
        if (Double.compare(that.returnTripPrice, returnTripPrice) != 0) return false;
        if (Double.compare(that.farePerMin, farePerMin) != 0) return false;
        if (Double.compare(that.minDistance, minDistance) != 0) return false;
        if (Double.compare(that.stopFee, stopFee) != 0) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (tittle != null ? !tittle.equals(that.tittle) : that.tittle != null) return false;
        if (vehicleLevel != null ? !vehicleLevel.equals(that.vehicleLevel) : that.vehicleLevel != null) return false;
        if (cityId != null ? !cityId.equals(that.cityId) : that.cityId != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (fareType != null ? !fareType.equals(that.fareType) : that.fareType != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = pricePanelId;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (tittle != null ? tittle.hashCode() : 0);
        result = 31 * result + (vehicleLevel != null ? vehicleLevel.hashCode() : 0);
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        temp = Double.doubleToLongBits(openKm);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(openPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(firstKm);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(firstKmPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(secondKm);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(secondKmPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(thirdKm);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(thirdKmPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(fourthKm);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(fourthKmPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(waitingPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(returnTripPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(farePerMin);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (fareType != null ? fareType.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        temp = Double.doubleToLongBits(minDistance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(stopFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
