package com.G13;

import com.G13.domain.Vehicle;
import com.G13.model.PassengerInfo;
import com.G13.model.RegisterDriverCompany;
import com.G13.model.TripDriver;
import com.G13.model.VehicleRequest;
import com.G13.service.AdminService;
import com.G13.service.TripDriverService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TestAdminService {
    @InjectMocks
    AdminService adminService;
    List<RegisterDriverCompany> registerDriverCompanyList;

    void AddDataRegisterDriverCompanyList(){
        registerDriverCompanyList = new ArrayList<>();
        RegisterDriverCompany registerDriverCompany1 = new RegisterDriverCompany();
        registerDriverCompany1.setPhoneNumber("012345678");
        registerDriverCompany1.setStatus("NEW");
        registerDriverCompany1.setAddress("Hanoi");
        registerDriverCompany1.setEmail("driver1@gmail.com");
        VehicleRequest vehicle = new VehicleRequest();
        vehicle.setPlate("29V512345");
        registerDriverCompany1.setVehicleInfo(vehicle);
        registerDriverCompany1.setFirstName("Hoan");
        registerDriverCompany1.setLastName("Kieu");
        Date date1 = new Date(2022,12,5);
        registerDriverCompany1.setCreateDate(date1.toInstant());
        registerDriverCompanyList.add(registerDriverCompany1);

        RegisterDriverCompany registerDriverCompany2 = new RegisterDriverCompany();
        registerDriverCompany2.setPhoneNumber("012345677");
        registerDriverCompany2.setStatus("NEW");
        registerDriverCompany2.setAddress("HaiPhong");
        registerDriverCompany2.setEmail("driver2@gmail.com");
        VehicleRequest vehicle2 = new VehicleRequest();
        vehicle2.setPlate("29V5555");
        registerDriverCompany2.setVehicleInfo(vehicle2);
        registerDriverCompany2.setFirstName("Nam");
        registerDriverCompany2.setLastName("Anh");
        Date date2 = new Date(2022,12,10);
        registerDriverCompany2.setCreateDate(date2.toInstant());
        registerDriverCompanyList.add(registerDriverCompany2);

    }
    //new
    // test Filter RegisterDriverCompany
    @Test
    void testFilterRegisterDriverCompanyWithNoFilter(){
        AddDataRegisterDriverCompanyList();
        Date regFrom = null;
        Date regTo = null;
        String phone ="";
        String driverName = "";
        String email = "";
        String Status = "";
        String city = "";
        String plate = "";
        List<RegisterDriverCompany> actualList = adminService.filterListDriverCompany(registerDriverCompanyList,
                regFrom,regTo,phone,driverName,email,Status,city,plate);
        assertThat(actualList.size()).isEqualTo(2);
    }
    @Test
    void testFilterRegisterDriverCompanyWithregFrom(){
        AddDataRegisterDriverCompanyList();
        Date regFrom = new Date(2022,12,4);
        Date regTo = null;
        String phone ="";
        String driverName = "";
        String email = "";
        String Status = "";
        String city = "";
        String plate = "";
        List<RegisterDriverCompany> actualList = adminService.filterListDriverCompany(registerDriverCompanyList,
                regFrom,regTo,phone,driverName,email,Status,city,plate);
        assertThat(actualList.size()).isEqualTo(2);
    }
    @Test
    void testFilterRegisterDriverCompanyWithregFromBoundary(){
        AddDataRegisterDriverCompanyList();
        Date regFrom = new Date(2022,12,5);
        Date regTo = null;
        String phone ="";
        String driverName = "";
        String email = "";
        String Status = "";
        String city = "";
        String plate = "";
        List<RegisterDriverCompany> actualList = adminService.filterListDriverCompany(registerDriverCompanyList,
                regFrom,regTo,phone,driverName,email,Status,city,plate);
        assertThat(actualList.size()).isEqualTo(2);
    }
    @Test
    void testFilterRegisterDriverCompanyWithregTo(){
        AddDataRegisterDriverCompanyList();
        Date regFrom = null;
        Date regTo = new Date(2022,12,11);
        String phone ="";
        String driverName = "";
        String email = "";
        String Status = "";
        String city = "";
        String plate = "";
        List<RegisterDriverCompany> actualList = adminService.filterListDriverCompany(registerDriverCompanyList,
                regFrom,regTo,phone,driverName,email,Status,city,plate);
        assertThat(actualList.size()).isEqualTo(2);
    }
    @Test
    void testFilterRegisterDriverCompanyWithregToBoundary(){
        AddDataRegisterDriverCompanyList();
        Date regFrom = null;
        Date regTo = new Date(2022,12,10);
        String phone ="";
        String driverName = "";
        String email = "";
        String Status = "";
        String city = "";
        String plate = "";
        List<RegisterDriverCompany> actualList = adminService.filterListDriverCompany(registerDriverCompanyList,
                regFrom,regTo,phone,driverName,email,Status,city,plate);
        assertThat(actualList.size()).isEqualTo(2);
    }
    @Test
    void testFilterRegisterDriverCompanyWithregFromAndregTo(){
        AddDataRegisterDriverCompanyList();
        Date regFrom = new Date(2022,12,5);
        Date regTo = new Date(2022,12,10);
        String phone ="";
        String driverName = "";
        String email = "";
        String Status = "";
        String city = "";
        String plate = "";
        List<RegisterDriverCompany> actualList = adminService.filterListDriverCompany(registerDriverCompanyList,
                regFrom,regTo,phone,driverName,email,Status,city,plate);
        assertThat(actualList.size()).isEqualTo(2);
    }
    @Test
    void testFilterRegisterDriverCompanyWithPhoneFound(){
        AddDataRegisterDriverCompanyList();
        Date regFrom = null;
        Date regTo = null;
        String phone ="012345678";
        String driverName = "";
        String email = "";
        String Status = "";
        String city = "";
        String plate = "";
        List<RegisterDriverCompany> actualList = adminService.filterListDriverCompany(registerDriverCompanyList,
                regFrom,regTo,phone,driverName,email,Status,city,plate);
        assertThat(actualList.size()).isEqualTo(1);
    }
    @Test
    void testFilterRegisterDriverCompanyWithPhoneNotFound(){
        AddDataRegisterDriverCompanyList();
        Date regFrom = null;
        Date regTo = null;
        String phone ="0000000000";
        String driverName = "";
        String email = "";
        String Status = "";
        String city = "";
        String plate = "";
        List<RegisterDriverCompany> actualList = adminService.filterListDriverCompany(registerDriverCompanyList,
                regFrom,regTo,phone,driverName,email,Status,city,plate);
        assertThat(actualList.size()).isEqualTo(0);
    }
    @Test
    void testFilterRegisterDriverCompanyWithDriverNameFound(){
        AddDataRegisterDriverCompanyList();
        Date regFrom = null;
        Date regTo = null;
        String phone ="";
        String driverName = "Kieu Hoan";
        String email = "";
        String Status = "";
        String city = "";
        String plate = "";
        List<RegisterDriverCompany> actualList = adminService.filterListDriverCompany(registerDriverCompanyList,
                regFrom,regTo,phone,driverName,email,Status,city,plate);
        assertThat(actualList.size()).isEqualTo(1);
    }
    @Test
    void testFilterRegisterDriverCompanyWithDriverNameNotFound(){
        AddDataRegisterDriverCompanyList();
        Date regFrom = null;
        Date regTo = null;
        String phone ="";
        String driverName = "abc xyz";
        String email = "";
        String Status = "";
        String city = "";
        String plate = "";
        List<RegisterDriverCompany> actualList = adminService.filterListDriverCompany(registerDriverCompanyList,
                regFrom,regTo,phone,driverName,email,Status,city,plate);
        assertThat(actualList.size()).isEqualTo(0);
    }
    @Test
    void testFilterRegisterDriverCompanyWithEmailFound(){
        AddDataRegisterDriverCompanyList();
        Date regFrom = null;
        Date regTo = null;
        String phone ="";
        String driverName = "";
        String email = "driver1@gmail.com";
        String Status = "";
        String city = "";
        String plate = "";
        List<RegisterDriverCompany> actualList = adminService.filterListDriverCompany(registerDriverCompanyList,
                regFrom,regTo,phone,driverName,email,Status,city,plate);
        assertThat(actualList.size()).isEqualTo(1);
    }
    @Test
    void testFilterRegisterDriverCompanyWithEmailNotFound(){
        AddDataRegisterDriverCompanyList();
        Date regFrom = null;
        Date regTo = null;
        String phone ="";
        String driverName = "";
        String email = "xyz@gmail.com";
        String Status = "";
        String city = "";
        String plate = "";
        List<RegisterDriverCompany> actualList = adminService.filterListDriverCompany(registerDriverCompanyList,
                regFrom,regTo,phone,driverName,email,Status,city,plate);
        assertThat(actualList.size()).isEqualTo(0);
    }
    @Test
    void testFilterRegisterDriverCompanyWithStatusFound(){
        AddDataRegisterDriverCompanyList();
        Date regFrom = null;
        Date regTo = null;
        String phone ="";
        String driverName = "";
        String email = "";
        String Status = "NEW";
        String city = "";
        String plate = "";
        List<RegisterDriverCompany> actualList = adminService.filterListDriverCompany(registerDriverCompanyList,
                regFrom,regTo,phone,driverName,email,Status,city,plate);
        assertThat(actualList.size()).isEqualTo(2);
    }
    @Test
    void testFilterRegisterDriverCompanyWithStatusNotFound(){
        AddDataRegisterDriverCompanyList();
        Date regFrom = null;
        Date regTo = null;
        String phone ="";
        String driverName = "";
        String email = "";
        String Status = "ACT";
        String city = "";
        String plate = "";
        List<RegisterDriverCompany> actualList = adminService.filterListDriverCompany(registerDriverCompanyList,
                regFrom,regTo,phone,driverName,email,Status,city,plate);
        assertThat(actualList.size()).isEqualTo(0);
    }
    @Test
    void testFilterRegisterDriverCompanyWithCityFound(){
        AddDataRegisterDriverCompanyList();
        Date regFrom = null;
        Date regTo = null;
        String phone ="";
        String driverName = "";
        String email = "";
        String Status = "";
        String city = "Hanoi";
        String plate = "";
        List<RegisterDriverCompany> actualList = adminService.filterListDriverCompany(registerDriverCompanyList,
                regFrom,regTo,phone,driverName,email,Status,city,plate);
        assertThat(actualList.size()).isEqualTo(1);
    }
    @Test
    void testFilterRegisterDriverCompanyWithCityNotFound(){
        AddDataRegisterDriverCompanyList();
        Date regFrom = null;
        Date regTo = null;
        String phone ="";
        String driverName = "";
        String email = "";
        String Status = "";
        String city = "HCM";
        String plate = "";
        List<RegisterDriverCompany> actualList = adminService.filterListDriverCompany(registerDriverCompanyList,
                regFrom,regTo,phone,driverName,email,Status,city,plate);
        assertThat(actualList.size()).isEqualTo(0);
    }
    @Test
    void testFilterRegisterDriverCompanyWithPlateFound(){
        AddDataRegisterDriverCompanyList();
        Date regFrom = null;
        Date regTo = null;
        String phone ="";
        String driverName = "";
        String email = "";
        String Status = "";
        String city = "";
        String plate = "29V5555";
        List<RegisterDriverCompany> actualList = adminService.filterListDriverCompany(registerDriverCompanyList,
                regFrom,regTo,phone,driverName,email,Status,city,plate);
        assertThat(actualList.size()).isEqualTo(1);
    }
    @Test
    void testFilterRegisterDriverCompanyWithPlateNotFound(){
        AddDataRegisterDriverCompanyList();
        Date regFrom = null;
        Date regTo = null;
        String phone ="";
        String driverName = "";
        String email = "";
        String Status = "";
        String city = "";
        String plate = "28V";
        List<RegisterDriverCompany> actualList = adminService.filterListDriverCompany(registerDriverCompanyList,
                regFrom,regTo,phone,driverName,email,Status,city,plate);
        assertThat(actualList.size()).isEqualTo(0);
    }
    @Test
    void testFilterRegisterDriverCompanyWithAllFilterFound(){
        AddDataRegisterDriverCompanyList();
        Date regFrom = new Date(2022,12,5);
        Date regTo = new Date(2022,12,10);
        String phone ="012345678";
        String driverName = "Kieu Hoan";
        String email = "driver1@gmail.com";
        String Status = "NEW";
        String city = "Hanoi";
        String plate = "29V";
        List<RegisterDriverCompany> actualList = adminService.filterListDriverCompany(registerDriverCompanyList,
                regFrom,regTo,phone,driverName,email,Status,city,plate);
        assertThat(actualList.size()).isEqualTo(1);
    }
    @Test
    void testFilterRegisterDriverCompanyWithAllFilterNotFound(){
        AddDataRegisterDriverCompanyList();
        Date regFrom = new Date(2022,12,5);
        Date regTo = new Date(2022,12,10);
        String phone ="0123456789";
        String driverName = "Kieu Hoan";
        String email = "driver1@gmail.com";
        String Status = "NEW";
        String city = "Hanoi";
        String plate = "28V";
        List<RegisterDriverCompany> actualList = adminService.filterListDriverCompany(registerDriverCompanyList,
                regFrom,regTo,phone,driverName,email,Status,city,plate);
        assertThat(actualList.size()).isEqualTo(0);
    }


    List<PassengerInfo> passengerInfoList;
    void addDatapassengerInfoList(){
        passengerInfoList = new ArrayList<>();
        PassengerInfo passengerInfo1 = new PassengerInfo();
        passengerInfo1.setPhone("012345678");
        passengerInfo1.setLassName("Kieu");
        passengerInfo1.setFirstName("Hoan");
        passengerInfo1.setEmail("hoan@gmail.com");
        passengerInfoList.add(passengerInfo1);

        PassengerInfo passengerInfo2 = new PassengerInfo();
        passengerInfo2.setPhone("012345677");
        passengerInfo2.setLassName("Nguyen");
        passengerInfo2.setFirstName("Nam");
        passengerInfo2.setEmail("hoan1@gmail.com");
        passengerInfoList.add(passengerInfo2);


    }

    //new
    //test filter passengerInfo

    @Test
    void testFilterPassengerInfoNoFilter(){
        addDatapassengerInfoList();
        String phone ="";
        String name ="";
        String email = "";
        List<PassengerInfo> actualList = adminService.filterlistRider(passengerInfoList,phone,name,email);
        assertThat(actualList.size()).isEqualTo(2);
    }
    @Test
    void testFilterPassengerInfoWithPhoneFound(){
        addDatapassengerInfoList();
        String phone ="012345678";
        String name ="";
        String email = "";
        List<PassengerInfo> actualList = adminService.filterlistRider(passengerInfoList,phone,name,email);
        assertThat(actualList.size()).isEqualTo(1);
    }
    @Test
    void testFilterPassengerInfoWithPhoneNotFound(){
        addDatapassengerInfoList();
        String phone ="000000000";
        String name ="";
        String email = "";
        List<PassengerInfo> actualList = adminService.filterlistRider(passengerInfoList,phone,name,email);
        assertThat(actualList.size()).isEqualTo(0);
    }
    @Test
    void testFilterPassengerInfoWithNameFound(){
        addDatapassengerInfoList();
        String phone ="";
        String name ="Kieu Hoan";
        String email = "";
        List<PassengerInfo> actualList = adminService.filterlistRider(passengerInfoList,phone,name,email);
        assertThat(actualList.size()).isEqualTo(1);
    }
    @Test
    void testFilterPassengerInfoWithNameNotFound(){
        addDatapassengerInfoList();
        String phone ="000000000";
        String name ="abc xyz";
        String email = "";
        List<PassengerInfo> actualList = adminService.filterlistRider(passengerInfoList,phone,name,email);
        assertThat(actualList.size()).isEqualTo(0);
    }
    @Test
    void testFilterPassengerInfoWithEmailFound(){
        addDatapassengerInfoList();
        String phone ="";
        String name ="";
        String email = "hoan@gmail.com";
        List<PassengerInfo> actualList = adminService.filterlistRider(passengerInfoList,phone,name,email);
        assertThat(actualList.size()).isEqualTo(1);
    }
    @Test
    void testFilterPassengerInfoWithEmailNotFound(){
        addDatapassengerInfoList();
        String phone ="";
        String name ="";
        String email = "abc@gmail.com";
        List<PassengerInfo> actualList = adminService.filterlistRider(passengerInfoList,phone,name,email);
        assertThat(actualList.size()).isEqualTo(0);
    }

//    List<TripDriver> tripDriverList;
//    void AddDataListTripDriver(){
//        tripDriverList = new ArrayList<>();
//        TripDriver tripDriver = new TripDriver();
//        tripDriver.setPhoneDriver("012345678");
//        tripDriver.setPhonePassenger("022345678");
//        tripDriver.setStatus("OPEN");
//        Date date1 = new Date(2000,12,5);
//        tripDriver.setInstantTimeStart(date1.toInstant());
//
//        tripDriverList = new ArrayList<>();
//        TripDriver tripDriver1 = new TripDriver();
//        tripDriver1.setPhoneDriver("012345677");
//        tripDriver1.setPhonePassenger("022345677");
//        tripDriver1.setStatus("OPEN");
//        Date date2 = new Date(2000,12,10);
//        tripDriver.setInstantTimeStart(date2.toInstant());
//    }
}
