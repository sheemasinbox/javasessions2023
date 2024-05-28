package OOP_Encapsulation;

public class Utility {

	//Private Constructor
	//no one can create an object of the class as its a private const..
	private Utility() {
		
	}
	
	
	//So we can declare methods as Static and call it using ClassName or directly(if calling from the same class)
	public static void launchBrowser() { 
		System.out.println("launch Browser");
//		return this;                    //Not possible as this always refers to the current class object
		                                //and object cannot be created as the COnst.. is private
										//so Builder Pattern not possible
	}
	
	public static void checkBrowserVersion() {
		System.out.println("Checking Browser Version");
	}
}
