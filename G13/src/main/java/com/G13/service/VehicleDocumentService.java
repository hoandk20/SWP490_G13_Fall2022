package com.G13.service;

import com.G13.domain.Document;
import com.G13.domain.Vehicle;
import com.G13.domain.Vehicledocument;
import com.G13.repo.VehicledocumentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class VehicleDocumentService {
    private final VehicledocumentRepository vehicledocumentRepository;

    public Vehicledocument getVehicleDocumentByDocument(Document document){
        return vehicledocumentRepository.findVehicledocumentByDocumentid(document);
    }
    public List<Vehicledocument>getVehicleDocumentByVehicle(Vehicle vehicle){
        return vehicledocumentRepository.findVehicledocumentsByVehicleidOrderByIdDesc(vehicle);
    }
    public boolean SaveVehicleDocument(Vehicledocument vehicledocument){
        if(vehicledocument.getVehicleid()==null||vehicledocument.getDocumentid()==null){
            return false;
        }else{
            vehicledocumentRepository.save(vehicledocument);
            return true;
        }
    }
}
