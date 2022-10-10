package com.example.userservice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class DriverpromotioncodePK implements Serializable {
    @Column(name = "DriverID", nullable = false, length = 50)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String driverId;
    @Column(name = "Code", nullable = false, length = 20)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String code;
    @Column(name = "ProgramCode", nullable = false, length = 30)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String programCode;
    @Column(name = "CompanyCode", nullable = false, length = 10)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String companyCode;

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
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
        if (o == null || getClass() != o.getClass()) return false;

        DriverpromotioncodePK that = (DriverpromotioncodePK) o;

        if (driverId != null ? !driverId.equals(that.driverId) : that.driverId != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (programCode != null ? !programCode.equals(that.programCode) : that.programCode != null) return false;
        if (companyCode != null ? !companyCode.equals(that.companyCode) : that.companyCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = driverId != null ? driverId.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (programCode != null ? programCode.hashCode() : 0);
        result = 31 * result + (companyCode != null ? companyCode.hashCode() : 0);
        return result;
    }
}
