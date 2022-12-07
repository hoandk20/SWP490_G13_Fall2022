package com.G13;

import com.G13.domain.Driver;
import com.G13.domain.Vehicle;
import com.G13.repo.DriverRepository;
import com.G13.service.DriverService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

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
        when(driverRepository.findDriverById("1")).thenReturn(driver);
        when(driverRepository.findByEmailOrderByCreatedDateDesc("hoan123@gmail.com")).thenReturn(driver);
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
}