package com.thoughtFocus.linkedHashSet;

public class MobileDTO {
	private int mobileID;
	private String modelName;
	private String brandName;
	private int serialNumber;
	private int noOfcamera;
    private double price;
	private int memory;
	public int getMobileID() {
		return mobileID;
	}
	public void setMobileID(int mobileID) {
		this.mobileID = mobileID;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public int getNoOfcamera() {
		return noOfcamera;
	}
	public void setNoOfcamera(int noOfcamera) {
		this.noOfcamera = noOfcamera;
	}
	@Override
	public String toString() {
		return "MobileDTO [mobileID=" + mobileID + ", modelName=" + modelName + ", price=" + price + ", memory="
				+ memory + ", brandName=" + brandName + ", serialNumber=" + serialNumber + ", noOfcamera=" + noOfcamera
				+ "]";
	}

}
