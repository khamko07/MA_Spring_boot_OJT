package BASIC;
class BankAccount {
       String ownerName;
       double balance;
       
       void deposit(double money) {
    	   balance = balance + money;
    	   System.out.println("Deposit successful");
       }
       
       void withdraw(double money) {
    	   balance = balance - money;
    	   System.out.println("Withdraw successful");
       }
       
       void showBalance() {
    	   System.out.println("Balance Owner " + ownerName);
    	   System.out.println("Balance " + balance);
       }
}


public class BT8 {
	public static void main(String[] args) {
		BankAccount acc = new BankAccount();

        // กำหนดข้อมูลเริ่มต้น
        acc.ownerName = "Khamko";
        acc.balance = 1000;

        // ฝากเงิน 1000
        // money = 1000 (ชั่วคราว)
        acc.deposit(1000);

        // ถอนเงิน 500
        // money = 500 (ชั่วคราว)
        acc.withdraw(500);

        // แสดงยอดล่าสุด
        acc.showBalance();
	}

}
