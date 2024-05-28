package Constructor_Assignments;

public class Rectangle {
	
	double length;
	double width;
	
	public Rectangle() {
		System.out.println("Default Constructor "+length+" "+width);
		System.out.println("No rectangle created, area 0");
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		System.out.println("The length is: "+length);
		System.out.println("The width is: "+width);
		calculateArea(length, width);
		
		//Eg of Constuctor calling a method from another class(Person)
		Person p = new Person("Sheema");
//		p.personName("Sheema");
		p.personName(p.name);
	}
	
	public double calculateArea(double length, double width) {
		double area = length*width;
//		System.out.println("The area of a rectangle is: "+area);
		return area;
	}

}
