package MapConcept;

import java.util.HashMap;

import ExceptionHandling.MyException;

public class UserRole {
	
	//SRP - Single Responsibility Pattern : Each method has only 1 responsibility Pattern
	
	//login with un and pwd -- external user
	public void doLogin(String un, String pwd) {
		System.out.println("user log in with : " +un+ " - " +pwd);
	}
	
	//role based login - Single Sign On method
	public void doLogin(String role) {
		String creds = getUserCreds(role);
		String un = creds.split(":")[0].trim();
		String pwd = creds.split(":")[1].trim();
		doLogin(un, pwd);
	}
	
	private HashMap<String, String> getUserMap() {
		HashMap<String, String> userMap = new HashMap<String, String>();
		userMap.put("admin", "admin:admin123");
		userMap.put("seller", "seller:seller123");
		userMap.put("vendor", "vendor:vendor123");
		userMap.put("partner", "partner:partner123");
		userMap.put("user", "sheema:sheema@123");
		return userMap;
	}
	
	private String getUserCreds(String role) {
		
		if(getUserMap().containsKey(role)) {
			return getUserMap().get(role);
		}
		else {
			throw new MyException("Role not found");
		}
	}
	

	public static void main(String[] args) {
	
		//Amazon - RBAC - Role Based access control
		//UserManagement - IAM
		
//		String role = "manager";   //NullPointerException
		String role = "admin";
		UserRole app = new UserRole();
		
		String creds = app.getUserCreds(role);       //admin:admin123
		System.out.println(creds);
		String cred[] = creds.split(":");
		String un = cred[0].trim();
		String pwd = cred[1].trim();	
		
		app.doLogin(un, pwd);
		
		app.doLogin("admin");    //Single-SignOn -- internal user

		app.doLogin("Harry", "Harry#123");
		
	}

}
