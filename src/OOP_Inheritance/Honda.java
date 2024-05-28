package OOP_Inheritance;

public class Honda extends Car {

	public void start() {
		System.out.println("Honda -- Start");
	}
	
	public void fuelEff() {
		System.out.println("Honda -- fuelEff");
	}
	
	//Composition
	//Sibling can use the method of another sibling by creating an object of a class and access it
	public void parking() {
		BMW b = new BMW();
		b.autoParking();
	}
}
