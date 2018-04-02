package com.training.basic;

public class Mean {

	public static void main(String[] args) {
		
		int a[] = new int[7];
		int sum =0; 
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;
		a[6] = 7;
		
		for(int i=0;i<7 ;i++) {
			sum = sum+a[i];
		}
		   double mean = sum / a.length; 
		          System.out.println("Print mean value is:"+mean);
		}
		
		

	}


