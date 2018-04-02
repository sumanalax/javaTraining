package com.training.model;

import com.training.intr.AnimalsIntf;

public  abstract class Animal implements AnimalsIntf{
	private String name;
	private String sound;
	private String type;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void printAnimalName() {
		System.out.println("animal name is nothing");
	}
	
	public abstract void walk();
}
