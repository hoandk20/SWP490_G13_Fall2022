package com.G13;

import com.G13.domain.Driver;
import com.G13.repository.DriverRepository;
import com.G13.service.DriverService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class DriverTest {
    @Mock
    DriverRepository driverRepository;
    @InjectMocks
    DriverService driverService;

    @BeforeEach
    void addData(){
        Driver driver = new Driver();
        driver.setId("1");
        driver.setEmail("hoan123@gmail.com");
        driver.setCurrentVehicle(1);
        List<Driver> list = new ArrayList<>();
        list.add(driver);
        when(driverRepository.findDriverById("1")).thenReturn(driver);
        when(driverRepository.findByEmailOrderByCreatedDateDesc("hoan123@gmail.com")).thenReturn(driver);
        when(driverRepository.findDriverByCurrentVehicle(1)).thenReturn(driver);
        when(driverRepository.findAll()).thenReturn(list);
    }
    //get driver by id
    @Test
    void testGetDriverById(){
        String expectUserid = "1";
        Driver Actualdriver = driverService.getDriverByID(expectUserid);
        assertThat(Actualdriver.getId()).isEqualTo(expectUserid);
    }
    @Test
    void testGetDriverByIdNotExisted(){
        Driver Actualdriver = driverService.getDriverByID("99");
        assertThat(Actualdriver).isEqualTo(null);
    }

    //get driver by email
    @Test
    void testGetDriverByEmailFound(){
        String expectEmail = "hoan123@gmail.com";
        Driver Actualdriver = driverService.getDriverByEmail(expectEmail);
        assertThat(Actualdriver.getEmail()).isEqualTo(expectEmail);
    }
    @Test
    void testGetDriverByEmailNotExisted(){
        Driver Actualdriver = driverService.getDriverByEmail("Email123@gmail.com");
        assertThat(Actualdriver).isEqualTo(null);
    }
    @Test
    void testGetDriverByInvalidEmail(){
        Driver Actualdriver = driverService.getDriverByEmail("hoan123");
        assertThat(Actualdriver).isEqualTo(null);
    }
    @Test
    void testGetDriverByBlankEmail(){
        Driver Actualdriver = driverService.getDriverByEmail("");
        assertThat(Actualdriver).isEqualTo(null);
    }

    //test save driver
    @Test
    void testSaveDriverSuccessfull(){
        Driver driver = new Driver();
        driver.setEmail("driver@gmail.com");
        driver.setFirstName("hoan");
        driver.setLastName("kieu");
        driver.setMobileNo("012345678");
        boolean ActualStatus  = driverService.SaveDriver(driver);
        assertThat(ActualStatus).isEqualTo(true);
    }
    @Test
    void testSaveDriverNoDriverEmail(){
        Driver driver = new Driver();
        driver.setFirstName("hoan");
        driver.setLastName("kieu");
        driver.setMobileNo("012345678");
        boolean ActualStatus  = driverService.SaveDriver(driver);
        assertThat(ActualStatus).isEqualTo(false);
    }
    @Test
    void testSaveDriverNoFirstName(){
        Driver driver = new Driver();
        driver.setEmail("driver@gmail.com");
        driver.setLastName("kieu");
        driver.setMobileNo("012345678");
        boolean ActualStatus  = driverService.SaveDriver(driver);
        assertThat(ActualStatus).isEqualTo(false);
    }
    @Test
    void testSaveDriverNoLastName(){
        Driver driver = new Driver();
        driver.setEmail("driver@gmail.com");
        driver.setFirstName("hoan");
        driver.setMobileNo("012345678");
        boolean ActualStatus  = driverService.SaveDriver(driver);
        assertThat(ActualStatus).isEqualTo(false);
    }
    @Test
    void testSaveDriverNoMobileNo(){
        Driver driver = new Driver();
        driver.setEmail("driver@gmail.com");
        driver.setFirstName("hoan");
        driver.setLastName("kieu");
        boolean ActualStatus  = driverService.SaveDriver(driver);
        assertThat(ActualStatus).isEqualTo(false);
    }

    //new
    //test get driver by vehicle Id
    @Test
    void testGetDriverByVehicleIdFound(){
        int expectId = 1;
        Driver Actualdriver = driverService.getDriverByVehicleId(expectId);
        assertThat(Actualdriver.getCurrentVehicle()).isEqualTo(expectId);
    }
    @Test
    void testGetDriverByVehicleIdNotFound(){
        int expectId = 0;
        Driver Actualdriver = driverService.getDriverByVehicleId(expectId);
        assertThat(Actualdriver).isEqualTo(null);
    }
    //new
    //test delete driver
    @Test
    void testDeleteDriverSuccess(){
        Driver driver = new Driver();
        driver.setId("1");
        driver.setEmail("hoan123@gmail.com");
        driver.setCurrentVehicle(1);
        boolean ActualStatus = driverService.DeleteDriver(driver);
        assertThat(ActualStatus).isEqualTo(true);
    }
    @Test
    void testDeleteDriverWithNoDriverID(){
        Driver driver = new Driver();
        driver.setEmail("hoan123@gmail.com");
        driver.setCurrentVehicle(1);
        boolean ActualStatus = driverService.DeleteDriver(driver);
        assertThat(ActualStatus).isEqualTo(false);
    }
    //new
    //test get all Driver
    @Test
    void testGetAllDriver(){
        int ExpectSize = 1;
        List<Driver> list = driverService.getAllDriver();
        assertThat(list.size()).isEqualTo(ExpectSize);
    }
}
