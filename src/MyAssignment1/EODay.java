package MyAssignment1;

import java.lang.*;

public class EODay implements Reports  {

	@Override
	public void sendDetails(String Start_Date, String End_Date) {
		System.out.println("Daily Report generated for the period: "+Start_Date+" to "+End_Date);
		
	}

	@Override
	public void fetchDetails(String name, int id) {
		System.out.println("Test Results updated for: "+name+" id number: "+id);
		
	}

	@Override
	public void customerData(String name, int id, int age, String tests) {
		System.out.println("Customer Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Age: "+age);
		
		switch (tests.toLowerCase().trim()) {
		case "bloodtest":
			System.out.println("EOD Blood Test: 280");
			break;
		case "ultrasound":
			System.out.println("EOD UltraSound: 600");
			break;
		case "ct":
			System.out.println("EOD CT: 2300");
			break;
		case "xray":
			System.out.println("EOD X-Ray: 500");
			break;
		case "urinetest":
			System.out.println("EOD Urine Test: 200");
			break;

		default:
			System.out.println("EOD Test not available. Please select correct Test.");
			break;
		}
		
	}

	//individual
	public void eodAmount(int a, int b) {
		try {
			System.out.println("The EOD Amount is: "+(a/b));
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception is displayed.....");
			e.printStackTrace();
		}
		
		
		
	}
	
	//individual
	public void messages() {
		String str = "This is the Daily Report. It provides Customer Data and their reports.";
		String str1 = "ultrasound,ct,urinetest,xray,bloodtest";
		System.out.println(str.charAt(0)); //T
		System.out.println(str1.replace(",", "|"));
		System.out.println("Length of String is: "+str.length());
		String[] mystr = str.split(" ");
		System.out.println(mystr.length);
		System.out.println();
		System.out.println(str.indexOf("reports."));
		
		
		for(int i=0; i<mystr.length; i++) {
			System.out.println(mystr[i]);
		}
	
	}
	
	
	
	
}
