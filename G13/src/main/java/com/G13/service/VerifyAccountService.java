package com.G13.service;

import com.G13.domain.Verifyaccount;
import com.G13.repository.VerifyaccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class VerifyAccountService {
    private final VerifyaccountRepository verifyaccountRepository;

    public Verifyaccount getVerifyAccountByUserId(int UseId){
        return verifyaccountRepository.findVerifyaccountByUseridOrderByExpiredateDesc(UseId);
    }
    public boolean SaveVerifyAccount(Verifyaccount verifyaccount){
        if(verifyaccount.getUserid()==null){
            return false;
        }
        try{
            verifyaccountRepository.save(verifyaccount);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
