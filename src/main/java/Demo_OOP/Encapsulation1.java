package Demo_OOP;

//Viết chương trình quản lý tài khoản ngân hàng:
//
//* Tạo class `BankAccount`
//* Có:
//  * `accountName`
//  * `balance`
//  * getter
//* Nếu balance < 0 thì set = 0
//* Tạo method:
//
//  * `showBalance()`

class BankAccount {

    private String accountName;
    private double balance;

    
    
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
              this.balance = balance;
        } else {
            this.balance = 0;
      }  
    }

   
    public String getAccountName() {
        return accountName;
    }

    
    
    public double getBalance() {
        return balance;
    }

  
    
    public void showBalance() {
        System.out.println("acc name: " + accountName);
        System.out.println("Balance: " + balance);
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setAccountName("Khamko");
        b.setBalance(-500);
        b.showBalance();

        
       
    }
}