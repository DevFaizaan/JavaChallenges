package oop;

import java.util.ArrayList;

public class PersonManager {

	ArrayList<Person> people = new ArrayList<>();

	void addPerson(Person p) {
		this.people.add(p);
	}

	Person findPerson(String name) {
		for (Person p : this.people) {
			if (p.getName().equalsIgnoreCase(name))
				return p;
		}
		return null;
	}

	void printAll() {
		for (Person p : this.people)
			p.print();
	}
}
