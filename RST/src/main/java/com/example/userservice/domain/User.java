package com.example.userservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Basic
    @Column(name = "email", nullable = true, length = 255)
    String email;
    @Basic
    @Column(name = "password", nullable = true, length = 255)
    String password;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> role = new ArrayList<>();
}
