package Inheritance_Assignments;

public class Max extends Hospital{

	@Override
	public void reports() {
		System.out.println("Max -- Medical Reports");
	}
	
	@Override
	public void doctorsSalary() {
		System.out.println("Max -- Doctors Salary");
	}
	
	//individual
	public void medicines() {
		System.out.println("Max -- Medicines");
	}
	
	//Composition - Calling a sibling class method by creating an object of the class
	public void maxAdministration() {
	Apollo a = new Apollo();
	a.administration();
	
	}
}
