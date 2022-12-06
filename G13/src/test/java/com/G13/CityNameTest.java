package com.G13;

import com.G13.domain.Cityname;
import com.G13.domain.CitynameId;
import com.G13.repo.CitynameRepository;

import com.G13.service.CityService;
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
public class CityNameTest {
    @Mock
    CitynameRepository citynameRepository;
    @InjectMocks
    CityService cityService;

    @BeforeEach
    void addData(){
        List<Cityname> citynames = new ArrayList<>();
        for (int i = 0; i < 64; i++) {
            Cityname c = new Cityname();
            CitynameId citynameId =new CitynameId();
            citynameId.setCityID(i);
            c.setId(citynameId);
            c.setCityName("city"+i);
            citynames.add(c);
        }
        when(citynameRepository.findAll()).thenReturn(citynames);
    }
    @Test
    void TestGetAllCity() {
        List<Cityname> list = cityService.getListCity();
        assertThat(list.size()).isEqualTo(64);
    }
}
