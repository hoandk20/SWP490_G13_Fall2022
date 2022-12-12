package com.G13.modelDto;

import lombok.Data;
import java.util.List;
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
    List<DocumentRequest> listDoc;
    String vehicleStatus;
    DocumentRequest CNBH;
    DocumentRequest CNDK;
}
