package OOP_V2;

class WalletAccount{
	private String ownerName;
	private int money;
	
	public void setownerName( String ownerName) {
		this.ownerName = ownerName;
	}
	
	public void setMoney(int money) {
		if(money >= 0) {
			this.money = money;
		} else {
			this.money = 0;
		}
	}
	
	public String getownerName() {
		return ownerName;
	}
	
	public int getMoney() {
		return money;
	}
	
	
}

public class Encapsulation_BT6 {
	public static void main(String[] args) {
		WalletAccount wall = new WalletAccount ();
		wall.setownerName("Khamko");
		wall.setMoney(-1000);
		
		System.out.println(wall.getownerName());
		System.out.println(wall.getMoney());
	}

}
