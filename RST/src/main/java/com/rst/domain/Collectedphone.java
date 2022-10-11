package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "collectedphone")
public class Collectedphone {
    @EmbeddedId
    private CollectedphoneId id;

    @MapsId("countryCode")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country countryCode;

    @Column(name = "AreaCode", length = 4)
    private String areaCode;

    @Column(name = "Target", length = 4)
    private String target;

    @Column(name = "Status", length = 4)
    private String status;

    @Column(name = "Exist", nullable = false)
    private Boolean exist = false;

    @Column(name = "IsVerified", nullable = false)
    private Boolean isVerified = false;

    @Column(name = "VerifyCode", length = 10)
    private String verifyCode;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "note", length = 400)
    private String note;

    @Column(name = "PushStatus", length = 4)
    private String pushStatus;

    @Column(name = "RiderRegStatus", nullable = false)
    private Boolean riderRegStatus = false;

    @Column(name = "DriverRegStatus", nullable = false)
    private Boolean driverRegStatus = false;

    @Column(name = "UserInputVCode", length = 10)
    private String userInputVCode;

    @Column(name = "ContactTimes", nullable = false)
    private Byte contactTimes;

    public CollectedphoneId getId() {
        return id;
    }

    public void setId(CollectedphoneId id) {
        this.id = id;
    }

    public Country getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Country countryCode) {
        this.countryCode = countryCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getExist() {
        return exist;
    }

    public void setExist(Boolean exist) {
        this.exist = exist;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPushStatus() {
        return pushStatus;
    }

    public void setPushStatus(String pushStatus) {
        this.pushStatus = pushStatus;
    }

    public Boolean getRiderRegStatus() {
        return riderRegStatus;
    }

    public void setRiderRegStatus(Boolean riderRegStatus) {
        this.riderRegStatus = riderRegStatus;
    }

    public Boolean getDriverRegStatus() {
        return driverRegStatus;
    }

    public void setDriverRegStatus(Boolean driverRegStatus) {
        this.driverRegStatus = driverRegStatus;
    }

    public String getUserInputVCode() {
        return userInputVCode;
    }

    public void setUserInputVCode(String userInputVCode) {
        this.userInputVCode = userInputVCode;
    }

    public Byte getContactTimes() {
        return contactTimes;
    }

    public void setContactTimes(Byte contactTimes) {
        this.contactTimes = contactTimes;
    }

}