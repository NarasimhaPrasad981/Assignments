package com.ThoughtFocus.ArrayApplications;

public class Technologies {
	String[] technologies = new String[15];
	private int index = 0;

	public void printAll() {
		for (int index = 0; index < technologies.length; index++) {
			if (technologies[index] != null && technologies[index] !="") {
				System.out.println(technologies[index]);
			}
		}
	}
	public boolean save(String language) {
		if (index < 15) {
			if (language != "") {
				technologies[index] = language;
				index++;
				return true;
			} else {
				System.out.println("Language is not added");
				return false;

			}
		}
		return false;
	}
	public String delete(String language) {
		for (int index = 0; index < technologies.length; index++) {
			if (technologies[index].equals(language)) {
				technologies[index] = "";
				return language + " is deleted";
			}
		}
		return "language not found";

	}
}
