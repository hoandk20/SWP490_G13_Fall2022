package com.G13.api;

import com.G13.domain.Driver;
import com.G13.domain.Vehicle;
import com.G13.master.CarStatus;
import com.G13.master.MasterStatus;
import com.G13.model.VehicleRequest;
import com.G13.repo.CompanyRepository;
import com.G13.repo.DriverRepository;
import com.G13.repo.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
@RestController
@RequestMapping("/api/driver")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RequiredArgsConstructor
public class DriverResource {
    private final DriverRepository driverRepository;
    private final CompanyRepository companyRepository;
    private final VehicleRepository vehicleRepository;
    @PostMapping("/addVehicle")
    public ResponseEntity<?> AddVehicle (@RequestBody VehicleRequest vr) {
        Date date = new Date();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        CarStatus carStatus = new CarStatus();
        float nofloat =0;
        short noShort = (short)0;
        long timeMilli = date.getTime();

        try {
            Vehicle vehicle = new Vehicle();

            vehicle.setCompanyID(0);
            vehicle.setProduceYear(vr.getProduceYear());
            vehicle.setInteriorColor(vr.getInteriorColor());
            vehicle.setExteriorColor(vr.getExteriorColor());
            vehicle.setPlate(vr.getPlate());
            vehicle.setLisencePlatState(vr.getPlatState());
            vehicle.setLisencePlatCountry(vr.getPlateCountry());
            vehicle.setCarTypeID(vr.getTypeId());
            vehicle.setCreatedBy(vr.getProducer());
            vehicle.setStatus(carStatus.Car_Using);
            Vehicle vehicleSave = vehicleRepository.saveAndFlush(vehicle);
            Driver driver  = driverRepository.findByEmail(vr.getDriverEmail());
            driver.setCurrentVehicle(vehicleSave.getId());
            driver.setDeviceType("N/A");
            driverRepository.save(driver);
            response.object=vehicleSave;
            response.status = masterStatus.SUCCESSFULL;
            return ResponseEntity.ok().body(response);
        }catch (Exception exception){
            response.content = exception.toString();
            response.status = masterStatus.FAILURE;
            return ResponseEntity.badRequest().body(response);
        }

    }
}
