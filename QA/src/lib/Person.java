package lib;

public class Person {

	private String name;
	private int age;
	private String email;
	private boolean isRegistered;
	
	public Person(String name, int age, String email, boolean isRegistered) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.isRegistered = isRegistered;
	}
	
//	public Person() {	
//	}
		
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [name=" + this.name + ", age=" + this.age + ", Email=" + this.email + ", is registered=" + isRegistered + "]";
	}

	void print() {
		System.out.println("Hello! My name is " + name);
		System.out.println("I am " + this.age + " years old!");
		System.out.println("And my email is " + email);
	}

	public void setUserID(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
}
