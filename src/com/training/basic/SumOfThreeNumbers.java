/**
 * 
 */
package com.training.basic;

/**
 * @author Sumana
 *
 */
public class SumOfThreeNumbers {
	
	public void sum(int a,int b,int c)
	{
		int d = a+b+c;
		System.out.println("Total value of d is :"+d);
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SumOfThreeNumbers total  = new SumOfThreeNumbers();
		total.sum(5,6,7);
	
}
}