package com.rst.domain;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CitypromotionprogramId implements Serializable {
    private static final long serialVersionUID = -4204002342449960038L;
    @Column(name = "CityID", nullable = false)
    private Integer cityID;

    @Column(name = "ProgramCode", nullable = false, length = 30)
    private String programCode;

    @Column(name = "CompanyCode", nullable = false, length = 15)
    private String companyCode;

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CitypromotionprogramId entity = (CitypromotionprogramId) o;
        return Objects.equals(this.companyCode, entity.companyCode) &&
                Objects.equals(this.programCode, entity.programCode) &&
                Objects.equals(this.cityID, entity.cityID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyCode, programCode, cityID);
    }

}