package com.G13.modelDto;

import lombok.Data;

@Data
public class ReportCompany {
    int driverNo;
    int vehicleNo;
    int tripNo;
    int tripOpenNo;
    int tripClose;
    int tripCancel;
    int DriverNoVehicle;
    int VehicleNoDriver;
}
