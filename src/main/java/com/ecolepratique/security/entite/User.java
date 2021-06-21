package com.ecolepratique.security.entite;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
public class User implements Serializable {
	@Id
	private String login;
	private String password;
	private boolean active;
	
	public User() {
		super();
	}

	public User(String login, String password) {
		super();
		this.login = login;
		this.password = hash(password);
		this.active = active;
	}
	
	private String hash(String hashInput) {
		String hashedOutput = null;
		
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		hashedOutput = bCryptPasswordEncoder.encode(hashInput);
		
		return hashedOutput;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + ", active=" + active + "]";
	}
	
}
