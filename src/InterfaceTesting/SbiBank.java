package InterfaceTesting;

public class SbiBank implements DebitCard,CreditCard{
	@Override
	public void Withdraw() {
		System.out.println("Withdraw a Amount in Sbi bank");
	}
	@Override
    public void Deposit() {
		System.out.println("Deposit a Amount Sbi bank");
	}
	@Override
    public void PayingBill() {
    	System.out.println("Paying bills using credit card");
    }
}
