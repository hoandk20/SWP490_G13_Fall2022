package com.G13;

import com.G13.domain.Promotiontrip;
import com.G13.domain.Vehicle;
import com.G13.repo.UserRepository;
import com.G13.repo.VehicleRepository;
import com.G13.service.UserService;
import com.G13.service.VehicleService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class VehicleTest {
    @Mock
    VehicleRepository vehicleRepository;
    @InjectMocks
    VehicleService vehicleService;

    @BeforeEach
    void addData(){
        Vehicle vehicle = new Vehicle();
        vehicle.setId(1);
        vehicle.setPlate("29V51111");
        vehicle.setCompanyID(1);
        when(vehicleRepository.findVehicleById(1)).thenReturn(vehicle);
        when(vehicleRepository.findFirstByCompanyIDOrderByCreatedDateDesc(1)).thenReturn(vehicle);
    }
    //test get vehicle by id
    @Test
    void testGetVehicleById(){
        int ExpectCompanyId = 1;
        Vehicle ActualVehicle = vehicleService.getVehicleByID(1);
        assertThat(ActualVehicle.getId()).isEqualTo(ExpectCompanyId);

    }
    @Test
    void testGetVehicleByIdNotFound(){
        Vehicle ActualVehicle = vehicleService.getVehicleByID(2);
        assertThat(ActualVehicle).isEqualTo(null);
    }

    //test get vehicle by company id
    @Test
    void testGetVehicleByCompanyId(){

        int ExpectCompanyId = 1;
        Vehicle ActualVehicle = vehicleService.getFistVehicleByCompanyId(ExpectCompanyId);
        assertThat(ActualVehicle.getCompanyID()).isEqualTo(ExpectCompanyId);
    }
    @Test
    void testGetVehicleByCompanyIdNotFound(){
        Vehicle ActualVehicle = vehicleService.getFistVehicleByCompanyId(2);
        assertThat(ActualVehicle).isEqualTo(null);
    }

}
