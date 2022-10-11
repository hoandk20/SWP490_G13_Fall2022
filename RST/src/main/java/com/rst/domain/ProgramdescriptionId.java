package com.rst.domain;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProgramdescriptionId implements Serializable {
    private static final long serialVersionUID = -3854954295313638517L;
    @Column(name = "ProgramCode", nullable = false, length = 30)
    private String programCode;

    @Column(name = "CompanyCode", nullable = false, length = 11)
    private String companyCode;

    @Column(name = "Language", nullable = false, length = 4)
    private String language;

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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProgramdescriptionId entity = (ProgramdescriptionId) o;
        return Objects.equals(this.companyCode, entity.companyCode) &&
                Objects.equals(this.programCode, entity.programCode) &&
                Objects.equals(this.language, entity.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyCode, programCode, language);
    }

}