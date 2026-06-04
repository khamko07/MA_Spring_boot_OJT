package testclass;


class BankAcc {
	private void test1() {
		System.out.println("This is test 1");
	}
	public void test2() {
		System.out.println("This is test2");
		test1();
	}
}


public class TestPT {
	public static void main(String[] args) {
		BankAcc b = new BankAcc();
		b.test2();
	}

}
