package com.rst.service;


import com.rst.domain.Role;
import com.rst.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole (Role role);
    void addRoleToUser (String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
