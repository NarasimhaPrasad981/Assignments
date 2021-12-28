package com.thoughtFocus.bank.dao;
import java.util.ArrayList;
//import com.thoughtFocus.bank.dto.*;
import java.util.List;

import com.thoughtFocus.bank.dto.AccountHolderDTO;

public class AccountHolderDAO {
   private List<AccountHolderDTO> dtos = new ArrayList<AccountHolderDTO>();
	
	public String save(AccountHolderDTO dto) {
		boolean isSaved = dtos.add(dto);
		if(isSaved) {
			return "Data saved";
		}else {
			return "Data not saved";
		}
		
	}
	public AccountHolderDTO getByName(String name) {
		for(int index=0;index<dtos.size();index++) {
			if(dtos.get(index).getName().equals(name)) {
				return dtos.get(index);
			}
		}
		return null;
	}
	public String deleteByName(String name) {
		for (int index = 0; index < dtos.size(); index++) {
			if(dtos.isEmpty()) {
				if (dtos.get(index).getName().equals(name)) {
					dtos.remove(index);					
				}
			}
		}
		return "Name is deleted";
	}
	public String updateByeMail(String oldMail,String newMail) {
		for (int index = 0; index < dtos.size(); index++) {
			if(dtos.isEmpty()) {
				if (dtos.get(index).geteMail().equals(oldMail)) {
					dtos.get(index).seteMail(newMail);
				}
			}	
		}
		return "eMail is updated";
	}
	public void printAll() {
		for(int index=0;index<dtos.size();index++) {
			System.out.println(dtos.get(index));

		}
	}
	public AccountHolderDTO updatePinCodeByArea(String area,int pinCode) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index).getAddress().getArea()==area) {
				dtos.get(index).getAddress().setPinCode(pinCode);
				return dtos.get(index);
					
			}
		}
		return null;
	}
//	public boolean equals(AccountHolderDTO dto) {
//	    if(!this.getAccountNumber().equals(dto.getaccountNumber()))    {
//	        return false;
//	    }
//	}
	public float getCurrentBalance(long accountNumber) {
		for(int index=0;index<dtos.size();index++) {
			if(dtos.get(index).getAccountNumber()==(accountNumber)) {
				return dtos.get(index).getBalance();
			}
		}
		return 0;
	}
	public float deposit(float amount,long accountNumber) {
		for(int index=0;index<dtos.size();index++) {
			if(dtos.get(index).getAccountNumber()==(accountNumber)) {
				float previousBalance = dtos.get(index).getBalance();
				float newBalance = previousBalance + amount;
				dtos.get(index).setBalance(newBalance);
				return newBalance;
				
			}
		}
		return 0;
		
	}
	public float withdraw(float amount, long accountNumber) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index).getAccountNumber() == accountNumber) {
				if (dtos.get(index).getBalance() > amount) {
					float currentBalance = dtos.get(index).getBalance() - amount;
					dtos.get(index).setBalance(currentBalance);
					return currentBalance;
				}
			}
		}
		return 0.00f;
	}
}
		

