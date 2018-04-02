/**
 * 
 */
package com.training.corejava;

/**
 * @author Sumana
 * Calculate different types of math operations.
 */
public class MathematicalOperations {
	
	int a;
	int b;
	
	public void add()
	{
		int c = a+b;
		System.out.println("Result of add:"+c);
	}
	
	public void sub()
	{
		int c = a-b;
		System.out.println("Result of sub is :"+c );
		
	}
	
	public void multiply()
	{
		int c = a*b;
		System.out.println("Result of multiply is :" +c);
	}
	public void division()
	{
		int c = a/b;
		System.out.println("Result of division is:" +c);
		
	}
	public void equal()
	{
		boolean c = (a==b);
		System.out.println("Result of equal is:"+c);
	}

	
	

}
