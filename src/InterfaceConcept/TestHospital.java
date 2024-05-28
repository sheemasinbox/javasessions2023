package InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		//USMedicalMethods
		fh.physioServices();
		fh.oncologyServices();
		fh.pediaServices();
//		USMedical.min_fee = 20;  //cannot be modified as its Final by default
		System.out.println(USMedical.min_fee);
		USMedical.billing();
		FortisHospital.billing();
		fh.covidVaccination();
		System.out.println("------------------------");
		
		
		//UKMedicalMethods
		fh.cardioServices();
		fh.dentalServices();
		System.out.println("------------------------");
		
		//IndianMedicalMethods
		fh.gynaecServices();
		fh.radiologyServices();
		System.out.println("------------------------");
		
		//IndividualMethods
		fh.OPTServices();
		fh.pathologyServices();
		System.out.println("------------------------");
		
		//Cannot create object of Interface only CLass object is allowed
		//Selenium ex: WebDriver is an interface, so
		// WebDriver dr = new WebDriver(); is not allowed
		//USMedical us = new USMedical();
		
		//Top Casting- Child class object can be referred by parent interface ref variable
		//Selenium ex: WebDriver is an interface, so
		// WebDriver dr = new ChromeDriver(); is allowed
		USMedical us = new FortisHospital();
		us.physioServices();
		us.oncologyServices();
		us.pediaServices();
		us.emergencyServices();  //common method
//		us.cardioServices();   //Reference Type Check Fails - UKmethod
		System.out.println("------------------------");
		
		UKMedical uk = new FortisHospital();
		fh.cardioServices();
		fh.dentalServices();
		uk.emergencyServices();  //common method
		System.out.println("------------------------");
		
		//DownCasting - NOt allowed even in COmpile time
		//Creating object of INterface not allowed
//		FortisHospital f = new USMedical();
		
		//Common Method
		fh.emergencyServices();
		System.out.println("------------------------");
		
		//Interface to Interface - Interface/Explicit Casting:
		//Selenium eg: JavaScript executor and WebDriver
		//USMedical ref converting into UKMedical ref which is referenced by uk1
		UKMedical uk1 = (UKMedical)us;
		uk1.cardioServices();
		uk1.dentalServices();
		uk1.emergencyServices();
		
	}

}
