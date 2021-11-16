package com.conneqt.smartapp.controlModels;

public class Signin {
	@Override
	public String toString() {
		return "Signin [username=" + username + ", password=" + password + "]";
	}
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;

}
