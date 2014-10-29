package com.prototype.eventtent;
public class User extends BaseModel{
	private String username, email, password;
	
	/*
	 * Sets up the constructor for the User class (holds all the User information)
	 */
	public User(String uName, String passW, String mail){
		username = uName;
		password = passW;
		email = mail;
	}
	
    
	
	/*
	 * Returns the User's username 
	 */
	public String getUsername(){
		return username;
	}
	
	/*
	 * Sets the User's username
	 */
	public void setUsername(String uName){
		username = uName;
	}
	
	/*
	 * Returns the User's password
	 */
	public String getPassword(){
		return password;
	}
	
	/*
	 * Sets the User's password
	 */
	public void setPassword(String passW){
		password = passW;
	}
	
	/*
	 * Returns the User's email
	 */
	public String getEmail(){
		return email;
	}
	
	/*
	 * Sets the User's email
	 */
	public void setEmail(String mail){
		email = mail;
	}
}
