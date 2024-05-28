package StringManipulation;

public class StringVsStringBuilderVsStringBuffer {

	public static void main(String[] args) {
		
		//Immutability: immutable, once created cannot be changed
		//Thread-safety: safe due to immutability
		//Performance: Efficient for Constant values
		//Usage Scenario: constant, keys in collections
		//Concatenation ease: use + for concat
		//Memory Efficiency: efficient with String Constant Pool (SCP)
		String tr = "Hello";     //Hello
		tr.concat("Selenium");   //HelloSelenium
		tr.concat("testing");    //HelloSeleniumtesting
		System.out.println(tr);   //Hello -- as String are immutable

		//Immutability: mutable -- any updates/manipulations - preferred for read operations
		//Thread-safety: Not Thread-safe - Ideal for single threaded scenarios
		//Performance: faster for frequent changes
		//Usage Scenario: Building complex strings, frequent modifications
		//Concatenation ease: use append() for concat
		//Memory Efficiency: More memory efficient than string for frequent chnages
		StringBuilder sb = new StringBuilder("Hello"); //1 obj in Heap, no obj in SCP
		sb.append("Selenium");
		sb.append("testing");
		System.out.println(sb); //HelloSeleniumtesting
		
		//Immutability: mutable -- any updates/manipulations - preferred for read/write operations
		//Thread-safety: synchronized for multi-threaded
		//Performance: slower due to synchronization, but necessary in multi-threaded scenarios
		//Usage Scenario: Building complex strings, frequent modifications, multi-threading
		//Concatenation ease: use append() for concat
		//Memory Efficiency: similar to String Builder, but synchronization may add overhead
		StringBuffer sbf = new StringBuffer("Hi!");
		sbf.append("World");
		System.out.println(sbf);
		
	}

}
