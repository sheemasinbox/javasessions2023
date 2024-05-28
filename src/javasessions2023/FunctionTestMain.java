package javasessions2023;

public class FunctionTestMain {
	
	int i = 10;

	public static void main(String[] sheema) {    //args can be anything
		
		int i = 20;
		System.out.println(i); //Preference is given to local variable

	}
	
	
	//JVM will always check for public static void main(String[] args). It will not accept a return type(void only).
	//It should always be static as static function can be called using only class name and does not require an object to be created.
//	public static int main(String[] args) {
//		
//		System.out.println("hi"); 
//		return 100;
//	}

}
