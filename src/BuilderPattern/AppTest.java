package BuilderPattern;

//Caller Class
public class AppTest {

	//Caller Method or User Method
	public static void main(String[] args) {
		
		//When no default constructor is written -> Java will add one default hidden const..
		//But when already consts... are created then Java wil not create any default const..
		//In that case, we cannot create objects for default const..
		
		EcommApplication app = new EcommApplication(); 
		app.login("sheema", "sheema@123")
			.search("Apple MacBook Pro")
				.addToCart("Apple MacBook Pro")
					.payment("2121 4367 8765 9818", 231)
						.getOrderId()
							.logOut();

		System.out.println("-----------------");
		app.login("Sheema", "Sheema@123")
			.search("TShirt", "Black")
				.logOut();
		
		System.out.println("-----------------");
		app.login("Admin", "Admin@123", "Admin")
			.search("Jean", "Blue", 799)
				.addToCart("Jeans")
					.payment("GPay")
						.getOrderId()
							.logOut();
		
		System.out.println("-----------------");
		app.login("Admin", "Admin@123", "Admin")
			.search("Jean", "Blue", 799)
				.search("Shirt", "Black", 999)
					.search("Skirt", "green", 599)
						.logOut();
		
		System.out.println("-----------------");
		app.login("Admin", "Admin@123", "Admin")
				.logOut();
		
		System.out.println("-----------------");
		app.login("Admin", "Admin@123", "Admin");
				
		System.out.println("-----------------");
		app.logOut();
		
		//You can also call the methods directly instead of using the above Builder pattern
		System.out.println("-----------------");
		app.login("Admin", "Admin@123", "Admin");
		app.search("toys");
		app.addToCart("toys");
		
		
	

	}

}
