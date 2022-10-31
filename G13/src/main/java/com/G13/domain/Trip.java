package com.G13.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "trip")
public class Trip {
    @Id
    @Column(name = "requestid", nullable = false, length = 50)
    private String id;

    @Column(name = "tocity")
    private Integer toCity;

    @Column(name = "fromcity")
    private Integer fromCity;

    @Column(name = "companyid")
    private Integer companyID;

    @Column(name = "driverid", length = 50)
    private String driverID;

    @Column(name = "riderid", nullable = false, length = 50)
    private String riderID;

    @Column(name = "vehicleid")
    private Integer vehicleID;

    @Column(name = "pricepanelid")
    private Integer pricePanelID;

    @Column(name = "paymentid")
    private Integer paymentID;

    @Column(name = "code", length = 20)
    private String code;

    @Column(name = "programcode", length = 30)
    private String programCode;

    @Column(name = "companycode", length = 11)
    private String companyCode;

    @Column(name = "requestdatetime", nullable = false)
    private Instant requestDatetime;

    @Column(name = "countryid", length = 4)
    private String countryID;

    @Column(name = "fromaddress")
    private String fromAddress;

    @Column(name = "toaddress")
    private String toAddress;

    @Column(name = "timestart")
    private Instant timeStart;

    @Column(name = "timeend")
    private Instant timeEnd;

    @Column(name = "openprice", nullable = false)
    private Float openPrice;

    @Column(name = "startlatitude", nullable = false)
    private Double startLatitude;

    @Column(name = "startlongtitude", nullable = false)
    private Double startLongtitude;

    @Column(name = "endlatitude", nullable = false)
    private Double endLatitude;

    @Column(name = "endlongtitude", nullable = false)
    private Double endLongtitude;

    @Column(name = "status", nullable = false, length = 4)
    private String status;

    @Column(name = "distance", nullable = false)
    private Float distance;

    @Column(name = "createdby", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "createddate", nullable = false)
    private Instant createdDate;

    @Column(name = "lastmodifiedby", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "lastmodifieddate", nullable = false)
    private Long lastModifiedDate;

    @Column(name = "fromcityname", length = 100)
    private String fromCityName;

    @Column(name = "tocityname", length = 100)
    private String toCityName;

    @Column(name = "currency", length = 10)
    private String currency;

    @Column(name = "cardno", length = 70)
    private String cardNo;

    @Column(name = "paymenttype", length = 3)
    private String paymentType;

    @Column(name = "cancelreasoncode", length = 4)
    private String cancelReasonCode;

    @Column(name = "reason", length = 100)
    private String reason;

    @Column(name = "adjustamount", nullable = false)
    private Float adjustAmount;

    @Column(name = "cancellatitude", nullable = false)
    private Double cancelLatitude;

    @Column(name = "cancellongtitude", nullable = false)
    private Double cancelLongtitude;

    @Column(name = "vehiclelevel", length = 3)
    private String vehicleLevel;

    @Column(name = "driverfee", nullable = false)
    private Double driverFee;

    @Column(name = "farerate", nullable = false)
    private Double fareRate;

    @Column(name = "fee", nullable = false)
    private Double fee;

    @Column(name = "paid", nullable = false)
    private Double paid;

    @Column(name = "promotion", nullable = false)
    private Double promotion;

    @Column(name = "drivercalpromotion", nullable = false)
    private Float driverCalPromotion;

    @Column(name = "estpaid", nullable = false)
    private Float estPaid;

    @Column(name = "tolls", nullable = false)
    private Double tolls;

    @Column(name = "distancefee", nullable = false)
    private Double distanceFee;

    @Column(name = "timefee", nullable = false)
    private Double timeFee;

    @Column(name = "invoicenumber", length = 30)
    private String invoiceNumber;

    @Column(name = "issuer", length = 4)
    private String issuer;

    @Column(name = "distanceunit", length = 4)
    private String distanceUnit;

    @Column(name = "riderbankfee", nullable = false)
    private Float riderBankFee;

    @Column(name = "driverbankfee", nullable = false)
    private Float driverBankFee;

    @Column(name = "driverwaitingtime", nullable = false)
    private Short driverWaitingTime;

