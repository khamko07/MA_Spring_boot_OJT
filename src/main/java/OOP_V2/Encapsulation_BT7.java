package OOP_V2;

class Product{
	private String productName;
	private int price;
	
	public void setproductName(String productName) {
		this.productName = productName;
	}
	
	public void setPrice(int price) {
		if (price >= 0) {
			this.price = price;
		} else {
			this.price = 0;
		}
			
	}
	
	public String getproductName(){
		return productName;
	}
	
	public int getPirce() {
		return price;
	}
}


public class Encapsulation_BT7 {
	public static void main(String[] args) {
		Product p = new Product();
		p.setproductName("Iphone");
		p.setPrice(-2000);
		
		System.out.println(p.getproductName());
		System.out.println(p.getPirce());
	}

}
