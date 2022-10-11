package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "taxinetusers")
public class Taxinetuser {
    @Id
    @Column(name = "UserID", nullable = false, length = 50)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "GroupCode", nullable = false)
    private Usergroup groupCode;

    @Column(name = "KnownSource", length = 3)
    private String knownSource;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CompanyID")
    private Company companyID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AgentID")
    private Agent agentID;

    @Column(name = "Username", nullable = false, length = 50)
    private String username;

    @Column(name = "Password", nullable = false, length = 50)
    private String password;

    @Column(name = "Status", nullable = false, length = 10)
    private String status;

    @Column(name = "DeactivatedDate")
    private LocalDate deactivatedDate;

    @Column(name = "ChangePasswordTime")
    private Instant changePasswordTime;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Usergroup getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(Usergroup groupCode) {
        this.groupCode = groupCode;
    }

    public String getKnownSource() {
        return knownSource;
    }

    public void setKnownSource(String knownSource) {
        this.knownSource = knownSource;
    }

    public Company getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Company companyID) {
        this.companyID = companyID;
    }

    public Agent getAgentID() {
        return agentID;
    }

    public void setAgentID(Agent agentID) {
        this.agentID = agentID;
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

    public LocalDate getDeactivatedDate() {
        return deactivatedDate;
    }

    public void setDeactivatedDate(LocalDate deactivatedDate) {
        this.deactivatedDate = deactivatedDate;
    }

    public Instant getChangePasswordTime() {
        return changePasswordTime;
    }

    public void setChangePasswordTime(Instant changePasswordTime) {
        this.changePasswordTime = changePasswordTime;
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

}