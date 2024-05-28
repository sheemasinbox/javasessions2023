package OOP_Inheritance;

public class Automobile extends Mechanical {

	public void design() {
		System.out.println("Automobile -- design");
	}
	
	@Override
	public void horsePower() {
		System.out.println("Automobile -- horsePower");
	}
}
