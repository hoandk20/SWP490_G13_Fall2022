package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Trip {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RequestID", nullable = false, length = 50)
    private String requestId;
    @Basic
    @Column(name = "ToCity", nullable = true)
    private Integer toCity;
    @Basic
    @Column(name = "FromCity", nullable = true)
    private Integer fromCity;
    @Basic
    @Column(name = "CompanyID", nullable = true)
    private Integer companyId;
    @Basic
    @Column(name = "DriverID", nullable = true, length = 50)
    private String driverId;
    @Basic
    @Column(name = "RiderID", nullable = false, length = 50)
    private String riderId;
    @Basic
    @Column(name = "VehicleID", nullable = true)
    private Integer vehicleId;
    @Basic
    @Column(name = "PricePanelID", nullable = true)
    private Integer pricePanelId;
    @Basic
    @Column(name = "PaymentID", nullable = true)
    private Integer paymentId;
    @Basic
    @Column(name = "Code", nullable = true, length = 20)
    private String code;
    @Basic
    @Column(name = "ProgramCode", nullable = true, length = 30)
    private String programCode;
    @Basic
    @Column(name = "CompanyCode", nullable = true, length = 11)
    private String companyCode;
    @Basic
    @Column(name = "RequestDatetime", nullable = false)
    private Timestamp requestDatetime;
    @Basic
    @Column(name = "CountryID", nullable = true, length = 4)
    private String countryId;
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
    @Column(name = "OpenPrice", nullable = false, precision = 0)
    private double openPrice;
    @Basic
    @Column(name = "StartLatitude", nullable = false, precision = 0)
    private double startLatitude;
    @Basic
    @Column(name = "StartLongtitude", nullable = false, precision = 0)
    private double startLongtitude;
    @Basic
    @Column(name = "EndLatitude", nullable = false, precision = 0)
    private double endLatitude;
    @Basic
    @Column(name = "EndLongtitude", nullable = false, precision = 0)
    private double endLongtitude;
    @Basic
    @Column(name = "Status", nullable = false, length = 4)
    private String status;
    @Basic
    @Column(name = "Distance", nullable = false, precision = 0)
    private double distance;
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
    private long lastModifiedDate;
    @Basic
    @Column(name = "FromCityName", nullable = true, length = 100)
    private String fromCityName;
    @Basic
    @Column(name = "ToCityName", nullable = true, length = 100)
    private String toCityName;
    @Basic
    @Column(name = "Currency", nullable = true, length = 10)
    private String currency;
    @Basic
    @Column(name = "CardNo", nullable = true, length = 70)
    private String cardNo;
    @Basic
    @Column(name = "PaymentType", nullable = true, length = 3)
    private String paymentType;
    @Basic
    @Column(name = "CancelReasonCode", nullable = true, length = 4)
    private String cancelReasonCode;
    @Basic
    @Column(name = "Reason", nullable = true, length = 100)
    private String reason;
    @Basic
    @Column(name = "adjustAmount", nullable = false, precision = 0)
    private double adjustAmount;
    @Basic
    @Column(name = "CancelLatitude", nullable = false, precision = 0)
    private double cancelLatitude;
    @Basic
    @Column(name = "CancelLongtitude", nullable = false, precision = 0)
    private double cancelLongtitude;
    @Basic
    @Column(name = "VehicleLevel", nullable = true, length = 3)
    private String vehicleLevel;
    @Basic
    @Column(name = "DriverFee", nullable = false, precision = 0)
    private double driverFee;
    @Basic
    @Column(name = "FareRate", nullable = false, precision = 0)
    private double fareRate;
    @Basic
    @Column(name = "Fee", nullable = false, precision = 0)
    private double fee;
    @Basic
    @Column(name = "Paid", nullable = false, precision = 0)
    private double paid;
    @Basic
    @Column(name = "Promotion", nullable = false, precision = 0)
    private double promotion;
    @Basic
    @Column(name = "DriverCalPromotion", nullable = false, precision = 0)
    private double driverCalPromotion;
    @Basic
    @Column(name = "EstPaid", nullable = false, precision = 0)
    private double estPaid;
    @Basic
    @Column(name = "Tolls", nullable = false, precision = 0)
    private double tolls;
    @Basic
    @Column(name = "DistanceFee", nullable = false, precision = 0)
    private double distanceFee;
    @Basic
    @Column(name = "TimeFee", nullable = false, precision = 0)
    private double timeFee;
    @Basic
    @Column(name = "InvoiceNumber", nullable = true, length = 30)
    private String invoiceNumber;
    @Basic
    @Column(name = "Issuer", nullable = true, length = 4)
    private String issuer;
    @Basic
    @Column(name = "DistanceUnit", nullable = true, length = 4)
    private String distanceUnit;
    @Basic
    @Column(name = "RiderBankFee", nullable = false, precision = 0)
    private double riderBankFee;
    @Basic
    @Column(name = "DriverBankFee", nullable = false, precision = 0)
    private double driverBankFee;
    @Basic
    @Column(name = "DriverWaitingTime", nullable = false)
    private short driverWaitingTime;
    @Basic
    @Column(name = "RiderWaitingTime", nullable = false)
    private short riderWaitingTime;
    @Basic
    @Column(name = "DriverRating", nullable = false)
    private byte driverRating;
    @Basic
    @Column(name = "RiderRating", nullable = false)
    private byte riderRating;
    @Basic
    @Column(name = "Duration", nullable = true)
    private Short duration;
    @Basic
    @Column(name = "RequestLatitude", nullable = false, precision = 0)
    private double requestLatitude;
    @Basic
    @Column(name = "RequestLongitude", nullable = false, precision = 0)
    private double requestLongitude;
    @Basic
    @Column(name = "AcceptLatitude", nullable = false, precision = 0)
    private double acceptLatitude;
    @Basic
    @Column(name = "AcceptLongitude", nullable = false, precision = 0)
    private double acceptLongitude;
    @Basic
    @Column(name = "SelectedToAddress", nullable = true, length = 255)
    private String selectedToAddress;
    @Basic
    @Column(name = "SelectedEndLatitude", nullable = false, precision = 0)
    private double selectedEndLatitude;
    @Basic
    @Column(name = "SelectedEndLongtitude", nullable = false, precision = 0)
    private double selectedEndLongtitude;
    @Basic
    @Column(name = "PromotionEstimate", nullable = false, precision = 0)
    private double promotionEstimate;
    @Basic
    @Column(name = "DurationEstimate", nullable = false, precision = 0)
    private double durationEstimate;
    @Basic
    @Column(name = "DistanceEstimate", nullable = false, precision = 0)
    private double distanceEstimate;
    @Basic
    @Column(name = "FareEstimate", nullable = false, precision = 0)
    private double fareEstimate;
    @Basic
    @Column(name = "FixedFare", nullable = false)
    private byte fixedFare;
    @Basic
    @Column(name = "SelectedFromAddress", nullable = true, length = 255)
    private String selectedFromAddress;
    @Basic
    @Column(name = "SelectedStartLatitude", nullable = false, precision = 0)
    private double selectedStartLatitude;
    @Basic
    @Column(name = "SelectedStartLongtitude", nullable = false, precision = 0)
    private double selectedStartLongtitude;
    @Basic
    @Column(name = "SelectedPaymentType", nullable = true, length = 3)
    private String selectedPaymentType;
    @Basic
    @Column(name = "IsReturn", nullable = true)
    private Boolean isReturn;
    @Basic
    @Column(name = "Cash", nullable = false, precision = 0)
    private double cash;
    @Basic
    @Column(name = "Note", nullable = true, length = 150)
    private String note;
    @Basic
    @Column(name = "ReturnFare", nullable = false, precision = 0)
    private double returnFare;
    @Basic
    @Column(name = "EstReturnFare", nullable = false, precision = 0)
    private double estReturnFare;
    @Basic
    @Column(name = "MobileRelative", nullable = true, length = 50)
    private String mobileRelative;
    @Basic
    @Column(name = "ExtraDistance", nullable = false, precision = 0)
    private double extraDistance;
    @Basic
    @Column(name = "DriverSelectedExtra", nullable = false)
    private boolean driverSelectedExtra;
    @Basic
    @Column(name = "calExtraFare", nullable = true)
    private Boolean calExtraFare;
    @Basic
    @Column(name = "StopFare", nullable = false, precision = 0)
    private double stopFare;
    @Basic
    @Column(name = "ExtraFare", nullable = false, precision = 0)
    private double extraFare;
    @Basic
    @Column(name = "ExtraStopFare", nullable = false, precision = 0)
    private double extraStopFare;
    @Basic
    @Column(name = "ExtraStopDuration", nullable = true)
    private Short extraStopDuration;
    @Basic
    @Column(name = "ExtraTravelTime", nullable = false)
    private short extraTravelTime;
    @Basic
    @Column(name = "DebtFare", nullable = false, precision = 0)
    private double debtFare;
    @Basic
    @Column(name = "DisForCalExtraFare", nullable = false, precision = 0)
    private double disForCalExtraFare;
    @Basic
    @Column(name = "DisCompleteToSelectedEnd", nullable = false, precision = 0)
    private double disCompleteToSelectedEnd;
    @Basic
    @Column(name = "StopTimeLimitted", nullable = false)
    private short stopTimeLimitted;
    @Basic
    @Column(name = "TripNote", nullable = true, length = 150)
    private String tripNote;
    @Basic
    @Column(name = "TripCode", nullable = true, length = 50)
    private String tripCode;
    @Basic
    @Column(name = "OrganizationId", nullable = true, length = 50)
    private String organizationId;
    @Basic
    @Column(name = "RiderVersion", nullable = true, length = 10)
    private String riderVersion;
    @Basic
    @Column(name = "DriverVersion", nullable = true, length = 10)
    private String driverVersion;
    @Basic
    @Column(name = "RiderDeviceType", nullable = true, length = 10)
    private String riderDeviceType;
    @Basic
    @Column(name = "DriverDeviceType", nullable = true, length = 10)
    private String driverDeviceType;
    @Basic
    @Column(name = "RecipientName", nullable = true, length = 80)
    private String recipientName;
    @Basic
    @Column(name = "RecipientMobile", nullable = true, length = 20)
    private String recipientMobile;
    @Basic
    @Column(name = "RecipientLocation", nullable = true, length = 150)
    private String recipientLocation;
    @Basic
    @Column(name = "ProgPayMethod", nullable = true, length = 4)
    private String progPayMethod;
    @Basic
    @Column(name = "GroupId", nullable = false)
    private int groupId;
    @Basic
    @Column(name = "DriverPoint", nullable = false)
    private short driverPoint;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
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

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Integer getPricePanelId() {
        return pricePanelId;
    }

    public void setPricePanelId(Integer pricePanelId) {
        this.pricePanelId = pricePanelId;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
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

    public Timestamp getRequestDatetime() {
        return requestDatetime;
    }

    public void setRequestDatetime(Timestamp requestDatetime) {
        this.requestDatetime = requestDatetime;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
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

    public double getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(double openPrice) {
        this.openPrice = openPrice;
    }

    public double getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(double startLatitude) {
        this.startLatitude = startLatitude;
    }

    public double getStartLongtitude() {
        return startLongtitude;
    }

    public void setStartLongtitude(double startLongtitude) {
        this.startLongtitude = startLongtitude;
    }

    public double getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(double endLatitude) {
        this.endLatitude = endLatitude;
    }

    public double getEndLongtitude() {
        return endLongtitude;
    }

    public void setEndLongtitude(double endLongtitude) {
        this.endLongtitude = endLongtitude;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
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

    public long getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(long lastModifiedDate) {
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

    public double getAdjustAmount() {
        return adjustAmount;
    }

    public void setAdjustAmount(double adjustAmount) {
        this.adjustAmount = adjustAmount;
    }

    public double getCancelLatitude() {
        return cancelLatitude;
    }

    public void setCancelLatitude(double cancelLatitude) {
        this.cancelLatitude = cancelLatitude;
    }

    public double getCancelLongtitude() {
        return cancelLongtitude;
    }

    public void setCancelLongtitude(double cancelLongtitude) {
        this.cancelLongtitude = cancelLongtitude;
    }

    public String getVehicleLevel() {
        return vehicleLevel;
    }

    public void setVehicleLevel(String vehicleLevel) {
        this.vehicleLevel = vehicleLevel;
    }

    public double getDriverFee() {
        return driverFee;
    }

    public void setDriverFee(double driverFee) {
        this.driverFee = driverFee;
    }

    public double getFareRate() {
        return fareRate;
    }

    public void setFareRate(double fareRate) {
        this.fareRate = fareRate;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getPaid() {
        return paid;
    }

    public void setPaid(double paid) {
        this.paid = paid;
    }

    public double getPromotion() {
        return promotion;
    }

    public void setPromotion(double promotion) {
        this.promotion = promotion;
    }

    public double getDriverCalPromotion() {
        return driverCalPromotion;
    }

    public void setDriverCalPromotion(double driverCalPromotion) {
        this.driverCalPromotion = driverCalPromotion;
    }

    public double getEstPaid() {
        return estPaid;
    }

    public void setEstPaid(double estPaid) {
        this.estPaid = estPaid;
    }

    public double getTolls() {
        return tolls;
    }

    public void setTolls(double tolls) {
        this.tolls = tolls;
    }

    public double getDistanceFee() {
        return distanceFee;
    }

    public void setDistanceFee(double distanceFee) {
        this.distanceFee = distanceFee;
    }

    public double getTimeFee() {
        return timeFee;
    }

    public void setTimeFee(double timeFee) {
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

    public double getRiderBankFee() {
        return riderBankFee;
    }

    public void setRiderBankFee(double riderBankFee) {
        this.riderBankFee = riderBankFee;
    }

    public double getDriverBankFee() {
        return driverBankFee;
    }

    public void setDriverBankFee(double driverBankFee) {
        this.driverBankFee = driverBankFee;
    }

    public short getDriverWaitingTime() {
        return driverWaitingTime;
    }

    public void setDriverWaitingTime(short driverWaitingTime) {
        this.driverWaitingTime = driverWaitingTime;
    }

    public short getRiderWaitingTime() {
        return riderWaitingTime;
    }

    public void setRiderWaitingTime(short riderWaitingTime) {
        this.riderWaitingTime = riderWaitingTime;
    }

    public byte getDriverRating() {
        return driverRating;
    }

    public void setDriverRating(byte driverRating) {
        this.driverRating = driverRating;
    }

    public byte getRiderRating() {
        return riderRating;
    }

    public void setRiderRating(byte riderRating) {
        this.riderRating = riderRating;
    }

    public Short getDuration() {
        return duration;
    }

    public void setDuration(Short duration) {
        this.duration = duration;
    }

    public double getRequestLatitude() {
        return requestLatitude;
    }

    public void setRequestLatitude(double requestLatitude) {
        this.requestLatitude = requestLatitude;
    }

    public double getRequestLongitude() {
        return requestLongitude;
    }

    public void setRequestLongitude(double requestLongitude) {
        this.requestLongitude = requestLongitude;
    }

    public double getAcceptLatitude() {
        return acceptLatitude;
    }

    public void setAcceptLatitude(double acceptLatitude) {
        this.acceptLatitude = acceptLatitude;
    }

    public double getAcceptLongitude() {
        return acceptLongitude;
    }

    public void setAcceptLongitude(double acceptLongitude) {
        this.acceptLongitude = acceptLongitude;
    }

    public String getSelectedToAddress() {
        return selectedToAddress;
    }

    public void setSelectedToAddress(String selectedToAddress) {
        this.selectedToAddress = selectedToAddress;
    }

    public double getSelectedEndLatitude() {
        return selectedEndLatitude;
    }

    public void setSelectedEndLatitude(double selectedEndLatitude) {
        this.selectedEndLatitude = selectedEndLatitude;
    }

    public double getSelectedEndLongtitude() {
        return selectedEndLongtitude;
    }

    public void setSelectedEndLongtitude(double selectedEndLongtitude) {
        this.selectedEndLongtitude = selectedEndLongtitude;
    }

    public double getPromotionEstimate() {
        return promotionEstimate;
    }

    public void setPromotionEstimate(double promotionEstimate) {
        this.promotionEstimate = promotionEstimate;
    }

    public double getDurationEstimate() {
        return durationEstimate;
    }

    public void setDurationEstimate(double durationEstimate) {
        this.durationEstimate = durationEstimate;
    }

    public double getDistanceEstimate() {
        return distanceEstimate;
    }

    public void setDistanceEstimate(double distanceEstimate) {
        this.distanceEstimate = distanceEstimate;
    }

    public double getFareEstimate() {
        return fareEstimate;
    }

    public void setFareEstimate(double fareEstimate) {
        this.fareEstimate = fareEstimate;
    }

    public byte getFixedFare() {
        return fixedFare;
    }

    public void setFixedFare(byte fixedFare) {
        this.fixedFare = fixedFare;
    }

    public String getSelectedFromAddress() {
        return selectedFromAddress;
    }

    public void setSelectedFromAddress(String selectedFromAddress) {
        this.selectedFromAddress = selectedFromAddress;
    }

    public double getSelectedStartLatitude() {
        return selectedStartLatitude;
    }

    public void setSelectedStartLatitude(double selectedStartLatitude) {
        this.selectedStartLatitude = selectedStartLatitude;
    }

    public double getSelectedStartLongtitude() {
        return selectedStartLongtitude;
    }

    public void setSelectedStartLongtitude(double selectedStartLongtitude) {
        this.selectedStartLongtitude = selectedStartLongtitude;
    }

    public String getSelectedPaymentType() {
        return selectedPaymentType;
    }

    public void setSelectedPaymentType(String selectedPaymentType) {
        this.selectedPaymentType = selectedPaymentType;
    }

    public Boolean getReturn() {
        return isReturn;
    }

    public void setReturn(Boolean aReturn) {
        isReturn = aReturn;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getReturnFare() {
        return returnFare;
    }

    public void setReturnFare(double returnFare) {
        this.returnFare = returnFare;
    }

    public double getEstReturnFare() {
        return estReturnFare;
    }

    public void setEstReturnFare(double estReturnFare) {
        this.estReturnFare = estReturnFare;
    }

    public String getMobileRelative() {
        return mobileRelative;
    }

    public void setMobileRelative(String mobileRelative) {
        this.mobileRelative = mobileRelative;
    }

    public double getExtraDistance() {
        return extraDistance;
    }

    public void setExtraDistance(double extraDistance) {
        this.extraDistance = extraDistance;
    }

    public boolean isDriverSelectedExtra() {
        return driverSelectedExtra;
    }

    public void setDriverSelectedExtra(boolean driverSelectedExtra) {
        this.driverSelectedExtra = driverSelectedExtra;
    }

    public Boolean getCalExtraFare() {
        return calExtraFare;
    }

    public void setCalExtraFare(Boolean calExtraFare) {
        this.calExtraFare = calExtraFare;
    }

    public double getStopFare() {
        return stopFare;
    }

    public void setStopFare(double stopFare) {
        this.stopFare = stopFare;
    }

    public double getExtraFare() {
        return extraFare;
    }

    public void setExtraFare(double extraFare) {
        this.extraFare = extraFare;
    }

    public double getExtraStopFare() {
        return extraStopFare;
    }

    public void setExtraStopFare(double extraStopFare) {
        this.extraStopFare = extraStopFare;
    }

    public Short getExtraStopDuration() {
        return extraStopDuration;
    }

    public void setExtraStopDuration(Short extraStopDuration) {
        this.extraStopDuration = extraStopDuration;
    }

    public short getExtraTravelTime() {
        return extraTravelTime;
    }

    public void setExtraTravelTime(short extraTravelTime) {
        this.extraTravelTime = extraTravelTime;
    }

    public double getDebtFare() {
        return debtFare;
    }

    public void setDebtFare(double debtFare) {
        this.debtFare = debtFare;
    }

    public double getDisForCalExtraFare() {
        return disForCalExtraFare;
    }

    public void setDisForCalExtraFare(double disForCalExtraFare) {
        this.disForCalExtraFare = disForCalExtraFare;
    }

    public double getDisCompleteToSelectedEnd() {
        return disCompleteToSelectedEnd;
    }

    public void setDisCompleteToSelectedEnd(double disCompleteToSelectedEnd) {
        this.disCompleteToSelectedEnd = disCompleteToSelectedEnd;
    }

    public short getStopTimeLimitted() {
        return stopTimeLimitted;
    }

    public void setStopTimeLimitted(short stopTimeLimitted) {
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

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public short getDriverPoint() {
        return driverPoint;
    }

    public void setDriverPoint(short driverPoint) {
        this.driverPoint = driverPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trip trip = (Trip) o;

        if (Double.compare(trip.openPrice, openPrice) != 0) return false;
        if (Double.compare(trip.startLatitude, startLatitude) != 0) return false;
        if (Double.compare(trip.startLongtitude, startLongtitude) != 0) return false;
        if (Double.compare(trip.endLatitude, endLatitude) != 0) return false;
        if (Double.compare(trip.endLongtitude, endLongtitude) != 0) return false;
        if (Double.compare(trip.distance, distance) != 0) return false;
        if (lastModifiedDate != trip.lastModifiedDate) return false;
        if (Double.compare(trip.adjustAmount, adjustAmount) != 0) return false;
        if (Double.compare(trip.cancelLatitude, cancelLatitude) != 0) return false;
        if (Double.compare(trip.cancelLongtitude, cancelLongtitude) != 0) return false;
        if (Double.compare(trip.driverFee, driverFee) != 0) return false;
        if (Double.compare(trip.fareRate, fareRate) != 0) return false;
        if (Double.compare(trip.fee, fee) != 0) return false;
        if (Double.compare(trip.paid, paid) != 0) return false;
        if (Double.compare(trip.promotion, promotion) != 0) return false;
        if (Double.compare(trip.driverCalPromotion, driverCalPromotion) != 0) return false;
        if (Double.compare(trip.estPaid, estPaid) != 0) return false;
        if (Double.compare(trip.tolls, tolls) != 0) return false;
        if (Double.compare(trip.distanceFee, distanceFee) != 0) return false;
        if (Double.compare(trip.timeFee, timeFee) != 0) return false;
        if (Double.compare(trip.riderBankFee, riderBankFee) != 0) return false;
        if (Double.compare(trip.driverBankFee, driverBankFee) != 0) return false;
        if (driverWaitingTime != trip.driverWaitingTime) return false;
        if (riderWaitingTime != trip.riderWaitingTime) return false;
        if (driverRating != trip.driverRating) return false;
        if (riderRating != trip.riderRating) return false;
        if (Double.compare(trip.requestLatitude, requestLatitude) != 0) return false;
        if (Double.compare(trip.requestLongitude, requestLongitude) != 0) return false;
        if (Double.compare(trip.acceptLatitude, acceptLatitude) != 0) return false;
        if (Double.compare(trip.acceptLongitude, acceptLongitude) != 0) return false;
        if (Double.compare(trip.selectedEndLatitude, selectedEndLatitude) != 0) return false;
        if (Double.compare(trip.selectedEndLongtitude, selectedEndLongtitude) != 0) return false;
        if (Double.compare(trip.promotionEstimate, promotionEstimate) != 0) return false;
        if (Double.compare(trip.durationEstimate, durationEstimate) != 0) return false;
        if (Double.compare(trip.distanceEstimate, distanceEstimate) != 0) return false;
        if (Double.compare(trip.fareEstimate, fareEstimate) != 0) return false;
        if (fixedFare != trip.fixedFare) return false;
        if (Double.compare(trip.selectedStartLatitude, selectedStartLatitude) != 0) return false;
        if (Double.compare(trip.selectedStartLongtitude, selectedStartLongtitude) != 0) return false;
        if (Double.compare(trip.cash, cash) != 0) return false;
        if (Double.compare(trip.returnFare, returnFare) != 0) return false;
        if (Double.compare(trip.estReturnFare, estReturnFare) != 0) return false;
        if (Double.compare(trip.extraDistance, extraDistance) != 0) return false;
        if (driverSelectedExtra != trip.driverSelectedExtra) return false;
        if (Double.compare(trip.stopFare, stopFare) != 0) return false;
        if (Double.compare(trip.extraFare, extraFare) != 0) return false;
        if (Double.compare(trip.extraStopFare, extraStopFare) != 0) return false;
        if (extraTravelTime != trip.extraTravelTime) return false;
        if (Double.compare(trip.debtFare, debtFare) != 0) return false;
        if (Double.compare(trip.disForCalExtraFare, disForCalExtraFare) != 0) return false;
        if (Double.compare(trip.disCompleteToSelectedEnd, disCompleteToSelectedEnd) != 0) return false;
        if (stopTimeLimitted != trip.stopTimeLimitted) return false;
        if (groupId != trip.groupId) return false;
        if (driverPoint != trip.driverPoint) return false;
        if (requestId != null ? !requestId.equals(trip.requestId) : trip.requestId != null) return false;
        if (toCity != null ? !toCity.equals(trip.toCity) : trip.toCity != null) return false;
        if (fromCity != null ? !fromCity.equals(trip.fromCity) : trip.fromCity != null) return false;
        if (companyId != null ? !companyId.equals(trip.companyId) : trip.companyId != null) return false;
        if (driverId != null ? !driverId.equals(trip.driverId) : trip.driverId != null) return false;
        if (riderId != null ? !riderId.equals(trip.riderId) : trip.riderId != null) return false;
        if (vehicleId != null ? !vehicleId.equals(trip.vehicleId) : trip.vehicleId != null) return false;
        if (pricePanelId != null ? !pricePanelId.equals(trip.pricePanelId) : trip.pricePanelId != null) return false;
        if (paymentId != null ? !paymentId.equals(trip.paymentId) : trip.paymentId != null) return false;
        if (code != null ? !code.equals(trip.code) : trip.code != null) return false;
        if (programCode != null ? !programCode.equals(trip.programCode) : trip.programCode != null) return false;
        if (companyCode != null ? !companyCode.equals(trip.companyCode) : trip.companyCode != null) return false;
        if (requestDatetime != null ? !requestDatetime.equals(trip.requestDatetime) : trip.requestDatetime != null)
            return false;
        if (countryId != null ? !countryId.equals(trip.countryId) : trip.countryId != null) return false;
        if (fromAddress != null ? !fromAddress.equals(trip.fromAddress) : trip.fromAddress != null) return false;
        if (toAddress != null ? !toAddress.equals(trip.toAddress) : trip.toAddress != null) return false;
        if (timeStart != null ? !timeStart.equals(trip.timeStart) : trip.timeStart != null) return false;
        if (timeEnd != null ? !timeEnd.equals(trip.timeEnd) : trip.timeEnd != null) return false;
        if (status != null ? !status.equals(trip.status) : trip.status != null) return false;
        if (createdBy != null ? !createdBy.equals(trip.createdBy) : trip.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(trip.createdDate) : trip.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(trip.lastModifiedBy) : trip.lastModifiedBy != null)
            return false;
        if (fromCityName != null ? !fromCityName.equals(trip.fromCityName) : trip.fromCityName != null) return false;
        if (toCityName != null ? !toCityName.equals(trip.toCityName) : trip.toCityName != null) return false;
        if (currency != null ? !currency.equals(trip.currency) : trip.currency != null) return false;
        if (cardNo != null ? !cardNo.equals(trip.cardNo) : trip.cardNo != null) return false;
        if (paymentType != null ? !paymentType.equals(trip.paymentType) : trip.paymentType != null) return false;
        if (cancelReasonCode != null ? !cancelReasonCode.equals(trip.cancelReasonCode) : trip.cancelReasonCode != null)
            return false;
        if (reason != null ? !reason.equals(trip.reason) : trip.reason != null) return false;
        if (vehicleLevel != null ? !vehicleLevel.equals(trip.vehicleLevel) : trip.vehicleLevel != null) return false;
        if (invoiceNumber != null ? !invoiceNumber.equals(trip.invoiceNumber) : trip.invoiceNumber != null)
            return false;
        if (issuer != null ? !issuer.equals(trip.issuer) : trip.issuer != null) return false;
        if (distanceUnit != null ? !distanceUnit.equals(trip.distanceUnit) : trip.distanceUnit != null) return false;
        if (duration != null ? !duration.equals(trip.duration) : trip.duration != null) return false;
        if (selectedToAddress != null ? !selectedToAddress.equals(trip.selectedToAddress) : trip.selectedToAddress != null)
            return false;
        if (selectedFromAddress != null ? !selectedFromAddress.equals(trip.selectedFromAddress) : trip.selectedFromAddress != null)
            return false;
        if (selectedPaymentType != null ? !selectedPaymentType.equals(trip.selectedPaymentType) : trip.selectedPaymentType != null)
            return false;
        if (isReturn != null ? !isReturn.equals(trip.isReturn) : trip.isReturn != null) return false;
        if (note != null ? !note.equals(trip.note) : trip.note != null) return false;
        if (mobileRelative != null ? !mobileRelative.equals(trip.mobileRelative) : trip.mobileRelative != null)
            return false;
        if (calExtraFare != null ? !calExtraFare.equals(trip.calExtraFare) : trip.calExtraFare != null) return false;
        if (extraStopDuration != null ? !extraStopDuration.equals(trip.extraStopDuration) : trip.extraStopDuration != null)
            return false;
        if (tripNote != null ? !tripNote.equals(trip.tripNote) : trip.tripNote != null) return false;
        if (tripCode != null ? !tripCode.equals(trip.tripCode) : trip.tripCode != null) return false;
        if (organizationId != null ? !organizationId.equals(trip.organizationId) : trip.organizationId != null)
            return false;
        if (riderVersion != null ? !riderVersion.equals(trip.riderVersion) : trip.riderVersion != null) return false;
        if (driverVersion != null ? !driverVersion.equals(trip.driverVersion) : trip.driverVersion != null)
            return false;
        if (riderDeviceType != null ? !riderDeviceType.equals(trip.riderDeviceType) : trip.riderDeviceType != null)
            return false;
        if (driverDeviceType != null ? !driverDeviceType.equals(trip.driverDeviceType) : trip.driverDeviceType != null)
            return false;
        if (recipientName != null ? !recipientName.equals(trip.recipientName) : trip.recipientName != null)
            return false;
        if (recipientMobile != null ? !recipientMobile.equals(trip.recipientMobile) : trip.recipientMobile != null)
            return false;
        if (recipientLocation != null ? !recipientLocation.equals(trip.recipientLocation) : trip.recipientLocation != null)
            return false;
        if (progPayMethod != null ? !progPayMethod.equals(trip.progPayMethod) : trip.progPayMethod != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = requestId != null ? requestId.hashCode() : 0;
        result = 31 * result + (toCity != null ? toCity.hashCode() : 0);
        result = 31 * result + (fromCity != null ? fromCity.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (driverId != null ? driverId.hashCode() : 0);
        result = 31 * result + (riderId != null ? riderId.hashCode() : 0);
        result = 31 * result + (vehicleId != null ? vehicleId.hashCode() : 0);
        result = 31 * result + (pricePanelId != null ? pricePanelId.hashCode() : 0);
        result = 31 * result + (paymentId != null ? paymentId.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (programCode != null ? programCode.hashCode() : 0);
        result = 31 * result + (companyCode != null ? companyCode.hashCode() : 0);
        result = 31 * result + (requestDatetime != null ? requestDatetime.hashCode() : 0);
        result = 31 * result + (countryId != null ? countryId.hashCode() : 0);
        result = 31 * result + (fromAddress != null ? fromAddress.hashCode() : 0);
        result = 31 * result + (toAddress != null ? toAddress.hashCode() : 0);
        result = 31 * result + (timeStart != null ? timeStart.hashCode() : 0);
        result = 31 * result + (timeEnd != null ? timeEnd.hashCode() : 0);
        temp = Double.doubleToLongBits(openPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(startLatitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(startLongtitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(endLatitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(endLongtitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (status != null ? status.hashCode() : 0);
        temp = Double.doubleToLongBits(distance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (int) (lastModifiedDate ^ (lastModifiedDate >>> 32));
        result = 31 * result + (fromCityName != null ? fromCityName.hashCode() : 0);
        result = 31 * result + (toCityName != null ? toCityName.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (cardNo != null ? cardNo.hashCode() : 0);
        result = 31 * result + (paymentType != null ? paymentType.hashCode() : 0);
        result = 31 * result + (cancelReasonCode != null ? cancelReasonCode.hashCode() : 0);
        result = 31 * result + (reason != null ? reason.hashCode() : 0);
        temp = Double.doubleToLongBits(adjustAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cancelLatitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cancelLongtitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (vehicleLevel != null ? vehicleLevel.hashCode() : 0);
        temp = Double.doubleToLongBits(driverFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(fareRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(fee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(paid);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(promotion);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(driverCalPromotion);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(estPaid);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(tolls);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(distanceFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(timeFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (invoiceNumber != null ? invoiceNumber.hashCode() : 0);
        result = 31 * result + (issuer != null ? issuer.hashCode() : 0);
        result = 31 * result + (distanceUnit != null ? distanceUnit.hashCode() : 0);
        temp = Double.doubleToLongBits(riderBankFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(driverBankFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) driverWaitingTime;
        result = 31 * result + (int) riderWaitingTime;
        result = 31 * result + (int) driverRating;
        result = 31 * result + (int) riderRating;
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        temp = Double.doubleToLongBits(requestLatitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(requestLongitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(acceptLatitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(acceptLongitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (selectedToAddress != null ? selectedToAddress.hashCode() : 0);
        temp = Double.doubleToLongBits(selectedEndLatitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(selectedEndLongtitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(promotionEstimate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(durationEstimate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(distanceEstimate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(fareEstimate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) fixedFare;
        result = 31 * result + (selectedFromAddress != null ? selectedFromAddress.hashCode() : 0);
        temp = Double.doubleToLongBits(selectedStartLatitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(selectedStartLongtitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (selectedPaymentType != null ? selectedPaymentType.hashCode() : 0);
        result = 31 * result + (isReturn != null ? isReturn.hashCode() : 0);
        temp = Double.doubleToLongBits(cash);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (note != null ? note.hashCode() : 0);
        temp = Double.doubleToLongBits(returnFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(estReturnFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (mobileRelative != null ? mobileRelative.hashCode() : 0);
        temp = Double.doubleToLongBits(extraDistance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (driverSelectedExtra ? 1 : 0);
        result = 31 * result + (calExtraFare != null ? calExtraFare.hashCode() : 0);
        temp = Double.doubleToLongBits(stopFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(extraFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(extraStopFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (extraStopDuration != null ? extraStopDuration.hashCode() : 0);
        result = 31 * result + (int) extraTravelTime;
        temp = Double.doubleToLongBits(debtFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(disForCalExtraFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(disCompleteToSelectedEnd);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) stopTimeLimitted;
        result = 31 * result + (tripNote != null ? tripNote.hashCode() : 0);
        result = 31 * result + (tripCode != null ? tripCode.hashCode() : 0);
        result = 31 * result + (organizationId != null ? organizationId.hashCode() : 0);
        result = 31 * result + (riderVersion != null ? riderVersion.hashCode() : 0);
        result = 31 * result + (driverVersion != null ? driverVersion.hashCode() : 0);
        result = 31 * result + (riderDeviceType != null ? riderDeviceType.hashCode() : 0);
        result = 31 * result + (driverDeviceType != null ? driverDeviceType.hashCode() : 0);
        result = 31 * result + (recipientName != null ? recipientName.hashCode() : 0);
        result = 31 * result + (recipientMobile != null ? recipientMobile.hashCode() : 0);
        result = 31 * result + (recipientLocation != null ? recipientLocation.hashCode() : 0);
        result = 31 * result + (progPayMethod != null ? progPayMethod.hashCode() : 0);
        result = 31 * result + groupId;
        result = 31 * result + (int) driverPoint;
        return result;
    }
}
