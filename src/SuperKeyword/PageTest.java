package SuperKeyword;

public class PageTest {

	public static void main(String[] args) {
		
		HomePage hp = new HomePage();
		hp.calculateTimeOut();
		System.out.println("----------------------------");

		HomePage hp1 = new HomePage(50);
		System.out.println("----------------------------");
		
		Hospital h = new Hospital();
		h.treatment();
	}

}
