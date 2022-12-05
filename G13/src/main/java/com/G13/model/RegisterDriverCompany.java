package com.G13.model;

import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
public class RegisterDriverCompany {
    String driverID;
    String companyEmail;

    String email;
    String password;

    String firstName;
    String lastName;
    String phoneNumber;
    String language;
    String country;
    int cityId;
    String city;
    String address;
    int vehicle;
    int removeVehicleId;
    String companyName;
    Instant createDate;
    String docStatus;
    String Status;
    String lh;
    String DeviceType;
    CompanyInfo companyInfo;
    VehicleRequest vehicleInfo;
    DocumentRequest BLX;
    DocumentRequest CNKN;
    DocumentRequest CNDK;
    DocumentRequest CNBH;
    String AvatarBase64;


}
