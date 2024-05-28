package Inheritance_Assignments;

public class Apollo extends Hospital{

	@Override
	public void billing() {
		System.out.println("Apollo -- Billing Info");
	}
	
	@Override
	public void reports() {
		System.out.println("Apollo -- Medical Reports");
	}
	
	//individual
	public void administration() {
		System.out.println("Apollo -- Administration");
	}
}
