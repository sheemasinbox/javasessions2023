package OOP_Inheritance;

public class BMW extends Car {   //BMW -Child class(Sub Class) and Car- Parent class(Super Class)
	
	//Method Overriding  -- Polymorphism (Run Time - Dynamic binding)
	//When you have a method in parent class and the same method in Child class also with 
	//1.the same name.
	//2.the same number and type of parameters.
	//3.the same sequence of parameters.
	//4.the same return type
	//5.the same access modifier
	//But different logic
	//Overridden method will be given preference

	int maxSpeed = 200;
	static int price = 5000;
	
	final int minSpeed = 50;  //Every class can have its own final variable
	
	@Override            //optional - to differentiate the methods
	//start() method from parent class -Car is overridden
	public void start() {
		System.out.println("BMW --- Start");
	}
	
	
	public void autoParking() {
		System.out.println("BMW- AutoParking");
	}
	
	@Override
	public void billing() {
		System.out.println("BMW -- Billing");
	}
	
//	@Override     - Static method cannot be overridden
	//Method hiding -- When both parent and Child classes have the same static method with the same signature
	public static void carDisplay() {
		System.out.println("BMW -- display");
	}
	
	//Private methods cannot be overridden as they are not visible outside the class
	//@Override
	private void show() {
		System.out.println("car -- show");
	}
	
	//Final Methods cannot be Overridden
//	public final void runFourWheels() {
//		System.out.println("car -- all run on 4 wheels only -FINAL");
//	}
	

}