    @Column(name = "riderwaitingtime", nullable = false)
    private Short riderWaitingTime;

    @Column(name = "driverrating", nullable = false)
    private Byte driverRating;

    @Column(name = "riderrating", nullable = false)
    private Byte riderRating;

    @Column(name = "duration")
    private Short duration;

    @Column(name = "requestlatitude", nullable = false)
    private Double requestLatitude;

    public Trip() {
        byte [] bytes =new byte[] { (byte)0};
        Instant instant = Instant.now();
        float NoFloat =0;
        Long longNo = Long.valueOf(0);
        short shortNo = (short)0;
        this.id = "";
        this.toCity = 0;
        this.fromCity = 0;
        this.companyID = 0;
        this.driverID = "";
        this.riderID = "";
        this.vehicleID = 0;
        this.pricePanelID = 0;
        this.paymentID = 0;
        this.code = "";
        this.programCode = "";
        this.companyCode = "";
        this.requestDatetime = instant;
        this.countryID = "";
        this.fromAddress = "";
        this.toAddress = "";
        this.timeStart = instant;
        this.timeEnd = instant;
        this.openPrice = NoFloat;
        this.startLatitude = 0.0;
        this.startLongtitude = 0.0;
        this.endLatitude = 0.0;
        this.endLongtitude = 0.0;
        this.status = "";
        this.distance = NoFloat;
        this.createdBy = "";
        this.createdDate = instant;
        this.lastModifiedBy = "";
        this.lastModifiedDate = longNo;
        this.fromCityName = "";
        this.toCityName = "";
        this.currency = "";
        this.cardNo = "";
        this.paymentType = "";
        this.cancelReasonCode = "";
        this.reason = "";
        this.adjustAmount = NoFloat;
        this.cancelLatitude = 0.0;
        this.cancelLongtitude = 0.0;
        this.vehicleLevel = "";
        this.driverFee = 0.0;
        this.fareRate = 0.0;
        this.fee = 0.0;
        this.paid = 0.0;
        this.promotion = 0.0;
        this.driverCalPromotion = NoFloat;
        this.estPaid = NoFloat;
        this.tolls = 0.0;
        this.distanceFee = 0.0;
        this.timeFee = 0.0;
        this.invoiceNumber = "";
        this.issuer = "";
        this.distanceUnit = "";
        this.riderBankFee = NoFloat;
        this.driverBankFee = NoFloat;
        this.driverWaitingTime = shortNo;
        this.riderWaitingTime = shortNo;
        this.driverRating = bytes[0];
        this.riderRating = bytes[0];
        this.duration = shortNo;
        this.requestLatitude = 0.0;
        this.requestLongitude = 0.0;
        this.acceptLatitude = 0.0;
        this.acceptLongitude = 0.0;
        this.selectedToAddress = "";
        this.selectedEndLatitude = 0.0;
        this.selectedEndLongtitude = 0.0;
        this.promotionEstimate = NoFloat;
        this.durationEstimate = 0.0;
        this.distanceEstimate = 0.0;
        this.fareEstimate = 0.0;
        this.fixedFare = false;
        this.selectedFromAddress = "";
        this.selectedStartLatitude = 0.0;
        this.selectedStartLongtitude = 0.0;
        this.selectedPaymentType = "";
        this.isReturn = false;
        this.cash = NoFloat;
        this.note = "";
        this.returnFare = NoFloat;
        this.estReturnFare = NoFloat;
        this.mobileRelative = "";
        this.extraDistance = NoFloat;
        this.driverSelectedExtra = false;
        this.calExtraFare = false;
        this.stopFare = 0.0;
        this.extraFare = 0.0;
        this.extraStopFare = 0.0;
        this.extraStopDuration = shortNo;
        this.extraTravelTime = shortNo;
        this.debtFare = 0.0;
        this.disForCalExtraFare = NoFloat;
        this.disCompleteToSelectedEnd = NoFloat;
        this.stopTimeLimitted = shortNo;
        this.tripNote = "";
        this.tripCode = "";
        this.organizationId = "";
        this.riderVersion = "";
        this.driverVersion = "";
        this.riderDeviceType = "";
        this.driverDeviceType = "";
        this.recipientName = "";
        this.recipientMobile = "";
        this.recipientLocation = "";
        this.progPayMethod = "";
        this.groupId = 0;
        this.driverPoint = shortNo;
    }

