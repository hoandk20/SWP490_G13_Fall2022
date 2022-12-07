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
    //test get rider by email
    @Test
    void testGetRiderByEmailFound(){
        String emailExpect = "user1@gmail.com";

        Rider ActualRider = riderService.getRiderByEmail(emailExpect);
        assertThat(ActualRider.getEmail()).isEqualTo(emailExpect);
    }
    @Test
    void testGetRiderByEmailNotFound(){
        String emailExpect = "user2@gmail.com";

        Rider ActualRider = riderService.getRiderByEmail(emailExpect);
        assertThat(ActualRider).isEqualTo(null);
    }

    @Test
    void testGetRiderByInvalidEmail(){
        String emailExpect = "user2";
        Rider ActualRider = riderService.getRiderByEmail(emailExpect);
        assertThat(ActualRider).isEqualTo(null);
    }

    //test save rider
    @Test
    void testSaveRiderSucessfull(){
        Rider rider = new Rider();
        rider.setEmail("rider@gmail.com");
        rider.setFirstName("hoan");
        rider.setLastName("kieu");
        rider.setMobileNo("012345678");
        boolean ActualStatus= riderService.SaveRider(rider);
        assertThat(ActualStatus).isEqualTo(true);
    }
    @Test
    void testSaveRiderNoEmail(){
        Rider rider = new Rider();
        rider.setFirstName("hoan");
        rider.setLastName("kieu");
        rider.setMobileNo("012345678");
        boolean ActualStatus= riderService.SaveRider(rider);
        assertThat(ActualStatus).isEqualTo(false);
    }
    @Test
    void testSaveRiderNoFirstName(){
        Rider rider = new Rider();
        rider.setEmail("rider@gmail.com");
        rider.setLastName("kieu");
        rider.setMobileNo("012345678");
        boolean ActualStatus= riderService.SaveRider(rider);
        assertThat(ActualStatus).isEqualTo(false);
    }
    @Test
    void testSaveRiderNoLastName(){
        Rider rider = new Rider();
        rider.setEmail("rider@gmail.com");
        rider.setMobileNo("012345678");
        boolean ActualStatus= riderService.SaveRider(rider);
        assertThat(ActualStatus).isEqualTo(false);
    }
    @Test
    void testSaveRiderNoPhone(){
        Rider rider = new Rider();
        rider.setEmail("rider@gmail.com");
        rider.setLastName("kieu");
        boolean ActualStatus= riderService.SaveRider(rider);
        assertThat(ActualStatus).isEqualTo(false);
    }

}
