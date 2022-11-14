package com.G13.model;

import lombok.Data;

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
     List<TripPassenger> listPassenger;
}
