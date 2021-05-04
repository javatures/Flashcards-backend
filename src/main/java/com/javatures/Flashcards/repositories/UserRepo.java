package com.javatures.Flashcards.repositories;

import com.javatures.Flashcards.models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer>{
    @Query(value = "select * from users where email = ?1 and password = ?2", nativeQuery = true)
    User checkEmail(String email, String password);
}
