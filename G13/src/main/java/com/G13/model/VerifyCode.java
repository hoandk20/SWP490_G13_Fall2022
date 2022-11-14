package com.G13.model;

import lombok.Data;

@Data
public class VerifyCode {
    String email;
    String code;
    String status;
    boolean isExpired;
}