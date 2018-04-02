package com.training.basic;

public class EvenAndoddNum {

	public static void main(String[] args) {
		
		int num = 0;
		
		while(num<20) { 
		num++;
		   System.out.println(num);
			
		if(num%2==0) {
			System.out.println("num is an even:"+num);
		}else if(num%2==1) {
			System.out.println("num is an odd:"+num);
		}
        	
        }
        
	  
		 

	}

}
