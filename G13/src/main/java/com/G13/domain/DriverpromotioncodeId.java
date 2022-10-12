package com.G13.domain;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DriverpromotioncodeId implements Serializable {
    private static final long serialVersionUID = 8794011942793863425L;
    @Column(name = "DriverID", nullable = false, length = 50)
    private String driverID;

    @Column(name = "Code", nullable = false, length = 20)
    private String code;

    @Column(name = "ProgramCode", nullable = false, length = 30)
    private String programCode;

    @Column(name = "CompanyCode", nullable = false, length = 10)
    private String companyCode;

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
        DriverpromotioncodeId entity = (DriverpromotioncodeId) o;
        return Objects.equals(this.companyCode, entity.companyCode) &&
                Objects.equals(this.code, entity.code) &&
                Objects.equals(this.driverID, entity.driverID) &&
                Objects.equals(this.programCode, entity.programCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyCode, code, driverID, programCode);
    }

}