package com.G13;

import com.G13.modelDto.TripDriver;
import com.G13.modelDto.filterTripPassenger;
import com.G13.service.TripDriverService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TestFilterDriverTrip {
    @InjectMocks
    TripDriverService tripDriverService;

    List<TripDriver> tripDriverList;

    void AddData(){
        tripDriverList = new ArrayList<>();
        TripDriver tripDriver = new TripDriver();


        tripDriver.setStatus("OPEN");
        Date DateStart = new Date(2022, 12, 5);
        tripDriver.setTimeStart(DateStart);
        tripDriver.setDriverEmail("driver1@gmail.com");
        tripDriverList.add(tripDriver);

        TripDriver tripDriver1 = new TripDriver();
        tripDriver1.setStatus("REJE");
        Date DateStart1 = new Date(2022, 12, 10);
        tripDriver1.setTimeStart(DateStart1);
        tripDriver1.setDriverEmail("driver2@gmail.com");
        tripDriverList.add(tripDriver1);

        TripDriver tripDriver2 = new TripDriver();
        tripDriver2.setStatus("CANC");
        Date DateStart2 = new Date(2022, 12, 15);
        tripDriver2.setTimeStart(DateStart2);
        tripDriver2.setDriverEmail("driver3@gmail.com");
        tripDriverList.add(tripDriver2);
    }


    //test filter trip driver
    @Test
    void testListFilterTripDriverWithAllFilter(){
        AddData();
        filterTripPassenger filter = new filterTripPassenger();
        filter.setStatus("OPEN");
        Date DateFrom = new Date(2022, 12, 1);
        filter.setDateFrom(DateFrom);
        Date DateTo = new Date(2022, 12, 30);
        filter.setDateTo(DateTo);
        filter.setDriverEmail("driver1@gmail.com");
        List<TripDriver> ActualList = tripDriverService.filterTripDriver(tripDriverList,filter);
        assertThat(ActualList.size()).isEqualTo(1);
    }
    @Test
    void testListFilterTripDriverWithAllFilterNotFound(){
        AddData();
        filterTripPassenger filter = new filterTripPassenger();
        filter.setStatus("CANC");
        Date DateFrom = new Date(2022, 12, 1);
        filter.setDateFrom(DateFrom);
        Date DateTo = new Date(2022, 12, 30);
        filter.setDateFrom(DateTo);
        filter.setDriverEmail("driver1@gmail.com");
        List<TripDriver> ActualList = tripDriverService.filterTripDriver(tripDriverList,filter);
        assertThat(ActualList.size()).isEqualTo(0);
    }
    @Test
    void testListFilterTripDriverWithStatusFound(){
        AddData();
        filterTripPassenger filter = new filterTripPassenger();
        filter.setStatus("CANC");
        List<TripDriver> ActualList = tripDriverService.filterTripDriver(tripDriverList,filter);
        assertThat(ActualList.size()).isEqualTo(1);
    }
    @Test
    void testListFilterTripDriverWithStatusNotFound(){
        AddData();
        filterTripPassenger filter = new filterTripPassenger();
        filter.setStatus("PEND");
        List<TripDriver> ActualList = tripDriverService.filterTripDriver(tripDriverList,filter);
        assertThat(ActualList.size()).isEqualTo(0);
    }
    @Test
    void testListFilterTripDriverWithDateFromFound(){
        AddData();
        filterTripPassenger filter = new filterTripPassenger();
        Date DateFrom = new Date(2022, 12, 1);
        filter.setDateFrom(DateFrom);
        List<TripDriver> ActualList = tripDriverService.filterTripDriver(tripDriverList,filter);
        assertThat(ActualList.size()).isEqualTo(3);
    }
    @Test
    void testListFilterTripDriverWithDateFromBoundary(){
        AddData();
        filterTripPassenger filter = new filterTripPassenger();
        Date DateFrom = new Date(2022, 12, 10);
        filter.setDateFrom(DateFrom);
        List<TripDriver> ActualList = tripDriverService.filterTripDriver(tripDriverList,filter);
        assertThat(ActualList.size()).isEqualTo(2);
    }
    @Test
    void testListFilterTripDriverWithDateFromNotFound(){
        AddData();
        filterTripPassenger filter = new filterTripPassenger();
        Date DateFrom = new Date(2022, 12, 30);
        filter.setDateFrom(DateFrom);
        List<TripDriver> ActualList = tripDriverService.filterTripDriver(tripDriverList,filter);
        assertThat(ActualList.size()).isEqualTo(0);
    }
    @Test
    void testListFilterTripDriverWithDateToFound(){
        AddData();
        filterTripPassenger filter = new filterTripPassenger();
        Date DateTo = new Date(2022, 12, 30);
        filter.setDateTo(DateTo);
        List<TripDriver> ActualList = tripDriverService.filterTripDriver(tripDriverList,filter);
        assertThat(ActualList.size()).isEqualTo(3);
    }
    @Test
    void testListFilterTripDriverWithDateToBoundary(){
        AddData();
        filterTripPassenger filter = new filterTripPassenger();
        Date DateTo = new Date(2022, 12, 10);
        filter.setDateTo(DateTo);
        List<TripDriver> ActualList = tripDriverService.filterTripDriver(tripDriverList,filter);
        assertThat(ActualList.size()).isEqualTo(2);
    }
    @Test
    void testListFilterTripDriverWithDateToNotFound(){
        AddData();
        filterTripPassenger filter = new filterTripPassenger();
        Date DateTo = new Date(2022, 12, 1);
        filter.setDateTo(DateTo);
        List<TripDriver> ActualList = tripDriverService.filterTripDriver(tripDriverList,filter);
        assertThat(ActualList.size()).isEqualTo(0);
    }
}
