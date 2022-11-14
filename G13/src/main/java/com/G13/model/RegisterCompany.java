package com.G13.model;

import lombok.Data;

@Data
public class RegisterCompany {
    String email;
    String password;
    String name;

    String phoneNumber;

    String language;
    String address;
}