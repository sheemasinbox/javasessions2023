package Inheritance_Assignments;

public class HospitalTest {

	public static void main(String[] args) {
	
		//parent class object
		Hospital h = new Hospital();
		h.billing();
		h.reports();
		h.doctorsSalary();
		
		System.out.println("---------------------------");
		//child class objects
		Apollo a = new Apollo();
		a.billing();           //Overridden
		a.reports();           //Overridden
		a.doctorsSalary();     //inherited
		a.administration();    //individual
		
		System.out.println("---------------------------");
		Fortis f = new Fortis();
		f.billing();           //Overridden
		f.reports();           //inherited
		f.doctorsSalary();     //Overridden
		f.medicalEquipment();  //individual
		
		System.out.println("---------------------------");
		Max m = new Max();
		m.billing();           //inherited
		m.reports();           //Overridden
		m.doctorsSalary();     //Overridden
		m.medicines();        //individual
		m.maxAdministration();  //Composition

		System.out.println("---------------------------");
		//Top-Casting : Parent reference pointing to child object
		Hospital h1 = new Apollo();   //Every Apollo IS-A Hospital
		h1.billing();              //parent accesses child overridden methods
		h1.reports();
		h1.doctorsSalary();
	
		//Down-Casting :
//		Apollo a1 =  (Apollo) new Hospital();      //ClassCastException in Run-time
		
		//Composition
		
	
		
	}

}
