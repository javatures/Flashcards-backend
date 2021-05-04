package com.javatures.Flashcards.repositories;

import com.javatures.Flashcards.models.Flashcard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// @RepositoryRestResource(collectionResourceRel = "flashcard", path = "people")
public interface FlashcardRepo extends JpaRepository<Flashcard, Integer> {
    
}
