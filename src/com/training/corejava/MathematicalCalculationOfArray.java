/**
 * 
 */
package com.training.corejava;

/**
 * @author Sumana
 *
 */
public class MathematicalCalculationOfArray {
	
	int a[];
	
	public void mean()
	{
		int sum =0;
  		for(int i=0;i<a.length ;i++) {
			sum = sum+a[i];
		}
	    double mean = sum / a.length; 
		System.out.println("Print mean value is:"+mean);
	} 
	
    public void largest() 
    {
    	int largest = 0;
    	for(int i=0;i<a.length;i++) {
    		if(a[i]>largest) {
    			largest=a[i];
    		}
    	}
        System.out.println("largest value of an array is:"+largest);   
    } 
    
    public void mode()
    {
    	
    		  
            }
    			
            
    
         
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MathematicalCalculationOfArray m1 = 
				new MathematicalCalculationOfArray();
		m1.a=new int[5];
		
		m1.a[0]=1;
		m1.a[1]=2;
		m1.a[2]=34;
		m1.a[3]=34;
		m1.a[4]=584;
		m1.mean();
		m1.largest();
		m1.mode();
		
	
	}

}
