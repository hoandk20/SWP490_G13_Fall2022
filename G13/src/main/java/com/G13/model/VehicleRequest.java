package com.G13.model;

import lombok.Data;

@Data
public class VehicleRequest{

    String driverEmail;
    int id;
    String companyEmail;
    String producer;
    String produceYear;
    String interiorColor;
    String exteriorColor;
    String plate;
    String platState;
    String plateCountry;
    int typeId;
}
