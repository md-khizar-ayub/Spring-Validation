package com.mka.validation.service;

import com.mka.validation.dto.UserRequest;
import com.mka.validation.entity.User;
import com.mka.validation.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public User getUserbyId(int id){
        return userRepo.findById(id).get();
    }

    public List<User> getAllUser(){
        return userRepo.findAll();
    }

    public User insertUser(UserRequest userRequest){
        User user = User.build(0,userRequest.getName(),
                userRequest.getAddress(),
                userRequest.getEmail(),
                userRequest.getAge(),
                userRequest.getSalary());
        return userRepo.save(user) ;
    }
}
