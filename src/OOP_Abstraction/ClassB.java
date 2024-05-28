package OOP_Abstraction;

public class ClassB extends ClassA {

	public ClassB() {
		System.out.println("ClassB Constructor");
		System.out.println("It first goes to Parent Constructor and then Child Constructor");
	}
	
	@Override
	public void aMethod() {
		super.aMethod();       //parent method
		System.out.println("ClassA Method overridden in ClassB");
		
	}
}
