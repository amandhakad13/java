class BankAccount {
	private String accountNumber;
	private float balance;
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public float getBalance() {
		return balance;
	}
}

class Test2 {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		
		b.setAccountNumber("12345872684");
		b.setBalance(10000);
		
		String account = b.getAccountNumber();
		float balance = b.getBalance();

		System.out.println("Account Number = "+account);
		System.out.println("Account Balance = "+balance);
	}
}