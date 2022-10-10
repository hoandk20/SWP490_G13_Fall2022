package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@IdClass(RiderpromotioncodePK.class)
public class Riderpromotioncode {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RiderID", nullable = false, length = 50)
    private String riderId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ProgramCode", nullable = false, length = 30)
    private String programCode;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Code", nullable = false, length = 20)
    private String code;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CompanyCode", nullable = false, length = 11)
    private String companyCode;
    @Basic
    @Column(name = "ObjectType", nullable = true, length = 2)
    private String objectType;
    @Basic
    @Column(name = "Status", nullable = true, length = 2)
    private String status;
    @Basic
    @Column(name = "AppliedDate", nullable = true)
    private Date appliedDate;
    @Basic
    @Column(name = "ExpireDate", nullable = true)
    private Date expireDate;
    @Basic
    @Column(name = "NumberOfTrip", nullable = false)
    private short numberOfTrip;
    @Basic
    @Column(name = "AcualNumberOfTrip", nullable = false)
    private short acualNumberOfTrip;
    @Basic
    @Column(name = "ActualNumberInvitee", nullable = false)
    private short actualNumberInvitee;
    @Basic
    @Column(name = "InviterID", nullable = true, length = 50)
    private String inviterId;
    @Basic
    @Column(name = "PromoCount", nullable = false)
    private short promoCount;
    @Basic
    @Column(name = "InviterCalculated", nullable = true)
    private Boolean inviterCalculated;
    @Basic
    @Column(name = "InviteeCalculated", nullable = true)
    private Boolean inviteeCalculated;
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
    @Column(name = "noInvitee", nullable = false)
    private short noInvitee;
    @Basic
    @Column(name = "ActualValue", nullable = false, precision = 0)
    private double actualValue;
    @Basic
    @Column(name = "CalculatedValue", nullable = false, precision = 0)
    private double calculatedValue;

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(Date appliedDate) {
        this.appliedDate = appliedDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public short getNumberOfTrip() {
        return numberOfTrip;
    }

    public void setNumberOfTrip(short numberOfTrip) {
        this.numberOfTrip = numberOfTrip;
    }

    public short getAcualNumberOfTrip() {
        return acualNumberOfTrip;
    }

    public void setAcualNumberOfTrip(short acualNumberOfTrip) {
        this.acualNumberOfTrip = acualNumberOfTrip;
    }

    public short getActualNumberInvitee() {
        return actualNumberInvitee;
    }

    public void setActualNumberInvitee(short actualNumberInvitee) {
        this.actualNumberInvitee = actualNumberInvitee;
    }

    public String getInviterId() {
        return inviterId;
    }

    public void setInviterId(String inviterId) {
        this.inviterId = inviterId;
    }

    public short getPromoCount() {
        return promoCount;
    }

    public void setPromoCount(short promoCount) {
        this.promoCount = promoCount;
    }

    public Boolean getInviterCalculated() {
        return inviterCalculated;
    }

    public void setInviterCalculated(Boolean inviterCalculated) {
        this.inviterCalculated = inviterCalculated;
    }

    public Boolean getInviteeCalculated() {
        return inviteeCalculated;
    }

    public void setInviteeCalculated(Boolean inviteeCalculated) {
        this.inviteeCalculated = inviteeCalculated;
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

    public short getNoInvitee() {
        return noInvitee;
    }

    public void setNoInvitee(short noInvitee) {
        this.noInvitee = noInvitee;
    }

    public double getActualValue() {
        return actualValue;
    }

    public void setActualValue(double actualValue) {
        this.actualValue = actualValue;
    }

    public double getCalculatedValue() {
        return calculatedValue;
    }

    public void setCalculatedValue(double calculatedValue) {
        this.calculatedValue = calculatedValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Riderpromotioncode that = (Riderpromotioncode) o;

        if (numberOfTrip != that.numberOfTrip) return false;
        if (acualNumberOfTrip != that.acualNumberOfTrip) return false;
        if (actualNumberInvitee != that.actualNumberInvitee) return false;
        if (promoCount != that.promoCount) return false;
        if (noInvitee != that.noInvitee) return false;
        if (Double.compare(that.actualValue, actualValue) != 0) return false;
        if (Double.compare(that.calculatedValue, calculatedValue) != 0) return false;
        if (riderId != null ? !riderId.equals(that.riderId) : that.riderId != null) return false;
        if (programCode != null ? !programCode.equals(that.programCode) : that.programCode != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (companyCode != null ? !companyCode.equals(that.companyCode) : that.companyCode != null) return false;
        if (objectType != null ? !objectType.equals(that.objectType) : that.objectType != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (appliedDate != null ? !appliedDate.equals(that.appliedDate) : that.appliedDate != null) return false;
        if (expireDate != null ? !expireDate.equals(that.expireDate) : that.expireDate != null) return false;
        if (inviterId != null ? !inviterId.equals(that.inviterId) : that.inviterId != null) return false;
        if (inviterCalculated != null ? !inviterCalculated.equals(that.inviterCalculated) : that.inviterCalculated != null)
            return false;
        if (inviteeCalculated != null ? !inviteeCalculated.equals(that.inviteeCalculated) : that.inviteeCalculated != null)
            return false;
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
        result = riderId != null ? riderId.hashCode() : 0;
        result = 31 * result + (programCode != null ? programCode.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (companyCode != null ? companyCode.hashCode() : 0);
        result = 31 * result + (objectType != null ? objectType.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (appliedDate != null ? appliedDate.hashCode() : 0);
        result = 31 * result + (expireDate != null ? expireDate.hashCode() : 0);
        result = 31 * result + (int) numberOfTrip;
        result = 31 * result + (int) acualNumberOfTrip;
        result = 31 * result + (int) actualNumberInvitee;
        result = 31 * result + (inviterId != null ? inviterId.hashCode() : 0);
        result = 31 * result + (int) promoCount;
        result = 31 * result + (inviterCalculated != null ? inviterCalculated.hashCode() : 0);
        result = 31 * result + (inviteeCalculated != null ? inviteeCalculated.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (int) noInvitee;
        temp = Double.doubleToLongBits(actualValue);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(calculatedValue);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
