package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@IdClass(CollectedphonePK.class)
public class Collectedphone {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CountryCode", nullable = false, length = 4)
    private String countryCode;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Phone", nullable = false, length = 15)
    private String phone;
    @Basic
    @Column(name = "AreaCode", nullable = true, length = 4)
    private String areaCode;
    @Basic
    @Column(name = "Target", nullable = true, length = 4)
    private String target;
    @Basic
    @Column(name = "Status", nullable = true, length = 4)
    private String status;
    @Basic
    @Column(name = "Exist", nullable = false)
    private boolean exist;
    @Basic
    @Column(name = "IsVerified", nullable = false)
    private boolean isVerified;
    @Basic
    @Column(name = "VerifyCode", nullable = true, length = 10)
    private String verifyCode;
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
    @Column(name = "note", nullable = true, length = 400)
    private String note;
    @Basic
    @Column(name = "PushStatus", nullable = true, length = 4)
    private String pushStatus;
    @Basic
    @Column(name = "RiderRegStatus", nullable = false)
    private boolean riderRegStatus;
    @Basic
    @Column(name = "DriverRegStatus", nullable = false)
    private boolean driverRegStatus;
    @Basic
    @Column(name = "UserInputVCode", nullable = true, length = 10)
    private String userInputVCode;
    @Basic
    @Column(name = "ContactTimes", nullable = false)
    private byte contactTimes;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public boolean isExist() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
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

    public boolean isRiderRegStatus() {
        return riderRegStatus;
    }

    public void setRiderRegStatus(boolean riderRegStatus) {
        this.riderRegStatus = riderRegStatus;
    }

    public boolean isDriverRegStatus() {
        return driverRegStatus;
    }

    public void setDriverRegStatus(boolean driverRegStatus) {
        this.driverRegStatus = driverRegStatus;
    }

    public String getUserInputVCode() {
        return userInputVCode;
    }

    public void setUserInputVCode(String userInputVCode) {
        this.userInputVCode = userInputVCode;
    }

    public byte getContactTimes() {
        return contactTimes;
    }

    public void setContactTimes(byte contactTimes) {
        this.contactTimes = contactTimes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Collectedphone that = (Collectedphone) o;

        if (exist != that.exist) return false;
        if (isVerified != that.isVerified) return false;
        if (riderRegStatus != that.riderRegStatus) return false;
        if (driverRegStatus != that.driverRegStatus) return false;
        if (contactTimes != that.contactTimes) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (areaCode != null ? !areaCode.equals(that.areaCode) : that.areaCode != null) return false;
        if (target != null ? !target.equals(that.target) : that.target != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (verifyCode != null ? !verifyCode.equals(that.verifyCode) : that.verifyCode != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (pushStatus != null ? !pushStatus.equals(that.pushStatus) : that.pushStatus != null) return false;
        if (userInputVCode != null ? !userInputVCode.equals(that.userInputVCode) : that.userInputVCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = countryCode != null ? countryCode.hashCode() : 0;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (areaCode != null ? areaCode.hashCode() : 0);
        result = 31 * result + (target != null ? target.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (exist ? 1 : 0);
        result = 31 * result + (isVerified ? 1 : 0);
        result = 31 * result + (verifyCode != null ? verifyCode.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (pushStatus != null ? pushStatus.hashCode() : 0);
        result = 31 * result + (riderRegStatus ? 1 : 0);
        result = 31 * result + (driverRegStatus ? 1 : 0);
        result = 31 * result + (userInputVCode != null ? userInputVCode.hashCode() : 0);
        result = 31 * result + (int) contactTimes;
        return result;
    }
}
