package OOP_Inheritance;

public class Car extends Vehicle {
	
	int maxSpeed = 100;
	static int price = 1000;
	
	final int minSpeed = 10;
	
	public void start() {
		System.out.println("car -- start");
	}
	
	public void stop() {
		System.out.println("car -- stop");
	}
	public void refuel() {
		System.out.println("car -- refuel");
	}
	
	@Override
	public void billing() {
		System.out.println("Car -- Billing");
	}
	
	//- Static method cannot be overridden but can be Overloaded
	public static void carDisplay() {
		System.out.println("Car -- display");
	}
	
	//private
	private void show() {
		System.out.println("car -- show");
	}
	
	public void showCar() {
		show();
	}
	
	//Final methods cannot be overridden
	public final void runFourWheels() {
		System.out.println("car -- all run on 4 wheels only -FINAL");
	}
	
	//static & final - cannot be Overridden
	public static final void loadCar() {
		System.out.println("Car --  Load car");
	}
	

}
