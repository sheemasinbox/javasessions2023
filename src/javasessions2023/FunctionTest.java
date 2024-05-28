package javasessions2023;

import java.util.ArrayList;

public class FunctionTest {
	
	// WAF: function Name: getStudentMarks
	// input Param: studenName (String)
	// return: marks (int)
	// student not found --> return something
	
	//Function using Switch case
	public int getStudentMarks(String studentName) {
		
		switch (studentName.toLowerCase().trim()) {
		case "hal":
			System.out.println("Getting marks for "+studentName+": ");
			return 90;
		//	break;      since we are using return, break should be deleted
		case "tim":
			System.out.println("Getting marks for "+studentName+": ");
			return 78;
		case "cal":
			System.out.println("Getting marks for "+studentName+": ");
			return 85;
		case "dia":
			System.out.println("Getting marks for "+studentName+": ");
			return 56;
		case "mil":
			System.out.println("Getting marks for "+studentName+": ");
			return 92;
		default:
			System.out.println("Student "+studentName+" not found.");
			return -1;
		}
	}
	
	//Function using if...else..
	public int getMarks(String studentName) {
		
		int marks = -1;
		if (studentName.trim().equalsIgnoreCase("Henry")) {
			System.out.println("Here are Marks for: "+studentName);
			marks = 78;
		}
		else if (studentName.trim().equalsIgnoreCase("Bonney")) {
			System.out.println("Here are Marks for: "+studentName);
			marks = 87;
		}
		else if (studentName.trim().equalsIgnoreCase("billy")) {
			System.out.println("Here are Marks for: "+studentName);
			marks = 66;
		}
		else
			System.out.println("Student "+studentName+ " not found");
		return marks;
	}
	
	    // WAF: launchBrowser (name)
		// input param: String browserName
		// return: true/false (boolean)
	public boolean launchBrowser(String browserName) {
		
		switch (browserName.trim().toLowerCase()) {
		case "ie":
			System.out.println("Launching browser: "+browserName);
			return true;
		case "ff":
			System.out.println("Launching browser: "+browserName);
			return true;
		case "chrome":
			System.out.println("Launching browser: "+browserName);
			return true;
		default:
			System.out.println("Browser "+browserName+" not found");
			return false;
		}
	}
	
		// WAF:
		// function name: getDevicesList
		// input param: empName
		// return: ArrayList<String> devicesList
	
	public ArrayList<String> getDevicesList(String empName) {
		
		ArrayList<String> devicesList = new ArrayList<String>(); //vc=10, pc=0
		
		switch (empName.trim().toLowerCase()) {
		case "moana":
			devicesList.add("MacBook");
			devicesList.add("iPhone");
			devicesList.add("iPad");
			break;
		case "mina":
			devicesList.add("MacBook");
			break;
		case "jana":
			devicesList.add("iPhone");
			devicesList.add("iPad");
			break;

		default:
			System.out.println("Employee "+empName+" not found");
			break;
		}
		return devicesList;
	}

	public static void main(String[] args) {
		
		FunctionTest fun = new FunctionTest();
		int marks = fun.getStudentMarks("soo");
		if (marks == -1) {
			System.out.println("Please enter correct name");
		}
		else {
			System.out.println("Generate MarkSheet");
			System.out.println(marks);
		}
		System.out.println("---------------------------------");
		
		int marks1 = fun.getMarks("Billy");
		if (marks1 == -1) {
			System.out.println("Enter Correct Name");
		}
		else
		System.out.println(marks1);
		System.out.println("---------------------------------");
		
		fun.launchBrowser("ww");
		System.out.println("---------------------------------");
		
		ArrayList<String> devices = fun.getDevicesList("Mona");
		if (devices.size()>0) {
		System.out.println(devices);
		System.out.println(devices.size());
		}
		else
			System.out.println("Enter correct employee name.");
		System.out.println("---------------------------------");
		
		
		
	}

}
