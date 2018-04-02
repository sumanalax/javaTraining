package com.training.basic;

public class MultiplicationTable {
	
	public void printTable(int x, int n)
	{
		int i= 1;
		
		  while(i<n) {
			  System.out.println(x+"*"+i+"="+(x*i));
			  i = i+1;
		  }
	}

	public static void main(String[] args) {
	MultiplicationTable	table = new MultiplicationTable ();
	table.printTable(2, 11);
	table.printTable(3, 11);
		
 
	}

}
