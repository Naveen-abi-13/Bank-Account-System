public class BankApp {
	public static void main(String[] args) {
		SavingsAccount acc = new SavingsAccount(101, "Naveen", 100000, 5.0);
		System.out.println("Account Number : " + acc.getAccountNumber());
		System.out.println("Account Holder Name : " + acc.getAccountHolderName());
		System.out.println("Balance : " + acc.getBalance());
		System.out.println("Interest Amount : " + acc.calculateInterest());
		acc.addInterest();
		System.out.println("Total Balance : " + acc.getBalance());
		acc.deposit(3250.50);
		acc.withdraw(57.2);
	}
}
