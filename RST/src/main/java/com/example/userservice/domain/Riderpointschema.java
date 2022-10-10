package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Riderpointschema {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RiderPointSchemaID", nullable = false)
    private int riderPointSchemaId;
    @Basic
    @Column(name = "Title", nullable = true, length = 100)
    private String title;
    @Basic
    @Column(name = "StartDate", nullable = false)
    private Date startDate;
    @Basic
    @Column(name = "EndDate", nullable = true)
    private Timestamp endDate;
    @Basic
    @Column(name = "FirstFare", nullable = true, precision = 0)
    private Double firstFare;
    @Basic
    @Column(name = "FirstPoint", nullable = true, precision = 0)
    private Double firstPoint;
    @Basic
    @Column(name = "SecondFare", nullable = true, precision = 0)
    private Double secondFare;
    @Basic
    @Column(name = "SecondPoint", nullable = true, precision = 0)
    private Double secondPoint;
    @Basic
    @Column(name = "ThirdFare", nullable = true, precision = 0)
    private Double thirdFare;
    @Basic
    @Column(name = "ThirdPoint", nullable = true, precision = 0)
    private Double thirdPoint;
    @Basic
    @Column(name = "FourthFare", nullable = true, precision = 0)
    private Double fourthFare;
    @Basic
    @Column(name = "FourthPoint", nullable = true, precision = 0)
    private Double fourthPoint;
    @Basic
    @Column(name = "CancelledPoint", nullable = true, precision = 0)
    private Double cancelledPoint;
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
    @Column(name = "CountryCode", nullable = false, length = 4)
    private String countryCode;
    @Basic
    @Column(name = "Status", nullable = true, length = 4)
    private String status;
    @Basic
    @Column(name = "CancelFee", nullable = false, precision = 0)
    private double cancelFee;
    @Basic
    @Column(name = "FifthPoint", nullable = false, precision = 0)
    private double fifthPoint;
    @Basic
    @Column(name = "Level", nullable = true, length = 4)
    private String level;
    @Basic
    @Column(name = "RatioPointTnet", nullable = true, precision = 0)
    private Double ratioPointTnet;
    @Basic
    @Column(name = "RatioPointCar", nullable = true, precision = 0)
    private Double ratioPointCar;
    @Basic
    @Column(name = "RatioPointBike", nullable = true, precision = 0)
    private Double ratioPointBike;

    public int getRiderPointSchemaId() {
        return riderPointSchemaId;
    }

    public void setRiderPointSchemaId(int riderPointSchemaId) {
        this.riderPointSchemaId = riderPointSchemaId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public Double getFirstFare() {
        return firstFare;
    }

    public void setFirstFare(Double firstFare) {
        this.firstFare = firstFare;
    }

    public Double getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Double firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Double getSecondFare() {
        return secondFare;
    }

    public void setSecondFare(Double secondFare) {
        this.secondFare = secondFare;
    }

    public Double getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Double secondPoint) {
        this.secondPoint = secondPoint;
    }

    public Double getThirdFare() {
        return thirdFare;
    }

    public void setThirdFare(Double thirdFare) {
        this.thirdFare = thirdFare;
    }

    public Double getThirdPoint() {
        return thirdPoint;
    }

    public void setThirdPoint(Double thirdPoint) {
        this.thirdPoint = thirdPoint;
    }

    public Double getFourthFare() {
        return fourthFare;
    }

    public void setFourthFare(Double fourthFare) {
        this.fourthFare = fourthFare;
    }

    public Double getFourthPoint() {
        return fourthPoint;
    }

    public void setFourthPoint(Double fourthPoint) {
        this.fourthPoint = fourthPoint;
    }

    public Double getCancelledPoint() {
        return cancelledPoint;
    }

    public void setCancelledPoint(Double cancelledPoint) {
        this.cancelledPoint = cancelledPoint;
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

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getCancelFee() {
        return cancelFee;
    }

    public void setCancelFee(double cancelFee) {
        this.cancelFee = cancelFee;
    }

    public double getFifthPoint() {
        return fifthPoint;
    }

    public void setFifthPoint(double fifthPoint) {
        this.fifthPoint = fifthPoint;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Double getRatioPointTnet() {
        return ratioPointTnet;
    }

    public void setRatioPointTnet(Double ratioPointTnet) {
        this.ratioPointTnet = ratioPointTnet;
    }

    public Double getRatioPointCar() {
        return ratioPointCar;
    }

    public void setRatioPointCar(Double ratioPointCar) {
        this.ratioPointCar = ratioPointCar;
    }

    public Double getRatioPointBike() {
        return ratioPointBike;
    }

    public void setRatioPointBike(Double ratioPointBike) {
        this.ratioPointBike = ratioPointBike;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Riderpointschema that = (Riderpointschema) o;

        if (riderPointSchemaId != that.riderPointSchemaId) return false;
        if (Double.compare(that.cancelFee, cancelFee) != 0) return false;
        if (Double.compare(that.fifthPoint, fifthPoint) != 0) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (firstFare != null ? !firstFare.equals(that.firstFare) : that.firstFare != null) return false;
        if (firstPoint != null ? !firstPoint.equals(that.firstPoint) : that.firstPoint != null) return false;
        if (secondFare != null ? !secondFare.equals(that.secondFare) : that.secondFare != null) return false;
        if (secondPoint != null ? !secondPoint.equals(that.secondPoint) : that.secondPoint != null) return false;
        if (thirdFare != null ? !thirdFare.equals(that.thirdFare) : that.thirdFare != null) return false;
        if (thirdPoint != null ? !thirdPoint.equals(that.thirdPoint) : that.thirdPoint != null) return false;
        if (fourthFare != null ? !fourthFare.equals(that.fourthFare) : that.fourthFare != null) return false;
        if (fourthPoint != null ? !fourthPoint.equals(that.fourthPoint) : that.fourthPoint != null) return false;
        if (cancelledPoint != null ? !cancelledPoint.equals(that.cancelledPoint) : that.cancelledPoint != null)
            return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (level != null ? !level.equals(that.level) : that.level != null) return false;
        if (ratioPointTnet != null ? !ratioPointTnet.equals(that.ratioPointTnet) : that.ratioPointTnet != null)
            return false;
        if (ratioPointCar != null ? !ratioPointCar.equals(that.ratioPointCar) : that.ratioPointCar != null)
            return false;
        if (ratioPointBike != null ? !ratioPointBike.equals(that.ratioPointBike) : that.ratioPointBike != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = riderPointSchemaId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (firstFare != null ? firstFare.hashCode() : 0);
        result = 31 * result + (firstPoint != null ? firstPoint.hashCode() : 0);
        result = 31 * result + (secondFare != null ? secondFare.hashCode() : 0);
        result = 31 * result + (secondPoint != null ? secondPoint.hashCode() : 0);
        result = 31 * result + (thirdFare != null ? thirdFare.hashCode() : 0);
        result = 31 * result + (thirdPoint != null ? thirdPoint.hashCode() : 0);
        result = 31 * result + (fourthFare != null ? fourthFare.hashCode() : 0);
        result = 31 * result + (fourthPoint != null ? fourthPoint.hashCode() : 0);
        result = 31 * result + (cancelledPoint != null ? cancelledPoint.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        temp = Double.doubleToLongBits(cancelFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(fifthPoint);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (ratioPointTnet != null ? ratioPointTnet.hashCode() : 0);
        result = 31 * result + (ratioPointCar != null ? ratioPointCar.hashCode() : 0);
        result = 31 * result + (ratioPointBike != null ? ratioPointBike.hashCode() : 0);
        return result;
    }
}
