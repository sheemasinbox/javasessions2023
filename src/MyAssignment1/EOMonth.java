package MyAssignment1;

import java.util.ArrayList;
import java.util.Arrays;

import ExceptionHandling.MyException;

public class EOMonth implements Reports  {

	@Override
	public void sendDetails(String Start_Date, String End_Date) {
		System.out.println("Monthly Report generated for the period: "+Start_Date+" to "+End_Date);
		
	}

	@Override
	public void fetchDetails(String name, int id) {
		System.out.println("Monthly Test Results updated for: "+name+" id number: "+id);
		
	}

	@Override
	public void customerData(String name, int id, int age, String tests) {
		System.out.println("Customer Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Age: "+age);
		
		switch (tests.toLowerCase().trim()) {
		case "bloodtest":
			System.out.println("EOM Blood Test: 280");
			break;
		case "ultrasound":
			System.out.println("EOM UltraSound: 600");
			break;
		case "ct":
			System.out.println("EOM CT: 2300");
			break;
		case "xray":
			System.out.println("EOM X-Ray: 500");
			break;
		case "urinetest":
			System.out.println("EOM Urine Test: 200");
			break;

		default:
			throw new MyException("EOM Test not available");
//			System.out.println("EOM Test not available. Please select correct Test.");
//			break;
		}
		
	}
	
	public void testList(int index) {
		ArrayList<String> testlist = new ArrayList<String>(Arrays.asList("UltraSound", "Blood Test", "CT", "Urine Test", "X-Ray"));
		
		try {
			System.out.println("Test Name "+index+" is: "+testlist.get(index));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException is encountered....");
			e.printStackTrace();
		}
		
	}

}
