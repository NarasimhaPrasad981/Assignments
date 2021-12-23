package com.ThoughtFocus.ArrayApplications;

public class Months {
	private String []months = new String[12];
	private int index = 0;
	public void printAll() {
		for(int index=0;index<months.length;index++) {
			if(months[index]!=null) {
				System.out.println(months[index]);
			}
		}
	}
	public boolean save(String month) {
		if(index<12) {
			if(month!="") {
			     months[index]=month;
			     index++;
			     return true;
		    }else {
			     System.out.println("month is not added");
			     return false;
		    }     
		}
	    return false;
	}
	public String delete(String month) {
		for (int index = 0; index < months.length; index++) {
			if (months[index].equals(month)) {
				months[index] = null;
				return month + " is deleted";
			}
		}
		return "Month not found";
	}	
	
}
