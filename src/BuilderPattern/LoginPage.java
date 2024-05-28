package BuilderPattern;

public class LoginPage {
	
	//NS class variables
	String userName;
	String password;
	
	//usecase of a default const... is to initialize default values
	public LoginPage() {
		userName = "admin";  //here not using this keyword as there is no comparison
		password = "admin@123";
	}
	
	public LoginPage(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	//NS ->NS
	public void doLogin() {
		System.out.println("enter username: " +userName);
		System.out.println("enter pwd: " +password);
		System.out.println("Click on login button");
		System.out.println("Logged in");
	}

}
