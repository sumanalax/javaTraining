package com.training.basic;

public class Arrays {

	public static void main(String[] args) {  
			
		int a[] = new int[7];
		int total = 0;
		a[0] = 1; 
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;		
		a[6] = 7;	
		
			
		
      for(int i=0;i<7;i++) {
    	  total  = total+a[i];
    	//System.out.println("print total value:" +total);
	}  
      System.out.println("print total value:" +total);

}
}