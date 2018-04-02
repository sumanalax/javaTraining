package com.training.impl;

import com.training.intr.PersonIntf;
import com.training.model.Person;


public class Student extends Person implements PersonIntf {
	
	
	public void printJob() {
		System.out.println("job is:"+getJob());
	}
	public void printCode() {
		System.out.println("College code is :"+getCode());
	}
	public void printCode(int code) {
		System.out.println("College code is:"+getCode());
	}
	public void printName() {
		System.out.println("studentName is:"+getName());
	}
	
	
	public void printPersonName() {
		System.out.println(" Student name is:"+getName());
	}
	
	public String toString() {
		return "id is: "+getId()+" name is: "+getName();
	}

}
