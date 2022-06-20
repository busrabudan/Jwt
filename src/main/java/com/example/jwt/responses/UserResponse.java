package com.example.jwt.responses;

import com.example.jwt.entitiy.User;
import lombok.Data;

@Data
public class UserResponse {
    Long id;
    String fullname;
    String username;
    String email;
    String password;

    public UserResponse(User entity){
        this.id= entity.getId();
        this.fullname= entity.getFullname();
        this.username= entity.getUsername();
        this.email= entity.getEmail();
        this.password= entity.getPassword();
    }
}
