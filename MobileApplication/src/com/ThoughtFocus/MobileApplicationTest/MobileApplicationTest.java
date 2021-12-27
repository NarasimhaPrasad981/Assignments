package com.ThoughtFocus.MobileApplication;

public class MobileApplicationTest {

	public static void main(String[] args) {
		DAO dao = new DAO();

		DTO dto = new DTO();
		DTO dto1 = new DTO();

		dto.setMobileId(123456789l);
		dto.setBrandName("OPPO");
		dto.setMemory(32);
		dto.setModelName("OPPO f11");
		dto.setNoOfCamera((byte) 2);
		dto.setPrice(20000);
		dto.setSerialNumber(987654321l);

		dto1.setMobileId(123458789l);
		dto1.setBrandName("Vivo");
		dto1.setMemory(32);
		dto1.setModelName("Vivo V20 pro max");
		dto1.setNoOfCamera((byte) 2);
		dto1.setPrice(20000);
		dto1.setSerialNumber(987698321l);

		dao.add(dto); 
		dao.add(dto1);

		dao.getAll();

		dao.getAllByBrandName("OPPO f11");

	}
}
