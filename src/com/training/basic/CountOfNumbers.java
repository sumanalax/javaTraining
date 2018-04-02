package com.training.basic;

public class CountOfNumbers {

	public static void main(String[] args) {
		
		int a[] = new int[7];
		
		a[0]=1;
		a[0]=1;
		a[0]=2;
		a[0]=2;
		a[0]=2;
		a[0]=3;
		a[0]=4;
		
		for(int i=0;i<a.length;i++) {
    		int num=a[i];
    		int count=0;
    	for(int j=0;j<num;j++) {
    		if(a[i]==a[j+1]) {
    			count=count+1;
    		}
    	}
	}
    	
    	
	}
}
