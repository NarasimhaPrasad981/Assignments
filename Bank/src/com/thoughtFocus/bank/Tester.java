package com.thoughtFocus.bank;
import com.thoughtFocus.bank.dao.AccountHolderDAO;
import com.thoughtFocus.bank.dto.*;
import com.thoughtFocus.bank.dto.AccountHolderDTO;

public class Tester {

	public static void main(String[] args) {
		AccountHolderDAO dao = new AccountHolderDAO();
		AccountHolderDTO dto = new AccountHolderDTO();
		AddressDTO aDto = new AddressDTO();
		dto.setName("Prasad");
		dto.setAccountNumber(335114295);
		dto.setContactNumber(807457570);
		dto.seteMail("narasimhaprasad981@gmail.com");
		dto.setiFSC("SBIN000977");
		aDto.setBuilding("1/44A");
		aDto.setArea("Nehru Nagar");
		aDto.setLandMark("shiva Temple main street");
		aDto.setCity("Jammalamadgu");
		aDto.setState("Andhra pradesh");
		aDto.setPinCode(516343);
		dto.setAddress(aDto);
		
		dao.save(dto);
		AccountHolderDTO dto2 = dao.getByName("Prasad");
		System.out.println(dto2);
		
		AccountHolderDTO dto1 = new AccountHolderDTO();
		AddressDTO aDto1 = new AddressDTO();
		dto1.setName("Sunil");
		dto1.setAccountNumber(34567891);
		dto1.setContactNumber(987654321);
		dto1.seteMail("saisunil765@gmail.com");
		dto1.setiFSC("SBIN000977");
		aDto.setBuilding("3/44B");
		aDto.setArea("Gandhi Nagar");
		aDto.setLandMark("main road");
		aDto.setCity("Amirpate");
		aDto.setState("telangana");
		aDto.setPinCode(516344);
		dto.setAddress(aDto1);
		
		String saveStatus = dao.save(dto);
		System.out.println(saveStatus);
		dao.save(dto1);
		AccountHolderDTO dto3 = dao.getByName("Sunil");
		System.out.println(dto3);
		
		AccountHolderDTO getByName = dao.getByName("Prasad"); 
		System.out.println(getByName);
		
		String updatedemail = dao.updateByeMail("narasimhaprasad981@gmail.com","badiginchala.narasimhaprasad@thoughtfocus.com");
		System.out.println(updatedemail);
		
		String deletedName = dao.deleteByName("Sunil");
		System.out.println(deletedName);
		
		AccountHolderDTO updatedpincode = dao.updatePinCodeByArea("Gandhi Nagar", 526434);
		System.out.println(updatedpincode);
		
		float balanceCheck = dao.getCurrentBalance(6387538);
		System.out.println(balanceCheck);
	
		
		float amountDeposit = dao.deposit(5000, 6387538);
		System.out.println(amountDeposit);

		float amountDebited = dao.withdraw(10000, 6387538);
		System.out.println(amountDebited);

		dao.printAll();
		

	}

}
