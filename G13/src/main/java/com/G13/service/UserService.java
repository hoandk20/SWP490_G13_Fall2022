package com.G13.service;


import com.G13.domain.Role;
import com.G13.domain.User;
import com.G13.domain.UserRole;
import com.G13.model.UserChangePassword;
import com.G13.repo.RoleRepository;
import com.G13.repo.UserRepository;
import com.G13.repo.UserRoleRepository;
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


@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserService implements UserDetailsService {

    private final UserRepository userRepo;
    private final RoleRepository roleRepo;
    private final UserRoleRepository userRoleRepo;
    private final PasswordEncoder passwordEncoder;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByEmail(username);
        if (user == null) {
            log.error("user not found");
            throw new UsernameNotFoundException("user not found on database");

        } else {
            log.info("user found in the database {}", username);
        }

        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();

        List<UserRole> list = userRoleRepo.findAllByUserId(new Long(user.getId()));
        for (UserRole r : list) {
            int id = Integer.parseInt(r.getRoleId() + "");
            Role role = roleRepo.findById(id);
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), authorities);
    }

    public User saveUser(User user) {
        log.info("save new user " + user.getEmail());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepo.save(user);
    }


    public Role saveRole(Role role) {
        log.info("save new role " + role.getName());
        return roleRepo.save(role);
    }


    public void addRoleToUser(String username, String roleName) {
        log.info("save role {} for user {}", roleName, username);
        User user = userRepo.findByEmail(username);
        Role role = roleRepo.findByName(roleName);
        UserRole userRole = new UserRole();
        userRole.setUserId(new Long(user.getId()));
        userRole.setRoleId(new Long(role.getId()));
        userRoleRepo.save(userRole);
    }


    public User getUser(String username) {
        log.info("get user");
        return userRepo.findByEmail(username);
    }

    public User getUserByEmail(String email) {
        log.info("get user");
        return userRepo.findByEmail(email);
    }
    public List<User> getUsers() {
        log.info("get all users");
        return userRepo.findAll();
    }


    public boolean combinePassword(String password, String passwordEncode) {
        return passwordEncoder.matches(password, passwordEncode);
    }


    public Boolean IsEmailExisted(String email) {
        User user = userRepo.findByEmail(email);
        return user != null;
    }


    public Role GetRoleByUser(String email) {
        User user = userRepo.findByEmail(email);
        List<UserRole> list = userRoleRepo.findAllByUserId(new Long(user.getId()));
        Role role = roleRepo.findById(Integer.parseInt(list.get(0).getRoleId() + ""));
        return role;
    }

    public boolean changePassword(UserChangePassword user) {
        if (user.getNewPassword().length() > 50) {
            System.out.println("Passowrd can not more than 50 characters");
            return false;
        }
        if (user.getNewPassword().trim().length() == 0) {
            System.out.println("Passowrd can not more than 50 characters");
            return false;
        }
        User userExisted = userRepo.findByEmail(user.getEmail());
        if (!combinePassword(user.getOldPassword(), userExisted.getPassword())) {
            System.out.println("old password is wrong");
            return false;
        }
        userExisted.setPassword(user.getNewPassword());
        saveUser(userExisted);
        return true;
    }


}
