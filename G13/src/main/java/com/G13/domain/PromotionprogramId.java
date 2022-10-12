package com.G13.domain;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PromotionprogramId implements Serializable {
    private static final long serialVersionUID = -3546799088209395974L;
    @Column(name = "ProgramCode", nullable = false, length = 30)
    private String programCode;

    @Column(name = "CompanyCode", nullable = false, length = 15)
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
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PromotionprogramId entity = (PromotionprogramId) o;
        return Objects.equals(this.companyCode, entity.companyCode) &&
                Objects.equals(this.programCode, entity.programCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyCode, programCode);
    }

}