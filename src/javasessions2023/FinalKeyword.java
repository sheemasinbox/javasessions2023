package javasessions2023;

public class FinalKeyword {

	 final int num = 20;//class var
	
	public static void main(String[] args) {
		
		final int i = 10;//local var is given preference	
		System.out.println(i);
		
		FinalKeyword obj = new FinalKeyword();    //Object of Class is created to call non-static final class variable
		System.out.println(obj.num);
		
		//constant vars are preferably declared in caps with underscore
		final int DAYS_IN_WEEK = 7;
//		int DAYS_IN_WEEK = 7;		//Since it is declared as final, its value cannot be changed
		
		int salary = 100 * DAYS_IN_WEEK;
		System.out.println(salary);

	}

}
