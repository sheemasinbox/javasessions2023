package OOP_Inheritance;

//1.Vehicle -> 2.Car -> 3.BMW & 3.Audi
public class Vehicle extends Automobile {
	
	int maxSpeed = 100;

	public void engine() {
		System.out.println("Vehicle -- engine");
	}
	
	public void billing() {
		System.out.println("Vehicle -- Billing");
	}
}
