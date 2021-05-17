package com.javatures.Flashcards.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flashcards")
public class Flashcard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer fid;
    private String user_email;
    private String question;
    private String answer;
    private String category;
    
    public Integer getFid() {
        return fid;
    }
    public void setFid(Integer fid) {
        this.fid = fid;
    }
    public String getUser_email() {
        return user_email;
    }
    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    
    public Flashcard(){
    }

    public Flashcard(Integer fid, String user_email, String question, String answer, String category) {
        this.fid = fid;
        this.user_email = user_email;
        this.question = question;
        this.answer = answer;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Flashcard [answer=" + answer + ", category=" + category + ", fid=" + fid + ", question=" + question
                + ", user_email=" + user_email + "]";
    }
    
}
