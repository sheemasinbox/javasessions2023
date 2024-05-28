package ExceptionHandling;

public class Employee{
	
	//amazon -- add to cart method
	public void m1(int a, int b) {
		System.out.println("m1 method");
		m2(a,b);
	}
	
	//amazon-payment
	public void m2(int a, int b){
		System.out.println("m2 method");
		try {
		m3(a,b);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("AE is coming...");
		}
		
	}
	
	//HDFC bank server method
	//throws keyword doesn't handle the exception and throws it to the caller method
	public void m3(int a, int b) throws ArithmeticException{  //incorrect exception name is allowed here and it gets handled in the caller trycatchblock
		System.out.println("m3 method");
		int i = a/b;
		System.out.println("payment");
	}
	

	public static void main(String[] args){
		
		Employee obj = new Employee();
		obj.m1(9,0);
		
		//Not a good practise to handle exceptions at the user level
//		try {
//			obj.m1();
//		}
//		catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
		
		
		System.out.println("Bye!");

	}

}
