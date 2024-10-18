package com.mka.validation.controller;

import com.mka.validation.dto.UserRequest;
import com.mka.validation.entity.User;
import com.mka.validation.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("/users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
    @GetMapping("/user/{id}")
    public User getUserbyId(@PathVariable Integer id){
        return userService.getUserbyId(id);
    }

    @PostMapping("/user")
    public User createUser(@RequestBody @Valid UserRequest userRequest){
        return  userService.insertUser(userRequest);
    }
}
