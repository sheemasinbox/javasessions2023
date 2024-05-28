package InterfaceConcept;

public class InternationalSchool extends University implements USEducationSystem, UKEducationSystem, IndianEducationSystem {

	//Interface - EducationServices
		@Override
		public void curriculum() {
			System.out.println("EducationServices Interface -- Curriculum");
			
		}

		//Indian
		@Override
		public void icse() {
			System.out.println("IS -- Indian -- Indian Certificate of Secondary Education");
			
		}

		@Override
		public void cbse() {
			System.out.println("IS -- Indian -- Central Board of Secondary Education");
			
		}

		@Override
		public void igcse() {
			System.out.println("IS -- Indian -- International General Certificate of Secondary Education");
			
		}

		@Override
		public void ib() {
			System.out.println("IS -- Indian -- International Baccalaureate");
			
		}

		//UK
		@Override
		public void gcse() {
			System.out.println("IS -- UK -- General Certificate of Secondary Education");
			
		}

		@Override
		public void cse() {
			System.out.println("IS -- UK -- Certificate of Secondary Education");
			
		}

		//US
		@Override
		public void aeb() {
			System.out.println("IS -- US -- American Education Board");
			
		}

		@Override
		public void highSchool() {
			System.out.println("IS -- US -- High School");
			
		}

		@Override
		public void fbise() {
			System.out.println("IS -- US -- Federal Board of Intermediate and Secondary Education");
			
		}

	
}
