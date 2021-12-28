package com.thoughtFocus.bank.dto;
import java.util.List;

public class AccountHolderDTO {
	private String name;
	private long accountNumber;
	private String iFSC;
	private String eMail;
	private long contactNumber;
	private float balance;
	private AddressDTO address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getiFSC() {
		return iFSC;
	}
	public void setiFSC(String iFSC) {
		this.iFSC = iFSC;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "AccountHolderDTO [name=" + name + ", accountNumber=" + accountNumber + ", iFSC=" + iFSC + ", eMail="
				+ eMail + ", contactNumber=" + contactNumber + ", balance=" + balance + ", addressDTO=" + address
				+ ", getName()=" + getName() + ", getAccountNumber()=" + getAccountNumber() + ", getiFSC()=" + getiFSC()
				+ ", geteMail()=" + geteMail() + ", getContactNumber()=" + getContactNumber() + ", getBalance()="
				+ getBalance() + ", getAddressDTO()=" + getAddress() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}	
	