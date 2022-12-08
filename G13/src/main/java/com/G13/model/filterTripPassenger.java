package com.G13.model;

import lombok.Data;

import java.util.Date;

@Data
public class filterTripPassenger{
    public int companyID;
    public String passengerEmail;
    public String driverEmail;
    public Date dateFrom;
    public Date dateTo;
    public String status;
}
