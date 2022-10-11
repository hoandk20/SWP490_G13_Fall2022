package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "promotiontripriders")
public class Promotiontriprider {
    @Id
    @Column(name = "PromotionTripRiderID", nullable = false, length = 50)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ToCity")
    private City toCity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FromCity")
    private City fromCity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RiderID")
    private Rider riderID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PromotionTripID", nullable = false)
    private Promotiontrip promotionTripID;

    @Column(name = "Status", length = 2)
    private String status;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "StartAddress")
    private String startAddress;

    @Column(name = "EndAddress")
    private String endAddress;

    @Column(name = "NumberOfSeats")
    private Integer numberOfSeats;

    @Column(name = "TimeStart")
    private Instant timeStart;

    @Column(name = "TimeGap")
    private Integer timeGap;

    @Column(name = "StartLatitude")
    private Double startLatitude;

    @Column(name = "StartLongtitude")
    private Double startLongtitude;

    @Column(name = "EndLatitude")
    private Double endLatitude;

    @Column(name = "EndLongtitude")
    private Double endLongtitude;

    @Column(name = "Action", nullable = false)
    private Byte action;

    @Column(name = "Note", length = 500)
    private String note;

    @Lob
    @Column(name = "DriverNote")
    private String driverNote;

    @Column(name = "DriverAction", nullable = false)
    private Byte driverAction;

    @Column(name = "FirstName", length = 30)
    private String firstName;

    @Column(name = "LastName", length = 50)
    private String lastName;

    @Column(name = "MobileNo", length = 12)
    private String mobileNo;

    @Column(name = "Fare", nullable = false)
    private Double fare;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public City getToCity() {
        return toCity;
    }

    public void setToCity(City toCity) {
        this.toCity = toCity;
    }

    public City getFromCity() {
        return fromCity;
    }

    public void setFromCity(City fromCity) {
        this.fromCity = fromCity;
    }

    public Rider getRiderID() {
        return riderID;
    }

    public void setRiderID(Rider riderID) {
        this.riderID = riderID;
    }

    public Promotiontrip getPromotionTripID() {
        return promotionTripID;
    }

    public void setPromotionTripID(Promotiontrip promotionTripID) {
        this.promotionTripID = promotionTripID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Instant lastModifiedDate) {
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

    public Instant getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Instant timeStart) {
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

    public Byte getAction() {
        return action;
    }

    public void setAction(Byte action) {
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

    public Byte getDriverAction() {
        return driverAction;
    }

    public void setDriverAction(Byte driverAction) {
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

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }

}