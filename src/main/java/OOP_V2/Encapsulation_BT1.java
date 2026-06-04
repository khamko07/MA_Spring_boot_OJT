package OOP_V2;


class BankAccount {
	private int balance;
	
	
	public void setBalance (int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
		
	}
}
public class Encapsulation_BT1 {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.setBalance(5000);
		System.out.println(b.getBalance());
	}

}
