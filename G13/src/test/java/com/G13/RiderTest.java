package com.G13;

import com.G13.domain.Rider;
import com.G13.domain.User;
import com.G13.repo.RiderRepository;
import com.G13.repo.UserRepository;
import com.G13.service.RiderService;
import com.G13.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class RiderTest {
    @Mock
    RiderRepository riderRepository;
    @InjectMocks
    RiderService riderService;

    @BeforeEach
    void AddDataRepo(){
        Rider rider = new Rider();
        rider.setId("1");
        rider.setEmail("user1@gmail.com");
        when(riderRepository.findByEmail("user1@gmail.com")).thenReturn(rider);
    }
    @Test
    void testGetRiderByEmailFound(){
        Rider ExpectRider = new Rider();
        ExpectRider.setId("1");
        ExpectRider.setEmail("user1@gmail.com");

        Rider ActualRider = riderService.getRiderByEmail("user1@gmail.com");
        assertThat(ActualRider.getEmail()).isEqualTo(ExpectRider.getEmail());
    }
}
