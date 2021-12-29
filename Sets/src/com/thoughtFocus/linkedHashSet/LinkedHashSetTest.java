package com.thoughtFocus.linkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
        MobileDAO dao = new MobileDAO();
		
		MobileDTO dto = new MobileDTO();
		dto.setBrandName("oppo f11");
		dto.setMemory(16);
		dto.setMobileID(2365);
		dto.setModelName("7A");
		dto.setNoOfcamera(4);
		dto.setSerialNumber(12);
		dto.setPrice(20000);
		dao.add(dto);
		
		
		MobileDTO dto1 = new MobileDTO();
		dto1.setBrandName("oneplus");
		dto1.setMemory(4);
		dto1.setMobileID(9874);
		dto1.setModelName("10B");
		dto1.setNoOfcamera(4);
		dto1.setPrice(70000);
		dto1.setSerialNumber(10);
		dao.add(dto1);
		dao.getAll();
		
		dao.updateByMobileID(2365, 5974);//updating mobile id
		dao.getAll();
		
		dao.deleteByPrice(20000);//deleting the price
		dao.getAll();
		
		try {
			dao.getAllByModelName("10B");
			}
			catch(ModelNameNotFoundException e){
				System.out.println(e.getMessage());

			}
			dao.getAll();

	}

}
