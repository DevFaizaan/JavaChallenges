package lib;

import lib.Library;
import lib.Person;
import lib.Books;
import lib.Maps;

public class Runner {
	
	public static void main(String[] args) {
		
		boolean bool = false;
		do{
			
			//Books b = new Books("Narnia", "Fantasy", "C.S. Lewis");
			
		
			Books b = new Books("book1","sci-fi","georgey");
			Books b2 = new Books("book2","fantasy","clooney");
			Maps m = new Maps("Tresure Map", true);
//			System.out.println(b.reading());
//			System.out.println(m.reading());
			Person josh = new Person("Josh", 23, "josh@gmail.com", true);
			Person Jamal = new Person("Jamal", 25, "jamal@gmail.com", true);
			
			Library l = new Library();
			l.addItem(b);
			l.addItem(b2);
			l.addItem(m);
			l.registerUser(josh);
			l.registerUser(Jamal);
			l.updatePerson(Jamal, "Johsnon", 22, "Johnson@gmail.com");
	
		l.deleteUser(josh);

			
			m.setCheckedIn(true);
			
			System.out.println(m);
			System.out.println(l.toStringPersons());
			System.out.println(l.toStringItems());
			
		}
		while(bool);
	}
		
		
	}


