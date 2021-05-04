package com.javatures.Flashcards.repositories;

import com.javatures.Flashcards.models.Flashcard;

import org.springframework.data.jpa.repository.JpaRepository;

// @RepositoryRestResource(collectionResourceRel = "flashcard", path = "people")
public interface FlashcardRepo extends JpaRepository<Flashcard, Integer> {
    
}
