package polymorphism;

import java.util.ArrayList;

import oop.Person;

public class Garage {
	
	ArrayList<Vehicle> vehicle = new ArrayList<>();
	
	void addVehicle(Vehicle v) {
		this.vehicle.add(v);
	}
	
	void deleteVehicle(Vehicle v) {
		
			this.vehicle.remove(v);	
	}
	
	void deleteVehicle(int ID) {
		this.vehicle.remove(ID);
	}
	
	void fixVehicle(Vehicle v) {
		
	}
	
	void emptyGarage() {
		vehicle.clear();
	}
	
	Vehicle vBill(String name) {
		for(Vehicle v : this.vehicle) {
			if(v.getType().equalsIgnoreCase(name))
				return v;
		}
		return null;
	}

	
	void printAll() {
		for (Vehicle v : this.vehicle)
			v.print();
	}
	
//	public void print() {
//        System.out.println("This car's type is " + Type );
//        System.out.println("The make of the car is " + Make + "and was made in " + yearMade);
//        System.out.println("The colour of the car is " + colour);
//    }
	
	
	

}
