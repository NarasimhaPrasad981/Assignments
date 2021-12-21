package InterfaceTesting;

public class HdfcBankAccount implements DebitCard,CreditCard{
	@Override
	public void Withdraw() {
		System.out.println("withdraw a Amount in Hdfc bank");
	}
    @Override
    public void Deposit() {
		System.out.println("Deposit a Amount in Hdfc bank");
	}
    @Override
    public void PayingBill() {
    	System.out.println("Paying bills using credit card");
    }
}
