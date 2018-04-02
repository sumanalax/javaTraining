package com.training.mains;

import java.util.ArrayList;
import java.util.Iterator;

import com.training.corejava.Employee;
import com.training.impl.Student;
import com.training.model.Animal;
import com.training.model.Person;

public class GetStatsOnPerson {

	public static void main(String[] args) {
    
		Person p = new Person();
        //p.printPersonName();
        
        Student s = new Student();
        s.setJob("Study");
        s.setCode(4521);
        s.setName("satish");
        s.setName("arun");
       // s.printName();
       // s.printJob();
       //s.printCode();
       // s.printCode(1234);
        
        Student s1 = new Student();
        s1.setId(0);
        s1.setName("lalitha");
        
        Student s2 = new Student();
        s2.setId(1);
        s2.setName("suresh");
        
        System.out.println("s1 tostring"+ s1.toString());
        System.out.println("s2 tostring"+ s2.toString());
        
        
        Employee e = new Employee();
        e.setJob("Work");
        e.setCode(3561);
        e.setName("john");
        
        //e.printCode();
        //e.printJob();
        //e.printName();
        
        Employee e1=new Employee();
        e1.setName("smith");
        
        Employee e2=new Employee();
        e2.setName("mary");
     
       Person p1 = new Employee();
       //p1.printPersonName();
       
       ArrayList Employee = new ArrayList() ;
       Employee.add(e1);
       Employee.add(e2);
       Employee.add(s1);
       Employee.add(s2);
       
       Iterator it = Employee.iterator();
		while(it.hasNext()) {
			Person n = (Person) it.next();
		    n.printPersonName();
       
		}
	}  
 }