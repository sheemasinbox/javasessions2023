package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		String data = null;
		
		try {
			if (data == null)
				throw new MyException("Data not Found");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
