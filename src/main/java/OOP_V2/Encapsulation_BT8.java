package OOP_V2;



class HotelRoom{
	private  String roomNumber;
	private int price;
	private int guestCount;
	
	public void setroomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public void setprice (int price) {
		if(price >= 0) {
			this.price = price;
		} else {
			this.price = 0;
		}
	}
	
	public void setguestCount(int guestCount) {
		if(guestCount > 0) {
			this.guestCount = guestCount;
		} else {
			this.guestCount = 1;
		}
		
	}
	
	public String getroomNumber() {
		return roomNumber;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getguestCount() {
		return guestCount;
	}
}

public class Encapsulation_BT8 {
	public static void main(String[] args) {
		HotelRoom ho = new HotelRoom();
		ho.setroomNumber("A229");
		ho.setprice(-200);
		ho.setguestCount(0);
		
		System.out.println(ho.getroomNumber());
		System.out.println(ho.getPrice());
		System.out.println(ho.getguestCount());
	}

}
