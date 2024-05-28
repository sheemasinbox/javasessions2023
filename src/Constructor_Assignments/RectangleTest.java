package Constructor_Assignments;

public class RectangleTest {

	public static void main(String[] args) {
	
		Rectangle r1 = new Rectangle();
		System.out.println(r1.calculateArea(r1.length, r1.width));

		System.out.println("---------------------------------");
		Rectangle r2 = new Rectangle(2, 4);
		double area = r2.calculateArea(2, 4);
	System.out.println("The area of the rectangle is: " +area);
		
		
		
	}

}
