package com.training.corejava;

import com.training.model.Person;

public class Employee extends Person {
	
	
	public void printJob() {
		System.out.println("job is:"+getJob() );
	}
	public void printCode() {
	    System.out.println("departmentcode is:"+getCode());
	}
	public void printName() {
		System.out.println("employeeName is:"+getName());
	}
	
	
     public void printPersonName() {
    	System.out.println("Employee name is: "+getName());
    }
}