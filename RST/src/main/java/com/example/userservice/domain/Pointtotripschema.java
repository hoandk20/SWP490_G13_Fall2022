package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Pointtotripschema {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PointToTripSchemaId", nullable = false)
    private int pointToTripSchemaId;
    @Basic
    @Column(name = "CountryCode", nullable = false, length = 4)
    private String countryCode;
    @Basic
    @Column(name = "CityID", nullable = true)
    private Integer cityId;
    @Basic
    @Column(name = "FirstPoint", nullable = false)
    private int firstPoint;
    @Basic
    @Column(name = "NoTrip1", nullable = false)
    private int noTrip1;
    @Basic
    @Column(name = "FirstReward", nullable = false, precision = 0)
    private double firstReward;
    @Basic
    @Column(name = "SecondPoint", nullable = false)
    private int secondPoint;
    @Basic
    @Column(name = "NoTrip2", nullable = false)
    private int noTrip2;
    @Basic
    @Column(name = "SecondReward", nullable = false, precision = 0)
    private double secondReward;
    @Basic
    @Column(name = "ThirdPoint", nullable = false)
    private int thirdPoint;
    @Basic
    @Column(name = "NoTrip3", nullable = false)
    private int noTrip3;
    @Basic
    @Column(name = "ThirdReward", nullable = false, precision = 0)
    private double thirdReward;
    @Basic
    @Column(name = "NoTrip4", nullable = false)
    private int noTrip4;
    @Basic
    @Column(name = "FourthPoint", nullable = false)
    private int fourthPoint;
    @Basic
    @Column(name = "FourthReward", nullable = false, precision = 0)
    private double fourthReward;
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

    public int getPointToTripSchemaId() {
        return pointToTripSchemaId;
    }

    public void setPointToTripSchemaId(int pointToTripSchemaId) {
        this.pointToTripSchemaId = pointToTripSchemaId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public int getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(int firstPoint) {
        this.firstPoint = firstPoint;
    }

    public int getNoTrip1() {
        return noTrip1;
    }

    public void setNoTrip1(int noTrip1) {
        this.noTrip1 = noTrip1;
    }

    public double getFirstReward() {
        return firstReward;
    }

    public void setFirstReward(double firstReward) {
        this.firstReward = firstReward;
    }

    public int getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(int secondPoint) {
        this.secondPoint = secondPoint;
    }

    public int getNoTrip2() {
        return noTrip2;
    }

    public void setNoTrip2(int noTrip2) {
        this.noTrip2 = noTrip2;
    }

    public double getSecondReward() {
        return secondReward;
    }

    public void setSecondReward(double secondReward) {
        this.secondReward = secondReward;
    }

    public int getThirdPoint() {
        return thirdPoint;
    }

    public void setThirdPoint(int thirdPoint) {
        this.thirdPoint = thirdPoint;
    }

    public int getNoTrip3() {
        return noTrip3;
    }

    public void setNoTrip3(int noTrip3) {
        this.noTrip3 = noTrip3;
    }

    public double getThirdReward() {
        return thirdReward;
    }

    public void setThirdReward(double thirdReward) {
        this.thirdReward = thirdReward;
    }

    public int getNoTrip4() {
        return noTrip4;
    }

    public void setNoTrip4(int noTrip4) {
        this.noTrip4 = noTrip4;
    }

    public int getFourthPoint() {
        return fourthPoint;
    }

    public void setFourthPoint(int fourthPoint) {
        this.fourthPoint = fourthPoint;
    }

    public double getFourthReward() {
        return fourthReward;
    }

    public void setFourthReward(double fourthReward) {
        this.fourthReward = fourthReward;
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

        Pointtotripschema that = (Pointtotripschema) o;

        if (pointToTripSchemaId != that.pointToTripSchemaId) return false;
        if (firstPoint != that.firstPoint) return false;
        if (noTrip1 != that.noTrip1) return false;
        if (Double.compare(that.firstReward, firstReward) != 0) return false;
        if (secondPoint != that.secondPoint) return false;
        if (noTrip2 != that.noTrip2) return false;
        if (Double.compare(that.secondReward, secondReward) != 0) return false;
        if (thirdPoint != that.thirdPoint) return false;
        if (noTrip3 != that.noTrip3) return false;
        if (Double.compare(that.thirdReward, thirdReward) != 0) return false;
        if (noTrip4 != that.noTrip4) return false;
        if (fourthPoint != that.fourthPoint) return false;
        if (Double.compare(that.fourthReward, fourthReward) != 0) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (cityId != null ? !cityId.equals(that.cityId) : that.cityId != null) return false;
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
        int result;
        long temp;
        result = pointToTripSchemaId;
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        result = 31 * result + firstPoint;
        result = 31 * result + noTrip1;
        temp = Double.doubleToLongBits(firstReward);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + secondPoint;
        result = 31 * result + noTrip2;
        temp = Double.doubleToLongBits(secondReward);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + thirdPoint;
        result = 31 * result + noTrip3;
        temp = Double.doubleToLongBits(thirdReward);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + noTrip4;
        result = 31 * result + fourthPoint;
        temp = Double.doubleToLongBits(fourthReward);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        return result;
    }
}
