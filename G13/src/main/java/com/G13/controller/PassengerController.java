package com.G13.controller;

import com.G13.domain.Document;
import com.G13.domain.Promotiontrip;
import com.G13.domain.Rider;
import com.G13.domain.Trip;
import com.G13.masterData.MasterStatus;
import com.G13.masterData.MasterTripStatus;
import com.G13.masterData.RegisterStatus;
import com.G13.masterData.UploadFileMaster;
import com.G13.modelDto.PassengerInfo;
import com.G13.modelDto.ReportDriverPassenger;
import com.G13.modelDto.ResopnseContent;
import com.G13.modelDto.UserInfo;
import com.G13.repository.*;
import com.G13.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/passenger")
@RequiredArgsConstructor
public class PassengerController {
    private final PromotionTripService promotionTripService;
    private final TripRepository tripRepository;
    private final DocumentService documentService;
    private final CommonService commonService;
    private final RiderService riderService;
    private final FileService fileService;

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
                Promotiontrip p = promotionTripService.getPromotionTripById(t.getTripCode());
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
        Rider rider = riderService.getRiderByEmail(userInfo.getEmail());
        ResopnseContent response = new ResopnseContent();
        MasterStatus masterStatus = new MasterStatus();
        try {
            if (rider != null) {
                if (commonService.IsPhoneExisted(userInfo.getPhone())
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
                response.setObject(riderService.SaveRider(rider));
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
            Rider rider = riderService.getRiderByEmail(passengerEmail);
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
            Document document = documentService
                    .GetDocumentByCreateByAndFileName(passengerInfo.getEmail(),uploadFileMaster.avatar);

            if(document!=null){
                passengerInfo.setAvatarBase64(fileService.GetBase64FromPath(document.getLink()));
            }

            response.setObject(passengerInfo);
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            response.setContent(exception.toString());
            return ResponseEntity.badRequest().body(response);
        }
    }

}

