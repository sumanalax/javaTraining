package com.training.mains;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.training.corejava.Cat;
import com.training.impl.Dog;
import com.training.model.Animal;

public class GetStatsOnAnimal {

	public static void main(String[] args) {
		//Animal n = new Animal();
		//n.printAnimalName();
		
		Dog d = new Dog() ;
		d.setName("Ruby");
		//d.printDogname();
		//d.printDogname("wallar");
		d.setSound("bark");
		//d.sound();
		//d.eat();
		
		Cat c = new Cat();
		c.setName("furry");
		//c.printCatname();
		c.setName("meow");
		//c.sound();
		//c.eat();
		
		Animal n1 = new Dog();
		//n1.printAnimalName();
		
		ArrayList dogs = new ArrayList();
		dogs.add(d);
		dogs.add(c);
		
		Iterator it = dogs.iterator();
		while(it.hasNext()) {
			Animal o = (Animal) it.next();
			o.printAnimalName();
		}
	}	
		
}		
		
		

	


