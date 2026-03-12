package entities;

public class Bank {
	private int numberAccount;
	private String nameAccount;
	private double balance;

	public Bank() {		
	}
	
	public Bank(int numberAccount, String nameAccount) {
		this.numberAccount = numberAccount;
		this.nameAccount = nameAccount;
	}
	
	public Bank(int numberAccount, String nameAccount, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.nameAccount = nameAccount;
		deposit(initialDeposit);
	}

	public double getNumberAccount() {
		return numberAccount;
	}

	public String getNameAccount() {
		return nameAccount;
	}

	public void setNameAccount(String nameAccount) {
		this.nameAccount = nameAccount;
	}

	public double getBalance() {
		return balance;
	}

	public String toString() {
		return "Account " + this.numberAccount + ", Holder: " + this.nameAccount + ", Balance: $ "
				+ String.format("%.2f", this.balance);
	}
	
	public void deposit(double initialDeposit) {
		balance += initialDeposit;
	}
	
	public void withdraw(double withdraw) {
		double tax = 5.0;
		balance -=  (withdraw + tax);
	}
}
