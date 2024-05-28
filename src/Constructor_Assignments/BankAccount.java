package Constructor_Assignments;

public class BankAccount {
	
	//Instance Variables
	String accountNumber;
	double balance;
	
	//Constructor
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	//Method
	public double deposit(double value) {
		balance = balance + value;
		return balance;
	}
	
	public double withdraw(double value) {
		balance = balance - value;
		return balance;
	}
	

}
