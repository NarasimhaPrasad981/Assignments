package com.ThoughtFocus.ArrayApplications;

public class MonthTest {

	public static void main(String[] args) {
		Months month = new Months();
		month.save("January");
		month.save("February");
		month.save("March");
		month.save("April");
		month.save("May");
		month.save("June");
		month.save("July");
		month.save("August");
		month.save("September");
		month.save("october");
		month.save("November");
		month.save("December");
		month.save("thoughtfocus");
		month.printAll();
		String status = month.delete("December");
		String status1 = month.delete("october");
		String status2 = month.delete("November");
		System.out.println(status);
		System.out.println(status1);
		System.out.println(status2);
		month.printAll();
	}
}
