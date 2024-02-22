package com.melissa.parkingcontrol.repository;

import com.melissa.parkingcontrol.model.ParkingSpotModel;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
    boolean existsByLicensePlateCar(String licensePlateCar);
    boolean existsByParkingSpotNumber(String parkingSpotNumber);
    
    boolean existsByApartmentAndBlock(String apartment, String block);
}
