package com.G13;

import com.G13.domain.Trip;
import com.G13.repository.TripRepository;
import com.G13.service.TripService;
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
public class TripTest {
    @Mock
    TripRepository tripRepository;
    @InjectMocks
    TripService tripService;

    @BeforeEach
    void addData(){
        List<Trip> tripList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Trip trip  = new Trip();
            trip.setId(i+"");
            trip.setRiderID("rider@gmail.com");
            trip.setTripCode("123");
            tripList.add(trip);
        }
        when(tripRepository.findAllByRiderIDOrderByCreatedDateDesc("rider@gmail.com")).thenReturn(tripList);
        when(tripRepository.findAllByTripCodeOrderByCreatedDateDesc("123")).thenReturn(tripList);

        Trip trip1  = new Trip();
        trip1.setId("1");
        trip1.setRiderID("rider1@gmail.com");
        when(tripRepository.findTripByIdOrderByCreatedDateDesc("1")).thenReturn(trip1);

    }

    //test get list trip by rider email
    @Test
    void testGetTripByRiderEmailFound(){
        String riderEmail = "rider@gmail.com";
        int ExpectTrip = 5;
        List<Trip> tripList = tripService.getListTripByRiderEmail(riderEmail);
        assertThat(tripList.size()).isEqualTo(ExpectTrip);
    }
    @Test
    void testGetTripByRiderEmailNotFound(){
        String riderEmail = "abc@gmail.com";
        int ExpectTrip = 0;
        List<Trip> tripList = tripService.getListTripByRiderEmail(riderEmail);
        assertThat(tripList.size()).isEqualTo(ExpectTrip);
    }
    @Test
    void testGetTripByRiderEmailInvalidEmail(){
        String riderEmail = "abc";
        int ExpectTrip = 0;
        List<Trip> tripList = tripService.getListTripByRiderEmail(riderEmail);
        assertThat(tripList.size()).isEqualTo(ExpectTrip);
    }
    //test get trip by tripid
    @Test
    void testGetTripByTripId(){
        String ExpectId = "1";
        Trip ActualTrip = tripService.getTripById(ExpectId);
        assertThat(ActualTrip.getId()).isEqualTo(ExpectId);
    }



    //test get all trip by tripcode

    @Test
    void testGetAllTripTripCodeFound(){
        String tripCode = "123";
        int ExpectTrip = 5;
        List<Trip> tripList = tripService.getAllByTripCode(tripCode);
        assertThat(tripList.size()).isEqualTo(ExpectTrip);
    }
    @Test
    void testGetAllTripTripCodeNotFound(){
        String tripCode = "111";
        int ExpectTrip = 0;
        List<Trip> tripList = tripService.getAllByTripCode(tripCode);
        assertThat(tripList.size()).isEqualTo(ExpectTrip);
    }


    //test save trip
    @Test
    void testSaveTripSuccess(){
        Trip trip = new Trip();
        trip.setRiderID("rider1@gmail.com");
        trip.setDriverID("driver1@gmail.com");
        trip.setFromAddress("Hanoi");
        trip.setToAddress("Camau");
        when(tripRepository.saveAndFlush(trip)).thenReturn(trip);

        Trip ActualTripSave = tripService.SaveTrip(trip);
        assertThat(ActualTripSave.getRiderID()).isEqualTo(trip.getRiderID());
    }
    @Test
    void testSaveTripNoRiderID(){
        Trip trip = new Trip();
        trip.setDriverID("driver1@gmail.com");
        trip.setFromAddress("Hanoi");
        trip.setToAddress("Camau");
        Trip ActualTripSave = tripService.SaveTrip(trip);
        assertThat(ActualTripSave).isEqualTo(null);
    }
    @Test
    void testSaveTripNoDriverID(){
        Trip trip = new Trip();
        trip.setRiderID("rider1@gmail.com");
        trip.setFromAddress("Hanoi");
        trip.setToAddress("Camau");
        Trip ActualTripSave = tripService.SaveTrip(trip);
        assertThat(ActualTripSave).isEqualTo(null);
    }
    @Test
    void testSaveTripNoFromAddess(){
        Trip trip = new Trip();
        trip.setRiderID("rider1@gmail.com");
        trip.setDriverID("driver1@gmail.com");
        trip.setToAddress("Camau");
        Trip ActualTripSave = tripService.SaveTrip(trip);
        assertThat(ActualTripSave).isEqualTo(null);
    }
    @Test
    void testSaveTripNoToAddress(){
        Trip trip = new Trip();
        trip.setRiderID("rider1@gmail.com");
        trip.setDriverID("driver1@gmail.com");
        trip.setFromAddress("Hanoi");
        Trip ActualTripSave = tripService.SaveTrip(trip);
        assertThat(ActualTripSave).isEqualTo(null);
    }


}
