package com.G13.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "promotiontrip")
public class Promotiontrip {
    @Id
    @Column(name = "promotiontripid", nullable = false, length = 50)
    private String id;

    @Column(name = "tocity", nullable = false)
    private Integer toCity;

    @Column(name = "fromcity", nullable = false)
    private Integer fromCity;

    @Column(name = "vehicleid")
    private Integer vehicleID;

    @Column(name = "driverid", length = 50)
    private String driverID;

    @Column(name = "paymentid")
    private Integer paymentID;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "numbercapacityregistered")
    private Integer numberCapacityRegistered;

    @Column(name = "requestdatetime")
    private Instant requestDatetime;

    @Column(name = "countrycode", length = 4)
    private String countryCode;

    @Column(name = "fromaddress")
    private String fromAddress;

    @Column(name = "toaddress")
    private String toAddress;

    @Column(name = "timestart")
    private Instant timeStart;

    @Column(name = "timeend")
    private Instant timeEnd;

    @Column(name = "startlatitude")
    private Double startLatitude;

    @Column(name = "startlongitude")
    private Double startLongitude;

    @Column(name = "endlongitude")
    private Double endLongitude;

    @Column(name = "englatitude")
    private Double engLatitude;

    @Column(name = "fee")
    private Double fee;
    @Column(name = "status", length = 4)
    private String status;

    @Column(name = "maxtimestart")
    private Instant maxTimeStart;

    @Column(name = "createdby", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "createddate", nullable = false)
    private Instant createdDate;

    @Column(name = "lastmodifiedby", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "lastmodifieddate", nullable = false)
    private Instant lastModifiedDate;

    @Column(name = "distance")
    private Double distance;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "proposedfare")
    private Double proposedFare;

    @Column(name = "acceptedfare")
    private Double acceptedFare;

    @Column(name = "estdistance")
    private Float estDistance;

    @Column(name = "selldriverid", length = 50)
    private String sellDriverId;

    @Column(name = "openbidtime")
    private Instant openBidTime;

    @Column(name = "closedbidtime")
    private Instant closedBidTime;

    @Column(name = "returntrip", nullable = false)
    private Boolean returnTrip = false;

    @Column(name = "riderbooked", nullable = false)
    private Boolean riderBooked = false;

    @Column(name = "riderrate", nullable = false)
    private Byte riderRate;

    public Promotiontrip() {
        byte [] bytes =new byte[] { (byte)0};
        Instant instant = Instant.now();
        float NoFloat =0;
        Long longNo = Long.valueOf(0);
        short shortNo = (short)0;
        this.id = "";
        this.toCity = 0;
        this.fromCity = 0;
        this.vehicleID = 0;
        this.driverID = "";
        this.paymentID = 0;
        this.capacity = 0;
        this.numberCapacityRegistered = 0;
        this.requestDatetime = instant;
        this.countryCode = "";
        this.fromAddress = "";
        this.toAddress = "";
        this.timeStart = instant;
        this.timeEnd = instant;
        this.startLatitude = 0.0;
        this.startLongitude = 0.0;
        this.endLongitude = 0.0;
        this.engLatitude = 0.0;
        this.fee = 0.0;
        this.status = "";
        this.maxTimeStart = instant;
        this.createdBy = "";
        this.createdDate = instant;
        this.lastModifiedBy = "";
        this.lastModifiedDate = instant;
        this.distance = 0.0;
        this.duration = 0;
        this.proposedFare = 0.0;
        this.acceptedFare = 0.0;
        this.estDistance = NoFloat;
        this.sellDriverId = "";
        this.openBidTime = instant;
        this.closedBidTime = instant;
        this.returnTrip = false;
        this.riderBooked = false;
        this.riderRate = bytes[0];
        this.bidTime = bytes[0];
        this.note = "";
        this.reasonCode = "";
        this.estFare = NoFloat;
        this.farePerRider = false;
    }

    @Column(name = "bidtime", nullable = false)
    private Byte bidTime;

    @Lob
    @Column(name = "note")
    private String note;

    @Column(name = "reasoncode", length = 4)
    private String reasonCode;

    @Column(name = "estfare", nullable = false)
    private Float estFare;

    @Column(name = "fareperrider", nullable = false)
    private Boolean farePerRider = false;

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

    public Integer getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(Integer vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public Integer getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(Integer paymentID) {
        this.paymentID = paymentID;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getNumberCapacityRegistered() {
        return numberCapacityRegistered;
    }

    public void setNumberCapacityRegistered(Integer numberCapacityRegistered) {
        this.numberCapacityRegistered = numberCapacityRegistered;
    }

    public Instant getRequestDatetime() {
        return requestDatetime;
    }

    public void setRequestDatetime(Instant requestDatetime) {
        this.requestDatetime = requestDatetime;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public Instant getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Instant timeStart) {
        this.timeStart = timeStart;
    }

    public Instant getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Instant timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Double getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(Double startLatitude) {
        this.startLatitude = startLatitude;
    }

    public Double getStartLongitude() {
        return startLongitude;
    }

    public void setStartLongitude(Double startLongitude) {
        this.startLongitude = startLongitude;
    }

    public Double getEndLongitude() {
        return endLongitude;
    }

    public void setEndLongitude(Double endLongitude) {
        this.endLongitude = endLongitude;
    }

    public Double getEngLatitude() {
        return engLatitude;
    }

    public void setEngLatitude(Double engLatitude) {
        this.engLatitude = engLatitude;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Instant getMaxTimeStart() {
        return maxTimeStart;
    }

    public void setMaxTimeStart(Instant maxTimeStart) {
        this.maxTimeStart = maxTimeStart;
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

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Double getProposedFare() {
        return proposedFare;
    }

    public void setProposedFare(Double proposedFare) {
        this.proposedFare = proposedFare;
    }

    public Double getAcceptedFare() {
        return acceptedFare;
    }

    public void setAcceptedFare(Double acceptedFare) {
        this.acceptedFare = acceptedFare;
    }

    public Float getEstDistance() {
        return estDistance;
    }

    public void setEstDistance(Float estDistance) {
        this.estDistance = estDistance;
    }

    public String getSellDriverId() {
        return sellDriverId;
    }

    public void setSellDriverId(String sellDriverId) {
        this.sellDriverId = sellDriverId;
    }

    public Instant getOpenBidTime() {
        return openBidTime;
    }

    public void setOpenBidTime(Instant openBidTime) {
        this.openBidTime = openBidTime;
    }

    public Instant getClosedBidTime() {
        return closedBidTime;
    }

    public void setClosedBidTime(Instant closedBidTime) {
        this.closedBidTime = closedBidTime;
    }

    public Boolean getReturnTrip() {
        return returnTrip;
    }

    public void setReturnTrip(Boolean returnTrip) {
        this.returnTrip = returnTrip;
    }

    public Boolean getRiderBooked() {
        return riderBooked;
    }

    public void setRiderBooked(Boolean riderBooked) {
        this.riderBooked = riderBooked;
    }

    public Byte getRiderRate() {
        return riderRate;
    }

    public void setRiderRate(Byte riderRate) {
        this.riderRate = riderRate;
    }

    public Byte getBidTime() {
        return bidTime;
    }

    public void setBidTime(Byte bidTime) {
        this.bidTime = bidTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public Float getEstFare() {
        return estFare;
    }

    public void setEstFare(Float estFare) {
        this.estFare = estFare;
    }

    public Boolean getFarePerRider() {
        return farePerRider;
    }

    public void setFarePerRider(Boolean farePerRider) {
        this.farePerRider = farePerRider;
    }

}