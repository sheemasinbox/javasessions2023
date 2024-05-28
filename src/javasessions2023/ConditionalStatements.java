package javasessions2023;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		System.out.println(x>y); //gives boolean result
		
		if (x>y)
			System.out.println("PASS");
		else
			System.out.println("FAIL");
		
		//Sample dead code
		if (true)
			System.out.println("Hi");
		else                                         //dead code
			System.out.println("unreachable code");
		
		// boolean example
		boolean flag = false;
		if (flag)
			System.out.println("Hi");
		else
			System.out.println("Bye");
		
		int t1 = 100;
		int t2 = 100;
		
		if (t1>t2) {
		System.out.println("t1 is greater than t2");
		}
		
		if (t1 != t2) {
			System.out.println("t1 is not equal to t2");
		}
		
		//Launch correct browser using if
		String browser = "chrome";
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("Launching Chrome browser");
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("Launching firefox browser");
		}
		else if (browser.equalsIgnoreCase("ie")) {
			System.out.println("Launching ie browser");
		}
		else if (browser.equalsIgnoreCase("safari")) {
			System.out.println("Launching safari browser");
		}
		else
			System.out.println("Plz pass the correct browser");
		

	}

}
