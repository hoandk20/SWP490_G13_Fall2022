package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@IdClass(DriverpromotioncodePK.class)
public class Driverpromotioncode {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DriverID", nullable = false, length = 50)
    private String driverId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Code", nullable = false, length = 20)
    private String code;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ProgramCode", nullable = false, length = 30)
    private String programCode;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CompanyCode", nullable = false, length = 10)
    private String companyCode;
    @Basic
    @Column(name = "ObjectType", nullable = false, length = 2)
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
    @Column(name = "NumberOfTrip", nullable = true)
    private Short numberOfTrip;
    @Basic
    @Column(name = "AcualNumberOfTrip", nullable = true)
    private Short acualNumberOfTrip;
    @Basic
    @Column(name = "ActualNumberInvitee", nullable = true)
    private Short actualNumberInvitee;
    @Basic
    @Column(name = "ActualValue", nullable = true, precision = 0)
    private Double actualValue;
    @Basic
    @Column(name = "InviterId", nullable = true, length = 50)
    private String inviterId;
    @Basic
    @Column(name = "PromoCount", nullable = true)
    private Short promoCount;
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
    @Column(name = "CalculatedValue", nullable = false, precision = 0)
    private double calculatedValue;
    @Basic
    @Column(name = "AccountTransactionID", nullable = true, length = 50)
    private String accountTransactionId;

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public Short getNumberOfTrip() {
        return numberOfTrip;
    }

    public void setNumberOfTrip(Short numberOfTrip) {
        this.numberOfTrip = numberOfTrip;
    }

    public Short getAcualNumberOfTrip() {
        return acualNumberOfTrip;
    }

    public void setAcualNumberOfTrip(Short acualNumberOfTrip) {
        this.acualNumberOfTrip = acualNumberOfTrip;
    }

    public Short getActualNumberInvitee() {
        return actualNumberInvitee;
    }

    public void setActualNumberInvitee(Short actualNumberInvitee) {
        this.actualNumberInvitee = actualNumberInvitee;
    }

    public Double getActualValue() {
        return actualValue;
    }

    public void setActualValue(Double actualValue) {
        this.actualValue = actualValue;
    }

    public String getInviterId() {
        return inviterId;
    }

    public void setInviterId(String inviterId) {
        this.inviterId = inviterId;
    }

    public Short getPromoCount() {
        return promoCount;
    }

    public void setPromoCount(Short promoCount) {
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

    public double getCalculatedValue() {
        return calculatedValue;
    }

    public void setCalculatedValue(double calculatedValue) {
        this.calculatedValue = calculatedValue;
    }

    public String getAccountTransactionId() {
        return accountTransactionId;
    }

    public void setAccountTransactionId(String accountTransactionId) {
        this.accountTransactionId = accountTransactionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driverpromotioncode that = (Driverpromotioncode) o;

        if (noInvitee != that.noInvitee) return false;
        if (Double.compare(that.calculatedValue, calculatedValue) != 0) return false;
        if (driverId != null ? !driverId.equals(that.driverId) : that.driverId != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (programCode != null ? !programCode.equals(that.programCode) : that.programCode != null) return false;
        if (companyCode != null ? !companyCode.equals(that.companyCode) : that.companyCode != null) return false;
        if (objectType != null ? !objectType.equals(that.objectType) : that.objectType != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (appliedDate != null ? !appliedDate.equals(that.appliedDate) : that.appliedDate != null) return false;
        if (expireDate != null ? !expireDate.equals(that.expireDate) : that.expireDate != null) return false;
        if (numberOfTrip != null ? !numberOfTrip.equals(that.numberOfTrip) : that.numberOfTrip != null) return false;
        if (acualNumberOfTrip != null ? !acualNumberOfTrip.equals(that.acualNumberOfTrip) : that.acualNumberOfTrip != null)
            return false;
        if (actualNumberInvitee != null ? !actualNumberInvitee.equals(that.actualNumberInvitee) : that.actualNumberInvitee != null)
            return false;
        if (actualValue != null ? !actualValue.equals(that.actualValue) : that.actualValue != null) return false;
        if (inviterId != null ? !inviterId.equals(that.inviterId) : that.inviterId != null) return false;
        if (promoCount != null ? !promoCount.equals(that.promoCount) : that.promoCount != null) return false;
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
        if (accountTransactionId != null ? !accountTransactionId.equals(that.accountTransactionId) : that.accountTransactionId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = driverId != null ? driverId.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (programCode != null ? programCode.hashCode() : 0);
        result = 31 * result + (companyCode != null ? companyCode.hashCode() : 0);
        result = 31 * result + (objectType != null ? objectType.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (appliedDate != null ? appliedDate.hashCode() : 0);
        result = 31 * result + (expireDate != null ? expireDate.hashCode() : 0);
        result = 31 * result + (numberOfTrip != null ? numberOfTrip.hashCode() : 0);
        result = 31 * result + (acualNumberOfTrip != null ? acualNumberOfTrip.hashCode() : 0);
        result = 31 * result + (actualNumberInvitee != null ? actualNumberInvitee.hashCode() : 0);
        result = 31 * result + (actualValue != null ? actualValue.hashCode() : 0);
        result = 31 * result + (inviterId != null ? inviterId.hashCode() : 0);
        result = 31 * result + (promoCount != null ? promoCount.hashCode() : 0);
        result = 31 * result + (inviterCalculated != null ? inviterCalculated.hashCode() : 0);
        result = 31 * result + (inviteeCalculated != null ? inviteeCalculated.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (int) noInvitee;
        temp = Double.doubleToLongBits(calculatedValue);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (accountTransactionId != null ? accountTransactionId.hashCode() : 0);
        return result;
    }
}
