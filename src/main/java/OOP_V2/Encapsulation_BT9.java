package OOP_V2;

class BankAccount2{
	private String accountName;
	private int balance;
	private int withdrawLimit;
	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public void setBalance(int balance ) {
		if (balance >= 0) {
			this.balance = balance;
		} else {
			this.balance = 0;
		}
	}
	
	public void setWithdrawLimit(int withdrawLimit) {
		if ( withdrawLimit > 0) {
			this.withdrawLimit = withdrawLimit;
		} else if (withdrawLimit<=0) {
			this.withdrawLimit = 100;
			
		}
	}
	
	
}

public class Encapsulation_BT9 {

}
