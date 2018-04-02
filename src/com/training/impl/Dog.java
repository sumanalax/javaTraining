package com.training.impl;

import com.training.intr.AnimalsIntf;
import com.training.model.Animal;

public class Dog extends Animal implements AnimalsIntf {
	

	
	
	public void printDogname(){
		System.out.println("Dog name is:"+getName() );
	}
	public void printDogname(String name) {
		System.out.println("Dog name is:"+getName());
		
	}
	
	public void sound() {
		System.out.println("sound is:"+getSound());
	}
	public void eat() {
	   System.out.println("Dog is eating");	
	}
	public void printAnimalName(){
		System.out.println("Dog");
	
	}
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Dog is walking");
	}
}
