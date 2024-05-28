package SuperKeyword;

//In Java, Object Class is super class of all the classes created
//so, object class also has a default const..
public class WebPage extends Page{

	public int speed = 10;
	
	//Constructor
	public WebPage() {
		super(); //calls Object Class
		System.out.println("WebPage -- default Const...");
	}
	
	public WebPage(int i) {
			System.out.println("WebPage Const..." +i);
		}
	
	public void calculateTimeOut() {
		System.out.println("WebPage -- Calculate Time OUt 20");
	}
	
	
	public final void logo() {
			System.out.println("WebPage -- logo");
		}
	
	public static void billing() {
		System.out.println("WebPage -- billing");
	}
}
