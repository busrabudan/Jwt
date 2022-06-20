package com.example.jwt.controller;

import com.example.jwt.entitiy.User;
import com.example.jwt.responses.UserResponse;
import com.example.jwt.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User newUser) {

        return userService.saveOneuser(newUser);
    }

    //@GetMapping("/{userId}")
    //public UserResponse getOneUser(@PathVariable Long userId) {
    //	return new UserResponse(userService.getOneUserById(userId));
    //}

    @GetMapping("/{username}")
    public UserResponse getOneUserByUsername(@PathVariable String username) {
        return new UserResponse(userService.getOneUserByUsername(username));
    }


    @PutMapping("/{userId}")
    public User updateOneUser(@PathVariable Long userId, @RequestBody User newUser) {
        return userService.updateOneUser(userId, newUser);
    }

    @DeleteMapping("/{userId}")
    public void deleteOneUser(@PathVariable Long userId) {
        userService.deleteById(userId);
    }


}
