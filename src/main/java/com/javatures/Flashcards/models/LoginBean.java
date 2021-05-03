package com.javatures.Flashcards.models;

public class LoginBean {

	private String user_email;
	private String user_login;
	private String user_pwd;
	
	public LoginBean() {
		
	}
	
	
	public LoginBean(String user_email, String user_login, String user_pwd) {
		super();
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((user_login == null) ? 0 : user_login.hashCode());
		result = prime * result + ((user_pwd == null) ? 0 : user_pwd.hashCode());
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
		LoginBean other = (LoginBean) obj;
		if (user_login == null) {
			if (other.user_login != null)
				return false;
		} else if (!user_login.equals(other.user_login))
			return false;
		if (user_pwd == null) {
			if (other.user_pwd != null)
				return false;
		} else if (!user_pwd.equals(other.user_pwd))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LoginBean [user_email=" + user_email + ", user_login=" + user_login + ", user_pwd=" + user_pwd + "]";
	}
	
	
	
}