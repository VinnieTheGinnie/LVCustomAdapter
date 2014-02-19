package com.mobileappdevelopersclub.listviewexample;

public class Contact {
		
	private String name;
	
	private String phoneNumber;

    private String test;

    private String test2;
	
	private String picture;
	
	private String email;
	
	public Contact(String name, String phoneNumber, String picture, String email) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.picture = picture;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
