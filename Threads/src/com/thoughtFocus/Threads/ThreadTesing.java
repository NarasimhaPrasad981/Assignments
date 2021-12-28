package com.thoughtFocus.Threads;

public class ThreadTesing {

	public static void main(String[] args) {
		TableOfTwo two = new TableOfTwo();
		two.start();
		TableOfFive five = new TableOfFive();
		Thread thread = new Thread(five);
		thread.start();
		

	}

}
