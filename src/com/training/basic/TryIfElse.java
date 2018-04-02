/**
 * 
 */
package com.training.basic;

/**
 * @author Sumana
 *
 */
public class TryIfElse {
	
	
	
	public void printValue(int a)
	{
           
		
		if(a>1) {
			System.out.println("a is greater than 1");
		}
             
		else if(a<1) {
			System.out.println("a is less than 1");
			
		}
		else {
			System.out.println("a is equal to 1");
		}
			
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TryIfElse value = new TryIfElse();
		value.printValue(5);
		
		
			
		
		
		
	}

}
