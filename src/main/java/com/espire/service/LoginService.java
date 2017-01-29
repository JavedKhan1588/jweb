package com.espire.service;

public class LoginService {

	public boolean isUserValid(String name, String password){
		if(name.equals("javed") && password.equals("hachiko")){
			return true;
		}
		return false;
	}
}
