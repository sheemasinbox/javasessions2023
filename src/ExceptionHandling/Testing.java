package ExceptionHandling;

public class Testing {
	
	public static void waitTime(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			
		}
	}

	public static void main(String[] args) {
	
		waitTime(1000);
		waitTime(3000);
		waitTime(10000);
		waitTime(5000);

	}

}
