package com.G13.modelDto;


import lombok.Data;

import java.time.Instant;

@Data
public class CompanyInfo {
    int companyId;
    int cityId;
    String companyName;
    String companyStatus;
    String companyAddress;
    String phone;
    String email;
    Instant createDate;
    DocumentRequest BLX;
    DocumentRequest CNKN;
    DocumentRequest GPKD;
    DocumentRequest GPHD;
    String AvatarBase64;
}
