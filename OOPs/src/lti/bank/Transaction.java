package lti.bank;

public class Transaction {
	public String type;
	protected double amount;
	protected double balance;

	public Transaction() {
	}

	public Transaction(String type, double amount, double balance) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return type + "\t" + amount + "\t" + balance;
	}
	
	

}
