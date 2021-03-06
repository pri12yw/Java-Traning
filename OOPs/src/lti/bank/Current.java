package lti.bank;

public class Current extends Account {
	private double overdraft;

	public Current() {
	}

	public Current(String holder) {
		super(holder, INIT_CUR_BAL);
		this.overdraft = 10000;
	}

	@Override
	public void deposit(double amount) {

		overdraft += amount;
		if (overdraft > OVERDRAFT_AMT) {
			balance += overdraft - OVERDRAFT_AMT;
			overdraft = OVERDRAFT_AMT;
		}
		txns[idx++] = new CurrentTransaction("Cr", amount, balance,overdraft);
	}

	@Override
	public void withdraw(double amount) {
		if (amount <= (balance + overdraft)) {
			balance -= amount;
			if (balance < MIN_CUR_BAL) {
				overdraft += balance;
				balance =MIN_CUR_BAL;
				txns[idx ++] = new CurrentTransaction("Db",amount,balance,overdraft);
			}
		} else {
			System.out.println("Insufficient funds");

		}
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft: " + overdraft);
	}
	
}
