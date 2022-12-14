package com.G13.modelDto;

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