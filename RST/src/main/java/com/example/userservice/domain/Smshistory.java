package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Smshistory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "SMSHistoryID", nullable = false)
    private int smsHistoryId;
    @Basic
    @Column(name = "CountryCode", nullable = true, length = 4)
    private String countryCode;
    @Basic
    @Column(name = "RiderID", nullable = true, length = 50)
    private String riderId;
    @Basic
    @Column(name = "MobileNo", nullable = false, length = 20)
    private String mobileNo;
    @Basic
    @Column(name = "Operator", nullable = false, length = 30)
    private String operator;
    @Basic
    @Column(name = "Time", nullable = false)
    private Timestamp time;
    @Basic
    @Column(name = "Status", nullable = false, length = 2)
    private String status;
    @Basic
    @Column(name = "CreatedDate", nullable = false)
    private Timestamp createdDate;
    @Basic
    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;
    @Basic
    @Column(name = "LastModifiedDate", nullable = false)
    private Timestamp lastModifiedDate;
    @Basic
    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;
    @Basic
    @Column(name = "Internal", nullable = true)
    private Boolean internal;
    @Basic
    @Column(name = "errorCode", nullable = true)
    private Integer errorCode;
    @Basic
    @Column(name = "errorDetail", nullable = true, length = 500)
    private String errorDetail;
    @Basic
    @Column(name = "App", nullable = true, length = 20)
    private String app;
    @Basic
    @Column(name = "SentCode", nullable = true, length = 10)
    private String sentCode;
    @Basic
    @Column(name = "InputCode", nullable = true, length = 50)
    private String inputCode;

    public int getSmsHistoryId() {
        return smsHistoryId;
    }

    public void setSmsHistoryId(int smsHistoryId) {
        this.smsHistoryId = smsHistoryId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Boolean getInternal() {
        return internal;
    }

    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getSentCode() {
        return sentCode;
    }

    public void setSentCode(String sentCode) {
        this.sentCode = sentCode;
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Smshistory that = (Smshistory) o;

        if (smsHistoryId != that.smsHistoryId) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (riderId != null ? !riderId.equals(that.riderId) : that.riderId != null) return false;
        if (mobileNo != null ? !mobileNo.equals(that.mobileNo) : that.mobileNo != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (internal != null ? !internal.equals(that.internal) : that.internal != null) return false;
        if (errorCode != null ? !errorCode.equals(that.errorCode) : that.errorCode != null) return false;
        if (errorDetail != null ? !errorDetail.equals(that.errorDetail) : that.errorDetail != null) return false;
        if (app != null ? !app.equals(that.app) : that.app != null) return false;
        if (sentCode != null ? !sentCode.equals(that.sentCode) : that.sentCode != null) return false;
        if (inputCode != null ? !inputCode.equals(that.inputCode) : that.inputCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = smsHistoryId;
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (riderId != null ? riderId.hashCode() : 0);
        result = 31 * result + (mobileNo != null ? mobileNo.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (internal != null ? internal.hashCode() : 0);
        result = 31 * result + (errorCode != null ? errorCode.hashCode() : 0);
        result = 31 * result + (errorDetail != null ? errorDetail.hashCode() : 0);
        result = 31 * result + (app != null ? app.hashCode() : 0);
        result = 31 * result + (sentCode != null ? sentCode.hashCode() : 0);
        result = 31 * result + (inputCode != null ? inputCode.hashCode() : 0);
        return result;
    }
}
