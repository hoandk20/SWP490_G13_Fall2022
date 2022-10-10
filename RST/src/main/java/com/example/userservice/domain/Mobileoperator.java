package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Mobileoperator {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "OperatorID", nullable = false)
    private int operatorId;
    @Basic
    @Column(name = "CountryCode", nullable = false, length = 4)
    private String countryCode;
    @Basic
    @Column(name = "HeaderCode", nullable = false, length = 6)
    private String headerCode;
    @Basic
    @Column(name = "OperatorCode", nullable = false, length = 4)
    private String operatorCode;
    @Basic
    @Column(name = "Name", nullable = false, length = 50)
    private String name;
    @Basic
    @Column(name = "InternalPrice", nullable = true, precision = 0)
    private Double internalPrice;
    @Basic
    @Column(name = "ExternalPrice", nullable = true, precision = 0)
    private Double externalPrice;
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
    @Column(name = "Length", nullable = true)
    private Integer length;

    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getHeaderCode() {
        return headerCode;
    }

    public void setHeaderCode(String headerCode) {
        this.headerCode = headerCode;
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getInternalPrice() {
        return internalPrice;
    }

    public void setInternalPrice(Double internalPrice) {
        this.internalPrice = internalPrice;
    }

    public Double getExternalPrice() {
        return externalPrice;
    }

    public void setExternalPrice(Double externalPrice) {
        this.externalPrice = externalPrice;
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

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mobileoperator that = (Mobileoperator) o;

        if (operatorId != that.operatorId) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (headerCode != null ? !headerCode.equals(that.headerCode) : that.headerCode != null) return false;
        if (operatorCode != null ? !operatorCode.equals(that.operatorCode) : that.operatorCode != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (internalPrice != null ? !internalPrice.equals(that.internalPrice) : that.internalPrice != null)
            return false;
        if (externalPrice != null ? !externalPrice.equals(that.externalPrice) : that.externalPrice != null)
            return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (length != null ? !length.equals(that.length) : that.length != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = operatorId;
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (headerCode != null ? headerCode.hashCode() : 0);
        result = 31 * result + (operatorCode != null ? operatorCode.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (internalPrice != null ? internalPrice.hashCode() : 0);
        result = 31 * result + (externalPrice != null ? externalPrice.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        return result;
    }
}
