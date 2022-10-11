package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "driverfeetabledetail")
public class Driverfeetabledetail {
    @Id
    @Column(name = "DriverFeeTableDetailID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DriverFeeTableID", nullable = false)
    private Driverfeetable driverFeeTableID;

    @Column(name = "FromKM", nullable = false)
    private Float fromKM;

    @Column(name = "ToKM", nullable = false)
    private Float toKM;

    @Column(name = "Fee", nullable = false)
    private Float fee;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "LastModifyDate", nullable = false)
    private Instant lastModifyDate;

    @Column(name = "LastModifyBy", nullable = false, length = 50)
    private String lastModifyBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Driverfeetable getDriverFeeTableID() {
        return driverFeeTableID;
    }

    public void setDriverFeeTableID(Driverfeetable driverFeeTableID) {
        this.driverFeeTableID = driverFeeTableID;
    }

    public Float getFromKM() {
        return fromKM;
    }

    public void setFromKM(Float fromKM) {
        this.fromKM = fromKM;
    }

    public Float getToKM() {
        return toKM;
    }

    public void setToKM(Float toKM) {
        this.toKM = toKM;
    }

    public Float getFee() {
        return fee;
    }

    public void setFee(Float fee) {
        this.fee = fee;
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

    public Instant getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Instant lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public String getLastModifyBy() {
        return lastModifyBy;
    }

    public void setLastModifyBy(String lastModifyBy) {
        this.lastModifyBy = lastModifyBy;
    }

}