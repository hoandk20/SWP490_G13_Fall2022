package com.G13.modelDto;

import lombok.Data;

@Data
public class DocumentRequest {
    int id;
    String Base64;
    String expired_month;
    String expired_year;
    String file_name;
    String createBy;
    String status;
    int vehicleId;

}