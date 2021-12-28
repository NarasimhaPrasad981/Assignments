package com.thoughtFocus.bank.dto;

public class AddressDTO {
	private String building;
	private String area;
	private String landMark;
	private String city;
	private String state;
	private int pinCode;

	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "AddressDTO [building=" + building + ", area=" + area + ", landMark=" + landMark + ", city=" + city
				+ ", state=" + state + ", pinCode=" + pinCode + ", getBuilding()=" + getBuilding() + ", getArea()="
				+ getArea() + ", getLandMark()=" + getLandMark() + ", getCity()=" + getCity() + ", getState()="
				+ getState() + ", getPinCode()=" + getPinCode() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
