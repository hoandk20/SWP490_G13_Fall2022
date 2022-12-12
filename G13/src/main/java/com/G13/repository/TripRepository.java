package com.G13.repository;

import com.G13.domain.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;

@Repository
public interface TripRepository extends JpaRepository<Trip, String> {
    Trip findByDriverIDAndTimeStart(String DriverID, Instant TimeStart);
    Trip findTripByIdOrderByCreatedDateDesc(String id);


    List<Trip> findAllByRiderIDOrderByCreatedDateDesc(String DriverID);

    List<Trip> findAllByStatus(String Status);
    List<Trip> findAllByRiderID(String DriverID);
    List<Trip> findAllByTripCodeOrderByCreatedDateDesc(String TripCode);
    List<Trip> findAllByTripCodeAndRiderID(String TripCode,String userId);
}