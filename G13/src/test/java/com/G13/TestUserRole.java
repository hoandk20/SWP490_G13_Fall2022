package com.G13;

import com.G13.domain.UserRole;
import com.G13.repo.UserRoleRepository;
import com.G13.service.UserRoleService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class TestUserRole {
    @Mock
    UserRoleRepository userRoleRepository;
    @InjectMocks
    UserRoleService userRoleService;

    @BeforeEach
    void AddDataRepo(){
        UserRole userRole = new UserRole();
        userRole.setUserId(new Long(1));
        userRole.setRoleId(new Long(1));
        when(userRoleRepository.save(userRole)).thenReturn(userRole);
    }

    //Test save UserRole
    @Test
    void testSaveUserRole(){
        boolean ExpectStatus = userRoleService.SaveUserRole(1,1);
        assertThat(ExpectStatus).isEqualTo(true);
    }
}
