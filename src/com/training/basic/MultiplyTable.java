package com.training.basic;

public class MultiplyTable {

	public static void main(String[] args) {
		
		int []a = new int[10];
		int n = 12;
		int result = 0;
		
		for(int i=1;i<11;i++) {
			
			System.out.print(n+"*");
			System.out.print(i+"= " );
			   result=n*i;
			
			System.out.print(result + "\n");
	
			
		}	   
	}		

}
