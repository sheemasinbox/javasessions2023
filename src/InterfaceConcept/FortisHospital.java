package InterfaceConcept;

//child -- parent class(1) -- parent interfaces(n)
//FortisHospital extends parent Hospital class and implements Interfaces - USMedical, UKMedical, IndianMedical
public class FortisHospital extends Hospital implements USMedical, UKMedical, IndianMedical {

	//US
	@Override
	public void physioServices() {
		System.out.println("FH -- physioServices");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH -- OncologyServices");
		
	}

	@Override
	public void pediaServices() {
		System.out.println("FH -- PediaServices");
		
	}

	//UK
	@Override
	public void cardioServices() {
		System.out.println("FH -- cardioServices");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("FH -- dentalServices");
		
	}

	//India
	@Override
	public void gynaecServices() {
		System.out.println("FH -- gynaecServices");
		
	}

	@Override
	public void radiologyServices() {
		System.out.println("FH -- radiologyServices");
		
	}
	
	//FH - Individual Methods
	public void OPTServices() {
		System.out.println("FH -- Individual -- OPTServcies");
	}
	
	public void pathologyServices() {
		System.out.println("FH -- Individual -- PathologyServcies");
	}

	//Common MEthod should be Overridden only once from the last Interface
	//Can use Switch case in business logic
	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices");
		
	}
	
	//Method HIding - static method from parent with exactly same signature
	public static void billing() {
		System.out.println("FH -- billing");
	}
	
	//Default method overridden from USMedical Interface
	@Override
	public void medicalInsurance() {
		System.out.println("USM -- medicalInsurance");
	}

	//Method from 'WHO' interface - parent of USMedical Interface
	@Override
	public void covidVaccination() {
		System.out.println("FH -- USMedical -- WHO -- covidVaccination");
		
	}
	

	

}
