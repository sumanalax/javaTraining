/**
 * 
 */
package com.training.corejava;

/**
 * @author Sumana
 *
 */
public class Calculate {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathematicalOperations  mOperations = new MathematicalOperations();
		mOperations.a = 6;
		mOperations.b = 2;
		mOperations.add();
		mOperations.sub();
		mOperations.multiply();
	    mOperations.division();
	    mOperations.equal();
	    
	    MathematicalOperations  mOperations1 = new MathematicalOperations();
	    mOperations.a = 100;
	    mOperations.b = 20;
	    mOperations.add();
	    mOperations.sub();
	    mOperations.multiply();
	    mOperations.division();
	    mOperations.equal();
	}

}
