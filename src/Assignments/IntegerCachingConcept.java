package Assignments;

public class IntegerCachingConcept {

	public static void main(String[] args) {
		
		Integer num1 = 127;
		Integer num2 = 127;
		
		//Integer range is from -128 to 127. If both numbers are between this range == operator works well, else does not.
		// This is called Integer Caching.
		//for every other number should always use num1.equals(num2). As, == compares the address of the variables.
		
		if (num1 == num2) {
			System.out.println("The numbers are equal");
		}
		else
			System.out.println("The numbers are not equal");

	}

}
