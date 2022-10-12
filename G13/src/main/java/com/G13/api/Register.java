package com.G13.api;

import com.G13.domain.User;
import com.G13.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class Register {



        private final UserService userService;

        @PostMapping("/passenger")
        public ResponseEntity<List<User>> RegisterPassenger() {
            return ResponseEntity.ok().body(userService.getUsers());
        }
}
