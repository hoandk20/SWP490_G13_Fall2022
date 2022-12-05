package com.G13;

import com.G13.domain.Promotiontrip;
import com.G13.master.MasterTripStatus;
import com.G13.repo.PromotiontripRepository;
import com.G13.service.PromotionTripService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
public class PromotionTripTest {
    @Mock
    PromotiontripRepository promotiontripRepository;
    @InjectMocks
    PromotionTripService tripDriverService;

    @Test
    void TestGetTop10TripOpen() {
        List<Promotiontrip> mocTripDriver = new ArrayList<>();
        MasterTripStatus masterTripStatus = new MasterTripStatus();
        for (int i = 0; i < 10; i++) {
            Promotiontrip p1 = new Promotiontrip();
            p1.setDriverID("driver"+i);
            p1.setFromAddress("address1"+i);
            p1.setToAddress("address1"+i);
            p1.setCapacity(3);
            p1.setId("123"+i);
            p1.setNumberCapacityRegistered(2);
            p1.setId("1234"+i);
            mocTripDriver.add(p1);
        }
        when(promotiontripRepository.findTop10ByStatusOrderByCreatedDateDesc(masterTripStatus.TRIP_OPEN)).thenReturn(mocTripDriver);

        List<Promotiontrip> list = tripDriverService.getTop10TripOpen();
        assertThat(list.size()).isEqualTo(10);
    }
}
