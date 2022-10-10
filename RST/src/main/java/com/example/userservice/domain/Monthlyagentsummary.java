package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Monthlyagentsummary {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "MonthlyAgentSummaryId", nullable = false)
    private int monthlyAgentSummaryId;
    @Basic
    @Column(name = "NumberOfCharges", nullable = false)
    private short numberOfCharges;
    @Basic
    @Column(name = "FinancialYear", nullable = false)
    private short financialYear;
    @Basic
    @Column(name = "Month", nullable = false)
    private short month;
    @Basic
    @Column(name = "CurrentBalance", nullable = false, precision = 0)
    private double currentBalance;
    @Basic
    @Column(name = "LastBalance", nullable = false, precision = 0)
    private double lastBalance;
    @Basic
    @Column(name = "AdjustAmount", nullable = false, precision = 0)
    private double adjustAmount;
    @Basic
    @Column(name = "PromotionAmount", nullable = false, precision = 0)
    private double promotionAmount;
    @Basic
    @Column(name = "PayableAmount", nullable = false, precision = 0)
    private double payableAmount;
    @Basic
    @Column(name = "ActualPayment", nullable = false, precision = 0)
    private double actualPayment;
    @Basic
    @Column(name = "ChargedAmount", nullable = false, precision = 0)
    private double chargedAmount;
    @Basic
    @Column(name = "DiscountedAmount", nullable = false, precision = 0)
    private double discountedAmount;
    @Basic
    @Column(name = "DiscountRate", nullable = false, precision = 0)
    private double discountRate;
    @Basic
    @Column(name = "AgentId", nullable = false)
    private int agentId;
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

    public int getMonthlyAgentSummaryId() {
        return monthlyAgentSummaryId;
    }

    public void setMonthlyAgentSummaryId(int monthlyAgentSummaryId) {
        this.monthlyAgentSummaryId = monthlyAgentSummaryId;
    }

    public short getNumberOfCharges() {
        return numberOfCharges;
    }

    public void setNumberOfCharges(short numberOfCharges) {
        this.numberOfCharges = numberOfCharges;
    }

    public short getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(short financialYear) {
        this.financialYear = financialYear;
    }

    public short getMonth() {
        return month;
    }

    public void setMonth(short month) {
        this.month = month;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public double getLastBalance() {
        return lastBalance;
    }

    public void setLastBalance(double lastBalance) {
        this.lastBalance = lastBalance;
    }

    public double getAdjustAmount() {
        return adjustAmount;
    }

    public void setAdjustAmount(double adjustAmount) {
        this.adjustAmount = adjustAmount;
    }

    public double getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(double promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    public double getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(double payableAmount) {
        this.payableAmount = payableAmount;
    }

    public double getActualPayment() {
        return actualPayment;
    }

    public void setActualPayment(double actualPayment) {
        this.actualPayment = actualPayment;
    }

    public double getChargedAmount() {
        return chargedAmount;
    }

    public void setChargedAmount(double chargedAmount) {
        this.chargedAmount = chargedAmount;
    }

    public double getDiscountedAmount() {
        return discountedAmount;
    }

    public void setDiscountedAmount(double discountedAmount) {
        this.discountedAmount = discountedAmount;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Monthlyagentsummary that = (Monthlyagentsummary) o;

        if (monthlyAgentSummaryId != that.monthlyAgentSummaryId) return false;
        if (numberOfCharges != that.numberOfCharges) return false;
        if (financialYear != that.financialYear) return false;
        if (month != that.month) return false;
        if (Double.compare(that.currentBalance, currentBalance) != 0) return false;
        if (Double.compare(that.lastBalance, lastBalance) != 0) return false;
        if (Double.compare(that.adjustAmount, adjustAmount) != 0) return false;
        if (Double.compare(that.promotionAmount, promotionAmount) != 0) return false;
        if (Double.compare(that.payableAmount, payableAmount) != 0) return false;
        if (Double.compare(that.actualPayment, actualPayment) != 0) return false;
        if (Double.compare(that.chargedAmount, chargedAmount) != 0) return false;
        if (Double.compare(that.discountedAmount, discountedAmount) != 0) return false;
        if (Double.compare(that.discountRate, discountRate) != 0) return false;
        if (agentId != that.agentId) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = monthlyAgentSummaryId;
        result = 31 * result + (int) numberOfCharges;
        result = 31 * result + (int) financialYear;
        result = 31 * result + (int) month;
        temp = Double.doubleToLongBits(currentBalance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(lastBalance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(adjustAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(promotionAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(payableAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(actualPayment);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(chargedAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(discountedAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(discountRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + agentId;
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        return result;
    }
}
