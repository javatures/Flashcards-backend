package com.javatures.Flashcards.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatures.Flashcards.models.AuthenticationBean;


//Controller
@RestController
@CrossOrigin(origins="http://54.90.153.65:3000")
//
public class AuthenticationController {

	@GetMapping(path = "/basicauth")
	public AuthenticationBean helloWorldBean() {
		return new AuthenticationBean("You are authenticated");
	}
}