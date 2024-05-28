package InterfaceConcept;

public class EducationTest {

	public static void main(String[] args) {
		
		InternationalCollege ic = new InternationalCollege();
		
		//EducationServices methods
		ic.curriculum();
		System.out.println("-------------------------------");
		
		//US overridden methods
		USEducationSystem.course();   //static method
		ic.aeb();
		ic.highSchool();
		ic.fbise();
		System.out.println("-------------------------------");
		
		//UK overridden methods
		ic.gcse();
		ic.cse();
		System.out.println("-------------------------------");
		
		//Indian overridden methods
		ic.icse();
		ic.cbse();
		ic.igcse();
		ic.ib();
		System.out.println("-------------------------------");
		
		ic.rulesRegulations(); //method from parent class University
		
		InternationalSchool is = new InternationalSchool();
		//EducationServices methods
				ic.curriculum();
				System.out.println("-------------------------------");
				
				//US overridden methods
				USEducationSystem.course();   //static method
				ic.aeb();
				ic.highSchool();
				ic.fbise();
				System.out.println("-------------------------------");
				
				//UK overridden methods
				ic.gcse();
				ic.cse();
				System.out.println("-------------------------------");
				
				//Indian overridden methods
				ic.icse();
				ic.cbse();
				ic.igcse();
				ic.ib();
				System.out.println("-------------------------------");
		
		
	}

}
