package ExceptionHandling;

public class AppTest {

	public static void main(String a[]) {
		String browser = "chrome";
		
		if(browser.equals("chrome")){
			System.out.println("open chrome");
	}
	else if(browser.equals("Firefox")){
			System.out.println("open Firefox");
	}
	else if(browser.equals("safari")){
		System.out.println("open safari");
	}
	else {
	System.out.println("Plz pass right browser");
	throw new MyException("WrongBrowserException");
	}
	
		System.out.println("Launch URL");
	}
	
}
