package com.G13.api;

import com.G13.File.FileManage;
import com.G13.domain.Document;
import com.G13.domain.Promotiontrip;
import com.G13.domain.Rider;
import com.G13.domain.Trip;
import com.G13.master.MasterStatus;
import com.G13.master.MasterTripStatus;
import com.G13.master.RegisterStatus;
import com.G13.master.UploadFileMaster;
import com.G13.model.PassengerInfo;
import com.G13.model.ReportDriverPassenger;
import com.G13.model.ResopnseContent;
import com.G13.model.UserInfo;
import com.G13.repo.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/passenger")
@RequiredArgsConstructor
public class PassengerResource {
    private final PromotiontripRepository promotiontripRepository;
    private final TripRepository tripRepository;
    private final RiderRepository riderRepository;
    private final DriverRepository driverRepository;
    private final CompanyRepository companyRepository;
    private final DocumentRepository documentRepository;

    @GetMapping("/reportPassenger")
    public ResponseEntity<?> reportDriver(String passengerEmail) {
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        MasterTripStatus masterTripStatus = new MasterTripStatus();

        try {
            List<Trip> tripList = tripRepository.findAllByRiderID(passengerEmail);
            ReportDriverPassenger reportDriverPassenger = new ReportDriverPassenger();
            RegisterStatus registerStatus = new RegisterStatus();
            int Trip = 0;
            int TripOpen = 0;
            int TripClose = 0;
            int TripCancel = 0;
            for (Trip t : tripList) {
                Promotiontrip p = promotiontripRepository.findPromotiontripByIdOrderByCreatedDateDesc(t.getTripCode());
                Trip++;
                if (p.getStatus().equals(masterTripStatus.TRIP_OPEN) && t.getStatus().equals(registerStatus.APPROVE)) {
                    TripOpen++;
                }
                if (p.getStatus().equals(masterTripStatus.TRIP_CANCEL)) {
                    TripCancel++;
                }
                if (p.getStatus().equals(masterTripStatus.TRIP_CLOSE)) {
                    TripClose++;
                }
            }


            reportDriverPassenger.setTripOpenNo(TripOpen);
            reportDriverPassenger.setTripNo(Trip);
            reportDriverPassenger.setTripClose(TripClose);
            reportDriverPassenger.setTripCancel(TripCancel);

            response.setStatus(masterStatus.SUCCESSFULL);
            response.setObject(reportDriverPassenger);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }

    }

    @PostMapping("/changeinfo")
    public ResponseEntity<?> changePassenger(@RequestBody UserInfo userInfo) {
        Rider rider = riderRepository.findByEmail(userInfo.getEmail());
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try {
            if (rider != null) {
                commonFuntion commonFuntion = new commonFuntion();
                if (commonFuntion.IsPhoneExisted(userInfo.getPhone(), riderRepository, driverRepository, companyRepository)
                        && !rider.getMobileNo().equals(userInfo.getPhone())) {
                    rider.setMobileNo(userInfo.getPhone());
                    Map<String, Boolean> err = new HashMap<>();
                    err.put("IsExistedPhone", true);
                    response.setObject(err);
                    response.setStatus(masterStatus.FAILURE);
                    return ResponseEntity.badRequest().body(response);
                }

                rider.setFirstName(userInfo.getFirstname());
                rider.setLastName(userInfo.getLastname());
                rider.setHomeAddressID(userInfo.getAddress());

                rider.setHomeAddressID(userInfo.getAddress());
                rider.setCityID(userInfo.getCityId());
                response.setObject(riderRepository.save(rider));
                return ResponseEntity.ok().body(response);
            } else {
                response.setContent("passenger not existed");
                return ResponseEntity.badRequest().body(response);
            }
        } catch (Exception e) {
            response.setContent(e.toString());
            response.setStatus(masterStatus.FAILURE);
            return ResponseEntity.badRequest().body(response);
        }
    }

    @GetMapping("/detail")
    public ResponseEntity<?> passengerDetail(String passengerEmail) {
        ResopnseContent response = new ResopnseContent();
        UploadFileMaster uploadFileMaster = new UploadFileMaster();
        try {
            Rider rider = riderRepository.findByEmail(passengerEmail);
            PassengerInfo passengerInfo = new PassengerInfo();
            passengerInfo.setId(rider.getId());
            passengerInfo.setAddress(rider.getHomeAddressID());
            passengerInfo.setLassName(rider.getLastName());
            passengerInfo.setFirstName(rider.getFirstName());
            passengerInfo.setPhone(rider.getMobileNo());
            passengerInfo.setEmail(rider.getEmail());
            try {
                passengerInfo.setCityId(rider.getCityID());
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            Document document = documentRepository
                    .findFirst1ByCreatedByAndFileNameOrderByCreatedDateDesc(passengerInfo.getEmail(),uploadFileMaster.avatar);

            if(document!=null){
                FileManage fileManage = new FileManage();
                passengerInfo.setAvatarBase64(fileManage.GetBase64FromPath(document.getLink()));
            }

            response.setObject(passengerInfo);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            return ResponseEntity.badRequest().body(response);
        }
    }

}

