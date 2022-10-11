package com.rst.api;


import com.rst.domain.User;
import com.rst.service.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController @RequestMapping ("/api")
@RequiredArgsConstructor
public class UserResouce {

    private final UserService userService;
    @GetMapping("/users")
    public ResponseEntity<List<User>>getUsers() {
        return ResponseEntity.ok().body (userService.getUsers());
    }
    @PostMapping("/user/save")
    public ResponseEntity<User>  saveUser(@RequestBody User user) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user/save").toUriString());
        return ResponseEntity.created(uri).body (userService.saveUser(user));
    }
    @PostMapping ("/role/AddToUser")
    public ResponseEntity<?> saveRole (@RequestBody RoleToUserForm form) {
        userService.addRoleToUser(form.getUsername(),form.getRoleName());
        return ResponseEntity.ok().build();
    }

}
@Data
class RoleToUserForm{
    private String username;
    private String roleName;
}
