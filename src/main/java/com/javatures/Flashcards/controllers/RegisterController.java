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
@CrossOrigin(origins = "http://54.90.153.65:3000")
@RequestMapping("users/register/api/user")
public class RegisterController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping
    public User creatUser(@RequestBody User user){
        System.out.println(user.toString());
        return userRepo.save(user);
    }
}
