package com.G13.model;


import lombok.Data;

import java.time.Instant;
import java.util.List;

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
    List<DocumentRequest> listDoc;
}
