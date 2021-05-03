package com.javatures.Flashcards.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatures.Flashcards.models.User;
import com.javatures.Flashcards.services.RegisterService;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;
	
	@GetMapping("/users/{useremail}/users")
	public List<User> getAllQuestionsAndAnswers(@PathVariable String useremail) {
		
		return this.registerService.findAll();
	}
	
	// register a user
	@PostMapping("/users/register/api/user")
	public ResponseEntity<User> createUser(
			@RequestBody User user) {
		
		User createdUser = this.registerService.addUser(user);
		
		return new ResponseEntity<User>(createdUser, HttpStatus.OK);
		
	}

}