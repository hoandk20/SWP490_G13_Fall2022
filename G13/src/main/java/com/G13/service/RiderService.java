package com.G13.service;

import com.G13.domain.Rider;
import com.G13.repo.RiderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class RiderService {
    private final RiderRepository riderRepository;

    public Rider getRiderByEmail(String email) {
     return   riderRepository.findByEmail(email);
    }
}
