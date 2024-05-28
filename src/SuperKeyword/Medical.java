package SuperKeyword;

public interface Medical {

	int min_fee = 10;
	
	public void covid();
	
	public static void testing() {
		System.out.println("Medical Testing");
	}
	
	default void bloodTest() {
		System.out.println("Medical -- BloodTest");
	}
	
}
