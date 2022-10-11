package com.rst.service;


import com.rst.domain.Role;
import com.rst.domain.User;
import com.rst.domain.UserRoleId;
import com.rst.repo.RoleRepo;
import com.rst.repo.UserRepo;
import com.rst.repo.UserRoleRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;


@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImpl implements UserService, UserDetailsService {

    private final UserRepo userRepo;
    private final RoleRepo roleRepo;
    private final UserRoleRepo userRoleRepo;
    private final PasswordEncoder passwordEncoder;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByEmail(username);
        if(user==null){
            log.error("user not found");
            throw new UsernameNotFoundException("user not found on database");

        }else{
            log.info("user found in the database {}",username);
        }

        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();

        List<UserRoleId> list = userRoleRepo.findAllByUserId(user.getId());
        for (UserRoleId r: list) {
            Role role =  roleRepo.findAllById(r.getRoleId());
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),authorities);
    }
    @Override
    public User saveUser(User user) {
        log.info("save new user "+user.getEmail());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("save new role "+role.getName());
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("save role {} for user {}",roleName,username);
        User user = userRepo.findByEmail(username);
        Role role = roleRepo.findByName(roleName);
        UserRoleId userRole = new UserRoleId();
        userRole.setUserId(user.getId());
        userRole.setRoleId(role.getId());
        userRoleRepo.save(userRole);
    }

    @Override
    public User getUser(String username) {
        log.info("get user");
        return userRepo.findByEmail(username);
    }

    @Override
    public List<User> getUsers() {
        log.info("get all users");
        return userRepo.findAll();
    }


}
