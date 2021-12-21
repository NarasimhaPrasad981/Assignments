package Prasad.Constructor;

public class Student {
	String name;
	int rollnum;
	static int count;
	Student(String n){
		name=n;
		rollnum=++count;
	}
	void display() {
		System.out.print("Name="+name);
		System.out.println("\trollnum="+rollnum);
		
	}
	static int getCount() {
		return count;
	}
}
