package com.G13.model;


import lombok.Data;

@Data
public class RegisterDriver {
    String email;
    String password;

    String firstName;
    String lastName;
    String phoneNumber;
    String language;
    String country;
    String city;
    String CompanyName;
    CompanyInfo companyInfo;
}
