package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "riderorder")
public class Riderorder {
    @Id
    @Column(name = "OrderNumber", nullable = false, length = 50)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RiderID", nullable = false)
    private Rider riderID;

    @Column(name = "Point", nullable = false)
    private Integer point;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OrganizationPromotionNo")
    private Organizationpromotion organizationPromotionNo;

    @Column(name = "Status", nullable = false, length = 4)
    private String status;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PaymentNumber")
    private Agentpayment paymentNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Rider getRiderID() {
        return riderID;
    }

    public void setRiderID(Rider riderID) {
        this.riderID = riderID;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Organizationpromotion getOrganizationPromotionNo() {
        return organizationPromotionNo;
    }

    public void setOrganizationPromotionNo(Organizationpromotion organizationPromotionNo) {
        this.organizationPromotionNo = organizationPromotionNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Agentpayment getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(Agentpayment paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

}