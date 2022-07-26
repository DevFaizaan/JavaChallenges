package oop;

import java.util.ArrayList;
import java.util.Collection;

public class object {

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList();
	

		PersonManager manager = new PersonManager();
		Person p = new Person("Gertrude", 48, "Dealer");
		manager.addPerson(p);
		
		manager.addPerson(p);
		manager.addPerson(new Person("Bertrude", 35, "Analyst"));
		manager.addPerson(new Person("Sirtrude", 28, "Knight"));
		
		//manager.printAll();
		Person found = manager.findPerson("Bertrude");
		found.print();
		
		
	
		
	
//		ArrayList<String> str = new ArrayList();
//		str.add(p.name);
//		str.add(p1.name);
//		str.add(p2.name);
//		str.add(p3.name);
		
//		System.out.println(str);
			
	}
	

}
