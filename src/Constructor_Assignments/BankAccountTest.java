package Constructor_Assignments;

public class BankAccountTest {

	public static void main(String[] args) {
		
		double bal1;
		
		BankAccount acc = new BankAccount("1234567890", 10987);
		
		bal1 = acc.deposit(500);  //deposit
		System.out.println("Balance after deposit1 is: " +bal1);
		
		bal1 = acc.deposit(100);  //deposit
		System.out.println("Balance after deposit is: " +bal1);

		bal1 = acc.withdraw(50); //withdraw
		System.out.println("Balance after deposit is: " +bal1);
		
		bal1 = acc.withdraw(122); //withdraw
		System.out.println("Balance after deposit is: " +bal1);
		
		bal1 = acc.withdraw(bal1); //withdraw the entire balance
		System.out.println("Balance after deposit is: " +bal1);
		
		bal1 = acc.deposit(5000);  //deposit
		System.out.println("Balance after deposit1 is: " +bal1); //5000
		
		
	}

}
