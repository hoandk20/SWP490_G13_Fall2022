package com.G13.api;

import com.G13.domain.*;
import com.G13.master.MasterStatus;
import com.G13.master.MasterTripStatus;
import com.G13.master.RegisterStatus;
import com.G13.modelDto.ResopnseContent;
import com.G13.modelDto.TripDriver;
import com.G13.modelDto.TripPassenger;
import com.G13.modelDto.filterTripPassenger;
import com.G13.service.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;

@RestController
@RequestMapping("/api/tripdriver")
@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
@RequiredArgsConstructor

public class DriverTrip {

    private final PromotionTripService promotionTripService;
    private final TripService tripService;
    private final VehicleService vehicleService;
    private final DriverService driverService;
    private final CommonService commonService;
    private final TripDriverService tripDriverService;

    @PostMapping("/create")
    public ResponseEntity<?> CreateTrip(@RequestBody TripDriver rp) {
        Date date = new Date();
        Instant timeStart = rp.getTimeStart().toInstant();
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        MasterTripStatus masterTripStatus = new MasterTripStatus();
        float nofloat = 0;
        short noShort = (short) 0;
        long timeMilli = date.getTime();

        try {
            MasterTripStatus m = new MasterTripStatus();
            Promotiontrip t = new Promotiontrip();
            t.setId(timeMilli + "");
            t.setFromAddress(rp.getFrom());
            t.setToAddress(rp.getTo());
            t.setFee(rp.getPrice());
            t.setTimeStart(timeStart);
            t.setDriverID(rp.getDriverEmail());
            t.setDuration(rp.getWaitingTime());
            t.setCapacity(rp.getSeat());
            t.setStatus(masterTripStatus.TRIP_OPEN);
            t.setNote(rp.getListPolyline());
            response.setContent(promotionTripService.SavePromotionTrip(t).toString());
            response.setObject(t);
            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }

    }

