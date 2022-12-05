package com.G13;

import com.G13.domain.Promotiontrip;
import com.G13.domain.Vehicle;
import com.G13.repo.UserRepository;
import com.G13.repo.VehicleRepository;
import com.G13.service.UserService;
import com.G13.service.VehicleService;
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

    @Test
    void testGetVehicleById(){
        Vehicle vehicle = new Vehicle();
        vehicle.setId(1);
        vehicle.setPlate("29V51111");
        when(vehicleRepository.findVehicleById(1)).thenReturn(vehicle);
        Vehicle ActualVehicle = vehicleService.getVehicleByID(1);
        assertThat(ActualVehicle.getId()).isEqualTo(vehicle.getId());
    }
    @Test
    void testGetVehicleByIdNotExisted(){
        Vehicle ActualVehicle = vehicleService.getVehicleByID(1);
        assertThat(ActualVehicle).isEqualTo(null);
    }
}
