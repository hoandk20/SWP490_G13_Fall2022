package com.G13.service;

import com.G13.domain.Cityname;
import com.G13.repo.CitynameRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class CityService {
    private final CitynameRepository citynameRepository;
    public List<Cityname> getListCity(){
        return citynameRepository.findAll();
    }
}
