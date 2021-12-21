package EncapsulationTesting;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Email email = new Email();
        email.setNoOfAccounts(2);
        email.setRecievingMail("Hi Prasad...");
        email.setSendingMail("Hi Rajesh..Good morning......");
        System.out.println("NoOfUsers:"+email.getNoOfAccounts());
        System.out.println(""+email.getRecievingMail());
        System.out.println(""+email.getSendingMail());
	}

}
