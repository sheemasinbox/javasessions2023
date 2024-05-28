package javasessions2023;

public class B {

	public static void main(String[] args) {
		
		System.out.println("Class B - Main");
		
		A.main(args);   //calling main method of Class A -- A is calling B and B is calling A entering an infinite loop-- Stack Overflow Error

	}

}
