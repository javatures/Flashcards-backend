package com.javatures.Flashcards.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.javatures.Flashcards.models.Flashcard;


@Service
public class FlashcardsService {
	
	private List<Flashcard> fList = new ArrayList<>();
	private int idCounter = 0;
	
	// replace this with database connection later
	// static {
	// 	fList.add(new Flashcard(++idCounter, "john@gmail.com", "java", "java", "java"));
	// 	fList.add(new Flashcard(++idCounter, "john@gmail.com", "react", "react", "react"));
	// 	fList.add(new Flashcard(++idCounter, "mary@gmail.com", "html", "html", "html"));
	// }
	
	// find all flash cards by user email
	public List<Flashcard> findAllByUser(String username) {
		System.out.println("QuestionsAndAnswersService.findAllByUser user_login=" + username);
		List<Flashcard> userF = new ArrayList<>();
		for(Flashcard f : fList) {
			if (f.getUser_email().equals(username)) {
				userF.add(f);
			}
		}
		System.out.println("QuestionsAndAnswersService.findAllByUser return " + userF);
		return userF;
	}
	
	
	// update a flash card by flash card ID
	public Flashcard update(int id, Flashcard flashcard) {
		
		
		System.out.println("QuestionsAndAnswersService.update user_login=" + flashcard.getUser_email());
		
		Flashcard temp = null;
		
		for(Flashcard f : this.fList) {
			if (f.getFid() == id) {
				temp = f;
			}
		}
		
		if (temp != null) {
			this.fList.remove(temp);
			flashcard.setFid(++idCounter);
			this.fList.add(flashcard);
		}
		
		return flashcard;
	}
	
	
	// delete a flash card by flash card ID
	public Flashcard deleteById(int fId) {
		System.out.println("******************************");
		System.out.println("QuestionsAndAnswersService.deleteById >>>" + fId);
		
		Flashcard temp = null;
		
		for(Flashcard f : this.fList) {
			if (f.getFid() == fId) {
				temp = f;
			}
		}
		
		if (temp != null) fList.remove(temp);
		
		return temp;
	}
	
	// find a flash card by flash card ID
	public Flashcard findById(int id) {
		Flashcard temp = null;
		
		for(Flashcard f : this.fList) {
			if (f.getFid() == id) {
				temp = f;
			}
		}
		return temp;
	}

	
	// insert a flash card into data storage
	public Flashcard insert(Flashcard f) {
		if (f.getUser_email() != null) {
			f.setFid(++idCounter);
			this.fList.add(f);
		}
		return f;
	}
	
}