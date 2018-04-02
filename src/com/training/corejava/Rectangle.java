package com.training.corejava;

public class Rectangle extends Shapes{
	int length;
	int width;
	
	
public void area () 
{
	int a = length*width;
	System.out.println("area of rectangle is:"+a);
}
public void perimeter() {
	int l = 2*(length+width);
	System.out.println("length of rectangle is:"+l);
}
  }	


