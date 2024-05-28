package Constructor_Assignments;

public class Car {

	String make;
	String model;
	int year;
	
	public Car(String make,String model, int year ) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public Car() {
		System.out.println("Car -- Default Constructor");
	}
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		System.out.println(c1.make+" "+c1.model+" "+c1.year);
		
		Car c2 = new Car("Honda", "HR-V", 2024);
		System.out.println(c2.make+" "+c2.model+" "+c2.year);
		
		c1.make = "Chevrolet";
		c1.model = "Spark";
		c1.year = 2009;
		System.out.println(c1.make+" "+c1.model+" "+c1.year);
		
		Car c3 = new Car("BMW","E-Class", 2023);
		System.out.println(c3.make+" "+c3.model+" "+c3.year);
		

	}

}
