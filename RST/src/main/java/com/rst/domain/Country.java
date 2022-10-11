package com.rst.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "country")
public class Country {
    @Id
    @Column(name = "Code", nullable = false, length = 4)
    private String id;

    @Column(name = "Name", nullable = false, length = 50)
    private String name;

    @Column(name = "Operate", nullable = false)
    private Byte operate;

    @Column(name = "PostalCode", nullable = false, length = 5)
    private String postalCode;

    @Column(name = "DistanceUnit", nullable = false, length = 7)
    private String distanceUnit;

    @Column(name = "RequestInvoice", nullable = false)
    private Byte requestInvoice;

    @Column(name = "Currency", length = 12)
    private String currency;

    @Column(name = "RoundValue")
    private Integer roundValue;

    @Column(name = "RoundUnit", length = 5)
    private String roundUnit;

    @Column(name = "NumberFormat", length = 15)
    private String numberFormat;

    @Column(name = "CurrencyFormat", length = 5)
    private String currencyFormat;

    @Column(name = "InternationalCode", nullable = false, length = 9)
    private String internationalCode;

    @Column(name = "RiderPromotion", length = 75)
    private String riderPromotion;

    @Column(name = "DriverPromotion", length = 75)
    private String driverPromotion;

    @Column(name = "AgentPromotion", length = 75)
    private String agentPromotion;

    @Column(name = "RiderInvitation", length = 75)
    private String riderInvitation;

    @Column(name = "DriverInvitation", length = 75)
    private String driverInvitation;

    @Column(name = "AgentInvitation", length = 75)
    private String agentInvitation;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "IncludedTolls")
    private Boolean includedTolls;

    @Column(name = "ChargeBankFee")
    private Boolean chargeBankFee;

    @Column(name = "RiderMinRate")
    private Float riderMinRate;

    @Column(name = "SupportEmail", length = 50)
    private String supportEmail;

    @Column(name = "MinDriverBalance", nullable = false)
    private Double minDriverBalance;

    @Column(name = "MinWithdrawal")
    private Double minWithdrawal;

    @Column(name = "MinChargeAmount", nullable = false)
    private Double minChargeAmount;

    @Column(name = "completeTripTimeOut", nullable = false)
    private Byte completeTripTimeOut;

    @Column(name = "MobileRegex", length = 300)
    private String mobileRegex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getOperate() {
        return operate;
    }

    public void setOperate(Byte operate) {
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

    public Byte getRequestInvoice() {
        return requestInvoice;
    }

    public void setRequestInvoice(Byte requestInvoice) {
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

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Instant lastModifiedDate) {
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

    public Float getRiderMinRate() {
        return riderMinRate;
    }

    public void setRiderMinRate(Float riderMinRate) {
        this.riderMinRate = riderMinRate;
    }

    public String getSupportEmail() {
        return supportEmail;
    }

    public void setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
    }

    public Double getMinDriverBalance() {
        return minDriverBalance;
    }

    public void setMinDriverBalance(Double minDriverBalance) {
        this.minDriverBalance = minDriverBalance;
    }

    public Double getMinWithdrawal() {
        return minWithdrawal;
    }

    public void setMinWithdrawal(Double minWithdrawal) {
        this.minWithdrawal = minWithdrawal;
    }

    public Double getMinChargeAmount() {
        return minChargeAmount;
    }

    public void setMinChargeAmount(Double minChargeAmount) {
        this.minChargeAmount = minChargeAmount;
    }

    public Byte getCompleteTripTimeOut() {
        return completeTripTimeOut;
    }

    public void setCompleteTripTimeOut(Byte completeTripTimeOut) {
        this.completeTripTimeOut = completeTripTimeOut;
    }

    public String getMobileRegex() {
        return mobileRegex;
    }

    public void setMobileRegex(String mobileRegex) {
        this.mobileRegex = mobileRegex;
    }

}