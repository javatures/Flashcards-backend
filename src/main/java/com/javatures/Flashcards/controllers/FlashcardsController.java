package com.javatures.Flashcards.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.javatures.Flashcards.models.Flashcard;
import com.javatures.Flashcards.services.FlashcardsService;


@RestController
@CrossOrigin(origins="http://localhost:3000")
public class FlashcardsController {
	
	@Autowired
	private FlashcardsService flashcardsService;
	
	// get all flash cards by username(email address)
	@GetMapping("/users/{username}/flashcards")
	public List<Flashcard> getAllFlashcardsByUser(@PathVariable String username) {
		System.out.println("QuestionsAndAnswerController.getAllQuestionsAndAnswersByUser user__login=" + username);
		return this.flashcardsService.findAllByUser(username);
	}
	
	// get a flash card
	@GetMapping("/users/{username}/flashcards/{id}")
	public Flashcard getFlashcard(@PathVariable String username, @PathVariable int id) {
		System.out.println("QuestionsAndAnswerController.getQa username=" + username);
		return this.flashcardsService.findById(id);
	}
	
	
	// delete a flash card
	@DeleteMapping("/users/{username}/flashcards/{fId}")
	public ResponseEntity<Void> deleteFlashcard(@PathVariable String username, @PathVariable  int fId) {
		Flashcard flashcard = this.flashcardsService.deleteById(fId);
		if(flashcard != null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}
	
	// edit/update a flash card
	@PutMapping("/users/{username}/flashcards/{id}")
	public ResponseEntity<Flashcard> updateFlashcard(
			@PathVariable String username, 
			@PathVariable int id,
			@RequestBody Flashcard flashcard) {
		
		System.out.println("FlashcardsController.updateFlashcard FEmail=" + username);
		System.out.println("FlashcardsController.updateFlashcard flashcard=" + flashcard);
	
		Flashcard f = this.flashcardsService.update(id, flashcard);
		
		return new ResponseEntity<Flashcard>(f, HttpStatus.OK);
	}
	
		// create a flash card
		@PostMapping("/users/{username}/flashcard")
		public ResponseEntity<Void> createFlashcard(
				@PathVariable String username, 
				@RequestBody Flashcard flashcard) {
			
			System.out.println("FlashcardsController.createFlashcard user__login=" + username);
			
			Flashcard createdFlashcard = this.flashcardsService.insert(flashcard);
			
			URI uri = ServletUriComponentsBuilder.fromCurrentContextPath()
				.path("/{id}").buildAndExpand(createdFlashcard.getFid()).toUri();
			
			return ResponseEntity.created(uri).build();
			
		}
	
	
	
	@RequestMapping(path="/hello-world", method=RequestMethod.GET)
	public String helloWorld() {
		return "Hello World";
	}
}

