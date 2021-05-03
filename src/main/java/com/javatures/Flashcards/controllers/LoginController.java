package com.javatures.Flashcards.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatures.Flashcards.models.LoginBean;
import com.javatures.Flashcards.services.LoginService;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@PostMapping("/users/login/api/user")
	public ResponseEntity<LoginBean> authenticateUser(
			@RequestBody LoginBean loginUser) {
		
		System.out.println("LoginController.authenticateUser: " + loginUser);
		
		LoginBean tempLoginUser = this.loginService.findByEmail(loginUser);
		
		System.out.println("LoginController.authenticateUser aflter findByEmail: " + tempLoginUser);
		
		return new ResponseEntity<LoginBean>(tempLoginUser, HttpStatus.OK);
		
	}

}