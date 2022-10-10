package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Fareratepanel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "FareRatePanelID", nullable = false)
    private int fareRatePanelId;
    @Basic
    @Column(name = "CountryCode", nullable = true, length = 4)
    private String countryCode;
    @Basic
    @Column(name = "FirstRiderRange", nullable = false)
    private int firstRiderRange;
    @Basic
    @Column(name = "FirstRate", nullable = false, precision = 0)
    private double firstRate;
    @Basic
    @Column(name = "SecondRiderRange", nullable = false)
    private int secondRiderRange;
    @Basic
    @Column(name = "SecondRate", nullable = false, precision = 0)
    private double secondRate;
    @Basic
    @Column(name = "ThirdRiderRange", nullable = false)
    private int thirdRiderRange;
    @Basic
    @Column(name = "ThirdRate", nullable = false, precision = 0)
    private double thirdRate;
    @Basic
    @Column(name = "FourthRiderRange", nullable = false)
    private int fourthRiderRange;
    @Basic
    @Column(name = "FourthRate", nullable = false, precision = 0)
    private double fourthRate;
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
    @Column(name = "MinRider", nullable = false)
    private int minRider;
    @Basic
    @Column(name = "MaxRider", nullable = false)
    private int maxRider;

    public int getFareRatePanelId() {
        return fareRatePanelId;
    }

    public void setFareRatePanelId(int fareRatePanelId) {
        this.fareRatePanelId = fareRatePanelId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public int getFirstRiderRange() {
        return firstRiderRange;
    }

    public void setFirstRiderRange(int firstRiderRange) {
        this.firstRiderRange = firstRiderRange;
    }

    public double getFirstRate() {
        return firstRate;
    }

    public void setFirstRate(double firstRate) {
        this.firstRate = firstRate;
    }

    public int getSecondRiderRange() {
        return secondRiderRange;
    }

    public void setSecondRiderRange(int secondRiderRange) {
        this.secondRiderRange = secondRiderRange;
    }

    public double getSecondRate() {
        return secondRate;
    }

    public void setSecondRate(double secondRate) {
        this.secondRate = secondRate;
    }

    public int getThirdRiderRange() {
        return thirdRiderRange;
    }

    public void setThirdRiderRange(int thirdRiderRange) {
        this.thirdRiderRange = thirdRiderRange;
    }

    public double getThirdRate() {
        return thirdRate;
    }

    public void setThirdRate(double thirdRate) {
        this.thirdRate = thirdRate;
    }

    public int getFourthRiderRange() {
        return fourthRiderRange;
    }

    public void setFourthRiderRange(int fourthRiderRange) {
        this.fourthRiderRange = fourthRiderRange;
    }

    public double getFourthRate() {
        return fourthRate;
    }

    public void setFourthRate(double fourthRate) {
        this.fourthRate = fourthRate;
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

    public int getMinRider() {
        return minRider;
    }

    public void setMinRider(int minRider) {
        this.minRider = minRider;
    }

    public int getMaxRider() {
        return maxRider;
    }

    public void setMaxRider(int maxRider) {
        this.maxRider = maxRider;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fareratepanel that = (Fareratepanel) o;

        if (fareRatePanelId != that.fareRatePanelId) return false;
        if (firstRiderRange != that.firstRiderRange) return false;
        if (Double.compare(that.firstRate, firstRate) != 0) return false;
        if (secondRiderRange != that.secondRiderRange) return false;
        if (Double.compare(that.secondRate, secondRate) != 0) return false;
        if (thirdRiderRange != that.thirdRiderRange) return false;
        if (Double.compare(that.thirdRate, thirdRate) != 0) return false;
        if (fourthRiderRange != that.fourthRiderRange) return false;
        if (Double.compare(that.fourthRate, fourthRate) != 0) return false;
        if (minRider != that.minRider) return false;
        if (maxRider != that.maxRider) return false;
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
        int result;
        long temp;
        result = fareRatePanelId;
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + firstRiderRange;
        temp = Double.doubleToLongBits(firstRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + secondRiderRange;
        temp = Double.doubleToLongBits(secondRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + thirdRiderRange;
        temp = Double.doubleToLongBits(thirdRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + fourthRiderRange;
        temp = Double.doubleToLongBits(fourthRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + minRider;
        result = 31 * result + maxRider;
        return result;
    }
}
