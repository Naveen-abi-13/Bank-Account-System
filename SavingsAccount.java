public class SavingsAccount extends Account {
	private double interestRate;
	SavingsAccount(int AccNo, String AccName, double bal, double interestRate){
		super(AccNo, AccName, bal);
		this.interestRate = interestRate;
	}
	public double calculateInterest() {
		double balance = getBalance();
		double interest = balance * interestRate / 100;
		return interest;
	}
	public void addInterest() {
		double currentBalance = getBalance();
		double interest = calculateInterest();
		setBalance(currentBalance + interest);
	}
	
}
