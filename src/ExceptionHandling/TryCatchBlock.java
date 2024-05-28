package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.RuntimeException;

public class TryCatchBlock {
	
	String name;

	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try {
			Thread.sleep(5000);   //CE-- Checked Exceptions(Compile time exceptions)
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {  //CE-- Checked Exceptions(Compile time exceptions)
			FileInputStream file = new FileInputStream("/users/test.xml");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
		TryCatchBlock obj = new TryCatchBlock();
		obj = null;
		
		//UNChecked Exceptions - Run time exceptions
		obj.name = "Naveen";   //NPE   //immediately at exception it goes to Catch block
		
		
		System.out.println("start");
		 int i = 9/0;        //AE           //immediately at exception it goes to Catch block
		 System.out.println("Hello");  //doesn't print, 
		}
		//'Exception cannot be the 1st catch block, it will result in unreachable code
//		catch(Exception e) {  
//			System.out.println("AE is coming....");
//			e.printStackTrace();     
//		}
		catch(NullPointerException e) {  //Can also use parent-'Exception' class or grandparent-'Throwable' class
			System.out.println("NPE is coming....");
			e.printStackTrace();     //displays the exception info
		}
		catch(ArithmeticException e) {  
			System.out.println("AE is coming....");
			e.printStackTrace();     
		}
		catch(Exception e) {       //Allowed, but not good code
			System.out.println("AE is coming....");
			e.printStackTrace();     
		}
		
		System.out.println("Bye!");
		
		
		
		
		
		
		
		
		
		
		

	}

}
