package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	
	@Column
	@Id
	private String Username;
	@Column
	private String Password;
	@Column
	private String Role;
	
	
	public Users() {
		super();
	}


	public Users(String username, String password, String role) {
		super();
		Username = username;
		Password = password;
		Role = role;
	}


	public String getUsername() {
		return Username;
	}


	public void setUsername(String username) {
		Username = username;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public String getRole() {
		return Role;
	}


	public void setRole(String role) {
		Role = role;
	}
	
	

}
