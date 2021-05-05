package com.javatures.Flashcards.controllers;

import com.javatures.Flashcards.models.User;
import com.javatures.Flashcards.repositories.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("users/login/api/user")
public class LoginController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping
    public User authenticateUser(@RequestBody User user){
        System.out.println(userRepo.checkEmail(user.getUser_email(), user.getUser_pwd()).toString());
        return userRepo.checkEmail(user.getUser_email(), user.getUser_pwd());
    }
}
