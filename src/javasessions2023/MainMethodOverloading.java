package javasessions2023;

public class MainMethodOverloading {

	public static void main(String[] args) {   //JVM will call only psvm(String[] args) 
		
		System.out.println("This is Main() method");
		
		//Calling the overloaded Static main() methods directly or using class name
		//No usecase in real time
		main(10);
		MainMethodOverloading.main(true, 5);
		main(20, false);
		MainMethodOverloading.main("Sheema", "Farheen");

	}
	
	public static void main(int i) {
			
			System.out.println("This is Overloaded Main() method with int parameter "+i);
	
		}

	public static void main(boolean s, int i) {
		
		System.out.println("This is Overloaded Main() method with boolean and int parameters "+s+i);
	
	}
	
	public static void main(int i, boolean s) {
		
		System.out.println("This is Overloaded Main() method with int and String[] parameters in different sequence");
	
	}

	public static void main(String s, String s1) {
			
			System.out.println("This is Overloaded Main() method with 2 String parameters");
		
		}
	
}
