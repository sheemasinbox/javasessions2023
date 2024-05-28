package OOP_Abstraction;

public class AppTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage(10); //JVM calls default hidden const..
		lp.title();
		lp.url();
		lp.pageLoadingTime();
		lp.doLogin("admin", "admin");
		Page.displayLogo();       //Static method preferably called using Classname
//		LoginPage.displayLogo();  -Static method can be called using Child classname also
		lp.footers();
		System.out.println("-------------------");
		
		//Top Casting: Child class obj can be referenced by parent abs class ref variable
		//pg ref can access the methods that came from parent class and overridden methods from parent
		Page pg = new LoginPage();
		pg.title();
		pg.url();
		pg.pageLoadingTime();  //overridden method
		pg.footers();
		pg.displayLogo();
		
		//Down Casting:
		//Not Possible: As cannot create obj of Abstract Class
		
		
	}

}
