package OOP_Inheritance;

public class Audi extends Car {
	//Child cannot have multiple parents, so Audi can extend only 1 parent class

	//individual method
	public void theftSafety() {
		System.out.println("Audi--Theft Safety");
	}
	
	//Overriden method from Vehicle Grandparent
	@Override
	public void engine() {
		System.out.println("Audi -- engine");
	}
}
