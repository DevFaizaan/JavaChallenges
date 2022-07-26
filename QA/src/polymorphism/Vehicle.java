package polymorphism;

import java.util.ArrayList;

import oop.Person;

public class Vehicle {

	
	public String Type;
	public String Make;
	public int yearMade;
	public int size;
	public String colour;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args) {
		ArrayList<Vehicle> vehicle = new ArrayList();
		Garage g = new Garage();
		Car c = new Car("Car", "Toyota", 2006, 7, "Red");
		Motorbike m = new Motorbike("Motorbike", "Ford", 1998, 2, "Blue");
		g.addVehicle(m);
		g.addVehicle(c);
		
		g.addVehicle(new Motorbike("Motorbike", "Mitsubishi", 2002, 2, "Black"));
		
		g.deleteVehicle(m);
		g.printAll();
		
		

	}
	
	public Vehicle(String Type, String Make, int yearMade, int size, String colour) {
		super();
		this.Type = Type;
		this.Make = Make;
		this.yearMade = yearMade;
		this.size = size;
		this.colour = colour;
	}
	
	

	public void print() {
  System.out.println("This Vehicles type is " + Type );
  System.out.println("The make of the vehicle is " + Make + " and was made in " + yearMade);
  System.out.println("The colour of the vehicle is " + colour);
}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getMake() {
		return Make;
	}

	public void setMake(String make) {
		Make = make;
	}

	public int getYearMade() {
		return yearMade;
	}

	public void setYearMade(int yearMade) {
		this.yearMade = yearMade;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	

}
