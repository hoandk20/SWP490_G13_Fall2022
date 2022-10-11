package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "driverpromotioncode")
public class Driverpromotioncode {
    @EmbeddedId
    private DriverpromotioncodeId id;

    @MapsId("driverID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DriverID", nullable = false)
    private Driver driverID;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "Code", referencedColumnName = "Code", nullable = false),
            @JoinColumn(name = "ProgramCode", referencedColumnName = "ProgramCode", nullable = false),
            @JoinColumn(name = "CompanyCode", referencedColumnName = "CompanyCode", nullable = false)
    })
    private Promotioncode promotioncode;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "InviterId")
    private Taxinetuser inviter;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AccountTransactionID")
    private Accounttransaction accountTransactionID;

    public DriverpromotioncodeId getId() {
        return id;
    }

    public void setId(DriverpromotioncodeId id) {
        this.id = id;
    }

    public Driver getDriverID() {
        return driverID;
    }

    public void setDriverID(Driver driverID) {
        this.driverID = driverID;
    }

    public Promotioncode getPromotioncode() {
        return promotioncode;
    }

    public void setPromotioncode(Promotioncode promotioncode) {
        this.promotioncode = promotioncode;
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

    public Taxinetuser getInviter() {
        return inviter;
    }

    public void setInviter(Taxinetuser inviter) {
        this.inviter = inviter;
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

    public Accounttransaction getAccountTransactionID() {
        return accountTransactionID;
    }

    public void setAccountTransactionID(Accounttransaction accountTransactionID) {
        this.accountTransactionID = accountTransactionID;
    }

}