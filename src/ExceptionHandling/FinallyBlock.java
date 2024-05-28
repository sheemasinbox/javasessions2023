package ExceptionHandling;

//FinallyBlock - always used with try catch block
public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("hello");
		
		try {
			int i = 9/0;
			System.out.println("Selenium");
		} 
			catch (Exception e) {      ///catch is not mandatory if finally is written
			System.out.println("some exception is coming...");
		}
		finally {     //with or without exception - finally is executed
			System.out.println("I am in finally block");
		}
		
		//When to use finally block?
		//finally block will always override the previous returns
		
		//make the connection with DB(SQL): username/pwd
		//hit the SQL: select * from Employee;
		
		//try - catch
		//{String result = get the results from DB/table}
		
		//finally
		//{close the db connection}
		
		//Use the results in script
		//COntinue Code
		//LogOut
		
		//Diff. between final, finally, finalize ?
		//final - keyword
		//finally{ } - Block
		//finalize() - method
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
