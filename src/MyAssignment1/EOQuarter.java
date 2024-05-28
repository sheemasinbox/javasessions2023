package MyAssignment1;

public class EOQuarter implements Reports {

	String name;
	int id;
	int age;
	String tests;
	private double bloodtest = 450;
	private double ultrasound = 1450;
	private double ct = 2850;
	private double xray = 300;
	private double urinetest = 180;
	double total;
	
	//Constructor
	public EOQuarter(String name, int id, int age, String tests) {
		this.name = name;
		this.id = id;
		customerData(name, id, age, tests);
	}
	
	public EOQuarter(String name, int id) {
		this.name = name;
		this.id = id;
		fetchDetails(name, id);
	}
	
	public EOQuarter(String Start_Date, String End_Date) {
		sendDetails(Start_Date, End_Date);
	}
	
	
	
	@Override
	public void sendDetails(String Start_Date, String End_Date) {
		System.out.println("Quarterly Report generated for the period: "+Start_Date+" to "+End_Date);
		
	}

	@Override
	public void fetchDetails(String name, int id) {
		System.out.println("Quarterly Test Results updated for: "+name+" id number: "+id);
		
	}

	//Encapsulation
	@Override
	public void customerData(String name, int id, int age, String tests) {
		System.out.println("Customer Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Age: "+age);
		
		switch (tests.toLowerCase().trim()) {
		case "bloodtest":
			System.out.println("EOQ Blood Test: "+bloodtest);
			break;
		case "ultrasound":
			System.out.println("EOQ UltraSound: "+ultrasound);
			break;
		case "ct":
			System.out.println("EOQ CT: "+ct);
			break;
		case "xray":
			System.out.println("EOQ X-Ray: "+xray);
			break;
		case "urinetest":
			System.out.println("EOQ Urine Test: " +urinetest);
			break;

		default:
			System.out.println("EOQ Test not available. Please select correct Test.");
			break;
		}
		
		

	}
}
