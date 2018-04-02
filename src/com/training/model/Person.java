package com.training.model;

public class Person {
	
   private int id;
   private String name;
   private String address;
   private String job;
   private int code;
   
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
    	this.id=id;
    }
    
    public void setName(String name) {
    	 this.name=name;
    }	
    public String getName() {
    	return this.name;
    }
    
    public String getAddress() {
    	return this.address;
    }
    public void setAddress(String address) {
    	this.address=address;
    }
    
    public void setJob(String job) {
    	this.job=job;
    }
    public String getJob() {
    	return this.job;
    } 	
    
    public void setCode(int code) {
       this.code=code;
    }
    public int getCode() {
    	return this.code;
    }
    /*public void toString() {
    
    }*/
    
    
     public void printPersonName(){
        System.out.println("suresh");
    }
    
}
