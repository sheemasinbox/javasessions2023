package Assignments;

public class ShortCircuitLogicalOperators {

	public static void main(String[] args) {
		
		//Check how && and & behaves when values are changed
		int x = 5, y = -15;
		
		if (x > 0 && y > 0 && x < y && x * 2 < y) {      // T && F
			System.out.println("This uses && and short circuits even if one condition is False");
		}
		if (x > 0 & y > 0 & x < y & x * 2 < y) {         // T & F & F & F
			System.out.println("This uses &");
		}
		
		//Check values of a and b and observe results
		boolean a = true;
		boolean b = true;
		
		boolean result = a && b;
		System.out.println(result);
		
		boolean resultVal = a & b;
		System.out.println(resultVal);

	}

}
