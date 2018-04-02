package com.training.mains;

import com.training.corejava.Shapes;
import com.training.impl.Circle;

public class GetStatsOnShapes {

	public static void main(String[] args) {
		Shapes  s=new Shapes();
		s.printShapeName();
		
		Circle c=new Circle();
		c.setRadius(4);
		c.area();
		c.printShapeName();
		
		Shapes s1 = new Circle();
		s1.printShapeName();
		
		

	}

}