    @Column(name = "requestlongitude", nullable = false)
    private Double requestLongitude;

    @Column(name = "acceptlatitude", nullable = false)
    private Double acceptLatitude;

    @Column(name = "acceptlongitude", nullable = false)
    private Double acceptLongitude;

    @Column(name = "selectedtoaddress")
    private String selectedToAddress;

    @Column(name = "selectedendlatitude", nullable = false)
    private Double selectedEndLatitude;

    @Column(name = "selectedendlongtitude", nullable = false)
    private Double selectedEndLongtitude;

    @Column(name = "promotionestimate", nullable = false)
    private Float promotionEstimate;

    @Column(name = "durationestimate", nullable = false)
    private Double durationEstimate;

    @Column(name = "distanceestimate", nullable = false)
    private Double distanceEstimate;

    @Column(name = "fareestimate", nullable = false)
    private Double fareEstimate;

    @Column(name = "fixedfare", nullable = false)
    private Boolean fixedFare = false;

    @Column(name = "selectedfromaddress")
    private String selectedFromAddress;

    @Column(name = "selectedstartlatitude", nullable = false)
    private Double selectedStartLatitude;

    @Column(name = "selectedstartlongtitude", nullable = false)
    private Double selectedStartLongtitude;

    @Column(name = "selectedpaymenttype", length = 3)
    private String selectedPaymentType;

    @Column(name = "isreturn")
    private Boolean isReturn;

    @Column(name = "cash", nullable = false)
    private Float cash;

    @Column(name = "note", length = 150)
    private String note;

    @Column(name = "returnfare", nullable = false)
    private Float returnFare;

    @Column(name = "estreturnfare", nullable = false)
    private Float estReturnFare;

    @Column(name = "mobilerelative", length = 50)
    private String mobileRelative;

    @Column(name = "extradistance", nullable = false)
    private Float extraDistance;

    @Column(name = "driverselectedextra", nullable = false)
    private Boolean driverSelectedExtra = false;

    @Column(name = "calextrafare")
    private Boolean calExtraFare;

    @Column(name = "stopfare", nullable = false)
    private Double stopFare;

    @Column(name = "extrafare", nullable = false)
    private Double extraFare;

    @Column(name = "extrastopfare", nullable = false)
    private Double extraStopFare;

    @Column(name = "extrastopduration")
    private Short extraStopDuration;

    @Column(name = "extratraveltime", nullable = false)
    private Short extraTravelTime;

    @Column(name = "debtfare", nullable = false)
    private Double debtFare;

    @Column(name = "disforcalextrafare", nullable = false)
    private Float disForCalExtraFare;

    @Column(name = "discompletetoselectedend", nullable = false)
    private Float disCompleteToSelectedEnd;

    @Column(name = "stoptimelimitted", nullable = false)
    private Short stopTimeLimitted;

    @Column(name = "tripnote", length = 150)
    private String tripNote;

    @Column(name = "tripcode", length = 50)
    private String tripCode;

    @Column(name = "organizationid", length = 50)
    private String organizationId;

    @Column(name = "riderversion", length = 10)
    private String riderVersion;

    @Column(name = "driverversion", length = 10)
    private String driverVersion;

    @Column(name = "riderdevicetype", length = 10)
    private String riderDeviceType;

    @Column(name = "driverdevicetype", length = 10)
    private String driverDeviceType;

    @Column(name = "recipientname", length = 80)
    private String recipientName;

    @Column(name = "recipientmobile", length = 20)
    private String recipientMobile;

    @Column(name = "recipientlocation", length = 150)
    private String recipientLocation;

    @Column(name = "progpaymethod", length = 4)
    private String progPayMethod;

    @Column(name = "groupid", nullable = false)
    private Integer groupId;

    @Column(name = "driverpoint", nullable = false)
    private Short driverPoint;

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

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public String getRiderID() {
        return riderID;
    }

    public void setRiderID(String riderID) {
        this.riderID = riderID;
    }

