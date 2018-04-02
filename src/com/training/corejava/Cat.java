package com.training.corejava;

import com.training.model.Animal;;

public class Cat extends Animal {
	
	public void printAnimalName() {
		System.out.println("Cat name is "+getName());
	}
	
	
	public void sound() {
		System.out.println("sound is:"+getSound() );
	}	
	public void eat() {
		System.out.println("eating");
	}
	
	public void walk() {
		System.out.println("Dog is walking");
	}
}
