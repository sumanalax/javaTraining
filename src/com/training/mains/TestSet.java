package com.training.mains;

import java.util.*;

public class TestSet {

	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> setOfIntegers = new TreeSet<Integer>();
		setOfIntegers.add(new Integer(1));
		setOfIntegers.add(new Integer(2 ));
		setOfIntegers.add(new Integer(3));
		setOfIntegers.add(new Integer(4));
		
		Iterator it = setOfIntegers.iterator();
		while(it.hasNext()) {
			System.out.println("print each element:"+ it.next());
		}
		
		
		
		setOfIntegers
		.stream()
		.unordered()
		.forEach(
				name -> {
				String Integers;
				String name1 = "rajesh";
				System.out.print(name1);
				});
		
		

	}

}
