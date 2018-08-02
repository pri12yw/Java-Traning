package lti.bank;

public class CurrentTransaction extends Transaction {
 private double od;
	
	public CurrentTransaction() {
	}

	public CurrentTransaction(String type, double amount, double balance,double od) {
		super(type, amount, balance);
		this.od = od;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return type + "\t" + amount + "\t" + balance + "\t"+ od;
	}
	

}
