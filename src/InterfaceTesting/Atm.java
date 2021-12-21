package InterfaceTesting;

public class Atm {
	void slot(DebitCard debitCard) {
		debitCard.Withdraw();
		debitCard.Deposit();
	}
	void slot1(CreditCard creditCard) {
		creditCard.PayingBill();
	}

}
