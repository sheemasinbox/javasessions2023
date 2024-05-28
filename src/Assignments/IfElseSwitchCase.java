package Assignments;

public class IfElseSwitchCase {

	public static void main(String[] args) {
		
		//1a.Find greatest number out of 3 numbers
		
		int no1 = 25;
		int no2 = 78;
		int no3 = 87;
		
		if (no1>no2) {
			if (no1>no3) {
				System.out.println("Number1: "+no1+" is greatest");
			}
			else
				System.out.println("Number3: "+no3+" is greatest");
		}
		else if (no2>no3) {
			System.out.println("Number2: "+no2+" is greatest");
		}
		else
			System.out.println("Number3: "+no3+" is greatest");

		//1b.Find the greatest number out of 4 numbers
		
		int n1 = 25;
		int n2 = 78;
		int n3 = 87;
		int n4 = 97;
		
		if (n1>n2) {
			if (n1>n3) {
				if (n1>n4) {
				System.out.println("Number1: "+n1+" is greatest");
				}
				else
					System.out.println("Number4: "+n4+" is greatest");
			}
			else
				System.out.println("Number3: "+n3+" is greatest");
		}
		else if (n2>n3) {
			if (n2>n4) {
			System.out.println("Number2: "+n2+" is greatest");
			}
			else
				System.out.println("Number4: "+n4+" is greatest");
		}
		else if (n3>n4) {
			System.out.println("Number3: "+n3+" is greatest");
		}
		else
			System.out.println("Number4: "+n4+" is greatest");
		
		//Switch Case
		int number = 97;
		
		switch (number) {
		case 25:
			System.out.println("25 is not greatest");
			break;
		case 78:
			System.out.println("78 is not greatest");
			break;
		case 87:
			System.out.println("87 is not greatest");
			break;
		case 97:
			System.out.println("97 is greatest");
			break;	

		default:
			System.out.println("Number is not in the list. Enter a valid number");
			break;
		}
		
		//2.Test whether a number is positive or negative
		
		int num = -11;
		
		if (num>=0) {
			System.out.println(num+" is a positive number");
		}
		else
			System.out.println(num+" is a negative number");
		
		//3.Check no. is Odd/Even using If-Else
		
		int no = 99;
		
		if (no%2==0) {
			System.out.println(no+" is Even Number");
		}
		else 
			System.out.println(no+" is Odd Number");
		
		//4.Check if an alphabet character is a vowel/consonant using Switch case
		
		char c = 'A';
		
		switch (c) {
		case 'a':
			System.out.println("'a' is a vowel");
			break;
		case 'e':
			System.out.println("'e' is a vowel");
			break;
		case 'i':
			System.out.println("'i' is a vowel");
			break;
		case 'o':
			System.out.println("'o' is a vowel");
			break;
		case 'u':
			System.out.println("'u' is a vowel");
			break;
		case 'A':
			System.out.println("'A' is a vowel");
			break;
		case 'E':
			System.out.println("'E' is a vowel");
			break;
		case 'I':
			System.out.println("'I' is a vowel");
			break;
		case 'O':
			System.out.println("'O' is a vowel");
			break;
		case 'U':
			System.out.println("'US' is a vowel");
			break;

		default:
			System.out.println(c+" is a consonant");
			break;
		}
		
		//5.Run TC's in specific env.- QA, Stage, Dev, UAT, Prod using Switch Case
		
		String env = "Prode";
		
		switch (env) {
		case "QA":
			System.out.println("Launch QA Environment");
			break;
		case "Stage":
			System.out.println("Launch Stage Environment");
			break;
		case "Dev":
			System.out.println("Launch Dev Environment");
			break;
		case "UAT":
			System.out.println("Launch UAT Environment");
			break;
		case "Prod":
			System.out.println("Launch Prod Environment");
			break;

		default:
			System.out.println("Please pass proper Environment");
			break;
		}
		
		//6.Book a car from Uber App using switch case. Type- Mini, Sedan, SUV, Premium.
		
		String carType = "Sedan";
		
		switch (carType.toLowerCase()) {
		case "mini":
			System.out.println("Mini car is booked");
			break;
		case "sedan":
			System.out.println("Sedan car is booked");
			break;
		case "suv":
			System.out.println("SUV car is booked");
			break;
		case "premium":
			System.out.println("Premium car is booked");
			break;

		default:
			System.out.println("Please select the right car type");
			break;
		}
		
		//7.Launch browsers(Chrome, FF, IE, Safari) using If-ElseIf and Switch case
		//Switch Case
		String browser = "Safari";
		
		switch (browser.toLowerCase()) {
		case "chrome":
			System.out.println("Launching Chrome Browser");
			break;
		case "firefox":
			System.out.println("Launching FireFox Browser");
			break;
		case "ie":
			System.out.println("Launching IE Browser");
			break;
		case "safari":
			System.out.println("Launching Safari Browser");
			break;

		default:
			System.out.println("Please pass the right browser name");
			break;
		}
		
		//If-ElseIf
		String browserType = "FireFox";
		
		if (browserType == "Chrome")
			System.out.println("Launching Chrome Browser");
		else if (browserType == "FireFox")
			System.out.println("Launching FireFox Browser");
		else if (browserType == "IE")
			System.out.println("Launching IE Browser");
		else if (browserType == "Safari")
			System.out.println("Launching Safari Browser");
		else
			System.out.println("Please pass the right browser name");
	
		//8.Define the Interest rate on the basis of loan type(Car loan, Housing loan, Personal loan, Education loan) using switch case
		//For Housing loan if the user's salary<35000 USD then print NOT APPLICABLE for Housing loan
		
		String loanType = "Housing loan";
		double salary = 38000;
		float interestRate;
		
		switch (loanType) {
		case "Car loan":
			interestRate = 12.33f;
			break;
		case "Housing loan":
			interestRate = 6.5f;
			if (salary<35000) {
				System.out.println("NOT APPLICABLE for Housing loan");
			return;
			}
			break;
		case "Personal loan":
			interestRate = 8.9f;
			break;
		case "Educational loan":
			interestRate = 5.6f;
			break;

		default:
			System.out.println("Please enter a valid loan type");
			return;
		}
		System.out.println("Interest Rate for "+loanType+" is: "+interestRate+"%");
		
					
		}
		
	}


