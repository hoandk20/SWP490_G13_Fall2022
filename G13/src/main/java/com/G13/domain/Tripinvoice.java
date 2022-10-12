package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "tripinvoice")
public class Tripinvoice {
    @Id
    @Column(name = "InvoiceNumber", nullable = false, length = 50)
    private String id;

    @Column(name = "CompanyID", nullable = false)
    private Integer companyID;

    @Column(name = "DriverID", nullable = false, length = 50)
    private String driverID;

    @Column(name = "RiderID", nullable = false, length = 50)
    private String riderID;

    @Column(name = "TripID", nullable = false, length = 50)
    private String tripID;

    @Column(name = "VATRate", nullable = false)
    private Double vATRate;

    @Column(name = "VAT")
    private Double vat;

    @Column(name = "Promotion")
    private Double promotion;

    @Column(name = "Fee")
    private Double fee;

    @Column(name = "Paid")
    private Double paid;

    @Column(name = "InvoiceDate", nullable = false)
    private Instant invoiceDate;

    @Column(name = "Currency", nullable = false, length = 10)
    private String currency;

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

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public String getRiderID() {
        return riderID;
    }

    public void setRiderID(String riderID) {
        this.riderID = riderID;
    }

    public String getTripID() {
        return tripID;
    }

    public void setTripID(String tripID) {
        this.tripID = tripID;
    }

    public Double getVATRate() {
        return vATRate;
    }

    public void setVATRate(Double vATRate) {
        this.vATRate = vATRate;
    }

    public Double getVat() {
        return vat;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }

    public Double getPromotion() {
        return promotion;
    }

    public void setPromotion(Double promotion) {
        this.promotion = promotion;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public Double getPaid() {
        return paid;
    }

    public void setPaid(Double paid) {
        this.paid = paid;
    }

    public Instant getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Instant invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
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