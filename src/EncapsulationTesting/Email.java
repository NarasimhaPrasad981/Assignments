package EncapsulationTesting;

public class Email {

	public int getNoOfAccounts() {
		return NoOfAccounts;
	}
	public void setNoOfAccounts(int noOfAccounts) {
		NoOfAccounts = noOfAccounts;
	}
	
	public String getSendingMail() {
		return SendingMail;
	}

	public void setSendingMail(String sendingMail) {
		SendingMail = sendingMail;
	}
	public String getRecievingMail() {
		return RecievingMail;
	}
	public void setRecievingMail(String recievingMail) {
		RecievingMail = recievingMail;
	}
	private int NoOfAccounts;
	private String SendingMail;
	private String RecievingMail;
	public void Email() {
		
	}

}
