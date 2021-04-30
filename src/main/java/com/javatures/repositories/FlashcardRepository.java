package com.javatures.repositories;

import com.javatures.models.Flashcard;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "flashcards", path = "flashcards")
public interface FlashcardRepository extends PagingAndSortingRepository<Flashcard, Integer> {
    
}
