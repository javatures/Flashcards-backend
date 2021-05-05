package com.javatures.Flashcards.controllers;

import com.javatures.Flashcards.repositories.FlashcardRepo;

import java.util.List;
import java.util.Optional;

import com.javatures.Flashcards.models.Flashcard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://54.90.153.65:3000/")
@RequestMapping("users")
public class FlashcardsController {
    @Autowired
    private FlashcardRepo flashcardRepo;

    @GetMapping("/{user_email}/flashcards")
    public List<Flashcard> getAllFromUser(@PathVariable String user_email){
        List<Flashcard> result = flashcardRepo.findFlashcards(user_email);
        System.out.println("getAllFromUser: " + result);
        return result;
    }

    @GetMapping("/{user_email}/flashcards/{id}")
    public Optional<Flashcard> getFlashcard(@PathVariable String user_email, @PathVariable int id){
        Optional<Flashcard> result = flashcardRepo.findById(id);
        System.out.println("getFlashcard: " + result);
        if (!result.isPresent()) return null;
        return result;
    }

    @PostMapping("/{user_email}/flashcards")
    public Flashcard createFlashcard(@PathVariable String user_email, @RequestBody Flashcard flashcard){
        Flashcard result = flashcardRepo.save(flashcard);
        System.out.println("createFlashcard: " + result);
        return result;
    }

    @DeleteMapping("/{username}/flashcards/{id}")
    public void removeFlashcard(@PathVariable String username, @PathVariable int id){
        System.out.println("removeFlashcard: "+ id);
        flashcardRepo.deleteById(id);
    }

    @PutMapping("/{username}/flashcards/{id}")
    public Flashcard editFlashcard(@PathVariable int id, @RequestBody Flashcard flashcard){
        Flashcard update = flashcardRepo.getOne(id);
        update.setQuestion(flashcard.getQuestion());
        update.setAnswer(flashcard.getAnswer());
        update.setCategory(flashcard.getCategory());
        flashcardRepo.save(update);
        return update;
    }

}
