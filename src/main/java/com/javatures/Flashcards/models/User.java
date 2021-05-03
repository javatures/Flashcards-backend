package com.javatures.Flashcards.models;

public class User {
	private int user_id;
	private String user_fn;
	private String user_ln;
	private String user_email;
	private String user_login;
	private String user_pwd;
	

	public User() {
		super();
	}


	public User(String user_fn, String user_ln, String user_email, String user_login, String user_pwd) {
		super();
		this.user_fn = user_fn;
		this.user_ln = user_ln;
		this.user_email = user_email;
		this.user_login = user_login;
		this.user_pwd = user_pwd;
	}


	public User(int user_id, String user_fn, String user_ln, String user_email, String user_login, String user_pwd) {
		super();
		this.user_id = user_id;
		this.user_fn = user_fn;
		this.user_ln = user_ln;
		this.user_email = user_email;
		this.user_login = user_login;
		this.user_pwd = user_pwd;
	}
	
	
	public String getUser_email() {
		return user_email;
	}


	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}


	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
	public String getUser_login() {
		return user_login;
	}
	public void setUser_login(String user_login) {
		this.user_login = user_login;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}


	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_fn=" + user_fn + ", user_ln=" + user_ln + ", user_email="
				+ user_email + ", user_login=" + user_login + ", user_pwd=" + user_pwd + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((user_email == null) ? 0 : user_email.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (user_email == null) {
			if (other.user_email != null)
				return false;
		} else if (!user_email.equals(other.user_email))
			return false;
		return true;
	}
	
	
	
}
