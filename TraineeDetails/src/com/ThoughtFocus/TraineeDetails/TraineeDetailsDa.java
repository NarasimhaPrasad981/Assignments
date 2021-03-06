package com.ThoughtFocus.TraineeDetails;

public class TraineeDetailsDa {
	private TraineeDetails[] details = new TraineeDetails[12];
	private int index = 0;

	public void printAll() {
		for (int index = 0; index < details.length; index++) {
			if (details[index] != null) {
				System.out.println(details[index]);
			}
		}
	}

	public String save(TraineeDetails EmployeeDetails) {
		if (EmployeeDetails.getName() != null && EmployeeDetails.getId() != 0) {
			details[index] = EmployeeDetails;
			index++;
			return "Employee Details is saved";
		}
		return "Employee details is not saved";
	}

	public String deleteByName(String name) {
		for (int index = 0; index < details.length; index++) {
			if (details[index] != null) {
				if (name.equals(details[index].getName())) {
					details[index] = null;
					return "employee details is deleted";
				}
			}
		}
		return "employee details is not deleted";

	}

	public String deleteById(int id) {
		for (int index = 0; index < details.length; index++) {
			if (details[index] != null) {
				if (id == details[index].getId()) {
					details[index] = null;
					return "employee details were deleted";
				}
			}
		}
		return "employee details were not deleted";
	}

	public String updateName(String oldName, String newName) {
		for (int index = 0; index < details.length; index++) {
			if (details[index] != null) {
				if (details[index].getName().equals(oldName)) {
					details[index].setName(newName);
					return "details updated";
				}
			}
		}
		return "Details not updated";
	}

	public String updateEmployeeId(int oldId, int newId) {
		for (int index = 0; index < details.length; index++) {
			if (details[index] != null) {
				if (oldId == details[index].getId()) {
					details[index].setId(newId);
					return "updated Id number";
				}
			}
		}
		return "Id is not updated";
	}

	public String updateEmployeeMobile(long oldNumber, long newNumber) {
		for (int index = 0; index < details.length; index++) {
			if (details[index] != null) {
				if (oldNumber == details[index].getNumber()) {
					details[index].setNumber(newNumber);
					return "phone number is updated..";
				}
			}
		}
		return "phone number is updated..";
	}

}


