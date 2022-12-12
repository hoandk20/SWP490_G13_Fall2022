package com.G13;
import com.G13.domain.Document;
import com.G13.domain.Vehicle;
import com.G13.domain.Vehicledocument;
import com.G13.repository.VehicledocumentRepository;
import com.G13.service.VehicleDocumentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class TestVehicleDocumentService {
    @Mock
    VehicledocumentRepository vehicledocumentRepository;
    @InjectMocks
    VehicleDocumentService  vehicleDocumentService;

    @BeforeEach
    void addData(){
        Vehicledocument vehicledocument = new Vehicledocument();
        Document document = new Document();
        document.setId(1);
        Vehicle vehicle = new Vehicle();
        vehicle.setId(1);
        vehicledocument.setDocumentid(document);
        vehicledocument.setVehicleid(vehicle);
        when(vehicledocumentRepository.findVehicledocumentByDocumentid(document)).thenReturn(vehicledocument);

         }


    //test get vehicleDocument by document
    @Test
    void testGetVehicleDocumentByDocumentFound(){
        Document document = new Document();
        document.setId(1);
        Vehicledocument vehicledocument = new Vehicledocument();
        vehicledocument.setDocumentid(document);

        when(vehicledocumentRepository.findVehicledocumentByDocumentid(document)).thenReturn(vehicledocument);


        Vehicledocument ActuaVvehicleDocument = vehicleDocumentService.getVehicleDocumentByDocument(document);
        assertThat(ActuaVvehicleDocument.getDocumentid().getId()).isEqualTo(document.getId());


    }
    @Test
    void testGetVehicleDocumentByDocumentNotFound(){

        Document document = new Document();
        document.setId(2);
        when(vehicledocumentRepository.findVehicledocumentByDocumentid(document)).thenReturn(null);
        Vehicledocument ActuaVvehicleDocument = vehicleDocumentService.getVehicleDocumentByDocument(document);
        assertThat(ActuaVvehicleDocument).isEqualTo(null);
    }
    @Test
    void testGetVehicleDocumentByDocumentNoDocumentId(){
        Document document = new Document();
        Vehicledocument ActuaVvehicleDocument = vehicleDocumentService.getVehicleDocumentByDocument(document);
        assertThat(ActuaVvehicleDocument).isEqualTo(null);
    }


    //test get List VehicleDocument by vehicle
    @Test
    void testgetListVehicleDocumentByVehicleFound(){
        Vehicle vehicle = new Vehicle();
        vehicle.setId(1);
        List<Vehicledocument> vehicledocumentList = new ArrayList<>();
        for (int i = 0; i <3; i++) {
            Document document1 = new Document();
            document1.setId(i);
            Vehicle vehicle1 = new Vehicle();
            vehicle1.setId(1);
            Vehicledocument vehicledocument1 = new Vehicledocument();
            vehicledocument1.setDocumentid(document1);
            vehicledocumentList.add(vehicledocument1);
        }
        when(vehicledocumentRepository.findVehicledocumentsByVehicleidOrderByIdDesc(vehicle)).thenReturn(vehicledocumentList);



        int ExpectSize = 3;
        List<Vehicledocument> ActualVehicleDocumentList = vehicleDocumentService.getVehicleDocumentByVehicle(vehicle);
        assertThat(ActualVehicleDocumentList.size()).isEqualTo(ExpectSize);
    }
    @Test
    void testgetListVehicleDocumentByVehicleNotFound(){
        int ExpectSize = 0;
        Vehicle vehicle = new Vehicle();
        vehicle.setId(2);
        List<Vehicledocument> ActualVehicleDocumentList = vehicleDocumentService.getVehicleDocumentByVehicle(vehicle);
        assertThat(ActualVehicleDocumentList.size()).isEqualTo(ExpectSize);
    }
    @Test
    void testgetListVehicleDocumentByVehicleWithNoId(){
        int ExpectSize = 0;
        Vehicle vehicle = new Vehicle();
        List<Vehicledocument> ActualVehicleDocumentList = vehicleDocumentService.getVehicleDocumentByVehicle(vehicle);
        assertThat(ActualVehicleDocumentList.size()).isEqualTo(ExpectSize);
    }

    @Test
    void testSaveVehicleDoccumentSussess(){
        Document document1 = new Document();
        document1.setId(1);
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setId(1);
        Vehicledocument vehicledocument1 = new Vehicledocument();
        vehicledocument1.setDocumentid(document1);
        vehicledocument1.setVehicleid(vehicle1);
        boolean status = vehicleDocumentService.SaveVehicleDocument(vehicledocument1);
        assertThat(status).isEqualTo(true);
    }
    @Test
    void testSaveVehicleDoccumentHaveNoDocId(){
        Document document1 = new Document();
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setId(1);
        Vehicledocument vehicledocument1 = new Vehicledocument();
        vehicledocument1.setDocumentid(document1);
        boolean status = vehicleDocumentService.SaveVehicleDocument(vehicledocument1);
        assertThat(status).isEqualTo(false);
    }
    @Test
    void testSaveVehicleDoccumentHaveNoVehicleId(){
        Document document1 = new Document();
        document1.setId(1);
        Vehicle vehicle1 = new Vehicle();
        Vehicledocument vehicledocument1 = new Vehicledocument();
        vehicledocument1.setDocumentid(document1);
        boolean status = vehicleDocumentService.SaveVehicleDocument(vehicledocument1);
        assertThat(status).isEqualTo(false);
    }

}
