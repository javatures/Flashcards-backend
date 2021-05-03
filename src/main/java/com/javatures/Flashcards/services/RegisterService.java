package com.javatures.Flashcards.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.javatures.Flashcards.models.LoginBean;
import com.javatures.Flashcards.models.User;

@Service
public class RegisterService {
	
	private List<User> usersList = new ArrayList<>();
	private static int idCounter = 0;

	RegisterService() {
		addUser(new User(++RegisterService.idCounter, "john", "ng", "john@gmail.com", "john@gmail.com", "password"));
		addUser(new User(++RegisterService.idCounter, "mary", "public", "mary@gmail.com", "mary@gmail.com", "password"));
	}
	
	// static {
	// 	usersList.add(new User(++idCounter, "john", "ng", "john@gmail.com", "john@gmail.com", "password"));
	// 	usersList.add(new User(++idCounter, "mary", "public", "mary@gmail.com", "mary@gmail.com", "password"));
	// }
	
	// retrieve all users
	public List<User> findAll() {
		return this.usersList;
	}
	
	
	// add a user to data storage
	public User addUser(User user) {
		User tempUser = new User(user.getUser_fn(), user.getUser_ln(), 
				user.getUser_email(), user.getUser_email(), user.getUser_pwd());
		
		tempUser.setUser_id(++idCounter);
		
		usersList.add(tempUser);
		
		System.out.println(usersList);
		
		return tempUser;
	}

	
	// find a user by his/her email
	public LoginBean findByEmail(LoginBean loginUser) {
		
		System.out.println("******************************");
		System.out.println("RegisterService.findById >>>" + loginUser.getUser_email());

		System.out.println("******************************");
		
		LoginBean lb = null;
		
		for(User user : usersList) {
			if (user.getUser_email().equals(loginUser.getUser_email())) {
				lb = new LoginBean();
				lb.setUser_email(user.getUser_email());
				lb.setUser_login(user.getUser_login());
				lb.setUser_pwd(user.getUser_pwd());
			}
		}
		
		return lb;
	}


}