    public Integer getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(Integer vehicleID) {
        this.vehicleID = vehicleID;
    }

    public Integer getPricePanelID() {
        return pricePanelID;
    }

    public void setPricePanelID(Integer pricePanelID) {
        this.pricePanelID = pricePanelID;
    }

    public Integer getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(Integer paymentID) {
        this.paymentID = paymentID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public Instant getRequestDatetime() {
        return requestDatetime;
    }

    public void setRequestDatetime(Instant requestDatetime) {
        this.requestDatetime = requestDatetime;
    }

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
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

    public Float getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(Float openPrice) {
        this.openPrice = openPrice;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
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

    public Long getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Long lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getFromCityName() {
        return fromCityName;
    }

    public void setFromCityName(String fromCityName) {
        this.fromCityName = fromCityName;
    }

    public String getToCityName() {
        return toCityName;
    }

    public void setToCityName(String toCityName) {
        this.toCityName = toCityName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getCancelReasonCode() {
        return cancelReasonCode;
    }

    public void setCancelReasonCode(String cancelReasonCode) {
        this.cancelReasonCode = cancelReasonCode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Float getAdjustAmount() {
        return adjustAmount;
    }

    public void setAdjustAmount(Float adjustAmount) {
        this.adjustAmount = adjustAmount;
    }

    public Double getCancelLatitude() {
        return cancelLatitude;
    }

    public void setCancelLatitude(Double cancelLatitude) {
        this.cancelLatitude = cancelLatitude;
    }

    public Double getCancelLongtitude() {
        return cancelLongtitude;
    }

    public void setCancelLongtitude(Double cancelLongtitude) {
        this.cancelLongtitude = cancelLongtitude;
    }

    public String getVehicleLevel() {
        return vehicleLevel;
    }

    public void setVehicleLevel(String vehicleLevel) {
        this.vehicleLevel = vehicleLevel;
    }

    public Double getDriverFee() {
        return driverFee;
    }

    public void setDriverFee(Double driverFee) {
        this.driverFee = driverFee;
    }

    public Double getFareRate() {
        return fareRate;
    }

    public void setFareRate(Double fareRate) {
        this.fareRate = fareRate;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public Double getPaid() {
        return paid;
    }

    public void setPaid(Double paid) {
        this.paid = paid;
    }

    public Double getPromotion() {
        return promotion;
    }

    public void setPromotion(Double promotion) {
        this.promotion = promotion;
    }

    public Float getDriverCalPromotion() {
        return driverCalPromotion;
    }

    public void setDriverCalPromotion(Float driverCalPromotion) {
        this.driverCalPromotion = driverCalPromotion;
    }

    public Float getEstPaid() {
        return estPaid;
    }

    public void setEstPaid(Float estPaid) {
        this.estPaid = estPaid;
    }

    public Double getTolls() {
        return tolls;
    }

    public void setTolls(Double tolls) {
        this.tolls = tolls;
    }

    public Double getDistanceFee() {
        return distanceFee;
    }

    public void setDistanceFee(Double distanceFee) {
        this.distanceFee = distanceFee;
    }

    public Double getTimeFee() {
        return timeFee;
    }

    public void setTimeFee(Double timeFee) {
        this.timeFee = timeFee;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getDistanceUnit() {
        return distanceUnit;
    }

    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    public Float getRiderBankFee() {
        return riderBankFee;
    }

    public void setRiderBankFee(Float riderBankFee) {
        this.riderBankFee = riderBankFee;
    }

    public Float getDriverBankFee() {
        return driverBankFee;
    }

    public void setDriverBankFee(Float driverBankFee) {
        this.driverBankFee = driverBankFee;
    }

    public Short getDriverWaitingTime() {
        return driverWaitingTime;
    }

    public void setDriverWaitingTime(Short driverWaitingTime) {
        this.driverWaitingTime = driverWaitingTime;
    }

    public Short getRiderWaitingTime() {
        return riderWaitingTime;
    }

    public void setRiderWaitingTime(Short riderWaitingTime) {
        this.riderWaitingTime = riderWaitingTime;
    }

    public Byte getDriverRating() {
        return driverRating;
    }

    public void setDriverRating(Byte driverRating) {
        this.driverRating = driverRating;
    }

    public Byte getRiderRating() {
        return riderRating;
    }

    public void setRiderRating(Byte riderRating) {
        this.riderRating = riderRating;
    }

    public Short getDuration() {
        return duration;
    }

    public void setDuration(Short duration) {
        this.duration = duration;
    }

    public Double getRequestLatitude() {
        return requestLatitude;
    }

    public void setRequestLatitude(Double requestLatitude) {
        this.requestLatitude = requestLatitude;
    }

    public Double getRequestLongitude() {
        return requestLongitude;
    }

    public void setRequestLongitude(Double requestLongitude) {
        this.requestLongitude = requestLongitude;
    }

    public Double getAcceptLatitude() {
        return acceptLatitude;
    }

    public void setAcceptLatitude(Double acceptLatitude) {
        this.acceptLatitude = acceptLatitude;
    }

    public Double getAcceptLongitude() {
        return acceptLongitude;
    }

    public void setAcceptLongitude(Double acceptLongitude) {
        this.acceptLongitude = acceptLongitude;
    }

    public String getSelectedToAddress() {
        return selectedToAddress;
    }

    public void setSelectedToAddress(String selectedToAddress) {
        this.selectedToAddress = selectedToAddress;
    }

    public Double getSelectedEndLatitude() {
        return selectedEndLatitude;
    }

    public void setSelectedEndLatitude(Double selectedEndLatitude) {
        this.selectedEndLatitude = selectedEndLatitude;
    }

    public Double getSelectedEndLongtitude() {
        return selectedEndLongtitude;
    }

    public void setSelectedEndLongtitude(Double selectedEndLongtitude) {
        this.selectedEndLongtitude = selectedEndLongtitude;
    }

    public Float getPromotionEstimate() {
        return promotionEstimate;
    }

    public void setPromotionEstimate(Float promotionEstimate) {
        this.promotionEstimate = promotionEstimate;
    }

    public Double getDurationEstimate() {
        return durationEstimate;
    }

    public void setDurationEstimate(Double durationEstimate) {
        this.durationEstimate = durationEstimate;
    }

    public Double getDistanceEstimate() {
        return distanceEstimate;
    }

    public void setDistanceEstimate(Double distanceEstimate) {
        this.distanceEstimate = distanceEstimate;
    }

    public Double getFareEstimate() {
        return fareEstimate;
    }

    public void setFareEstimate(Double fareEstimate) {
        this.fareEstimate = fareEstimate;
    }

    public Boolean getFixedFare() {
        return fixedFare;
    }

    public void setFixedFare(Boolean fixedFare) {
        this.fixedFare = fixedFare;
    }

    public String getSelectedFromAddress() {
        return selectedFromAddress;
    }

    public void setSelectedFromAddress(String selectedFromAddress) {
        this.selectedFromAddress = selectedFromAddress;
    }

    public Double getSelectedStartLatitude() {
        return selectedStartLatitude;
    }

    public void setSelectedStartLatitude(Double selectedStartLatitude) {
        this.selectedStartLatitude = selectedStartLatitude;
    }

    public Double getSelectedStartLongtitude() {
        return selectedStartLongtitude;
    }

    public void setSelectedStartLongtitude(Double selectedStartLongtitude) {
        this.selectedStartLongtitude = selectedStartLongtitude;
    }

    public String getSelectedPaymentType() {
        return selectedPaymentType;
    }

    public void setSelectedPaymentType(String selectedPaymentType) {
        this.selectedPaymentType = selectedPaymentType;
    }

    public Boolean getIsReturn() {
        return isReturn;
    }

    public void setIsReturn(Boolean isReturn) {
        this.isReturn = isReturn;
    }

    public Float getCash() {
        return cash;
    }

    public void setCash(Float cash) {
        this.cash = cash;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Float getReturnFare() {
        return returnFare;
    }

    public void setReturnFare(Float returnFare) {
        this.returnFare = returnFare;
    }

    public Float getEstReturnFare() {
        return estReturnFare;
    }

    public void setEstReturnFare(Float estReturnFare) {
        this.estReturnFare = estReturnFare;
    }

    public String getMobileRelative() {
        return mobileRelative;
    }

    public void setMobileRelative(String mobileRelative) {
        this.mobileRelative = mobileRelative;
    }

    public Float getExtraDistance() {
        return extraDistance;
    }

    public void setExtraDistance(Float extraDistance) {
        this.extraDistance = extraDistance;
    }

    public Boolean getDriverSelectedExtra() {
        return driverSelectedExtra;
    }

    public void setDriverSelectedExtra(Boolean driverSelectedExtra) {
        this.driverSelectedExtra = driverSelectedExtra;
    }

    public Boolean getCalExtraFare() {
        return calExtraFare;
    }

    public void setCalExtraFare(Boolean calExtraFare) {
        this.calExtraFare = calExtraFare;
    }

    public Double getStopFare() {
        return stopFare;
    }

    public void setStopFare(Double stopFare) {
        this.stopFare = stopFare;
    }

    public Double getExtraFare() {
        return extraFare;
    }

    public void setExtraFare(Double extraFare) {
        this.extraFare = extraFare;
    }

    public Double getExtraStopFare() {
        return extraStopFare;
    }

    public void setExtraStopFare(Double extraStopFare) {
        this.extraStopFare = extraStopFare;
    }

    public Short getExtraStopDuration() {
        return extraStopDuration;
    }

    public void setExtraStopDuration(Short extraStopDuration) {
        this.extraStopDuration = extraStopDuration;
    }

    public Short getExtraTravelTime() {
        return extraTravelTime;
    }

    public void setExtraTravelTime(Short extraTravelTime) {
        this.extraTravelTime = extraTravelTime;
    }

    public Double getDebtFare() {
        return debtFare;
    }

    public void setDebtFare(Double debtFare) {
        this.debtFare = debtFare;
    }

    public Float getDisForCalExtraFare() {
        return disForCalExtraFare;
    }

    public void setDisForCalExtraFare(Float disForCalExtraFare) {
        this.disForCalExtraFare = disForCalExtraFare;
    }

    public Float getDisCompleteToSelectedEnd() {
        return disCompleteToSelectedEnd;
    }

    public void setDisCompleteToSelectedEnd(Float disCompleteToSelectedEnd) {
        this.disCompleteToSelectedEnd = disCompleteToSelectedEnd;
    }

    public Short getStopTimeLimitted() {
        return stopTimeLimitted;
    }

    public void setStopTimeLimitted(Short stopTimeLimitted) {
        this.stopTimeLimitted = stopTimeLimitted;
    }

    public String getTripNote() {
        return tripNote;
    }

    public void setTripNote(String tripNote) {
        this.tripNote = tripNote;
    }

    public String getTripCode() {
        return tripCode;
    }

    public void setTripCode(String tripCode) {
        this.tripCode = tripCode;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getRiderVersion() {
        return riderVersion;
    }

    public void setRiderVersion(String riderVersion) {
        this.riderVersion = riderVersion;
    }

    public String getDriverVersion() {
        return driverVersion;
    }

    public void setDriverVersion(String driverVersion) {
        this.driverVersion = driverVersion;
    }

    public String getRiderDeviceType() {
        return riderDeviceType;
    }

    public void setRiderDeviceType(String riderDeviceType) {
        this.riderDeviceType = riderDeviceType;
    }

    public String getDriverDeviceType() {
        return driverDeviceType;
    }

    public void setDriverDeviceType(String driverDeviceType) {
        this.driverDeviceType = driverDeviceType;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getRecipientMobile() {
        return recipientMobile;
    }

    public void setRecipientMobile(String recipientMobile) {
        this.recipientMobile = recipientMobile;
    }

    public String getRecipientLocation() {
        return recipientLocation;
    }

    public void setRecipientLocation(String recipientLocation) {
        this.recipientLocation = recipientLocation;
    }

    public String getProgPayMethod() {
        return progPayMethod;
    }

    public void setProgPayMethod(String progPayMethod) {
        this.progPayMethod = progPayMethod;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Short getDriverPoint() {
        return driverPoint;
    }

    public void setDriverPoint(Short driverPoint) {
        this.driverPoint = driverPoint;
    }

}