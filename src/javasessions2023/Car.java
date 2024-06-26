package javasessions2023;

public class Car {
	
	//Common Value properties of objects are declared as static and stored in CMA (Common Memory Allocation)
		//Local variables cannot be static
		//Static Properties can be accessed in 3 ways - 
		//1. Using Class Name syso(Car.wheels) --Best Way
		//2. Called directly syso(wheels)
		//3. Using object name syso(c1.wheels) - But this will throw a warning - "Static properties should be accessed in a static way"
	//Java will create copies of non-static properties and assign it to objects.
	
	String name;
	String licenseNumber;
	double price;
	String color;
	static final int wheels = 4;

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name = "BMW";
		c1.licenseNumber = "12121";
		c1.price = 80.11;
		c1.color = "Red";

		Car c2 = new Car();
		c2.name = "Audi";
		c2.licenseNumber = "3232";
		c2.price = 82.11;
		c2.color = "Black";

		Car c3 = new Car();
		c3.name = "Honda";
		c3.licenseNumber = "4343";
		c3.price = 22.11;
		c3.color = "White";	
		
		int totalPrice = Car.wheels * 100;
		System.out.println(totalPrice);
	
		//how to access static var:
			//1. using class name:  (RECOMMENDED)
			System.out.println(Car.wheels);
			
			System.out.println(c1.name + " "+ c1.licenseNumber + " " + c1.price + " " + c1.color + " " + Car.wheels);

			System.out.println(c2.name + " "+ c2.licenseNumber + " " + c2.price + " " + c2.color + " " + Car.wheels);
			
			//2. directly:
			System.out.println(wheels);
			
			//3. can I access static var using object ref name? 
			System.out.println(c1.wheels);

	}

}
