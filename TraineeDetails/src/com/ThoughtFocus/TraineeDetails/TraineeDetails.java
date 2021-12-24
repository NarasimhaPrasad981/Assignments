package com.ThoughtFocus.TraineeDetails;

public class TraineeDetails {
	private int id;
	private String name;
	private long Number;

	public TraineeDetails() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNumber() {
		return Number;
	}

	public void setNumber(long number) {
		this.Number = number;
	}

	@Override
	public String toString() {
		return "TraineeDetails [id=" + id + ", name=" + name + ", phoneNumber=" +Number + "]";
	}

}


