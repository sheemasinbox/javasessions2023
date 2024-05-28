package Inheritance_Assignments;

public class Fortis extends Hospital{

	@Override
	public void billing() {
		System.out.println("Fortis -- Billing Info");
	}
	
	@Override
	public void doctorsSalary() {
		System.out.println("Fortis -- Doctors Salary");
	}
	
	//individual
	public void medicalEquipment() {
		System.out.println("Fortis -- Medical Equipment");
	}
	
}
