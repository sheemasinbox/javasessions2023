package OOP_Encapsulation;

public class LoginPage {
	
	private String userName;
	private String password;
	
	//Constructor -- Setter
	public LoginPage(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	//Setter & Getter
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void doLogin(String userName) {
		if (isValidUserName(userName)) {
			System.out.println("Enter UserName: " +userName);
			System.out.println("Enter Password: " +password);
			System.out.println("User Logged in.");
		}
	}
		
		private boolean isValidUserName(String userName) {
			System.out.println("Checking if User Name is Valid...");
			if (userName.length()>=3) {
				System.out.println("UserName is Valid");
				return true;
			}
				else {
					System.out.println("UserName is not Valid");
				return false;
				}
		}
	}
	

