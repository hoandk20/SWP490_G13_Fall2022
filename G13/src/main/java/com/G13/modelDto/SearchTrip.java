package com.G13.modelDto;

import lombok.Data;

import java.util.Date;

@Data
public class SearchTrip {
    String id;
    String listPolyline;
    String registerSeat;
    String status;
    Date dateStart;
    String timeStart;
}
