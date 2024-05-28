package javasessions2023;

public class AndOrOperators {

	public static void main(String[] args) {
		
		//MAX NUMBER
		//Find out the max number from 3 different numbers
		
		int a = 100;
		int b = 200;
		int c = 300;
		
		if (a>b && a>c) {   //&& is called short circuit operator. if 1st condition is false then it will not go to the next condition
			System.out.println("a is greatest");
		}
		else if (b>c) {
			System.out.println("b is greatest");
		}
		else
			System.out.println("c is greatest");
		
		//Find out the max number from 3 different numbers
		
		int a1 = 100;
		int b1 = 200;
		int c11 = 400;
		int d1 = 400;
		
		if (a1>b1 && a1>c11 && a1>d1) {   
			System.out.println("a1 is greatest");
		}
		else if (b1>c11 && b1>d1) {
			System.out.println("b1 is greatest");
		}
		else if (c11>a1 && c11>d1)
			System.out.println("c1 is greatest");
		else 
			System.out.println("d1 is greatest");
		
		
		//Grade as per Marks
		int marks = 89;
		if (marks>=90 && marks <=100) {
			if (marks == 100)
				System.out.println("A** - Eligible for Scholarship");
			else
				System.out.println("A* Grade");
		}
		else if (marks>=70 && marks<=89) {
			if (marks>=80 ) {
			System.out.println("A+ Grade");
			}
			else
				System.out.println("A Grade");
		}
		else if (marks>=50 && marks<=79) {
			if (marks>=60)
				System.out.println("B Grade");
			else
				System.out.println("C Grade");	
		}
		else if (marks>=35 && marks<=49)
			System.out.println("D Grade");
		else if (marks>=0 && marks<=34)
			System.out.println("Fail");
		else System.out.println("Please pass correct marks");
		

		//
		boolean c1 = false;
		boolean c2 = false;
		boolean c3 = false;
		boolean c4 = false;
		
		//short circuit reason: true
//		if (c1 || c2 || c3 || c4) { 
//		    System.out.println("selenium");
//		}
//		else {
//			System.out.println("Bye");
//		}
		
//		if (c1 | c2 | c3 | c4) { //f | f | f | f ==>f
//		    System.out.println("selenium");
//		}

		//short circuit reason: false
//		if (c1 && c2 && c3 && c4) {//f
//		    System.out.println("selenium");
//		}
		
		if (c1 & c2 & c3 & c4) {//f & f & f & f ==> f
		    System.out.println("selenium");
		}

		//if(isDisplayed & isDisabled & isClickable){ //t & f & f ==> false
			
		//}
		//print / log --> 
		
		//
		int salary = 60;
		if (salary <= 100 | salary <= 10 | salary <= 5) {// true or false or false = true
			System.out.println("PASS");
		}

		// && ||
		// |
		// button on the page:
		// 1. isVisible
		// 2. isEnabled
		// 3. isClickable

		// if(isVisible & isEnabled & isClickable)//T&T&F
		// ---print/log -- useful for logging purpose
		// if(isVisible && isEnabled && isClickable)//F

		// if(isVisible | isEnabled | isClickable)
		// if(isVisible || isEnabled || isClickable)
		
		
	}

}
