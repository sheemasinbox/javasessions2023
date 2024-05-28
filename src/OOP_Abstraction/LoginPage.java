package OOP_Abstraction;

public class LoginPage extends Page{

	//Child Class Const
	public LoginPage() {
		System.out.println("LP -- Const..");
	}
	
	public LoginPage(int i) {
		System.out.println("LP -- Const.."+i);
	}
	
	
	//Always Abstarct methods from parent should be implemented/overridden in child class
	@Override
	public void title() {
		System.out.println("LP -- title");
		
	}

	@Override
	public void url() {
		System.out.println("LP -- url");
		
	}

	//separately overridden
	@Override
	public void pageLoadingTime() {
		System.out.println("page -- loading time out - 5secs");
	}
	
	//individual methods
	public void doLogin(String un, String pwd) {
		System.out.println("login with: "+un+" "+pwd);
	}
	
	
	//NOTE: Constructors
	//1. Parent Abs class has COnst. and Child Class has No COnst.
	//The COnst in the Parent is called when Child Class Obj. is created in the caller class.
	//JVM from caller class(AppTest) calls the default hidden const.
		//Default hidden const. calls the const. in the Parent Page class
	
	//2. BOth Parent Abs class and Child class has const
	//Both constructors are called when obj of child class is created. (1st Parent const - then child const)
	//Control first checks if child class has const then it goes to the Parent class, enters the const and then the child const
	
}
