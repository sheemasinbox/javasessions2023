package Encapsulation_Assignment;

public class BankAccount {
	
	private String accountNumber;
	private double balance;
	private String owner;
	
	//Getters
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public String getOwner() {
		return owner;
	}
	
	//Setters
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	//Methods
	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}
	
	public double withdraw(double amount) {
		balance = balance - amount;
		return balance;
	}
	
	public void printStatement() {
		System.out.println(accountNumber+" "+balance+" "+owner);
	}
	
	
	
	

}
