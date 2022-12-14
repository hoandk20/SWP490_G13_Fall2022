package com.G13.domain;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RidergiftcodeId implements Serializable {
    private static final long serialVersionUID = -6992364829419209635L;
    @Column(name = "RiderID", nullable = false, length = 50)
    private String riderID;

    @Column(name = "GiftCode", nullable = false, length = 20)
    private String giftCode;

    @Column(name = "ProgramCode", nullable = false, length = 30)
    private String programCode;

    @Column(name = "CompanyCode", nullable = false, length = 11)
    private String companyCode;

    public String getRiderID() {
        return riderID;
    }

    public void setRiderID(String riderID) {
        this.riderID = riderID;
    }

    public String getGiftCode() {
        return giftCode;
    }

    public void setGiftCode(String giftCode) {
        this.giftCode = giftCode;
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
        RidergiftcodeId entity = (RidergiftcodeId) o;
        return Objects.equals(this.companyCode, entity.companyCode) &&
                Objects.equals(this.riderID, entity.riderID) &&
                Objects.equals(this.giftCode, entity.giftCode) &&
                Objects.equals(this.programCode, entity.programCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyCode, riderID, giftCode, programCode);
    }

}