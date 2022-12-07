package com.G13;

import com.G13.model.TripPassenger;
import com.G13.model.filterTripPassenger;
import com.G13.service.PassengerTripService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.util.List;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TestFilterPassengerTrip {
    @InjectMocks
    PassengerTripService passengerTripService;

    List<TripPassenger> tripPassengerList ;
    void addData(){
        tripPassengerList = new ArrayList<>();
        TripPassenger tripPassenger1 = new TripPassenger();
        tripPassenger1.setId("1");
        tripPassenger1.setTripID("1");
        tripPassenger1.setDriverEmail("driver1@gmail.com");
        tripPassenger1.setTripStatus("OPEN");
        Date DateStart = new Date(2022, 12, 5);
        tripPassenger1.setTimeStart(DateStart);
        tripPassengerList.add(tripPassenger1);

        TripPassenger tripPassenger2 = new TripPassenger();
        tripPassenger2.setId("2");
        tripPassenger2.setTripID("2");
        tripPassenger2.setDriverEmail("driver2@gmail.com");
        tripPassenger2.setTripStatus("CLOS");
        Date DateStart2 = new Date(2022, 12, 10);
        tripPassenger2.setTimeStart(DateStart2);
        tripPassengerList.add(tripPassenger2);

        TripPassenger tripPassenger3 = new TripPassenger();
        tripPassenger3.setId("3");
        tripPassenger3.setTripStatus("REJE");
        tripPassenger3.setTripID("3");
        tripPassenger3.setDriverEmail("driver3@gmail.com");
        Date DateStart3 = new Date(2022, 12, 6);
        tripPassenger3.setTimeStart(DateStart3);
        tripPassengerList.add(tripPassenger3);


    }

    //Test filter trip passenger
    @Test
    void testFilterPassengerTripByStatusFound(){
        addData();
        filterTripPassenger  filterTripPassenger = new filterTripPassenger();
        filterTripPassenger.status = "OPEN";
        int ExpectSize=1;
        List<TripPassenger> ActualListPassenger =
                passengerTripService.filterTripPassenger(tripPassengerList,filterTripPassenger);
        assertThat(ActualListPassenger.size()).isEqualTo(ExpectSize);
    }
    @Test
    void testFilterPassengerTripByStatusNotFound(){
        addData();
        filterTripPassenger  filterTripPassenger = new filterTripPassenger();
        filterTripPassenger.status = "CANC";
        int ExpectSize=0;
        List<TripPassenger> ActualListPassenger =
                passengerTripService.filterTripPassenger(tripPassengerList,filterTripPassenger);
        assertThat(ActualListPassenger.size()).isEqualTo(ExpectSize);
    }

    @Test
    void testFilterPassengerTripByDriverEmailFound(){
        addData();
        filterTripPassenger  filterTripPassenger = new filterTripPassenger();
        filterTripPassenger.driverEmail = "driver2@gmail.com";
        int ExpectSize=1;
        List<TripPassenger> ActualListPassenger =
                passengerTripService.filterTripPassenger(tripPassengerList,filterTripPassenger);
        assertThat(ActualListPassenger.size()).isEqualTo(ExpectSize);
    }
    @Test
    void testFilterPassengerTripByDriverEmailNotFound(){
        addData();
        filterTripPassenger  filterTripPassenger = new filterTripPassenger();
        filterTripPassenger.driverEmail = "driver999@gmail.com";
        int ExpectSize=0;
        List<TripPassenger> ActualListPassenger =
                passengerTripService.filterTripPassenger(tripPassengerList,filterTripPassenger);
        assertThat(ActualListPassenger.size()).isEqualTo(ExpectSize);
    }
    @Test
    void testFilterPassengerTripByInvalidDriverEmail(){
        addData();
        filterTripPassenger  filterTripPassenger = new filterTripPassenger();
        filterTripPassenger.driverEmail = "driver999";
        int ExpectSize=0;
        List<TripPassenger> ActualListPassenger =
                passengerTripService.filterTripPassenger(tripPassengerList,filterTripPassenger);
        assertThat(ActualListPassenger.size()).isEqualTo(ExpectSize);
    }
    @Test
    void testFilterPassengerTripByBlankDriverEmail(){
        addData();
        filterTripPassenger  filterTripPassenger = new filterTripPassenger();
        filterTripPassenger.driverEmail = "";
        int ExpectSize=3;
        List<TripPassenger> ActualListPassenger =
                passengerTripService.filterTripPassenger(tripPassengerList,filterTripPassenger);
        assertThat(ActualListPassenger.size()).isEqualTo(ExpectSize);
    }
    @Test
    void testFilterPassengerTripByNoFilter(){
        addData();
        filterTripPassenger  filterTripPassenger = new filterTripPassenger();
        int ExpectSize=3;
        List<TripPassenger> ActualListPassenger =
                passengerTripService.filterTripPassenger(tripPassengerList,filterTripPassenger);
        assertThat(ActualListPassenger.size()).isEqualTo(ExpectSize);
    }
    @Test
    void testFilterPassengerTripByDateFromFound(){
        addData();
        filterTripPassenger  filterTripPassenger = new filterTripPassenger();
        int ExpectSize=3;
        Date DateFrom = new Date(2022, 12, 4);
        filterTripPassenger.setDateFrom(DateFrom);
        List<TripPassenger> ActualListPassenger =
                passengerTripService.filterTripPassenger(tripPassengerList,filterTripPassenger);
        assertThat(ActualListPassenger.size()).isEqualTo(ExpectSize);
    }
    @Test
    void testFilterPassengerTripByDateFromBoundary(){
        addData();
        filterTripPassenger  filterTripPassenger = new filterTripPassenger();
        int ExpectSize=2;
        Date DateFrom = new Date(2022, 12, 6);
        filterTripPassenger.setDateFrom(DateFrom);
        List<TripPassenger> ActualListPassenger =
                passengerTripService.filterTripPassenger(tripPassengerList,filterTripPassenger);
        assertThat(ActualListPassenger.size()).isEqualTo(ExpectSize);
    }
    @Test
    void testFilterPassengerTripByDateFromNotFound(){
        addData();
        filterTripPassenger  filterTripPassenger = new filterTripPassenger();
        int ExpectSize=0;
        Date DateFrom = new Date(2022, 12, 30);
        filterTripPassenger.setDateFrom(DateFrom);
        List<TripPassenger> ActualListPassenger =
                passengerTripService.filterTripPassenger(tripPassengerList,filterTripPassenger);
        assertThat(ActualListPassenger.size()).isEqualTo(ExpectSize);
    }
    @Test
    void testFilterPassengerTripByDateToNotFound(){
        addData();
        filterTripPassenger  filterTripPassenger = new filterTripPassenger();
        int ExpectSize=0;
        Date DateTo = new Date(2022, 12, 1);
        filterTripPassenger.setDateTo(DateTo);
        List<TripPassenger> ActualListPassenger =
                passengerTripService.filterTripPassenger(tripPassengerList,filterTripPassenger);
        assertThat(ActualListPassenger.size()).isEqualTo(ExpectSize);
    }
    @Test
    void testFilterPassengerTripByDateToFound(){
        addData();
        filterTripPassenger  filterTripPassenger = new filterTripPassenger();
        int ExpectSize=3;
        Date DateTo = new Date(2022, 12, 30);
        filterTripPassenger.setDateTo(DateTo);
        List<TripPassenger> ActualListPassenger =
                passengerTripService.filterTripPassenger(tripPassengerList,filterTripPassenger);
        assertThat(ActualListPassenger.size()).isEqualTo(ExpectSize);
    }
    @Test
    void testFilterPassengerTripByDateToBoundary(){
        addData();
        filterTripPassenger  filterTripPassenger = new filterTripPassenger();
        int ExpectSize=2;
        Date DateTo = new Date(2022, 12, 10);
        filterTripPassenger.setDateTo(DateTo);
        List<TripPassenger> ActualListPassenger =
                passengerTripService.filterTripPassenger(tripPassengerList,filterTripPassenger);
        assertThat(ActualListPassenger.size()).isEqualTo(ExpectSize);
    }
    @Test
    void testFilterPassengerTripByDateToAnDateFrom(){
        addData();
        filterTripPassenger  filterTripPassenger = new filterTripPassenger();
        int ExpectSize=3;
        Date DateFrom = new Date(2022, 12, 1);
        filterTripPassenger.setDateFrom(DateFrom);
        Date DateTo = new Date(2022, 12, 30);
        filterTripPassenger.setDateTo(DateTo);

        List<TripPassenger> ActualListPassenger =
                passengerTripService.filterTripPassenger(tripPassengerList,filterTripPassenger);
        assertThat(ActualListPassenger.size()).isEqualTo(ExpectSize);
    }
    @Test
    void testFilterPassengerTripAllFilterNotFound(){
        addData();
        filterTripPassenger  filterTripPassenger = new filterTripPassenger();
        int ExpectSize=0;
        Date DateFrom = new Date(2022, 12, 1);
        filterTripPassenger.setDateFrom(DateFrom);
        Date DateTo = new Date(2022, 12, 30);
        filterTripPassenger.driverEmail = "driver2@gmail.com";
        filterTripPassenger.setDateTo(DateTo);
        filterTripPassenger.status = "OPEN";

        List<TripPassenger> ActualListPassenger =
                passengerTripService.filterTripPassenger(tripPassengerList,filterTripPassenger);
        assertThat(ActualListPassenger.size()).isEqualTo(ExpectSize);
    }
    @Test
    void testFilterPassengerTripAllFilterFound(){
        addData();
        filterTripPassenger  filterTripPassenger = new filterTripPassenger();
        int ExpectSize=1;
        Date DateFrom = new Date(2022, 12, 1);
        filterTripPassenger.setDateFrom(DateFrom);
        Date DateTo = new Date(2022, 12, 30);
        filterTripPassenger.driverEmail = "driver1@gmail.com";
        filterTripPassenger.setDateTo(DateTo);
        filterTripPassenger.status = "OPEN";


        List<TripPassenger> ActualListPassenger =
                passengerTripService.filterTripPassenger(tripPassengerList,filterTripPassenger);
        assertThat(ActualListPassenger.size()).isEqualTo(ExpectSize);
    }
}
