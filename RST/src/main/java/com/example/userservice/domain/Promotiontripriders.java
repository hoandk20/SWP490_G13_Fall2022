package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Promotiontripriders {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PromotionTripRiderID", nullable = false, length = 50)
    private String promotionTripRiderId;
    @Basic
    @Column(name = "ToCity", nullable = true)
    private Integer toCity;
    @Basic
    @Column(name = "FromCity", nullable = true)
    private Integer fromCity;
    @Basic
    @Column(name = "RiderID", nullable = true, length = 50)
    private String riderId;
    @Basic
    @Column(name = "PromotionTripID", nullable = false, length = 50)
    private String promotionTripId;
    @Basic
    @Column(name = "Status", nullable = true, length = 2)
    private String status;
    @Basic
    @Column(name = "CreatedDate", nullable = false)
    private Timestamp createdDate;
    @Basic
    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;
    @Basic
    @Column(name = "LastModifiedDate", nullable = false)
    private Timestamp lastModifiedDate;
    @Basic
    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;
    @Basic
    @Column(name = "StartAddress", nullable = true, length = 255)
    private String startAddress;
    @Basic
    @Column(name = "EndAddress", nullable = true, length = 255)
    private String endAddress;
    @Basic
    @Column(name = "NumberOfSeats", nullable = true)
    private Integer numberOfSeats;
    @Basic
    @Column(name = "TimeStart", nullable = true)
    private Timestamp timeStart;
    @Basic
    @Column(name = "TimeGap", nullable = true)
    private Integer timeGap;
    @Basic
    @Column(name = "StartLatitude", nullable = true, precision = 0)
    private Double startLatitude;
    @Basic
    @Column(name = "StartLongtitude", nullable = true, precision = 0)
    private Double startLongtitude;
    @Basic
    @Column(name = "EndLatitude", nullable = true, precision = 0)
    private Double endLatitude;
    @Basic
    @Column(name = "EndLongtitude", nullable = true, precision = 0)
    private Double endLongtitude;
    @Basic
    @Column(name = "Action", nullable = false)
    private byte action;
    @Basic
    @Column(name = "Note", nullable = true, length = 500)
    private String note;
    @Basic
    @Column(name = "DriverNote", nullable = true, length = -1)
    private String driverNote;
    @Basic
    @Column(name = "DriverAction", nullable = false)
    private byte driverAction;
    @Basic
    @Column(name = "FirstName", nullable = true, length = 30)
    private String firstName;
    @Basic
    @Column(name = "LastName", nullable = true, length = 50)
    private String lastName;
    @Basic
    @Column(name = "MobileNo", nullable = true, length = 12)
    private String mobileNo;
    @Basic
    @Column(name = "Fare", nullable = false, precision = 0)
    private double fare;

    public String getPromotionTripRiderId() {
        return promotionTripRiderId;
    }

    public void setPromotionTripRiderId(String promotionTripRiderId) {
        this.promotionTripRiderId = promotionTripRiderId;
    }

    public Integer getToCity() {
        return toCity;
    }

    public void setToCity(Integer toCity) {
        this.toCity = toCity;
    }

    public Integer getFromCity() {
        return fromCity;
    }

    public void setFromCity(Integer fromCity) {
        this.fromCity = fromCity;
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public String getPromotionTripId() {
        return promotionTripId;
    }

    public void setPromotionTripId(String promotionTripId) {
        this.promotionTripId = promotionTripId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    public String getEndAddress() {
        return endAddress;
    }

    public void setEndAddress(String endAddress) {
        this.endAddress = endAddress;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Timestamp getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Timestamp timeStart) {
        this.timeStart = timeStart;
    }

    public Integer getTimeGap() {
        return timeGap;
    }

    public void setTimeGap(Integer timeGap) {
        this.timeGap = timeGap;
    }

    public Double getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(Double startLatitude) {
        this.startLatitude = startLatitude;
    }

    public Double getStartLongtitude() {
        return startLongtitude;
    }

    public void setStartLongtitude(Double startLongtitude) {
        this.startLongtitude = startLongtitude;
    }

    public Double getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(Double endLatitude) {
        this.endLatitude = endLatitude;
    }

    public Double getEndLongtitude() {
        return endLongtitude;
    }

    public void setEndLongtitude(Double endLongtitude) {
        this.endLongtitude = endLongtitude;
    }

    public byte getAction() {
        return action;
    }

    public void setAction(byte action) {
        this.action = action;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDriverNote() {
        return driverNote;
    }

    public void setDriverNote(String driverNote) {
        this.driverNote = driverNote;
    }

    public byte getDriverAction() {
        return driverAction;
    }

    public void setDriverAction(byte driverAction) {
        this.driverAction = driverAction;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Promotiontripriders that = (Promotiontripriders) o;

        if (action != that.action) return false;
        if (driverAction != that.driverAction) return false;
        if (Double.compare(that.fare, fare) != 0) return false;
        if (promotionTripRiderId != null ? !promotionTripRiderId.equals(that.promotionTripRiderId) : that.promotionTripRiderId != null)
            return false;
        if (toCity != null ? !toCity.equals(that.toCity) : that.toCity != null) return false;
        if (fromCity != null ? !fromCity.equals(that.fromCity) : that.fromCity != null) return false;
        if (riderId != null ? !riderId.equals(that.riderId) : that.riderId != null) return false;
        if (promotionTripId != null ? !promotionTripId.equals(that.promotionTripId) : that.promotionTripId != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (startAddress != null ? !startAddress.equals(that.startAddress) : that.startAddress != null) return false;
        if (endAddress != null ? !endAddress.equals(that.endAddress) : that.endAddress != null) return false;
        if (numberOfSeats != null ? !numberOfSeats.equals(that.numberOfSeats) : that.numberOfSeats != null)
            return false;
        if (timeStart != null ? !timeStart.equals(that.timeStart) : that.timeStart != null) return false;
        if (timeGap != null ? !timeGap.equals(that.timeGap) : that.timeGap != null) return false;
        if (startLatitude != null ? !startLatitude.equals(that.startLatitude) : that.startLatitude != null)
            return false;
        if (startLongtitude != null ? !startLongtitude.equals(that.startLongtitude) : that.startLongtitude != null)
            return false;
        if (endLatitude != null ? !endLatitude.equals(that.endLatitude) : that.endLatitude != null) return false;
        if (endLongtitude != null ? !endLongtitude.equals(that.endLongtitude) : that.endLongtitude != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (driverNote != null ? !driverNote.equals(that.driverNote) : that.driverNote != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (mobileNo != null ? !mobileNo.equals(that.mobileNo) : that.mobileNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = promotionTripRiderId != null ? promotionTripRiderId.hashCode() : 0;
        result = 31 * result + (toCity != null ? toCity.hashCode() : 0);
        result = 31 * result + (fromCity != null ? fromCity.hashCode() : 0);
        result = 31 * result + (riderId != null ? riderId.hashCode() : 0);
        result = 31 * result + (promotionTripId != null ? promotionTripId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (startAddress != null ? startAddress.hashCode() : 0);
        result = 31 * result + (endAddress != null ? endAddress.hashCode() : 0);
        result = 31 * result + (numberOfSeats != null ? numberOfSeats.hashCode() : 0);
        result = 31 * result + (timeStart != null ? timeStart.hashCode() : 0);
        result = 31 * result + (timeGap != null ? timeGap.hashCode() : 0);
        result = 31 * result + (startLatitude != null ? startLatitude.hashCode() : 0);
        result = 31 * result + (startLongtitude != null ? startLongtitude.hashCode() : 0);
        result = 31 * result + (endLatitude != null ? endLatitude.hashCode() : 0);
        result = 31 * result + (endLongtitude != null ? endLongtitude.hashCode() : 0);
        result = 31 * result + (int) action;
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (driverNote != null ? driverNote.hashCode() : 0);
        result = 31 * result + (int) driverAction;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (mobileNo != null ? mobileNo.hashCode() : 0);
        temp = Double.doubleToLongBits(fare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
