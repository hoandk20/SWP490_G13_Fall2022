package com.G13.service;

import com.G13.domain.UserRole;
import com.G13.repo.UserRoleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserRoleService {
    private final UserRoleRepository userRoleRepository;
    public boolean SaveUserRole(int UserId, int RoleId){
        try{
            UserRole userRole = new UserRole();
            userRole.setUserId(new Long(UserId));
            userRole.setRoleId(new Long(RoleId));
            userRoleRepository.save(userRole);
            return true;
        }catch (Exception e){
            return false;
        }


    }
}
