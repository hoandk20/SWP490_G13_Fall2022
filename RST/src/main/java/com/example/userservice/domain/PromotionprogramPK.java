package com.example.userservice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class PromotionprogramPK implements Serializable {
    @Column(name = "ProgramCode", nullable = false, length = 30)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String programCode;
    @Column(name = "CompanyCode", nullable = false, length = 15)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String companyCode;

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

        PromotionprogramPK that = (PromotionprogramPK) o;

        if (programCode != null ? !programCode.equals(that.programCode) : that.programCode != null) return false;
        if (companyCode != null ? !companyCode.equals(that.companyCode) : that.companyCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = programCode != null ? programCode.hashCode() : 0;
        result = 31 * result + (companyCode != null ? companyCode.hashCode() : 0);
        return result;
    }
}
