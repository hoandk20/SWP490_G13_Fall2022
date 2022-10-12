package com.G13.api;


import com.G13.domain.Role;
import com.G13.domain.User;
import com.G13.master.MasterRole;
import com.G13.service.UserService;
import jdk.jshell.Snippet;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserResouce {

    private final UserService userService;


    @GetMapping("/checkEmailExist")
    public ResponseEntity<?> checkEmailExisted(String email){
        boolean IsExisted = userService.IsEmailExisted(email);
        Map<String,String> res = new HashMap<>();
        res.put("IsExisted",IsExisted?"true":"false");
        return ResponseEntity.ok().body(res);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok().body(userService.getUsers());
    }

    @PostMapping("/user/save")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user/save").toUriString());
        return ResponseEntity.created(uri).body(userService.saveUser(user));
    }

    @PostMapping("/role/AddToUser")
    public ResponseEntity<?> saveRole(@RequestBody RoleToUserForm form) {
        userService.addRoleToUser(form.getUsername(), form.getRoleName());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/autoGenUser")
    public void autoGenerateUser() {
        MasterRole m = new MasterRole();
        userService.saveRole(new Role(m.ROLE_DRIVER));
        userService.saveRole(new Role(m.ROLE_PASSENGER));
        userService.saveRole(new Role(m.ROLE_COMPANY));
        userService.saveRole(new Role(m.ROLE_ADMIN));

        userService.saveUser(new User("hoan", "hoan"));
        userService.saveUser(new User("hoan1", "hoan1"));
        userService.saveUser(new User("hoan2", "hoan2"));
        userService.saveUser(new User("hoan3", "hoan3"));

        userService.addRoleToUser("hoan", m.ROLE_DRIVER);
        userService.addRoleToUser("hoan1", m.ROLE_PASSENGER);
        userService.addRoleToUser("hoan2", m.ROLE_COMPANY);
        userService.addRoleToUser("hoan3", m.ROLE_ADMIN);
    }


}

@Data
class RoleToUserForm {
    private String username;
    private String roleName;
}
