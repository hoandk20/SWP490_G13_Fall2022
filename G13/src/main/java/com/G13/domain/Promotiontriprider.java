package com.G13.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "promotiontripriders")
public class Promotiontriprider {
    @Id
    @Column(name = "promotiontripriderid", nullable = false, length = 50)
    private String id;

    @Column(name = "tocity")
    private Integer toCity;

    @Column(name = "fromcity")
    private Integer fromCity;

    @Column(name = "riderid", length = 50)
    private String riderID;

    @Column(name = "promotiontripid", nullable = false, length = 50)
    private String promotionTripID;

    @Column(name = "status", length = 2)
    private String status;

    @Column(name = "createddate", nullable = false)
    private Instant createdDate;

    @Column(name = "createdby", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "lastmodifieddate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "lastmodifiedby", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "startaddress")
    private String startAddress;

    @Column(name = "endaddress")
    private String endAddress;

    @Column(name = "numberofseats")
    private Integer numberOfSeats;

    @Column(name = "timestart")
    private Instant timeStart;

    @Column(name = "timegap")
    private Integer timeGap;

    @Column(name = "startlatitude")
    private Double startLatitude;

    @Column(name = "startlongtitude")
    private Double startLongtitude;

    @Column(name = "endlatitude")
    private Double endLatitude;

    @Column(name = "endlongtitude")
    private Double endLongtitude;

    @Column(name = "action", nullable = false)
    private Byte action;

    @Column(name = "note", length = 500)
    private String note;

    @Lob
    @Column(name = "drivernote")
    private String driverNote;

    @Column(name = "driveraction", nullable = false)
    private Byte driverAction;

    @Column(name = "firstname", length = 30)
    private String firstName;

    @Column(name = "lastname", length = 50)
    private String lastName;

    @Column(name = "mobileno", length = 12)
    private String mobileNo;

    @Column(name = "fare", nullable = false)
    private Double fare;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getRiderID() {
        return riderID;
    }

    public void setRiderID(String riderID) {
        this.riderID = riderID;
    }

    public String getPromotionTripID() {
        return promotionTripID;
    }

    public void setPromotionTripID(String promotionTripID) {
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