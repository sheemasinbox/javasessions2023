package ExceptionHandling;

//only mutiple catch is allowed. try and finally should be written only once
//ALLOWED
//try - catch(n)-finally
//try - catch(n)
//try - finally

//NOT ALLOWED
//try
//catch - finally
//try(n) - catch - finally
//try - catch - finally(n)

public class FinallyBlockQuestion {
	
	public static int getMarks(String studentName) {
		System.out.println("getting marks for: "+studentName);
		
		if(studentName.equals("rahul")) {
			try {
				int i = 9/3;
				System.exit(1);   //Shut down the JVM   -- 1 is the status
								  //exit() is a static method in SYstem class
								  //never use exit
				return 80;
			} catch (Exception e) {
				System.out.println("ArithmeticException is coming.....");
				return 70;
			}
			finally {
				System.out.println("finally block");
				
				try {
					int i = 9/0;
				} catch (Exception e2) {
					System.out.println("finally block exception");
				}
				finally {
					System.out.println("finally inside a finally");
				}
				
	//			return 60;    --usually we do not return in finally
			}
			
	//		return 90;  --unreachable code
		}
		else if(studentName.equals("om")) {
			
			try {
				int p = 9/0;
			}
			catch(Exception e) {
				return 5;
			}
			finally {
				return 8;
			}
//			return 95;
		}
		else if(studentName.equals("naveen")) {
			return 10;
		}
		else {
			System.out.println("plz pass the right student name...");
			return -1;
		}
	}

	public static void main(String[] args) {
		
		int m = getMarks("rahul");
		System.out.println(m);

	}

}
