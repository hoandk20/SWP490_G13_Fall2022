package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "tripinvoice")
public class Tripinvoice {
    @Id
    @Column(name = "InvoiceNumber", nullable = false, length = 50)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CompanyID", nullable = false)
    private Company companyID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DriverID", nullable = false)
    private Driver driverID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RiderID", nullable = false)
    private Rider riderID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TripID", nullable = false)
    private Trip tripID;

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

    public Company getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Company companyID) {
        this.companyID = companyID;
    }

    public Driver getDriverID() {
        return driverID;
    }

    public void setDriverID(Driver driverID) {
        this.driverID = driverID;
    }

    public Rider getRiderID() {
        return riderID;
    }

    public void setRiderID(Rider riderID) {
        this.riderID = riderID;
    }

    public Trip getTripID() {
        return tripID;
    }

    public void setTripID(Trip tripID) {
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