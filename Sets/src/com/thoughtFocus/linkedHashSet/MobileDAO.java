package com.thoughtFocus.linkedHashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class MobileDAO implements Mobile {
	
	private Set<MobileDTO> dtos = new LinkedHashSet<MobileDTO>();

	@Override
	public boolean add(MobileDTO dto) {
		if(dto != null) {
			if(dtos.add(dto)) {
				return true; 
			}
		}
		return false;
	}



	@Override
	public void getAll() {
		System.out.println("--------All device list--------");
		for(MobileDTO detail : dtos) {
			System.out.println(detail);
		}

	}

	@Override
	public MobileDTO deleteByPrice(int price) {
		boolean key = false;
		for(MobileDTO status:dtos) {
			if(status.getPrice()==price) {
				System.out.println("price deleted");
				dtos.remove(status);
				key = true;
			}

		}
		if(!key) {
			throw new PriceNotFoundException();
		}

		return null;
	}

	@Override
	public MobileDTO updateByMobileID(int oldMobileId,int newMobileId) {
		for(MobileDTO status:dtos) {
			if(status.getMobileID()==oldMobileId) {
				status.setSerialNumber(newMobileId);

			}
			else {
				throw new MobileIDNotFoundException();
			}
		}


		return null;
	}

	@Override
	public void getAllByModelName(String modelName) {
		for(MobileDTO details:dtos) {
			if(details.getModelName().equals(modelName)) {
				System.out.println(details);
				return;
			}
		}

		throw new ModelNameNotFoundException();

	}

}


