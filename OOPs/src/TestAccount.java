import lti.bank.AccountFactory;
import lti.bank.Bank;

public class TestAccount {

	public static void main(String[] args) {
		Bank sav = AccountFactory.openAccount("savings", "Polo");//no 'new' bcoz cannot be instantiated
		sav.summary();
		
		sav.withdraw(3000);
		sav.withdraw(7000);
		sav.summary();
		
		sav.deposit(2000);
		sav.deposit(4000);
		sav.summary();
	
	}
	

}
