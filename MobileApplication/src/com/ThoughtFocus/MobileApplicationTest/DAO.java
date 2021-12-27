package com.ThoughtFocus.MobileApplication;

public class DAO extends Mobile{
	DTO[] Dto = new DTO[10];
	private int index = 0;

	@Override
	public void add(DTO dto) {
		if (dto.getMobileId() != 0 && dto.getSerialNumber() != 0) {
			Dto[index] = dto;
			index++;
		}
	}

	@Override
	public void getAll() {
		for (int index = 0; index < Dto.length; index++) {
			if (Dto[index] != null) {
				System.out.println(Dto[index]);
			}
		}
	}

	@Override
	public void getAllByBrandName(String brandName) {
		for (int index = 0; index < Dto.length; index++) {
			if (Dto[index] != null) {
				if (Dto[index].getBrandName().equals(brandName)) {
					System.out.println(Dto[index]);
				}
			}

		}

	}

	@Override
	public DTO deleteByMobileID(long mobileId) {
		for (int index = 0; index < Dto.length; index++) {
			if (Dto[index] != null) {
				if (Dto[index].getMobileId() == mobileId) {
					DTO obj = Dto[index];
					Dto[index] = null;
					return obj;
				}
			}
		}
	}

	@Override
	public DTO updateBySerialNumber(long oldSerailNumber, long newSerailNumber) {
		for (int index = 0; index < Dto.length; index++) {
			if (Dto[index] != null) {
				if (Dto[index].getSerialNumber() == oldSerailNumber) {
					Dto[index].setSerialNumber(newSerailNumber);
					DTO updated = Dto[index];
					return updated;
				}
			}
		}
	}

}


