package com.autowire;

public class Master {
	public Master() {
		// TODO Auto-generated constructor stub
	}
	
	public Master(Dog dog1) {
		// TODO Auto-generated method stub
		this.dog=dog1;
	}
	
	private String masname;
	private Dog dog;
	public String getMasname() {
		return masname;
	}
	public void setMasname(String masname) {
		this.masname = masname;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
}
