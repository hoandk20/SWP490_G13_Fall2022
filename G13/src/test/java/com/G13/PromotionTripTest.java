package com.G13;

import com.G13.domain.Promotiontrip;
import com.G13.masterData.MasterTripStatus;
import com.G13.repository.PromotiontripRepository;
import com.G13.service.PromotionTripService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class PromotionTripTest {
    @Mock
    PromotiontripRepository promotiontripRepository;
    @InjectMocks
    PromotionTripService promotionTripService;

    @BeforeEach
    void addData(){
        List<Promotiontrip> mocTripDriver = new ArrayList<>();
        MasterTripStatus masterTripStatus = new MasterTripStatus();
        for (int i = 0; i < 10; i++) {
            Promotiontrip p1 = new Promotiontrip();
            p1.setDriverID("driver@gmail.com");
            p1.setFromAddress("address1"+i);
            p1.setToAddress("address1"+i);
            p1.setCapacity(3);
            p1.setId("123"+i);
            p1.setNumberCapacityRegistered(2);
            p1.setId("1234"+i);
            mocTripDriver.add(p1);
        }
        when(promotiontripRepository.findTop10ByStatusOrderByCreatedDateDesc(masterTripStatus.TRIP_OPEN)).thenReturn(mocTripDriver);
        when(promotiontripRepository.findAllByDriverIDOrderByCreatedDateDesc("driver@gmail.com")).thenReturn(mocTripDriver);
        when(promotiontripRepository.findAll()).thenReturn(mocTripDriver);

    }
    @BeforeEach
    void addData2(){
        Promotiontrip p = new Promotiontrip();
        p.setDriverID("driver");
        p.setFromAddress("address1");
        p.setToAddress("address1");
        p.setStatus("OPEN");
        p.setCapacity(3);
        p.setId("123");
        p.setNumberCapacityRegistered(2);
        p.setId("1");
        when(promotiontripRepository.findPromotiontripByIdOrderByCreatedDateDesc("1")).thenReturn(p);
        List<Promotiontrip> mocTripDriver = new ArrayList<>();
        mocTripDriver.add(p);
        when(promotiontripRepository.findAllByStatus("OPEN")).thenReturn(mocTripDriver);

    }
    //test get top 10 promotion trip
    @Test
    void TestGetTop10TripOpen() {
        List<Promotiontrip> list = promotionTripService.getTop10TripOpen();
        assertThat(list.size()).isEqualTo(10);
    }
    //test get promotion trip by id
    @Test
    void testGetPromotionTripByIdFound(){
         String id = "1";
         Promotiontrip ActualPromotiontrip = promotionTripService.getPromotionTripById(id);
         assertThat(ActualPromotiontrip.getId()).isEqualTo(id);
    }
    @Test
    void testGetPromotionTripByIdNotFound(){
        String id = "22";
        Promotiontrip ActualPromotiontrip = promotionTripService.getPromotionTripById(id);
        assertThat(ActualPromotiontrip).isEqualTo(null);
    }
    @Test
    void testGetPromotionTripByIdBlankId(){
        String id = "";
        Promotiontrip ActualPromotiontrip = promotionTripService.getPromotionTripById(id);
        assertThat(ActualPromotiontrip).isEqualTo(null);
    }
    //test get promotiontrip by driver id
    @Test
    void testGetPromotionTripByDriverIDFound(){
        String driverID = "driver@gmail.com";
        List<Promotiontrip> list = promotionTripService.getAllTripByDriverId(driverID);
        assertThat(list.size()).isEqualTo(10);
    }
    @Test
    void testGetPromotionTripByDriverIDNotFound(){
        String driverID = "driver9999@gmail.com";
        List<Promotiontrip> list = promotionTripService.getAllTripByDriverId(driverID);
        assertThat(list.size()).isEqualTo(0);
    }
    //test get promotiontrip by status
    @Test
    void testGetPromotionByStatusFound(){

        String status = "OPEN";
        List<Promotiontrip> ActualList = promotionTripService.getAllByStatus(status);
        assertThat(ActualList.size()).isEqualTo(1);
    }
    @Test
    void testGetPromotionByStatusNotFound(){
        String status = "REJE";
        List<Promotiontrip> list = promotionTripService.getAllByStatus(status);
        assertThat(list.size()).isEqualTo(0);
    }
    //new
    //test get all Promotion trip
    @Test
    void testGetAllPromotionTrip(){
        List<Promotiontrip> ActualPromotiontripList = promotionTripService.getAllTrip();
        int ExpectSize =10;
        assertThat(ActualPromotiontripList.size()).isEqualTo(10);
    }
}
