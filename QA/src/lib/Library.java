package lib;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
	
 ArrayList<Items> item = new ArrayList<>();
 ArrayList<Person> person = new ArrayList<>();

 private int itemCount =1;
 private int userCount = 1;
 
 
 void addItem(Items t) {
	 t.setID(itemCount++);
	 this.item.add(t);
 }
 
 void removeItem(Items t) {
	 this.item.remove(t);
 }
 
 void updateItem(Items t, int ID) {
	 this.item.set(ID, t);
 }
 
 void registerUser(Person p) {
	 p.setUserID(userCount++);
	 this.person.add(p);
 }
 
 void deleteUser(Person p) {
	 this.person.remove(p);
 }
 
 void updatePerson(Person p, String name, int age, String email) {
	 p.setEmail(email);
	 p.setAge(age);
	 p.setName(name);
 }
 
 void checkOutItem(Items t) {
	 t.setCheckedOut(true);
 }
 
 void checkInItem(Items t) {
	 t.setCheckedIn(true);

 }
 
 public String toStringItems() {
		return "itemList=" + item;
	}
	
	public String toStringPersons() {
		return "personList=" + person;
	}
	
	@Override
	public String toString() {
		return "Library [itemList=" + item + " personList=" + person + "]";
	}

}
