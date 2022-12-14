package com.G13.modelDto;

import lombok.Data;

@Data
public class UserInfo {
    String username;
    String firstname;
    String lastname;
    String avatarBase64;
    String address;
    String email;
    String phone;
    String country;
    String statusVerify;
    String Role;
    VehicleRequest vehicleRequest;
    int companyId;
    int cityId;
    String statusDriver;
    String statusCompany;
}