package OOP_Encapsulation;

public class AppLoginTest {

	public static void main(String[] args) {
	
		LoginPage lp = new LoginPage("Sheema", "Sheema@123");
		
		lp.doLogin(lp.getUserName());
		
		lp.setPassword("Farheen@123");
		
		System.out.println(lp.getPassword());
		
		lp.doLogin(lp.getUserName());

		//Caling methods from Utility Class with private const.. by making them Static
		Utility.launchBrowser();
		
	}

}
