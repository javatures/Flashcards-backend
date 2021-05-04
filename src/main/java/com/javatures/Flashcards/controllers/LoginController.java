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
@RequestMapping("login")
public class LoginController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping
    public User authenticateUser(@RequestBody User user){
        System.out.println(user);
        System.out.println(userRepo.checkEmail(user.getEmail(), user.getPassword()).toString());
        return userRepo.checkEmail(user.getEmail(), user.getPassword());
    }
}
