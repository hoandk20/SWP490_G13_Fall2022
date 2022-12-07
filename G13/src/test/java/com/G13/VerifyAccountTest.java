package com.G13;

import com.G13.domain.Vehicle;
import com.G13.domain.Verifyaccount;
import com.G13.repo.VehicleRepository;
import com.G13.repo.VerifyaccountRepository;
import com.G13.service.VehicleService;
import com.G13.service.VerifyAccountService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class VerifyAccountTest {
    @Mock
    VerifyaccountRepository verifyaccountRepository;
    @InjectMocks
    VerifyAccountService verifyAccountService;

    @BeforeEach
    void addData(){
        Verifyaccount verifyaccount = new Verifyaccount();
        verifyaccount.setId(1);
        verifyaccount.setUserid(1);
        when(verifyaccountRepository.findVerifyaccountByUseridOrderByExpiredateDesc(1)).thenReturn(verifyaccount);
    }

    //get verify account by user id
    @Test
    void testGetVerifyAccountByUserIdFound(){
       int  ExpectId =1;
        Verifyaccount ActualVerifyAccount = verifyAccountService.getVerifyAccountByUserId(ExpectId);
        assertThat(ActualVerifyAccount.getId()).isEqualTo(ExpectId);
    }
    @Test
    void testGetVerifyAccountByUserIdNotFound(){
        int  ExpectId =2;
        Verifyaccount ActualVerifyAccount = verifyAccountService.getVerifyAccountByUserId(ExpectId);
        assertThat(ActualVerifyAccount).isEqualTo(null);
    }
    //test save verify account
    @Test
    void testSaveVerifyAccountSuccess(){
        Verifyaccount verifyaccount = new Verifyaccount();
        verifyaccount.setId(1);
        verifyaccount.setUserid(1);
        boolean ActualStatus = verifyAccountService.SaveVerifyAccount(verifyaccount);
        assertThat(ActualStatus).isEqualTo(true);
    }
    @Test
    void testSaveVerifyAccountNoUserID(){
        Verifyaccount verifyaccount = new Verifyaccount();
        boolean ActualStatus = verifyAccountService.SaveVerifyAccount(verifyaccount);
        assertThat(ActualStatus).isEqualTo(false);
    }
}
