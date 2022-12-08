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

import java.util.ArrayList;
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
        vehicle.setStatus("PE");
        vehicle.setCompanyID(1);
        List<Vehicle>Actuallist = new ArrayList<>();
        Actuallist.add(vehicle);
        when(vehicleRepository.findVehicleById(1)).thenReturn(vehicle);
        when(vehicleRepository.findFirstByCompanyIDOrderByCreatedDateDesc(1)).thenReturn(vehicle);
        when(vehicleRepository.saveAndFlush(vehicle)).thenReturn(vehicle);
        when(vehicleRepository.findByCompanyIDAndStatus(1,"PE")).thenReturn(Actuallist);

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
    //test Save Vehicle

    @Test
    void testSaveVehicleSuccess(){
        Vehicle vehicle = new Vehicle();
        vehicle.setId(1);
        vehicle.setPlate("29V51111");
        vehicle.setCompanyID(1);
        when(vehicleRepository.saveAndFlush(vehicle)).thenReturn(vehicle);


        Vehicle ActualVehicleSave = vehicleService.SaveVehicle(vehicle);
        assertThat(ActualVehicleSave.getPlate()).isEqualTo(vehicle.getPlate());
    }
    @Test
    void testSaveVehicleNoPlate(){
        Vehicle vehicle = new Vehicle();
        vehicle.setId(1);
        vehicle.setCompanyID(1);
        Vehicle ActualVehicleSave = vehicleService.SaveVehicle(vehicle);
        assertThat(ActualVehicleSave).isEqualTo(null);
    }


    //test get vehicle by company and status
    @Test
    void testGetVehicleByCompanyIdAndStatusFound(){

        List<Vehicle>Actuallist = vehicleService.getVehicleByCompanyIdAndStatus(1,"PE");
        assertThat(Actuallist.size()).isEqualTo(1);
    }
    @Test
    void testGetVehicleByCompanyIdAndStatusNotFound(){
        List<Vehicle>Actuallist = vehicleService.getVehicleByCompanyIdAndStatus(1,"US");
        assertThat(Actuallist.size()).isEqualTo(0);
    }
    //new
    //test delete vehicle
    @Test
    void testDeleteVehicleSuccess(){
        Vehicle vehicle = new Vehicle();
        vehicle.setId(1);
        vehicle.setCompanyID(1);
        boolean ActualStatus = vehicleService.DeleteVehicle(vehicle);
        assertThat(ActualStatus).isEqualTo(true);
    }
    @Test
    void testDeleteVehicleWithNoVehicleID(){
        Vehicle vehicle = new Vehicle();
        vehicle.setCompanyID(1);
        boolean ActualStatus = vehicleService.DeleteVehicle(vehicle);
        assertThat(ActualStatus).isEqualTo(false);
    }

}
