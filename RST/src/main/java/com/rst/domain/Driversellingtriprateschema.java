package com.rst.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "driversellingtriprateschema")
public class Driversellingtriprateschema {
    @Id
    @Column(name = "DriverSellingTripRateSchemaID", nullable = false)
    private Integer id;

    @Column(name = "StartDate", nullable = false)
    private LocalDate startDate;

    @Column(name = "EndDate")
    private LocalDate endDate;

    @Column(name = "MinFee", nullable = false)
    private Float minFee;

    @Column(name = "MaxFee", nullable = false)
    private Float maxFee;

    @Column(name = "Rate", nullable = false)
    private Float rate;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "CancelFee", nullable = false)
    private Float cancelFee;

    @Column(name = "Status", nullable = false, length = 20)
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Float getMinFee() {
        return minFee;
    }

    public void setMinFee(Float minFee) {
        this.minFee = minFee;
    }

    public Float getMaxFee() {
        return maxFee;
    }

    public void setMaxFee(Float maxFee) {
        this.maxFee = maxFee;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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

    public Float getCancelFee() {
        return cancelFee;
    }

    public void setCancelFee(Float cancelFee) {
        this.cancelFee = cancelFee;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}