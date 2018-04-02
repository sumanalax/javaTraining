package com.training.corejava;

public class Square extends Shapes {
	
	int side;
	
public void squareArea() {
	double a = (side*2);
	System.out.println("square area is:"+a);
}
public void squarePerimeter() {
	double p = 4*side;
	System.out.println("squarePerimeter is:"+p);
}

	

}
