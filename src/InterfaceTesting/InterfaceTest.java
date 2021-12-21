package InterfaceTesting;

public class InterfaceTest {

	public static void main(String[] args) {
        HdfcBankAccount hdfc = new HdfcBankAccount();
        SbiBank sbi = new SbiBank();
//        Atm atm = new Atm();
//        atm.slot(hdfc);
//        atm.slot(sbi);
//        atm.slot1(sbi);
        sbi.PayingBill();
        sbi.Withdraw();
        sbi.Deposit();
        hdfc.Withdraw();
        hdfc.Deposit();
        
        }

}
