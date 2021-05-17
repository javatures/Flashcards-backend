package com.javatures.Flashcards.repositories;

import com.javatures.Flashcards.models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer>{
    @Query("select u from User u where u.user_email = ?1 and u.user_pwd = ?2")
    User checkEmail(String email, String password);
}
