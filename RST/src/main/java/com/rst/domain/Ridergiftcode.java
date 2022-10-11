package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "ridergiftcode")
public class Ridergiftcode {
    @EmbeddedId
    private RidergiftcodeId id;

    @MapsId("riderID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RiderID", nullable = false)
    private Rider riderID;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "GiftCode", referencedColumnName = "Code", nullable = false),
            @JoinColumn(name = "ProgramCode", referencedColumnName = "ProgramCode", nullable = false),
            @JoinColumn(name = "CompanyCode", referencedColumnName = "CompanyCode", nullable = false)
    })
    private Giftcode giftcode;

    @Column(name = "Status", length = 2)
    private String status;

    @Column(name = "AppliedDate")
    private LocalDate appliedDate;

    @Column(name = "ExpireDate")
    private LocalDate expireDate;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    public RidergiftcodeId getId() {
        return id;
    }

    public void setId(RidergiftcodeId id) {
        this.id = id;
    }

    public Rider getRiderID() {
        return riderID;
    }

    public void setRiderID(Rider riderID) {
        this.riderID = riderID;
    }

    public Giftcode getGiftcode() {
        return giftcode;
    }

    public void setGiftcode(Giftcode giftcode) {
        this.giftcode = giftcode;
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