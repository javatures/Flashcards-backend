package com.javatures.Flashcards.repositories;

import java.util.List;

import com.javatures.Flashcards.models.Flashcard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

// @RepositoryRestResource(collectionResourceRel = "flashcard", path = "people")
public interface FlashcardRepo extends JpaRepository<Flashcard, Integer> {
    @Query("select f from Flashcard f where f.user_email = ?1")
    List<Flashcard> findFlashcards(String user_email);
}
