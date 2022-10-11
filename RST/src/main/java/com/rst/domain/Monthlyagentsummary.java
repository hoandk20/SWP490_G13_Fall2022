package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "monthlyagentsummary")
public class Monthlyagentsummary {
    @Id
    @Column(name = "MonthlyAgentSummaryId", nullable = false)
    private Integer id;

    @Column(name = "NumberOfCharges", nullable = false)
    private Short numberOfCharges;

    @Column(name = "FinancialYear", nullable = false)
    private Short financialYear;

    @Column(name = "Month", nullable = false)
    private Short month;

    @Column(name = "CurrentBalance", nullable = false)
    private Double currentBalance;

    @Column(name = "LastBalance", nullable = false)
    private Double lastBalance;

    @Column(name = "AdjustAmount", nullable = false)
    private Double adjustAmount;

    @Column(name = "PromotionAmount", nullable = false)
    private Double promotionAmount;

    @Column(name = "PayableAmount", nullable = false)
    private Double payableAmount;

    @Column(name = "ActualPayment", nullable = false)
    private Double actualPayment;

    @Column(name = "ChargedAmount", nullable = false)
    private Double chargedAmount;

    @Column(name = "DiscountedAmount", nullable = false)
    private Double discountedAmount;

    @Column(name = "DiscountRate", nullable = false)
    private Double discountRate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "AgentId", nullable = false)
    private Agent agent;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getNumberOfCharges() {
        return numberOfCharges;
    }

    public void setNumberOfCharges(Short numberOfCharges) {
        this.numberOfCharges = numberOfCharges;
    }

    public Short getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(Short financialYear) {
        this.financialYear = financialYear;
    }

    public Short getMonth() {
        return month;
    }

    public void setMonth(Short month) {
        this.month = month;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Double getLastBalance() {
        return lastBalance;
    }

    public void setLastBalance(Double lastBalance) {
        this.lastBalance = lastBalance;
    }

    public Double getAdjustAmount() {
        return adjustAmount;
    }

    public void setAdjustAmount(Double adjustAmount) {
        this.adjustAmount = adjustAmount;
    }

    public Double getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(Double promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    public Double getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(Double payableAmount) {
        this.payableAmount = payableAmount;
    }

    public Double getActualPayment() {
        return actualPayment;
    }

    public void setActualPayment(Double actualPayment) {
        this.actualPayment = actualPayment;
    }

    public Double getChargedAmount() {
        return chargedAmount;
    }

    public void setChargedAmount(Double chargedAmount) {
        this.chargedAmount = chargedAmount;
    }

    public Double getDiscountedAmount() {
        return discountedAmount;
    }

    public void setDiscountedAmount(Double discountedAmount) {
        this.discountedAmount = discountedAmount;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
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

}