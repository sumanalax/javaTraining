/**
 * 
 */
package com.training.corejava;

/**
 * @author Sumana
 * Calculating body mass index of a person.
 */
  public class Person1 {
	
	//Attributes
	
	  int height;
	  int weight;
	
	 /**
	 * Functions
	 */
	  
   public void bmi()	
   {
	   int totalbmi = height/weight;
	   System.out.println("Result of totalbmi is: "+totalbmi);
   }
      //Main method
	
	public static void main(String[] args) {
	
		//Objects
		
		Person1 seetha = new Person1 ();
		seetha.height = 60;
		seetha.weight = 30;
		seetha.bmi();
		
		Person1 suresh = new Person1();
		suresh.height = 120;
		suresh.weight = 60;
		suresh.bmi();
		
		Person1 geetha = new Person1();
		geetha.height = 40;
		geetha.weight = 20;
		geetha.bmi();
		
		
		

	}

}
