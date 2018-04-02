/**
 * 
 */
package com.training.corejava;

/**
 * @author Sumana
 * Calculating the total marks of students.
 */
  public class Student1 {
	
	//Attributes
	
	 int id;
	 int englishMarks;
	 int mathsMarks;
	 int scienceMarks;

	/**
	 * Functions
	 */
   public void totalMarks()	
 {
	  int result  = englishMarks + mathsMarks + scienceMarks;
	  System.out.println("Result of totalMarks is:"+result );
	 
 }
 
	//Main method
 
	public static void main(String[]args){
    
		//Object creating
		
	   Student1 s1 = new Student1();
	   s1.id = 1;
	   s1.englishMarks = 80;
       s1.mathsMarks = 90;
	   s1.scienceMarks = 95;
	   s1.totalMarks();
	   
	   Student1 s2 = new Student1();
	   s2.id = 2;
	   s2.englishMarks = 85;
       s2.mathsMarks = 95;
	   s2.scienceMarks = 100;
	   s2.totalMarks();
	   
	   Student1 s3 = new Student1();
	   s3.id = 3;
	   s3.englishMarks = 70;
	   s3.mathsMarks = 100;
	   s3.scienceMarks = 92;
	   s3.totalMarks();
	   
	}

}
