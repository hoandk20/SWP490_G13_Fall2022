package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Tripinvoice {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "InvoiceNumber", nullable = false, length = 50)
    private String invoiceNumber;
    @Basic
    @Column(name = "CompanyID", nullable = false)
    private int companyId;
    @Basic
    @Column(name = "DriverID", nullable = false, length = 50)
    private String driverId;
    @Basic
    @Column(name = "RiderID", nullable = false, length = 50)
    private String riderId;
    @Basic
    @Column(name = "TripID", nullable = false, length = 50)
    private String tripId;
    @Basic
    @Column(name = "VATRate", nullable = false, precision = 0)
    private double vatRate;
    @Basic
    @Column(name = "VAT", nullable = true, precision = 0)
    private Double vat;
    @Basic
    @Column(name = "Promotion", nullable = true, precision = 0)
    private Double promotion;
    @Basic
    @Column(name = "Fee", nullable = true, precision = 0)
    private Double fee;
    @Basic
    @Column(name = "Paid", nullable = true, precision = 0)
    private Double paid;
    @Basic
    @Column(name = "InvoiceDate", nullable = false)
    private Timestamp invoiceDate;
    @Basic
    @Column(name = "Currency", nullable = false, length = 10)
    private String currency;
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

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public double getVatRate() {
        return vatRate;
    }

    public void setVatRate(double vatRate) {
        this.vatRate = vatRate;
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

    public Timestamp getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Timestamp invoiceDate) {
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

        Tripinvoice that = (Tripinvoice) o;

        if (companyId != that.companyId) return false;
        if (Double.compare(that.vatRate, vatRate) != 0) return false;
        if (invoiceNumber != null ? !invoiceNumber.equals(that.invoiceNumber) : that.invoiceNumber != null)
            return false;
        if (driverId != null ? !driverId.equals(that.driverId) : that.driverId != null) return false;
        if (riderId != null ? !riderId.equals(that.riderId) : that.riderId != null) return false;
        if (tripId != null ? !tripId.equals(that.tripId) : that.tripId != null) return false;
        if (vat != null ? !vat.equals(that.vat) : that.vat != null) return false;
        if (promotion != null ? !promotion.equals(that.promotion) : that.promotion != null) return false;
        if (fee != null ? !fee.equals(that.fee) : that.fee != null) return false;
        if (paid != null ? !paid.equals(that.paid) : that.paid != null) return false;
        if (invoiceDate != null ? !invoiceDate.equals(that.invoiceDate) : that.invoiceDate != null) return false;
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;
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
        int result;
        long temp;
        result = invoiceNumber != null ? invoiceNumber.hashCode() : 0;
        result = 31 * result + companyId;
        result = 31 * result + (driverId != null ? driverId.hashCode() : 0);
        result = 31 * result + (riderId != null ? riderId.hashCode() : 0);
        result = 31 * result + (tripId != null ? tripId.hashCode() : 0);
        temp = Double.doubleToLongBits(vatRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (vat != null ? vat.hashCode() : 0);
        result = 31 * result + (promotion != null ? promotion.hashCode() : 0);
        result = 31 * result + (fee != null ? fee.hashCode() : 0);
        result = 31 * result + (paid != null ? paid.hashCode() : 0);
        result = 31 * result + (invoiceDate != null ? invoiceDate.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        return result;
    }
}
