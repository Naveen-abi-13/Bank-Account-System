public class Account {
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	Account(int accountNumber, String accountHolderName, double balance){
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
		if(amount > 0) {
			this.balance = balance + amount;
			System.out.println("Deposited: " + amount + " | New Balance: " + balance);
		}
		else {
			System.out.println("Enter a valid amount");
		}
	}
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			this.balance = balance - amount;
			System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
}
