package javasessions2023;

public class A {

	public static void main(String[] args) {
		
		System.out.println("Class A - main");
		
		B.main(args);  //calling main method of Class B  -- A is calling B and B is calling A entering an infinite loop-- Stack Overflow Error

	}

}
