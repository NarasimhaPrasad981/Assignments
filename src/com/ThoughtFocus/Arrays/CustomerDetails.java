package com.ThoughtFocus.Arrays;

public class CustomerDetails {
	private String Name;
	private int CustomerId;
    private int Age;
    private String City;
    void CustomerDetails(String name,int customerId,int age,String city) {
    	this.Name=name;
    	this.CustomerId=customerId;
    	this.Age=age;
    	this.City=city;
    }
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}    
}
