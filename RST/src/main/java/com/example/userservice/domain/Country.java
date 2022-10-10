package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Country {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Code", nullable = false, length = 4)
    private String code;
    @Basic
    @Column(name = "Name", nullable = false, length = 50)
    private String name;
    @Basic
    @Column(name = "Operate", nullable = false)
    private byte operate;
    @Basic
    @Column(name = "PostalCode", nullable = false, length = 5)
    private String postalCode;
    @Basic
    @Column(name = "DistanceUnit", nullable = false, length = 7)
    private String distanceUnit;
    @Basic
    @Column(name = "RequestInvoice", nullable = false)
    private byte requestInvoice;
    @Basic
    @Column(name = "Currency", nullable = true, length = 12)
    private String currency;
    @Basic
    @Column(name = "RoundValue", nullable = true)
    private Integer roundValue;
    @Basic
    @Column(name = "RoundUnit", nullable = true, length = 5)
    private String roundUnit;
    @Basic
    @Column(name = "NumberFormat", nullable = true, length = 15)
    private String numberFormat;
    @Basic
    @Column(name = "CurrencyFormat", nullable = true, length = 5)
    private String currencyFormat;
    @Basic
    @Column(name = "InternationalCode", nullable = false, length = 9)
    private String internationalCode;
    @Basic
    @Column(name = "RiderPromotion", nullable = true, length = 75)
    private String riderPromotion;
    @Basic
    @Column(name = "DriverPromotion", nullable = true, length = 75)
    private String driverPromotion;
    @Basic
    @Column(name = "AgentPromotion", nullable = true, length = 75)
    private String agentPromotion;
    @Basic
    @Column(name = "RiderInvitation", nullable = true, length = 75)
    private String riderInvitation;
    @Basic
    @Column(name = "DriverInvitation", nullable = true, length = 75)
    private String driverInvitation;
    @Basic
    @Column(name = "AgentInvitation", nullable = true, length = 75)
    private String agentInvitation;
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
    @Column(name = "IncludedTolls", nullable = true)
    private Boolean includedTolls;
    @Basic
    @Column(name = "ChargeBankFee", nullable = true)
    private Boolean chargeBankFee;
    @Basic
    @Column(name = "RiderMinRate", nullable = true, precision = 0)
    private Double riderMinRate;
    @Basic
    @Column(name = "SupportEmail", nullable = true, length = 50)
    private String supportEmail;
    @Basic
    @Column(name = "MinDriverBalance", nullable = false, precision = 0)
    private double minDriverBalance;
    @Basic
    @Column(name = "MinWithdrawal", nullable = true, precision = 0)
    private Double minWithdrawal;
    @Basic
    @Column(name = "MinChargeAmount", nullable = false, precision = 0)
    private double minChargeAmount;
    @Basic
    @Column(name = "completeTripTimeOut", nullable = false)
    private byte completeTripTimeOut;
    @Basic
    @Column(name = "MobileRegex", nullable = true, length = 300)
    private String mobileRegex;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getOperate() {
        return operate;
    }

    public void setOperate(byte operate) {
        this.operate = operate;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getDistanceUnit() {
        return distanceUnit;
    }

    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    public byte getRequestInvoice() {
        return requestInvoice;
    }

    public void setRequestInvoice(byte requestInvoice) {
        this.requestInvoice = requestInvoice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getRoundValue() {
        return roundValue;
    }

    public void setRoundValue(Integer roundValue) {
        this.roundValue = roundValue;
    }

    public String getRoundUnit() {
        return roundUnit;
    }

    public void setRoundUnit(String roundUnit) {
        this.roundUnit = roundUnit;
    }

    public String getNumberFormat() {
        return numberFormat;
    }

    public void setNumberFormat(String numberFormat) {
        this.numberFormat = numberFormat;
    }

    public String getCurrencyFormat() {
        return currencyFormat;
    }

    public void setCurrencyFormat(String currencyFormat) {
        this.currencyFormat = currencyFormat;
    }

    public String getInternationalCode() {
        return internationalCode;
    }

    public void setInternationalCode(String internationalCode) {
        this.internationalCode = internationalCode;
    }

    public String getRiderPromotion() {
        return riderPromotion;
    }

    public void setRiderPromotion(String riderPromotion) {
        this.riderPromotion = riderPromotion;
    }

    public String getDriverPromotion() {
        return driverPromotion;
    }

    public void setDriverPromotion(String driverPromotion) {
        this.driverPromotion = driverPromotion;
    }

    public String getAgentPromotion() {
        return agentPromotion;
    }

    public void setAgentPromotion(String agentPromotion) {
        this.agentPromotion = agentPromotion;
    }

    public String getRiderInvitation() {
        return riderInvitation;
    }

    public void setRiderInvitation(String riderInvitation) {
        this.riderInvitation = riderInvitation;
    }

    public String getDriverInvitation() {
        return driverInvitation;
    }

    public void setDriverInvitation(String driverInvitation) {
        this.driverInvitation = driverInvitation;
    }

    public String getAgentInvitation() {
        return agentInvitation;
    }

    public void setAgentInvitation(String agentInvitation) {
        this.agentInvitation = agentInvitation;
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

    public Boolean getIncludedTolls() {
        return includedTolls;
    }

    public void setIncludedTolls(Boolean includedTolls) {
        this.includedTolls = includedTolls;
    }

    public Boolean getChargeBankFee() {
        return chargeBankFee;
    }

    public void setChargeBankFee(Boolean chargeBankFee) {
        this.chargeBankFee = chargeBankFee;
    }

    public Double getRiderMinRate() {
        return riderMinRate;
    }

    public void setRiderMinRate(Double riderMinRate) {
        this.riderMinRate = riderMinRate;
    }

    public String getSupportEmail() {
        return supportEmail;
    }

    public void setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
    }

    public double getMinDriverBalance() {
        return minDriverBalance;
    }

    public void setMinDriverBalance(double minDriverBalance) {
        this.minDriverBalance = minDriverBalance;
    }

    public Double getMinWithdrawal() {
        return minWithdrawal;
    }

    public void setMinWithdrawal(Double minWithdrawal) {
        this.minWithdrawal = minWithdrawal;
    }

    public double getMinChargeAmount() {
        return minChargeAmount;
    }

    public void setMinChargeAmount(double minChargeAmount) {
        this.minChargeAmount = minChargeAmount;
    }

    public byte getCompleteTripTimeOut() {
        return completeTripTimeOut;
    }

    public void setCompleteTripTimeOut(byte completeTripTimeOut) {
        this.completeTripTimeOut = completeTripTimeOut;
    }

    public String getMobileRegex() {
        return mobileRegex;
    }

    public void setMobileRegex(String mobileRegex) {
        this.mobileRegex = mobileRegex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (operate != country.operate) return false;
        if (requestInvoice != country.requestInvoice) return false;
        if (Double.compare(country.minDriverBalance, minDriverBalance) != 0) return false;
        if (Double.compare(country.minChargeAmount, minChargeAmount) != 0) return false;
        if (completeTripTimeOut != country.completeTripTimeOut) return false;
        if (code != null ? !code.equals(country.code) : country.code != null) return false;
        if (name != null ? !name.equals(country.name) : country.name != null) return false;
        if (postalCode != null ? !postalCode.equals(country.postalCode) : country.postalCode != null) return false;
        if (distanceUnit != null ? !distanceUnit.equals(country.distanceUnit) : country.distanceUnit != null)
            return false;
        if (currency != null ? !currency.equals(country.currency) : country.currency != null) return false;
        if (roundValue != null ? !roundValue.equals(country.roundValue) : country.roundValue != null) return false;
        if (roundUnit != null ? !roundUnit.equals(country.roundUnit) : country.roundUnit != null) return false;
        if (numberFormat != null ? !numberFormat.equals(country.numberFormat) : country.numberFormat != null)
            return false;
        if (currencyFormat != null ? !currencyFormat.equals(country.currencyFormat) : country.currencyFormat != null)
            return false;
        if (internationalCode != null ? !internationalCode.equals(country.internationalCode) : country.internationalCode != null)
            return false;
        if (riderPromotion != null ? !riderPromotion.equals(country.riderPromotion) : country.riderPromotion != null)
            return false;
        if (driverPromotion != null ? !driverPromotion.equals(country.driverPromotion) : country.driverPromotion != null)
            return false;
        if (agentPromotion != null ? !agentPromotion.equals(country.agentPromotion) : country.agentPromotion != null)
            return false;
        if (riderInvitation != null ? !riderInvitation.equals(country.riderInvitation) : country.riderInvitation != null)
            return false;
        if (driverInvitation != null ? !driverInvitation.equals(country.driverInvitation) : country.driverInvitation != null)
            return false;
        if (agentInvitation != null ? !agentInvitation.equals(country.agentInvitation) : country.agentInvitation != null)
            return false;
        if (createdBy != null ? !createdBy.equals(country.createdBy) : country.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(country.createdDate) : country.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(country.lastModifiedBy) : country.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(country.lastModifiedDate) : country.lastModifiedDate != null)
            return false;
        if (includedTolls != null ? !includedTolls.equals(country.includedTolls) : country.includedTolls != null)
            return false;
        if (chargeBankFee != null ? !chargeBankFee.equals(country.chargeBankFee) : country.chargeBankFee != null)
            return false;
        if (riderMinRate != null ? !riderMinRate.equals(country.riderMinRate) : country.riderMinRate != null)
            return false;
        if (supportEmail != null ? !supportEmail.equals(country.supportEmail) : country.supportEmail != null)
            return false;
        if (minWithdrawal != null ? !minWithdrawal.equals(country.minWithdrawal) : country.minWithdrawal != null)
            return false;
        if (mobileRegex != null ? !mobileRegex.equals(country.mobileRegex) : country.mobileRegex != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = code != null ? code.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) operate;
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (distanceUnit != null ? distanceUnit.hashCode() : 0);
        result = 31 * result + (int) requestInvoice;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (roundValue != null ? roundValue.hashCode() : 0);
        result = 31 * result + (roundUnit != null ? roundUnit.hashCode() : 0);
        result = 31 * result + (numberFormat != null ? numberFormat.hashCode() : 0);
        result = 31 * result + (currencyFormat != null ? currencyFormat.hashCode() : 0);
        result = 31 * result + (internationalCode != null ? internationalCode.hashCode() : 0);
        result = 31 * result + (riderPromotion != null ? riderPromotion.hashCode() : 0);
        result = 31 * result + (driverPromotion != null ? driverPromotion.hashCode() : 0);
        result = 31 * result + (agentPromotion != null ? agentPromotion.hashCode() : 0);
        result = 31 * result + (riderInvitation != null ? riderInvitation.hashCode() : 0);
        result = 31 * result + (driverInvitation != null ? driverInvitation.hashCode() : 0);
        result = 31 * result + (agentInvitation != null ? agentInvitation.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (includedTolls != null ? includedTolls.hashCode() : 0);
        result = 31 * result + (chargeBankFee != null ? chargeBankFee.hashCode() : 0);
        result = 31 * result + (riderMinRate != null ? riderMinRate.hashCode() : 0);
        result = 31 * result + (supportEmail != null ? supportEmail.hashCode() : 0);
        temp = Double.doubleToLongBits(minDriverBalance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (minWithdrawal != null ? minWithdrawal.hashCode() : 0);
        temp = Double.doubleToLongBits(minChargeAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) completeTripTimeOut;
        result = 31 * result + (mobileRegex != null ? mobileRegex.hashCode() : 0);
        return result;
    }
}
