package Encapsulation_Assignment;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();
		acc1.setAccountNumber("87689754577568");
		acc1.setBalance(24456.23);
		acc1.setOwner("Sheema");
		
		acc1.deposit(100);
		acc1.deposit(500);
		acc1.withdraw(10);
		
		acc1.printStatement();

	}

}
