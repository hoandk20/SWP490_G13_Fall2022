package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "agentinvoice")
public class Agentinvoice {
    @Id
    @Column(name = "InvoiceNumber", nullable = false, length = 50)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "AgentID", nullable = false)
    private Agent agentID;

    @Column(name = "VATRate", nullable = false)
    private Float vATRate;

    @Column(name = "VAT", nullable = false)
    private Double vat;

    @Column(name = "Total", nullable = false)
    private Double total;

    @Column(name = "ActualPayment", nullable = false)
    private Double actualPayment;

    @Column(name = "InvoiceDate", nullable = false)
    private LocalDate invoiceDate;

    @Column(name = "FromDate", nullable = false)
    private LocalDate fromDate;

    @Column(name = "ToDate", nullable = false)
    private LocalDate toDate;

    @Column(name = "Currency", nullable = false, length = 10)
    private String currency;

    @Column(name = "PaymentType", nullable = false, length = 3)
    private String paymentType;

    @Column(name = "Category", nullable = false, length = 3)
    private String category;

    @Column(name = "Receiver", nullable = false, length = 100)
    private String receiver;

    @Column(name = "Status", nullable = false, length = 3)
    private String status;

    @Column(name = "Note", nullable = false, length = 200)
    private String note;

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

    public Agent getAgentID() {
        return agentID;
    }

    public void setAgentID(Agent agentID) {
        this.agentID = agentID;
    }

    public Float getVATRate() {
        return vATRate;
    }

    public void setVATRate(Float vATRate) {
        this.vATRate = vATRate;
    }

    public Double getVat() {
        return vat;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getActualPayment() {
        return actualPayment;
    }

    public void setActualPayment(Double actualPayment) {
        this.actualPayment = actualPayment;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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