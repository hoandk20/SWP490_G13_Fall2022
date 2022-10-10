package com.example.userservice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class RidergiftcodePK implements Serializable {
    @Column(name = "RiderID", nullable = false, length = 50)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String riderId;
    @Column(name = "GiftCode", nullable = false, length = 20)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String giftCode;
    @Column(name = "ProgramCode", nullable = false, length = 30)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String programCode;
    @Column(name = "CompanyCode", nullable = false, length = 11)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String companyCode;

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
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
        if (o == null || getClass() != o.getClass()) return false;

        RidergiftcodePK that = (RidergiftcodePK) o;

        if (riderId != null ? !riderId.equals(that.riderId) : that.riderId != null) return false;
        if (giftCode != null ? !giftCode.equals(that.giftCode) : that.giftCode != null) return false;
        if (programCode != null ? !programCode.equals(that.programCode) : that.programCode != null) return false;
        if (companyCode != null ? !companyCode.equals(that.companyCode) : that.companyCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = riderId != null ? riderId.hashCode() : 0;
        result = 31 * result + (giftCode != null ? giftCode.hashCode() : 0);
        result = 31 * result + (programCode != null ? programCode.hashCode() : 0);
        result = 31 * result + (companyCode != null ? companyCode.hashCode() : 0);
        return result;
    }
}
