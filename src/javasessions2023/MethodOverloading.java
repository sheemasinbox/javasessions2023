package javasessions2023;

public class MethodOverloading {
	
	//Duplicate methods are not allowed
	//Method overloading is Polymorphism [Poly(many)+morphism(forms)]
	//Which method should be called is decided by the compiler based on the value passed.
	//So its also known as compile time polymorphism/ Static Polymorphism/ Static binding.
	
	//Method Overloading is when there are different methods with :
	//1. same name
	//2. different params (diff. no. of params and diff. types of params)
	//3. different sequence of params in case of same number of params
	//4. return type does not matter
	//5. static or non-static does not matter
	
	public void test(String s) { //1 param
		
	}
	
	public void test(String s, String s1) { //2 params
		
	}
	
	public int test(int i) { //differnt data type
		return 100;
	}
	
//	return type does not matter
//	public void test(int i) {  
//		
//	}
	
	public void test(int i, String s) { //different sequence
		
	}
	
	public void test(String s, int i) { //different sequence
		
	}
	
	//Examples:
	//Login for ecomm applications
	public void login(String username) { }
	public void login(String username, String password) { }
	public void login(String username, String password, int otp) { }
	public void login(String username, String password, String role) { }
	
	//Search for an item in Amazon
	public void search(String name) { }
	public void search(String name, String color) { }
	public void search(String name, String color, int price) { }
	
	//Make Payments
	public void makePayments(String paymentMethod) {
		switch (paymentMethod) {
		case "upi":
			
			break;
		case "PayPal":
			
			break;

		default:
			break;
		}
	}
	
	public void makePayments(String cc, int cvv, int otp) {
		
	}
	
	//Uber bookings
	public void booking(String source, String destination) { }
	public void booking(String source, String destination, String carType) { }
	public void booking(String source, String destination, String carType, String paymentType) { }
	
	
	//get
	public void get(String i) {
		System.out.println("hi");
	}
	
	public void get(int i) {
		System.out.println(i);
		System.out.println("int is preferred");
	}
	
	public void get(short i) {
		System.out.println("short i");
	}
	
	public void get(byte i) {
		System.out.println("byte i");
	}
	

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.get(20);                //call by value/argument
		obj.get("hi");              //calls get(String i)
		obj.get(10);                //calls get(int i) as int is given preference 
		obj.get((byte) 10);         //calls get(byte i) as we typecasted it
		obj.get((short) 10);        //calls get(short i)
	}

}
