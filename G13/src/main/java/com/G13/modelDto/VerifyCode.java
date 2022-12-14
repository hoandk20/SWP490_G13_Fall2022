package com.G13.modelDto;

import lombok.Data;

@Data
public class VerifyCode {
    String email;
    String code;
    String status;
    boolean isExpired;
}