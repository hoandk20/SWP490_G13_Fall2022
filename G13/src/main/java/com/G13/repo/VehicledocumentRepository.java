package com.G13.repo;


import com.G13.domain.Document;
import com.G13.domain.Vehicle;
import com.G13.domain.Vehicledocument;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface VehicledocumentRepository extends JpaRepository<Vehicledocument, Integer> {
    List<Vehicledocument> findVehicledocumentsByVehicleidOrderByIdDesc(Vehicle VehicleId);

    Vehicledocument findVehicledocumentByDocumentid(Document document);

}