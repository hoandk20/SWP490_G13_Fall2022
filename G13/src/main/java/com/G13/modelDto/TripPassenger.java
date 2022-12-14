package com.G13.modelDto;

import lombok.Data;

import java.util.Date;

@Data
public class TripPassenger {
    String id;
    String note;
    String passengerEmail;
    String tripID;
    String driverEmail;
    String from;
    String to;
    int seatRegister;
    Date timeStart;
    int waitingTime;
    float price;
    String status;
    String TripStatus;
    String RegisterStatus;
    String vehiclePlate;
    String vehicleName;
    String vehicleColor;
    String phone;
}