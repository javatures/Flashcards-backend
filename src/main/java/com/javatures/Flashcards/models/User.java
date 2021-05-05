package com.javatures.Flashcards.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String user_fn;
    private String user_ln;
    private String user_email;
    private String user_pwd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_fn() {
        return user_fn;
    }

    public void setUser_fn(String user_fn) {
        this.user_fn = user_fn;
    }

    public String getUser_ln() {
        return user_ln;
    }

    public void setUser_ln(String user_ln) {
        this.user_ln = user_ln;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public User(){
        
    }

    public User(Integer id, String user_fn, String user_ln, String user_email, String user_pwd) {
        this.id = id;
        this.user_fn = user_fn;
        this.user_ln = user_ln;
        this.user_email = user_email;
        this.user_pwd = user_pwd;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", user_email=" + user_email + ", user_fn=" + user_fn
                + ", user_ln=" + user_ln + ", user_pwd=" + user_pwd + "]";
    }
}
