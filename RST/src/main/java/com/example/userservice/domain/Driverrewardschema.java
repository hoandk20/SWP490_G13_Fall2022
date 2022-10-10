package com.example.userservice.domain;

import javax.persistence.*;

@Entity
public class Driverrewardschema {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RewardSchemaId", nullable = false)
    private int rewardSchemaId;
    @Basic
    @Column(name = "ProgramCode", nullable = false, length = 30)
    private String programCode;
    @Basic
    @Column(name = "CompanyCode", nullable = false, length = 15)
    private String companyCode;
    @Basic
    @Column(name = "FareFrom", nullable = false, precision = 0)
    private double fareFrom;
    @Basic
    @Column(name = "NoTrip", nullable = false)
    private short noTrip;
    @Basic
    @Column(name = "DistanceFrom", nullable = false, precision = 0)
    private double distanceFrom;
    @Basic
    @Column(name = "Reward", nullable = false, precision = 0)
    private double reward;
    @Basic
    @Column(name = "FareTo", nullable = false, precision = 0)
    private double fareTo;
    @Basic
    @Column(name = "DistanceTo", nullable = true, precision = 0)
    private Double distanceTo;
    @Basic
    @Column(name = "PointFrom", nullable = false)
    private short pointFrom;
    @Basic
    @Column(name = "PointTo", nullable = false)
    private short pointTo;

    public int getRewardSchemaId() {
        return rewardSchemaId;
    }

    public void setRewardSchemaId(int rewardSchemaId) {
        this.rewardSchemaId = rewardSchemaId;
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public double getFareFrom() {
        return fareFrom;
    }

    public void setFareFrom(double fareFrom) {
        this.fareFrom = fareFrom;
    }

    public short getNoTrip() {
        return noTrip;
    }

    public void setNoTrip(short noTrip) {
        this.noTrip = noTrip;
    }

    public double getDistanceFrom() {
        return distanceFrom;
    }

    public void setDistanceFrom(double distanceFrom) {
        this.distanceFrom = distanceFrom;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public double getFareTo() {
        return fareTo;
    }

    public void setFareTo(double fareTo) {
        this.fareTo = fareTo;
    }

    public Double getDistanceTo() {
        return distanceTo;
    }

    public void setDistanceTo(Double distanceTo) {
        this.distanceTo = distanceTo;
    }

    public short getPointFrom() {
        return pointFrom;
    }

    public void setPointFrom(short pointFrom) {
        this.pointFrom = pointFrom;
    }

    public short getPointTo() {
        return pointTo;
    }

    public void setPointTo(short pointTo) {
        this.pointTo = pointTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driverrewardschema that = (Driverrewardschema) o;

        if (rewardSchemaId != that.rewardSchemaId) return false;
        if (Double.compare(that.fareFrom, fareFrom) != 0) return false;
        if (noTrip != that.noTrip) return false;
        if (Double.compare(that.distanceFrom, distanceFrom) != 0) return false;
        if (Double.compare(that.reward, reward) != 0) return false;
        if (Double.compare(that.fareTo, fareTo) != 0) return false;
        if (pointFrom != that.pointFrom) return false;
        if (pointTo != that.pointTo) return false;
        if (programCode != null ? !programCode.equals(that.programCode) : that.programCode != null) return false;
        if (companyCode != null ? !companyCode.equals(that.companyCode) : that.companyCode != null) return false;
        if (distanceTo != null ? !distanceTo.equals(that.distanceTo) : that.distanceTo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = rewardSchemaId;
        result = 31 * result + (programCode != null ? programCode.hashCode() : 0);
        result = 31 * result + (companyCode != null ? companyCode.hashCode() : 0);
        temp = Double.doubleToLongBits(fareFrom);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) noTrip;
        temp = Double.doubleToLongBits(distanceFrom);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(reward);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(fareTo);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (distanceTo != null ? distanceTo.hashCode() : 0);
        result = 31 * result + (int) pointFrom;
        result = 31 * result + (int) pointTo;
        return result;
    }
}
