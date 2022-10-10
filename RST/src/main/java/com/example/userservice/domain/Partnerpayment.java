package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Partnerpayment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PaymentNumber", nullable = false, length = 50)
    private String paymentNumber;
    @Basic
    @Column(name = "CompanyID", nullable = false)
    private int companyId;
    @Basic
    @Column(name = "BankID", nullable = true)
    private Integer bankId;
    @Basic
    @Column(name = "ReceiverNI", nullable = true, length = 15)
    private String receiverNi;
    @Basic
    @Column(name = "Total", nullable = false, precision = 0)
    private double total;
    @Basic
    @Column(name = "ActualPayment", nullable = false, precision = 0)
    private double actualPayment;
    @Basic
    @Column(name = "PaymentDate", nullable = false)
    private Date paymentDate;
    @Basic
    @Column(name = "Currency", nullable = false, length = 10)
    private String currency;
    @Basic
    @Column(name = "PaymentMethod", nullable = false, length = 3)
    private String paymentMethod;
    @Basic
    @Column(name = "BankAccount", nullable = true, length = 15)
    private String bankAccount;
    @Basic
    @Column(name = "Receiver", nullable = false, length = 100)
    private String receiver;
    @Basic
    @Column(name = "Status", nullable = false, length = 3)
    private String status;
    @Basic
    @Column(name = "Category", nullable = false, length = 3)
    private String category;
    @Basic
    @Column(name = "Note", nullable = false, length = 200)
    private String note;
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
    @Column(name = "ApprovedDate", nullable = true)
    private Date approvedDate;
    @Basic
    @Column(name = "BranchId", nullable = true)
    private Integer branchId;
    @Basic
    @Column(name = "AccountHolder", nullable = true, length = 80)
    private String accountHolder;

    public String getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(String paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getReceiverNi() {
        return receiverNi;
    }

    public void setReceiverNi(String receiverNi) {
        this.receiverNi = receiverNi;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getActualPayment() {
        return actualPayment;
    }

    public void setActualPayment(double actualPayment) {
        this.actualPayment = actualPayment;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

    public Date getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(Date approvedDate) {
        this.approvedDate = approvedDate;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Partnerpayment that = (Partnerpayment) o;

        if (companyId != that.companyId) return false;
        if (Double.compare(that.total, total) != 0) return false;
        if (Double.compare(that.actualPayment, actualPayment) != 0) return false;
        if (paymentNumber != null ? !paymentNumber.equals(that.paymentNumber) : that.paymentNumber != null)
            return false;
        if (bankId != null ? !bankId.equals(that.bankId) : that.bankId != null) return false;
        if (receiverNi != null ? !receiverNi.equals(that.receiverNi) : that.receiverNi != null) return false;
        if (paymentDate != null ? !paymentDate.equals(that.paymentDate) : that.paymentDate != null) return false;
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;
        if (paymentMethod != null ? !paymentMethod.equals(that.paymentMethod) : that.paymentMethod != null)
            return false;
        if (bankAccount != null ? !bankAccount.equals(that.bankAccount) : that.bankAccount != null) return false;
        if (receiver != null ? !receiver.equals(that.receiver) : that.receiver != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (approvedDate != null ? !approvedDate.equals(that.approvedDate) : that.approvedDate != null) return false;
        if (branchId != null ? !branchId.equals(that.branchId) : that.branchId != null) return false;
        if (accountHolder != null ? !accountHolder.equals(that.accountHolder) : that.accountHolder != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = paymentNumber != null ? paymentNumber.hashCode() : 0;
        result = 31 * result + companyId;
        result = 31 * result + (bankId != null ? bankId.hashCode() : 0);
        result = 31 * result + (receiverNi != null ? receiverNi.hashCode() : 0);
        temp = Double.doubleToLongBits(total);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(actualPayment);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (paymentDate != null ? paymentDate.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (paymentMethod != null ? paymentMethod.hashCode() : 0);
        result = 31 * result + (bankAccount != null ? bankAccount.hashCode() : 0);
        result = 31 * result + (receiver != null ? receiver.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (approvedDate != null ? approvedDate.hashCode() : 0);
        result = 31 * result + (branchId != null ? branchId.hashCode() : 0);
        result = 31 * result + (accountHolder != null ? accountHolder.hashCode() : 0);
        return result;
    }
}
