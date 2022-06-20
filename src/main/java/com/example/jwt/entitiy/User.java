package com.example.jwt.entitiy;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String fullname;
    String username;
    String email;
    String password;
}
