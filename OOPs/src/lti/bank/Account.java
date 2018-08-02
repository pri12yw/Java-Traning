package lti.bank;

/***
 * this class represents generalised bank account.
 * @author AE206_PC9
 * @version 1.0
 */
public abstract class Account implements Bank {
	private int actNo;
	private String holder;
	protected double balance;

	private static int INIT_ACNT_NO = 1001;
	protected Transaction[] txns;
	protected int idx;

	public Account() {
	}

	public Account(String holder, double balance) {

		this.actNo = INIT_ACNT_NO++;
		this.holder = holder;
		this.balance = balance;
		// instantiating transaction array for account
		txns = new Transaction[10];
		// adding opening account transaction
		txns[idx++] = new Transaction("OB", balance, balance);
	}

	public void summary() {
		System.out.println("Ac no:" + actNo);
		System.out.println("Holder:" + holder);
		System.out.println("Balance:" + balance);

	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
		txns[idx++] = new Transaction("Cr", amount, balance);
	}


	//public void withdraw(double amount);
	
	
	public void statement() {
	System.out.println("statement of a/c:" +actNo);	
	
	for(int i=0; i<idx;i++) {
		System.out.println(txns[i]);
		
		
		}
	}
	
}	
	
	
	
