package com.ThoughtFocus.MobileApplication;
public abstract class Mobile {
		abstract public void add(DTO dto);

		abstract public void getAll();

		abstract public void getAllByBrandName(String brandName);

		abstract public DTO deleteByMobileID(long mobileId);

		abstract public DTO updateBySerialNumber(long oldSerailNumber, long newSerailNumber);
}
