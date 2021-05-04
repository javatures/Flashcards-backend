package com.javatures.Flashcards.controllers;

import com.javatures.Flashcards.repositories.FlashcardRepo;

import java.util.List;

import com.javatures.Flashcards.models.Flashcard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("flashcards")
public class FlashcardsController {
    @Autowired
    private FlashcardRepo flashcardRepo;

    @GetMapping
    public List<Flashcard> getAll(){
        System.out.println(flashcardRepo.findAll());
        return (List<Flashcard>) flashcardRepo.findAll();
    }

    @PostMapping("/create")
    public Flashcard createFlashcard(@RequestBody Flashcard flashcard){
        return flashcardRepo.save(flashcard);
    }
}
