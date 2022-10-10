package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Promotiontrip {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PromotionTripID", nullable = false, length = 50)
    private String promotionTripId;
    @Basic
    @Column(name = "ToCity", nullable = false)
    private int toCity;
    @Basic
    @Column(name = "FromCity", nullable = false)
    private int fromCity;
    @Basic
    @Column(name = "VehicleID", nullable = true)
    private Integer vehicleId;
    @Basic
    @Column(name = "DriverID", nullable = true, length = 50)
    private String driverId;
    @Basic
    @Column(name = "PaymentID", nullable = true)
    private Integer paymentId;
    @Basic
    @Column(name = "Capacity", nullable = true)
    private Integer capacity;
    @Basic
    @Column(name = "NumberCapacityRegistered", nullable = true)
    private Integer numberCapacityRegistered;
    @Basic
    @Column(name = "RequestDatetime", nullable = true)
    private Timestamp requestDatetime;
    @Basic
    @Column(name = "CountryCode", nullable = true, length = 4)
    private String countryCode;
    @Basic
    @Column(name = "FromAddress", nullable = true, length = 255)
    private String fromAddress;
    @Basic
    @Column(name = "ToAddress", nullable = true, length = 255)
    private String toAddress;
    @Basic
    @Column(name = "TimeStart", nullable = true)
    private Timestamp timeStart;
    @Basic
    @Column(name = "TimeEnd", nullable = true)
    private Timestamp timeEnd;
    @Basic
    @Column(name = "StartLatitude", nullable = true, precision = 0)
    private Double startLatitude;
    @Basic
    @Column(name = "StartLongitude", nullable = true, precision = 0)
    private Double startLongitude;
    @Basic
    @Column(name = "EndLongitude", nullable = true, precision = 0)
    private Double endLongitude;
    @Basic
    @Column(name = "EngLatitude", nullable = true, precision = 0)
    private Double engLatitude;
    @Basic
    @Column(name = "Fee", nullable = true, precision = 0)
    private Double fee;
    @Basic
    @Column(name = "Status", nullable = true, length = 4)
    private String status;
    @Basic
    @Column(name = "MaxTimeStart", nullable = true)
    private Timestamp maxTimeStart;
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
    @Column(name = "Distance", nullable = true, precision = 0)
    private Double distance;
    @Basic
    @Column(name = "Duration", nullable = true)
    private Integer duration;
    @Basic
    @Column(name = "ProposedFare", nullable = true, precision = 0)
    private Double proposedFare;
    @Basic
    @Column(name = "AcceptedFare", nullable = true, precision = 0)
    private Double acceptedFare;
    @Basic
    @Column(name = "EstDistance", nullable = true, precision = 0)
    private Double estDistance;
    @Basic
    @Column(name = "SellDriverId", nullable = true, length = 50)
    private String sellDriverId;
    @Basic
    @Column(name = "OpenBidTime", nullable = true)
    private Timestamp openBidTime;
    @Basic
    @Column(name = "ClosedBidTime", nullable = true)
    private Timestamp closedBidTime;
    @Basic
    @Column(name = "ReturnTrip", nullable = false)
    private boolean returnTrip;
    @Basic
    @Column(name = "RiderBooked", nullable = false)
    private boolean riderBooked;
    @Basic
    @Column(name = "RiderRate", nullable = false)
    private byte riderRate;
    @Basic
    @Column(name = "BidTime", nullable = false)
    private byte bidTime;
    @Basic
    @Column(name = "Note", nullable = true, length = -1)
    private String note;
    @Basic
    @Column(name = "ReasonCode", nullable = true, length = 4)
    private String reasonCode;
    @Basic
    @Column(name = "EstFare", nullable = false, precision = 0)
    private double estFare;
    @Basic
    @Column(name = "FarePerRider", nullable = false)
    private boolean farePerRider;

    public String getPromotionTripId() {
        return promotionTripId;
    }

    public void setPromotionTripId(String promotionTripId) {
        this.promotionTripId = promotionTripId;
    }

    public int getToCity() {
        return toCity;
    }

    public void setToCity(int toCity) {
        this.toCity = toCity;
    }

    public int getFromCity() {
        return fromCity;
    }

    public void setFromCity(int fromCity) {
        this.fromCity = fromCity;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
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

    public Timestamp getRequestDatetime() {
        return requestDatetime;
    }

    public void setRequestDatetime(Timestamp requestDatetime) {
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

    public Timestamp getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Timestamp timeStart) {
        this.timeStart = timeStart;
    }

    public Timestamp getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Timestamp timeEnd) {
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

    public Timestamp getMaxTimeStart() {
        return maxTimeStart;
    }

    public void setMaxTimeStart(Timestamp maxTimeStart) {
        this.maxTimeStart = maxTimeStart;
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

    public Double getEstDistance() {
        return estDistance;
    }

    public void setEstDistance(Double estDistance) {
        this.estDistance = estDistance;
    }

    public String getSellDriverId() {
        return sellDriverId;
    }

    public void setSellDriverId(String sellDriverId) {
        this.sellDriverId = sellDriverId;
    }

    public Timestamp getOpenBidTime() {
        return openBidTime;
    }

    public void setOpenBidTime(Timestamp openBidTime) {
        this.openBidTime = openBidTime;
    }

    public Timestamp getClosedBidTime() {
        return closedBidTime;
    }

    public void setClosedBidTime(Timestamp closedBidTime) {
        this.closedBidTime = closedBidTime;
    }

    public boolean isReturnTrip() {
        return returnTrip;
    }

    public void setReturnTrip(boolean returnTrip) {
        this.returnTrip = returnTrip;
    }

    public boolean isRiderBooked() {
        return riderBooked;
    }

    public void setRiderBooked(boolean riderBooked) {
        this.riderBooked = riderBooked;
    }

    public byte getRiderRate() {
        return riderRate;
    }

    public void setRiderRate(byte riderRate) {
        this.riderRate = riderRate;
    }

    public byte getBidTime() {
        return bidTime;
    }

    public void setBidTime(byte bidTime) {
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

    public double getEstFare() {
        return estFare;
    }

    public void setEstFare(double estFare) {
        this.estFare = estFare;
    }

    public boolean isFarePerRider() {
        return farePerRider;
    }

    public void setFarePerRider(boolean farePerRider) {
        this.farePerRider = farePerRider;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Promotiontrip that = (Promotiontrip) o;

        if (toCity != that.toCity) return false;
        if (fromCity != that.fromCity) return false;
        if (returnTrip != that.returnTrip) return false;
        if (riderBooked != that.riderBooked) return false;
        if (riderRate != that.riderRate) return false;
        if (bidTime != that.bidTime) return false;
        if (Double.compare(that.estFare, estFare) != 0) return false;
        if (farePerRider != that.farePerRider) return false;
        if (promotionTripId != null ? !promotionTripId.equals(that.promotionTripId) : that.promotionTripId != null)
            return false;
        if (vehicleId != null ? !vehicleId.equals(that.vehicleId) : that.vehicleId != null) return false;
        if (driverId != null ? !driverId.equals(that.driverId) : that.driverId != null) return false;
        if (paymentId != null ? !paymentId.equals(that.paymentId) : that.paymentId != null) return false;
        if (capacity != null ? !capacity.equals(that.capacity) : that.capacity != null) return false;
        if (numberCapacityRegistered != null ? !numberCapacityRegistered.equals(that.numberCapacityRegistered) : that.numberCapacityRegistered != null)
            return false;
        if (requestDatetime != null ? !requestDatetime.equals(that.requestDatetime) : that.requestDatetime != null)
            return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (fromAddress != null ? !fromAddress.equals(that.fromAddress) : that.fromAddress != null) return false;
        if (toAddress != null ? !toAddress.equals(that.toAddress) : that.toAddress != null) return false;
        if (timeStart != null ? !timeStart.equals(that.timeStart) : that.timeStart != null) return false;
        if (timeEnd != null ? !timeEnd.equals(that.timeEnd) : that.timeEnd != null) return false;
        if (startLatitude != null ? !startLatitude.equals(that.startLatitude) : that.startLatitude != null)
            return false;
        if (startLongitude != null ? !startLongitude.equals(that.startLongitude) : that.startLongitude != null)
            return false;
        if (endLongitude != null ? !endLongitude.equals(that.endLongitude) : that.endLongitude != null) return false;
        if (engLatitude != null ? !engLatitude.equals(that.engLatitude) : that.engLatitude != null) return false;
        if (fee != null ? !fee.equals(that.fee) : that.fee != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (maxTimeStart != null ? !maxTimeStart.equals(that.maxTimeStart) : that.maxTimeStart != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(that.lastModifiedDate) : that.lastModifiedDate != null)
            return false;
        if (distance != null ? !distance.equals(that.distance) : that.distance != null) return false;
        if (duration != null ? !duration.equals(that.duration) : that.duration != null) return false;
        if (proposedFare != null ? !proposedFare.equals(that.proposedFare) : that.proposedFare != null) return false;
        if (acceptedFare != null ? !acceptedFare.equals(that.acceptedFare) : that.acceptedFare != null) return false;
        if (estDistance != null ? !estDistance.equals(that.estDistance) : that.estDistance != null) return false;
        if (sellDriverId != null ? !sellDriverId.equals(that.sellDriverId) : that.sellDriverId != null) return false;
        if (openBidTime != null ? !openBidTime.equals(that.openBidTime) : that.openBidTime != null) return false;
        if (closedBidTime != null ? !closedBidTime.equals(that.closedBidTime) : that.closedBidTime != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (reasonCode != null ? !reasonCode.equals(that.reasonCode) : that.reasonCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = promotionTripId != null ? promotionTripId.hashCode() : 0;
        result = 31 * result + toCity;
        result = 31 * result + fromCity;
        result = 31 * result + (vehicleId != null ? vehicleId.hashCode() : 0);
        result = 31 * result + (driverId != null ? driverId.hashCode() : 0);
        result = 31 * result + (paymentId != null ? paymentId.hashCode() : 0);
        result = 31 * result + (capacity != null ? capacity.hashCode() : 0);
        result = 31 * result + (numberCapacityRegistered != null ? numberCapacityRegistered.hashCode() : 0);
        result = 31 * result + (requestDatetime != null ? requestDatetime.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (fromAddress != null ? fromAddress.hashCode() : 0);
        result = 31 * result + (toAddress != null ? toAddress.hashCode() : 0);
        result = 31 * result + (timeStart != null ? timeStart.hashCode() : 0);
        result = 31 * result + (timeEnd != null ? timeEnd.hashCode() : 0);
        result = 31 * result + (startLatitude != null ? startLatitude.hashCode() : 0);
        result = 31 * result + (startLongitude != null ? startLongitude.hashCode() : 0);
        result = 31 * result + (endLongitude != null ? endLongitude.hashCode() : 0);
        result = 31 * result + (engLatitude != null ? engLatitude.hashCode() : 0);
        result = 31 * result + (fee != null ? fee.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (maxTimeStart != null ? maxTimeStart.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (distance != null ? distance.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (proposedFare != null ? proposedFare.hashCode() : 0);
        result = 31 * result + (acceptedFare != null ? acceptedFare.hashCode() : 0);
        result = 31 * result + (estDistance != null ? estDistance.hashCode() : 0);
        result = 31 * result + (sellDriverId != null ? sellDriverId.hashCode() : 0);
        result = 31 * result + (openBidTime != null ? openBidTime.hashCode() : 0);
        result = 31 * result + (closedBidTime != null ? closedBidTime.hashCode() : 0);
        result = 31 * result + (returnTrip ? 1 : 0);
        result = 31 * result + (riderBooked ? 1 : 0);
        result = 31 * result + (int) riderRate;
        result = 31 * result + (int) bidTime;
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (reasonCode != null ? reasonCode.hashCode() : 0);
        temp = Double.doubleToLongBits(estFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (farePerRider ? 1 : 0);
        return result;
    }
}
