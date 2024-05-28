package ExceptionHandling;

//Throwable - Exception - RuntimeException - ArithmeticException, NullPointerException, etc....
//RuntimeException from Java.lang package
//Customized Exception created
public class MyException extends RuntimeException{

	public MyException(String msg) {
		super(msg);
	}
	
	
	
}
