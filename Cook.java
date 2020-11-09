package com.cognixia.jump.corejava.BurgerSpot;

public class Cook {

	//Attributes
	private String name;
	private String speciality;
	private int experience;
	
	//Constructors 
	//Default constructor below(good practice)
	public Cook() {
		this.setName("");
		this.speciality = "";
		this.experience = 0;
	}
	//Constructor written completely out.
	public Cook(String name, String speciality, int experience) {
		super();
		this.setName(name);
		this.speciality = speciality;
		this.experience = experience;
	}
	
	public static void makeBurger() {
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
