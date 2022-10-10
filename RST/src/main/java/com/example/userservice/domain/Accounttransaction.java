package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Accounttransaction {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "TransactionID", nullable = false, length = 50)
    private String transactionId;
    @Basic
    @Column(name = "UserID", nullable = true, length = 50)
    private String userId;
    @Basic
    @Column(name = "DriverID", nullable = true, length = 50)
    private String driverId;
    @Basic
    @Column(name = "AgentID", nullable = true)
    private Integer agentId;
    @Basic
    @Column(name = "TransactionDate", nullable = false)
    private Date transactionDate;
    @Basic
    @Column(name = "TransferDate", nullable = true)
    private Date transferDate;
    @Basic
    @Column(name = "Amount", nullable = false, precision = 0)
    private double amount;
    @Basic
    @Column(name = "Discount", nullable = false, precision = 0)
    private double discount;
    @Basic
    @Column(name = "balance", nullable = false, precision = 0)
    private double balance;
    @Basic
    @Column(name = "PromotionBalance", nullable = false, precision = 0)
    private double promotionBalance;
    @Basic
    @Column(name = "reason", nullable = true, length = 500)
    private String reason;
    @Basic
    @Column(name = "Payer", nullable = true, length = 100)
    private String payer;
    @Basic
    @Column(name = "Type", nullable = false, length = 4)
    private String type;
    @Basic
    @Column(name = "PaymentType", nullable = false, length = 4)
    private String paymentType;
    @Basic
    @Column(name = "PartnerInvoiceNo", nullable = true, length = 50)
    private String partnerInvoiceNo;
    @Basic
    @Column(name = "PartnerPaymentNo", nullable = true, length = 50)
    private String partnerPaymentNo;
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
    @Column(name = "TripID", nullable = true, length = 50)
    private String tripId;
    @Basic
    @Column(name = "Status", nullable = true, length = 4)
    private String status;
    @Basic
    @Column(name = "ReasonCode", nullable = true, length = 35)
    private String reasonCode;
    @Basic
    @Column(name = "Promotion1", nullable = false, precision = 4)
    private double promotion1;
    @Basic
    @Column(name = "PromotionBalance1", nullable = false, precision = 0)
    private double promotionBalance1;
    @Basic
    @Column(name = "programCode", nullable = true, length = 30)
    private String programCode;
    @Basic
    @Column(name = "companyCode", nullable = true, length = 11)
    private String companyCode;
    @Basic
    @Column(name = "PromotionTripId", nullable = true, length = 50)
    private String promotionTripId;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Date getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(Date transferDate) {
        this.transferDate = transferDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getPromotionBalance() {
        return promotionBalance;
    }

    public void setPromotionBalance(double promotionBalance) {
        this.promotionBalance = promotionBalance;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPartnerInvoiceNo() {
        return partnerInvoiceNo;
    }

    public void setPartnerInvoiceNo(String partnerInvoiceNo) {
        this.partnerInvoiceNo = partnerInvoiceNo;
    }

    public String getPartnerPaymentNo() {
        return partnerPaymentNo;
    }

    public void setPartnerPaymentNo(String partnerPaymentNo) {
        this.partnerPaymentNo = partnerPaymentNo;
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

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public double getPromotion1() {
        return promotion1;
    }

    public void setPromotion1(double promotion1) {
        this.promotion1 = promotion1;
    }

    public double getPromotionBalance1() {
        return promotionBalance1;
    }

    public void setPromotionBalance1(double promotionBalance1) {
        this.promotionBalance1 = promotionBalance1;
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

    public String getPromotionTripId() {
        return promotionTripId;
    }

    public void setPromotionTripId(String promotionTripId) {
        this.promotionTripId = promotionTripId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Accounttransaction that = (Accounttransaction) o;

        if (Double.compare(that.amount, amount) != 0) return false;
        if (Double.compare(that.discount, discount) != 0) return false;
        if (Double.compare(that.balance, balance) != 0) return false;
        if (Double.compare(that.promotionBalance, promotionBalance) != 0) return false;
        if (Double.compare(that.promotion1, promotion1) != 0) return false;
        if (Double.compare(that.promotionBalance1, promotionBalance1) != 0) return false;
        if (transactionId != null ? !transactionId.equals(that.transactionId) : that.transactionId != null)
            return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (driverId != null ? !driverId.equals(that.driverId) : that.driverId != null) return false;
        if (agentId != null ? !agentId.equals(that.agentId) : that.agentId != null) return false;
        if (transactionDate != null ? !transactionDate.equals(that.transactionDate) : that.transactionDate != null)
            return false;
        if (transferDate != null ? !transferDate.equals(that.transferDate) : that.transferDate != null) return false;
        if (reason != null ? !reason.equals(that.reason) : that.reason != null) return false;
        if (payer != null ? !payer.equals(that.payer) : that.payer != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (paymentType != null ? !paymentType.equals(that.paymentType) : that.paymentType != null) return false;
        if (partnerInvoiceNo != null ? !partnerInvoiceNo.equals(that.partnerInvoiceNo) : that.partnerInvoiceNo != null)
            return false;
        if (partnerPaymentNo != null ? !partnerPaymentNo.equals(that.partnerPaymentNo) : that.partnerPaymentNo != null)
            return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (tripId != null ? !tripId.equals(that.tripId) : that.tripId != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (reasonCode != null ? !reasonCode.equals(that.reasonCode) : that.reasonCode != null) return false;
        if (programCode != null ? !programCode.equals(that.programCode) : that.programCode != null) return false;
        if (companyCode != null ? !companyCode.equals(that.companyCode) : that.companyCode != null) return false;
        if (promotionTripId != null ? !promotionTripId.equals(that.promotionTripId) : that.promotionTripId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = transactionId != null ? transactionId.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (driverId != null ? driverId.hashCode() : 0);
        result = 31 * result + (agentId != null ? agentId.hashCode() : 0);
        result = 31 * result + (transactionDate != null ? transactionDate.hashCode() : 0);
        result = 31 * result + (transferDate != null ? transferDate.hashCode() : 0);
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(discount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(promotionBalance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (reason != null ? reason.hashCode() : 0);
        result = 31 * result + (payer != null ? payer.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (paymentType != null ? paymentType.hashCode() : 0);
        result = 31 * result + (partnerInvoiceNo != null ? partnerInvoiceNo.hashCode() : 0);
        result = 31 * result + (partnerPaymentNo != null ? partnerPaymentNo.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (tripId != null ? tripId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (reasonCode != null ? reasonCode.hashCode() : 0);
        temp = Double.doubleToLongBits(promotion1);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(promotionBalance1);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (programCode != null ? programCode.hashCode() : 0);
        result = 31 * result + (companyCode != null ? companyCode.hashCode() : 0);
        result = 31 * result + (promotionTripId != null ? promotionTripId.hashCode() : 0);
        return result;
    }
}
