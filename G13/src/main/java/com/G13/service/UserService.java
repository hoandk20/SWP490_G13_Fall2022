package com.G13.service;


import com.G13.domain.Role;
import com.G13.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole (Role role);
    void addRoleToUser (String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
