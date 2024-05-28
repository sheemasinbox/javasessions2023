package javasessions2023;

public class MethodChaining {
	
	//----------------------------------Stack Overflow Error---------------------------------
	
	//Static Methods --  Stored in Common Memory Allocation (CMA)
	public static void t1() {
		System.out.println("t1 method");
		t2();           //Static methods can call each other directly
	}
	
	public static void t2() {
		System.out.println("t2 method");
		t3();
	}
	
	public static void t3() {
		System.out.println("t3 method");
		
		//Static methods calling NS methods using object of class
		MethodChaining mc = new MethodChaining();
		mc.m1();
		
	}
	
	//Non-Static Methods -- Stored in Heap Memory
	public void m1() {
		System.out.println("m1 method");
		m2();             //NS methods can call each other directly
	}
	
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	
	public void m3() {
		System.out.println("m3 method");
		t1();   //Call static methods directly
	}

	public static void main(String[] args) {
		
		MethodChaining.t1();  //calling static method
		
		//calling non-static method
		MethodChaining obj = new MethodChaining();
		obj.m1();
		
		//s - s --> class name.method name/directly
		//NS -- NS --> directly
		//s - NS --> create the object
		//NS -- s --> class name.method name/directly
		//main -- s --> class name.method name/directly
		//main -- NS --> create the object

	}

}
