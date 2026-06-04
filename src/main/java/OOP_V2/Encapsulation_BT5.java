package OOP_V2;

class ATMAccount{
	 private String ownerName;
	private int balance;

	
	public void setOwnerName( String ownerName ) {
		this.ownerName = ownerName;
	}
	
	public void setbalance(int balance ) {
		if (balance >= 0) {
			this.balance = balance;
		} else {
			this.balance = 0;
		}
	}
	
	public String getownerName() {
		return ownerName;
	}
	
	public int getbalance () {
		return balance;
	}
}

public class Encapsulation_BT5 {
	public static void main(String[] args) {
		ATMAccount atm = new ATMAccount();
		atm.setOwnerName("Alex");
        atm.setbalance(-500);  
        
        System.out.println(atm.getownerName());
        System.out.println(atm.getbalance());
        
	}

}
