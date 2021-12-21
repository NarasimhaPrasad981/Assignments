package Methodoverloading;

public class OnlineShoping {
	public void payment() {
		System.out.println("payment using debit card");
	}
	public void payment(String Credit) {
		System.out.println("payment using Credit card");
	}
}
