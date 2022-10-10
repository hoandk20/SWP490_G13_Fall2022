package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Riderorder {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "OrderNumber", nullable = false, length = 50)
    private String orderNumber;
    @Basic
    @Column(name = "RiderID", nullable = false, length = 50)
    private String riderId;
    @Basic
    @Column(name = "Point", nullable = false)
    private int point;
    @Basic
    @Column(name = "OrganizationPromotionNo", nullable = true, length = 50)
    private String organizationPromotionNo;
    @Basic
    @Column(name = "Status", nullable = false, length = 4)
    private String status;
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
    @Column(name = "PaymentNumber", nullable = true, length = 50)
    private String paymentNumber;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getOrganizationPromotionNo() {
        return organizationPromotionNo;
    }

    public void setOrganizationPromotionNo(String organizationPromotionNo) {
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

    public String getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(String paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Riderorder that = (Riderorder) o;

        if (point != that.point) return false;
        if (orderNumber != null ? !orderNumber.equals(that.orderNumber) : that.orderNumber != null) return false;
        if (riderId != null ? !riderId.equals(that.riderId) : that.riderId != null) return false;
        if (organizationPromotionNo != null ? !organizationPromotionNo.equals(that.organizationPromotionNo) : that.organizationPromotionNo != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (paymentNumber != null ? !paymentNumber.equals(that.paymentNumber) : that.paymentNumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderNumber != null ? orderNumber.hashCode() : 0;
        result = 31 * result + (riderId != null ? riderId.hashCode() : 0);
        result = 31 * result + point;
        result = 31 * result + (organizationPromotionNo != null ? organizationPromotionNo.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (paymentNumber != null ? paymentNumber.hashCode() : 0);
        return result;
    }
}
