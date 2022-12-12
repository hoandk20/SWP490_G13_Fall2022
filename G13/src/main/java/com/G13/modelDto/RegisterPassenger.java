package com.G13.modelDto;

import lombok.Data;

@Data
public class RegisterPassenger {


     String email;
     String password;
     String firstName;
     String LastName;
     String PhoneNumber;
     String Language;
     int cityId;
}