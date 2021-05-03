package com.javatures.Flashcards.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatures.Flashcards.models.LoginBean;
import com.javatures.Flashcards.models.User;



@Service
public class LoginService {
	
	@Autowired
	RegisterService registerService;

	public LoginBean findByEmail(LoginBean loginUser) {
		
		
		System.out.println("LoginService.findByEmail loginUser: " + loginUser);
		
		
		LoginBean user = this.registerService.findByEmail(loginUser);
		
		return user;
	}

}