package com.example.jwt.requests;

import lombok.Data;

@Data
public class UserRequest {

    String fullname;
    String username;
    String email;
    String password;

}