    @GetMapping("/listOpen")
    public ResponseEntity<?> listTripOpen() {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        MasterTripStatus masterTripStatus = new MasterTripStatus();
        try {
            List<Promotiontrip> list = promotionTripService.getAllTrip();
            List<TripDriver> driverTripHistory = new ArrayList<>();
            for (Promotiontrip detail : list
            ) {
                if (detail.getStatus().equals(masterTripStatus.TRIP_OPEN)) {
                    TripDriver tripDriver = new TripDriver();
                    tripDriver.setId(detail.getId());
                    tripDriver.setDriverEmail(detail.getDriverID());
                    tripDriver.setFrom(detail.getFromAddress());
                    tripDriver.setTo(detail.getToAddress());
                    tripDriver.setSeat(detail.getCapacity());
                    tripDriver.setSeatRegistered(detail.getNumberCapacityRegistered());
                    tripDriver.setStatus(detail.getStatus());
                    tripDriver.setTimeStart(Date.from(detail.getTimeStart()));
                    tripDriver.setWaitingTime(detail.getDuration());
                    tripDriver.setPrice(detail.getFee());
                    Driver driver = driverService.getDriverByEmail(tripDriver.getDriverEmail());
                    Vehicle vehicle = vehicleService.getVehicleByID(driver.getCurrentVehicle());
                    if (vehicle != null) {
                        tripDriver.setVehiclePlate(vehicle.getPlate());
                        tripDriver.setVehicleColor(vehicle.getExteriorColor());
                        tripDriver.setVehicleName(vehicle.getCreatedBy());
                    }
                    driverTripHistory.add(tripDriver);
                }
            }
            response.setObject(driverTripHistory);
            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }


    @PostMapping("/listTrip")
    public ResponseEntity<?> listTrip(@RequestBody filterTripPassenger filter) {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();

        try {
            List<Promotiontrip> list = promotionTripService.getAllTripByDriverId(filter.driverEmail);
            List<TripDriver> driverTrips = new ArrayList<>();
            for (Promotiontrip detail : list
            ) {
                TripDriver tripDriver = new TripDriver();
                tripDriver.setDriverEmail(detail.getDriverID());
                tripDriver.setFrom(detail.getFromAddress());
                tripDriver.setTo(detail.getToAddress());
                tripDriver.setSeat(detail.getCapacity());
                tripDriver.setId(detail.getId());
                tripDriver.setSeatRegistered(detail.getNumberCapacityRegistered());
                tripDriver.setStatus(detail.getStatus());
                tripDriver.setTimeStart(Date.from(detail.getTimeStart()));
                tripDriver.setWaitingTime(detail.getDuration());
                tripDriver.setPrice(detail.getFee());
                Driver driver = driverService.getDriverByEmail(tripDriver.getDriverEmail());
                Vehicle vehicle = vehicleService.getVehicleByID(driver.getCurrentVehicle());
                if (vehicle != null) {
                    tripDriver.setVehiclePlate(vehicle.getPlate());
                    tripDriver.setVehicleColor(vehicle.getExteriorColor());
                    tripDriver.setVehicleName(vehicle.getCreatedBy());
                }
                driverTrips.add(tripDriver);
            }
            driverTrips = tripDriverService.filterTripDriver(driverTrips, filter);

            response.setObject(driverTrips);
            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }


    @PostMapping("/search")
    public ResponseEntity<?> listTrip(@RequestBody SearchTrip searchTrip) {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try {

            List<Promotiontrip> list = promotionTripService.getAllByStatus(searchTrip.status);
            List<TripDriver> driverTrips = new ArrayList<>();
            for (Promotiontrip detail : list
            ) {
                boolean isAdd = false;
                TripDriver tripDriver = new TripDriver();
                tripDriver.setListPolyline(detail.getNote());
                tripDriver.setDriverEmail(detail.getDriverID());
                tripDriver.setFrom(detail.getFromAddress());
                tripDriver.setTo(detail.getToAddress());
                tripDriver.setSeat(detail.getCapacity());
                tripDriver.setId(detail.getId());
                tripDriver.setTripID(detail.getId());
                tripDriver.setSeatRegistered(detail.getNumberCapacityRegistered());
                tripDriver.setStatus(detail.getStatus());
                tripDriver.setTimeStart(Date.from(detail.getTimeStart()));
                tripDriver.setInstantTimeStart(detail.getTimeStart());
                tripDriver.setWaitingTime(detail.getDuration());
                tripDriver.setPrice(detail.getFee());
                Driver driver = driverService.getDriverByEmail(tripDriver.getDriverEmail());
                Vehicle vehicle = vehicleService.getVehicleByID(driver.getCurrentVehicle());
                if (vehicle != null) {
                    tripDriver.setVehiclePlate(vehicle.getPlate());
                    tripDriver.setVehicleColor(vehicle.getExteriorColor());
                    tripDriver.setVehicleName(vehicle.getCreatedBy());
                }

                driverTrips.add(tripDriver);
            }
            driverTrips = filterTrip(driverTrips, searchTrip.listPolyline, searchTrip.registerSeat, searchTrip.dateStart, searchTrip.timeStart);
            Collections.sort(driverTrips, new Comparator<TripDriver>() {
                @Override
                public int compare(TripDriver o1, TripDriver o2) {
                    if (o1.getNoOfPolyline() == o2.getNoOfPolyline()) {
                        return 0;
                    }
                    return o1.getNoOfPolyline() > (o2.getNoOfPolyline()) ? -1 : 1;
                }
            });
            response.setObject(driverTrips);
            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }

    public List<TripDriver> filterTrip(List<TripDriver> list, String SlistPoly, String registerSeat, Date dateStart, String timeStart) {
        List<TripDriver> listResult = new ArrayList<>();
        Instant instantStart = Instant.now();
        boolean IsHasTime = true;
        try {
//            Date date = new SimpleDateFormat("hh:mm a, EEE MM/dd/yyyy").parse(dateStart);
            instantStart = dateStart.toInstant();
        } catch (Exception e) {
            IsHasTime = false;
        }
        int RegisterSeat = commonService.parseIntWithDefault(registerSeat, 0);
        int TimeStart = commonService.parseIntWithDefault(timeStart, 0);

        String[] listPoly = SlistPoly.split(";");
        listPoly[0] = "";
        listPoly[listPoly.length - 1] = "";
        for (TripDriver t : list) {
            if (t.getListPolyline() == null || t.getListPolyline().equals("")) {
                continue;
            }
            int i = 0;
            String sameWay = "";
            for (String o : listPoly) {
                String poly = o;
                if (t.getListPolyline().contains(poly) && !poly.equals("")) {
                    i++;
                    if (i < 3) {
                        sameWay = sameWay + o + ";";
                    }

                }
            }
            if (!t.getListPolyline().contains(sameWay)) {
                continue;
            }

            //not match of the routes
            System.out.println("" + t.getFrom() + " - " + t.getTo() + ", same: " + i + "/" + listPoly.length);
            //match less than 10% skip
            if (i < 0.1 * listPoly.length) {
                continue;
            }
            t.setNoOfPolyline(i);
            DecimalFormat df = new DecimalFormat("#.###");
            t.setPrice(t.getPrice() * i / listPoly.length);
            String[] listPoly2 = t.getListPolyline().split(";");
            t.setListPolyline(listPoly2[0] + "," + listPoly2[listPoly2.length - 1]);
            //not enough seat
            if (!(t.getSeat() - t.getSeatRegistered() >= RegisterSeat)) {
                continue;
            }
            if (IsHasTime) {
                if (TimeStart > 0) {
                    Date Date1 = Date.from(t.getInstantTimeStart());
                    Date Date2 = Date.from(instantStart);

                    if (Date1.getDay() == Date2.getDay() && Date1.getMonth() == Date2.getMonth() && Date1.getYear() == Date2.getYear()) {
                        if (!(Date1.getHours() + 2 > TimeStart && Date1.getHours() - 2 < TimeStart)) {
                            continue;
                        }
                    } else {
                        continue;
                    }

                } else {
                    Date Date1 = Date.from(t.getInstantTimeStart());
                    Date Date2 = Date.from(instantStart);
                    SimpleDateFormat sm = new SimpleDateFormat("MM-dd-yyyy");
                    if (!(sm.format(Date1).toString().equals(sm.format(Date2).toString()))) {
                        continue;
                    }
                }
            }
            listResult.add(t);

        }
        return listResult;
    }

    @PostMapping("ChangeStatus")
    public ResponseEntity<?> ChangeStatus(@RequestBody SearchTrip searchTrip) {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        MasterTripStatus masterTripStatus = new MasterTripStatus();
        try {

            Promotiontrip detail = promotionTripService.getPromotionTripById(searchTrip.getId());
            detail.setStatus(searchTrip.getStatus());
            response.setObject(promotionTripService.SavePromotionTrip(detail));
            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }

    @GetMapping("/listTripHistory")
    public ResponseEntity<?> listTripHistory(String driverEmail) {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        MasterTripStatus masterTripStatus = new MasterTripStatus();

        try {
            List<Promotiontrip> list = promotionTripService.getAllTripByDriverId(driverEmail);
            List<TripDriver> driverTripHistory = new ArrayList<>();
            for (Promotiontrip detail : list
            ) {
                if (detail.getStatus().equals(masterTripStatus.TRIP_CLOSE) || detail.getStatus().equals(masterTripStatus.TRIP_CANCEL)) {
                    TripDriver tripDriver = new TripDriver();
                    tripDriver.setId(detail.getId());
                    tripDriver.setDriverEmail(detail.getDriverID());
                    tripDriver.setFrom(detail.getFromAddress());
                    tripDriver.setTo(detail.getToAddress());
                    tripDriver.setSeat(detail.getCapacity());
                    tripDriver.setSeatRegistered(detail.getNumberCapacityRegistered());
                    tripDriver.setStatus(detail.getStatus());
                    tripDriver.setTimeStart(Date.from(detail.getTimeStart()));
                    tripDriver.setWaitingTime(detail.getDuration());
                    tripDriver.setPrice(detail.getFee());
                    Driver driver = driverService.getDriverByEmail(tripDriver.getDriverEmail());
                    Vehicle vehicle = vehicleService.getVehicleByID(driver.getCurrentVehicle());
                    if (vehicle != null) {
                        tripDriver.setVehiclePlate(vehicle.getPlate());
                        tripDriver.setVehicleColor(vehicle.getExteriorColor());
                        tripDriver.setVehicleName(vehicle.getCreatedBy());
                    }
                    driverTripHistory.add(tripDriver);
                }
            }

            response.setObject(driverTripHistory);
            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }

    @GetMapping("/detail")
    public ResponseEntity<?> tripDetail(String id) {

        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        RegisterStatus  registerStatus = new RegisterStatus();
        try {
            Promotiontrip detail = promotionTripService.getPromotionTripById(id);
            TripDriver tripDriver = new TripDriver();
            tripDriver.setSeat(detail.getCapacity());
            tripDriver.setStatus(detail.getStatus());
            tripDriver.setDriverEmail(detail.getDriverID());
            tripDriver.setFrom(detail.getFromAddress());
            tripDriver.setTo(detail.getToAddress());
            tripDriver.setTripID(detail.getId());
            tripDriver.setId(detail.getId());

            tripDriver.setTimeStart(Date.from(detail.getTimeStart()));
            tripDriver.setWaitingTime(detail.getDuration());
            tripDriver.setPrice(detail.getFee());
            List<Trip> listPassengers = tripService.getAllByTripCode(id);
            List<TripPassenger> tripPassengers = new ArrayList<>();
            int seatRegisted =0;
            for (Trip t : listPassengers) {
                TripPassenger tripPassenger = new TripPassenger();
                tripPassenger.setSeatRegister(t.getDuration());
                tripPassenger.setId(t.getId());
                tripPassenger.setTripID(t.getTripCode());
                tripPassenger.setPassengerEmail(t.getRiderID());
                tripPassenger.setStatus(t.getStatus());
                tripPassenger.setDriverEmail(t.getDriverID());
                tripPassenger.setFrom(t.getFromAddress());
                tripPassenger.setTo(t.getToAddress());
                tripPassenger.setNote(t.getNote());
                tripPassenger.setTimeStart(Date.from(t.getTimeStart()));
                tripPassenger.setWaitingTime(t.getDriverWaitingTime());
                tripPassenger.setPrice(t.getOpenPrice());
                tripPassengers.add(tripPassenger);
            }
            Driver driver = driverService.getDriverByEmail(tripDriver.getDriverEmail());
            tripDriver.setPhoneDriver(driver.getMobileNo());
            Vehicle vehicle = vehicleService.getVehicleByID(driver.getCurrentVehicle());
            if (vehicle != null) {
                tripDriver.setVehiclePlate(vehicle.getPlate());
                tripDriver.setVehicleColor(vehicle.getExteriorColor());
                tripDriver.setVehicleName(vehicle.getCreatedBy());
            }
            tripDriver.setListPassenger(tripPassengers);
            tripDriver.setSeatRegistered(detail.getNumberCapacityRegistered());
            response.setObject(tripDriver);
            response.setStatus(masterStatus.SUCCESSFULL);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }


}

@Data
class SearchTrip {
    String id;
    String listPolyline;
    String registerSeat;
    String status;
    Date dateStart;
    String timeStart;
}

