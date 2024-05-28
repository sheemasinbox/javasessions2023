package InterfaceConcept;

public class InternationalCollege extends University implements USEducationSystem, UKEducationSystem, IndianEducationSystem {

	//Interface - EducationServices
	@Override
	public void curriculum() {
		System.out.println("EducationServices Interface -- Curriculum");
		
	}

	//Indian
	@Override
	public void icse() {
		System.out.println("IC -- Indian -- Indian Certificate of Secondary Education");
		
	}

	@Override
	public void cbse() {
		System.out.println("IC -- Indian -- Central Board of Secondary Education");
		
	}

	@Override
	public void igcse() {
		System.out.println("IC -- Indian -- International General Certificate of Secondary Education");
		
	}

	@Override
	public void ib() {
		System.out.println("IC -- Indian -- International Baccalaureate");
		
	}

	//UK
	@Override
	public void gcse() {
		System.out.println("IC -- UK -- General Certificate of Secondary Education");
		
	}

	@Override
	public void cse() {
		System.out.println("IC -- UK -- Certificate of Secondary Education");
		
	}

	//US
	@Override
	public void aeb() {
		System.out.println("IC -- US -- American Education Board");
		
	}

	@Override
	public void highSchool() {
		System.out.println("IC -- US -- High School");
		
	}

	@Override
	public void fbise() {
		System.out.println("IC -- US -- Federal Board of Intermediate and Secondary Education");
		
	}

}
