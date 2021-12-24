package com.ThoughtFocus.TraineeDetails;

public class TraineeDetailsTest {

	public static void main(String[] args) {
		TraineeDetails details1 = new TraineeDetails();
		TraineeDetailsDa da = new TraineeDetailsDa();
		details1.setId(106581);
		details1.setName("Prasad");
		details1.setNumber(799760609);
		da.save(details1);
		da.printAll();
		TraineeDetails details2 = new TraineeDetails();
		details2.setId(106582);
		details2.setName("Rajesh");
		details2.setNumber(807457570);
		da.save(details2);
		da.printAll();
		TraineeDetails details3 = new TraineeDetails();

		details3.setId(106587);
		details3.setName("venkatesh");
		details3.setNumber(768083837);

		String saveDetails = da.save(details2);

		System.out.println(saveDetails);
		String deleteByIdStatus = da.deleteById(106587);
		System.out.println(deleteByIdStatus);
		da.printAll();

		String deleteByNameStatus = da.deleteByName("Rajesh"); 
		System.out.println(deleteByNameStatus);
		da.printAll();
		da.updateEmployeeId(106581, 1065110);
		da.printAll();
		da.updateName("Prasad", "Narasimha prasad");
		da.updateEmployeeMobile(799760609, 799760608);

		da.printAll();

	}


}
