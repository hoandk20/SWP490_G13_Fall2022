package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "driverpromotioncode")
public class Driverpromotioncode {
    @EmbeddedId
    private DriverpromotioncodeId id;

    @Column(name = "ObjectType", nullable = false, length = 2)
    private String objectType;

    @Column(name = "Status", length = 2)
    private String status;

    @Column(name = "AppliedDate")
    private LocalDate appliedDate;

    @Column(name = "ExpireDate")
    private LocalDate expireDate;

    @Column(name = "NumberOfTrip")
    private Short numberOfTrip;

    @Column(name = "AcualNumberOfTrip")
    private Short acualNumberOfTrip;

    @Column(name = "ActualNumberInvitee")
    private Short actualNumberInvitee;

    @Column(name = "ActualValue")
    private Double actualValue;

    @Column(name = "InviterId", length = 50)
    private String inviterId;

    @Column(name = "PromoCount")
    private Short promoCount;

    @Column(name = "InviterCalculated")
    private Boolean inviterCalculated;

    @Column(name = "InviteeCalculated")
    private Boolean inviteeCalculated;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "noInvitee", nullable = false)
    private Short noInvitee;

    @Column(name = "CalculatedValue", nullable = false)
    private Double calculatedValue;

    @Column(name = "AccountTransactionID", length = 50)
    private String accountTransactionID;

    public DriverpromotioncodeId getId() {
        return id;
    }

    public void setId(DriverpromotioncodeId id) {
        this.id = id;
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

    public LocalDate getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(LocalDate appliedDate) {
        this.appliedDate = appliedDate;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
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

    public Short getNoInvitee() {
        return noInvitee;
    }

    public void setNoInvitee(Short noInvitee) {
        this.noInvitee = noInvitee;
    }

    public Double getCalculatedValue() {
        return calculatedValue;
    }

    public void setCalculatedValue(Double calculatedValue) {
        this.calculatedValue = calculatedValue;
    }

    public String getAccountTransactionID() {
        return accountTransactionID;
    }

    public void setAccountTransactionID(String accountTransactionID) {
        this.accountTransactionID = accountTransactionID;
    }

}