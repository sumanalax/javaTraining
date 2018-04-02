package com.training.basic;

public class LargestNumber {

	public static void main(String[] args) {
		
		int a[] = new int[7];
		a[0] = 2;
		a[1] = 3;
		a[2] = 4;
		a[3] = 5;
		a[4] = 6;
		a[5] = 7;
		a[6] = 8;
		int largest  = 0;
		
		for(int i=0;i<7;i++) {
			if(a[i]>largest) {
				largest = a[i]; 
			}
		}
		      System.out.println("Largest number of an array is :"+largest);

	}

}
