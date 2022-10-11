package com.rst.domain;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "trip")
public class Trip {
    @Id
    @Column(name = "RequestID", nullable = false, length = 50)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ToCity")
    private City toCity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FromCity")
    private City fromCity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CompanyID")
    private Company companyID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DriverID")
    private Driver driverID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RiderID", nullable = false)
    private Rider riderID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VehicleID")
    private Vehicle vehicleID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PricePanelID")
    private Pricepanel pricePanelID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PaymentID")
    private Payment paymentID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "Code", referencedColumnName = "Code"),
            @JoinColumn(name = "ProgramCode", referencedColumnName = "ProgramCode"),
            @JoinColumn(name = "CompanyCode", referencedColumnName = "CompanyCode")
    })
    private Promotioncode promotioncode;

    @Column(name = "RequestDatetime", nullable = false)
    private Instant requestDatetime;

    @Column(name = "CountryID", length = 4)
    private String countryID;

    @Column(name = "FromAddress")
    private String fromAddress;

    @Column(name = "ToAddress")
    private String toAddress;

    @Column(name = "TimeStart")
    private Instant timeStart;

    @Column(name = "TimeEnd")
    private Instant timeEnd;

    @Column(name = "OpenPrice", nullable = false)
    private Float openPrice;

    @Column(name = "StartLatitude", nullable = false)
    private Double startLatitude;

    @Column(name = "StartLongtitude", nullable = false)
    private Double startLongtitude;

    @Column(name = "EndLatitude", nullable = false)
    private Double endLatitude;

    @Column(name = "EndLongtitude", nullable = false)
    private Double endLongtitude;

    @Column(name = "Status", nullable = false, length = 4)
    private String status;

    @Column(name = "Distance", nullable = false)
    private Float distance;

    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;

    @Column(name = "LastModifiedDate", nullable = false)
    private Long lastModifiedDate;

    @Column(name = "FromCityName", length = 100)
    private String fromCityName;

    @Column(name = "ToCityName", length = 100)
    private String toCityName;

    @Column(name = "Currency", length = 10)
    private String currency;

    @Column(name = "CardNo", length = 70)
    private String cardNo;

    @Column(name = "PaymentType", length = 3)
    private String paymentType;

    @Column(name = "CancelReasonCode", length = 4)
    private String cancelReasonCode;

    @Column(name = "Reason", length = 100)
    private String reason;

    @Column(name = "adjustAmount", nullable = false)
    private Float adjustAmount;

    @Column(name = "CancelLatitude", nullable = false)
    private Double cancelLatitude;

    @Column(name = "CancelLongtitude", nullable = false)
    private Double cancelLongtitude;

    @Column(name = "VehicleLevel", length = 3)
    private String vehicleLevel;

    @Column(name = "DriverFee", nullable = false)
    private Double driverFee;

    @Column(name = "FareRate", nullable = false)
    private Double fareRate;

    @Column(name = "Fee", nullable = false)
    private Double fee;

    @Column(name = "Paid", nullable = false)
    private Double paid;

    @Column(name = "Promotion", nullable = false)
    private Double promotion;

    @Column(name = "DriverCalPromotion", nullable = false)
    private Float driverCalPromotion;

    @Column(name = "EstPaid", nullable = false)
    private Float estPaid;

    @Column(name = "Tolls", nullable = false)
    private Double tolls;

    @Column(name = "DistanceFee", nullable = false)
    private Double distanceFee;

    @Column(name = "TimeFee", nullable = false)
    private Double timeFee;

    @Column(name = "InvoiceNumber", length = 30)
    private String invoiceNumber;

    @Column(name = "Issuer", length = 4)
    private String issuer;

    @Column(name = "DistanceUnit", length = 4)
    private String distanceUnit;

    @Column(name = "RiderBankFee", nullable = false)
    private Float riderBankFee;

    @Column(name = "DriverBankFee", nullable = false)
    private Float driverBankFee;

    @Column(name = "DriverWaitingTime", nullable = false)
    private Short driverWaitingTime;

    @Column(name = "RiderWaitingTime", nullable = false)
    private Short riderWaitingTime;

    @Column(name = "DriverRating", nullable = false)
    private Byte driverRating;

    @Column(name = "RiderRating", nullable = false)
    private Byte riderRating;

    @Column(name = "Duration")
    private Short duration;

    @Column(name = "RequestLatitude", nullable = false)
    private Double requestLatitude;

    @Column(name = "RequestLongitude", nullable = false)
    private Double requestLongitude;

    @Column(name = "AcceptLatitude", nullable = false)
    private Double acceptLatitude;

    @Column(name = "AcceptLongitude", nullable = false)
    private Double acceptLongitude;

    @Column(name = "SelectedToAddress")
    private String selectedToAddress;

    @Column(name = "SelectedEndLatitude", nullable = false)
    private Double selectedEndLatitude;

    @Column(name = "SelectedEndLongtitude", nullable = false)
    private Double selectedEndLongtitude;

    @Column(name = "PromotionEstimate", nullable = false)
    private Float promotionEstimate;

    @Column(name = "DurationEstimate", nullable = false)
    private Double durationEstimate;

    @Column(name = "DistanceEstimate", nullable = false)
    private Double distanceEstimate;

    @Column(name = "FareEstimate", nullable = false)
    private Double fareEstimate;

    @Column(name = "FixedFare", nullable = false)
    private Boolean fixedFare = false;

    @Column(name = "SelectedFromAddress")
    private String selectedFromAddress;

    @Column(name = "SelectedStartLatitude", nullable = false)
    private Double selectedStartLatitude;

    @Column(name = "SelectedStartLongtitude", nullable = false)
    private Double selectedStartLongtitude;

    @Column(name = "SelectedPaymentType", length = 3)
    private String selectedPaymentType;

    @Column(name = "IsReturn")
    private Boolean isReturn;

    @Column(name = "Cash", nullable = false)
    private Float cash;

    @Column(name = "Note", length = 150)
    private String note;

    @Column(name = "ReturnFare", nullable = false)
    private Float returnFare;

    @Column(name = "EstReturnFare", nullable = false)
    private Float estReturnFare;

    @Column(name = "MobileRelative", length = 50)
    private String mobileRelative;

    @Column(name = "ExtraDistance", nullable = false)
    private Float extraDistance;

    @Column(name = "DriverSelectedExtra", nullable = false)
    private Boolean driverSelectedExtra = false;

    @Column(name = "calExtraFare")
    private Boolean calExtraFare;

    @Column(name = "StopFare", nullable = false)
    private Double stopFare;

    @Column(name = "ExtraFare", nullable = false)
    private Double extraFare;

    @Column(name = "ExtraStopFare", nullable = false)
    private Double extraStopFare;

    @Column(name = "ExtraStopDuration")
    private Short extraStopDuration;

    @Column(name = "ExtraTravelTime", nullable = false)
    private Short extraTravelTime;

    @Column(name = "DebtFare", nullable = false)
    private Double debtFare;

    @Column(name = "DisForCalExtraFare", nullable = false)
    private Float disForCalExtraFare;

    @Column(name = "DisCompleteToSelectedEnd", nullable = false)
    private Float disCompleteToSelectedEnd;

    @Column(name = "StopTimeLimitted", nullable = false)
    private Short stopTimeLimitted;

    @Column(name = "TripNote", length = 150)
    private String tripNote;

    @Column(name = "TripCode", length = 50)
    private String tripCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OrganizationId")
    private Organization organization;

    @Column(name = "RiderVersion", length = 10)
    private String riderVersion;

    @Column(name = "DriverVersion", length = 10)
    private String driverVersion;

    @Column(name = "RiderDeviceType", length = 10)
    private String riderDeviceType;

    @Column(name = "DriverDeviceType", length = 10)
    private String driverDeviceType;

    @Column(name = "RecipientName", length = 80)
    private String recipientName;

    @Column(name = "RecipientMobile", length = 20)
    private String recipientMobile;

    @Column(name = "RecipientLocation", length = 150)
    private String recipientLocation;

    @Column(name = "ProgPayMethod", length = 4)
    private String progPayMethod;

    @Column(name = "GroupId", nullable = false)
    private Integer groupId;

    @Column(name = "DriverPoint", nullable = false)
    private Short driverPoint;

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

    public Company getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Company companyID) {
        this.companyID = companyID;
    }

    public Driver getDriverID() {
        return driverID;
    }

    public void setDriverID(Driver driverID) {
        this.driverID = driverID;
    }

    public Rider getRiderID() {
        return riderID;
    }

    public void setRiderID(Rider riderID) {
        this.riderID = riderID;
    }

    public Vehicle getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(Vehicle vehicleID) {
        this.vehicleID = vehicleID;
    }

    public Pricepanel getPricePanelID() {
        return pricePanelID;
    }

    public void setPricePanelID(Pricepanel pricePanelID) {
        this.pricePanelID = pricePanelID;
    }

    public Payment getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(Payment paymentID) {
        this.paymentID = paymentID;
    }

    public Promotioncode getPromotioncode() {
        return promotioncode;
    }

    public void setPromotioncode(Promotioncode promotioncode) {
        this.promotioncode = promotioncode;
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

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
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