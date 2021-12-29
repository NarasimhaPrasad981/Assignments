package com.thoughtFocus.linkedHashSet;

public interface Mobile {
	boolean add(MobileDTO dto);
	void getAll();
	MobileDTO deleteByPrice(int price);
	void getAllByModelName(String modelName);
	MobileDTO updateByMobileID(int oldMobileId,int newMobileId);

}
