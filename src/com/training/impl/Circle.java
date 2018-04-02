package com.training.impl;

import com.training.corejava.Shapes;
import com.training.intr.ShapesIntf;

public class Circle extends Shapes implements ShapesIntf{
	
	private int radius;
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void area()
	{
		double a = 3.14*(radius*2);
		System.out.println("circle area value is:"+a);
	}
	// over loading
	public void area(int radius)
	{
		double a = 3.14*(radius*2);
		System.out.println("circle area value is:"+a);
	}
	
	public void perimeter() 
	{
		double p = 2*3.14*radius;
		System.out.println("circle perimeter value is:"+p);	
	}
	// over riding1
	public void  printShapeName() 
	{
		System.out.println("Circle");
	}
 }
