package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "proposedfaresateschema")
public class Proposedfaresateschema {
    @Id
    @Column(name = "ProposedFareRateSchemaId", nullable = false)
    private Integer id;

    @Column(name = "FareTo", nullable = false)
    private Double fareTo;

    @Column(name = "FareFrom", nullable = false)
    private Double fareFrom;

    @Column(name = "Rate", nullable = false)
    private Float rate;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "Status", nullable = false, length = 5)
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getFareTo() {
        return fareTo;
    }

    public void setFareTo(Double fareTo) {
        this.fareTo = fareTo;
    }

    public Double getFareFrom() {
        return fareFrom;
    }

    public void setFareFrom(Double fareFrom) {
        this.fareFrom = fareFrom;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}