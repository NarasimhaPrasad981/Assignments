package BankAccountDetails;

public class BankAccountDetails {
		public int savingAmount;
		public int depositAmount;
		public int withdrawAmount;
		public int fixedAmount;
		
		public void saving(int savingAmount) {
			System.out.println("savings amount is: "+savingAmount);
		}
		public void deposit(int depositAmount) {
			System.out.println("deposit amount is: "+depositAmount);
		}
		public void withdraw(int withdrawAmount) {
			System.out.println("withdraw amount is: "+withdrawAmount);
		}
		public void fixed(int fixedAmount) {
			System.out.println("fixed amount is: "+fixedAmount);
		}
		public void deleteAccount() {
			System.out.println("Person account is deleted...");
		}
}


