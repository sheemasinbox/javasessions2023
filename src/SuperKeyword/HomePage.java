package SuperKeyword;

public class HomePage extends WebPage {

	public int speed = 50;
	
	//Constructor
	//super keyword calls the parent class const..
	//super keyword should be the first statement of the child class const...
	//this keyword calls the same class const...
	//super and this cannot be together as both should be 1st stmt
		
	public HomePage() {
//			super();  //It will go to the default parent const
			super(10); //It will go to the parametrized parent const and not default in this case   
			System.out.println("HomePage -- default Const...");
			super.calculateTimeOut();        //super. can be used
			System.out.println(super.speed);
		}
		
		public HomePage(int i) {
			super(i+10);
			System.out.println("HomePage Const..." +i);
		}
		
		@Override
		public void pagePanel() {
			System.out.println("HomePage Panel");
		}
		
		//Method Hiding
		public static void billing() {
			System.out.println("WebPage -- billing");
		}
		
		
	
	@Override
	public void calculateTimeOut() {
		super.calculateTimeOut();  //call parent class methods which are overridden
		System.out.println("HomePage -- Calculate Time OUt 5");
		super.logo();   //call parent class methods
		System.out.println(super.speed);  //direct Parent class variable
										//if parent does not have the value, it will go to GrandParent class
		super.speed = 20;
		System.out.println(speed);        //same class speed
		System.out.println(this.speed);   //same class speed
		
		super.pagePanel();   //inherited from GrandParent Page
		super.billing();     //super doesn't create an object and calls from parent
		WebPage.billing();   //Preferable with classname
		HomePage.billing();  //Preferable with classname
		this.billing();   //Since this keyword refers to the current class object, it throws an error- Not recommended
		
		
	}
	
	//super:
	//1. is used to call parent class const..
	//2. is used to access parent class methods and variables
	//in const.. super and this cannot be used together
	//in method.. super and this can be used together
	//in const.. super and this keyword should be the 1st stmt
	//in methods super need not be 1st stmt
	
	
	
	
}
