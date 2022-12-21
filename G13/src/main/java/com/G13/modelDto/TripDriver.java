package com.G13.modelDto;

import lombok.Data;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@Data
public class  TripDriver{
     String id;

     String TripID;
     String driverEmail ;
     String from;
     String to;
     int seatRegistered;
     int seat;
     Date timeStart;
     int WaitingTime;
     double price;
     String status;
     Instant InstantTimeStart;
     List<TripPassenger> listPassenger;
     String phoneDriver;
     String phonePassenger;
     String listPolyline;
     int NoOfPolyline;
     String vehiclePlate;
     String vehicleName;
     String vehicleColor;
     int vehicleType;


}
