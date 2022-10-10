package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Taxinetusers {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "UserID", nullable = false, length = 50)
    private String userId;
    @Basic
    @Column(name = "GroupCode", nullable = false, length = 3)
    private String groupCode;
    @Basic
    @Column(name = "KnownSource", nullable = true, length = 3)
    private String knownSource;
    @Basic
    @Column(name = "CompanyID", nullable = true)
    private Integer companyId;
    @Basic
    @Column(name = "AgentID", nullable = true)
    private Integer agentId;
    @Basic
    @Column(name = "Username", nullable = false, length = 50)
    private String username;
    @Basic
    @Column(name = "Password", nullable = false, length = 50)
    private String password;
    @Basic
    @Column(name = "Status", nullable = false, length = 10)
    private String status;
    @Basic
    @Column(name = "DeactivatedDate", nullable = true)
    private Date deactivatedDate;
    @Basic
    @Column(name = "ChangePasswordTime", nullable = true)
    private Timestamp changePasswordTime;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getKnownSource() {
        return knownSource;
    }

    public void setKnownSource(String knownSource) {
        this.knownSource = knownSource;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDeactivatedDate() {
        return deactivatedDate;
    }

    public void setDeactivatedDate(Date deactivatedDate) {
        this.deactivatedDate = deactivatedDate;
    }

    public Timestamp getChangePasswordTime() {
        return changePasswordTime;
    }

    public void setChangePasswordTime(Timestamp changePasswordTime) {
        this.changePasswordTime = changePasswordTime;
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

        Taxinetusers that = (Taxinetusers) o;

        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (groupCode != null ? !groupCode.equals(that.groupCode) : that.groupCode != null) return false;
        if (knownSource != null ? !knownSource.equals(that.knownSource) : that.knownSource != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (agentId != null ? !agentId.equals(that.agentId) : that.agentId != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (deactivatedDate != null ? !deactivatedDate.equals(that.deactivatedDate) : that.deactivatedDate != null)
            return false;
        if (changePasswordTime != null ? !changePasswordTime.equals(that.changePasswordTime) : that.changePasswordTime != null)
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
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (groupCode != null ? groupCode.hashCode() : 0);
        result = 31 * result + (knownSource != null ? knownSource.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (agentId != null ? agentId.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (deactivatedDate != null ? deactivatedDate.hashCode() : 0);
        result = 31 * result + (changePasswordTime != null ? changePasswordTime.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        return result;
    }
}
