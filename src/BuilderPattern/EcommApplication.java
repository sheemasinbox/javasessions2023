package BuilderPattern;

//Methods only, no main class
public class EcommApplication {
	
	public EcommApplication login(String un, String pwd) {    //return type of method - classname
		System.out.println("logged in with: " +un +pwd);
//		return new EcommApplication();    //current class object of type classname
		return this;    //this refers to current class object- object 'app' in the 'AppTest' class 
	}
	
	public EcommApplication login(String un, String pwd, String role) {
		System.out.println("logged in with: " +un +pwd +role);
		return this;
	}

	public EcommApplication search(String productName) {
		System.out.println("search: " +productName);
		return this;
	}
	
	public EcommApplication search(String productName, String color) {
		System.out.println("search: " +productName +color);
		return this;
	}
	
	public EcommApplication search(String productName, String color, int price) {
		System.out.println("search: " +productName +color +price);
		return this;
	}
	
	public EcommApplication addToCart(String productName) {
		System.out.println("Add to Cart: " +productName);
		return this;
	}
	
	public EcommApplication payment(String upi) {
		System.out.println("MAking Payment via: " +upi);
		return this;
	}
	
	public EcommApplication payment(String cc, int cvv) {
		System.out.println("Making payment via cc: " +cc+" "+cvv);
		return this;
	}
	
	public EcommApplication getOrderId() {
		System.out.println("Order is done. OrderId is: " +12345);
		return this;
	}
	
	public EcommApplication logOut() {
		System.out.println("Logged Out");
		return this;
	}
	
	
}
