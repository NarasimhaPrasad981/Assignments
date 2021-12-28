package com.thoughtFocus.Threads;

public class TableOfFive implements Runnable{
	@Override
	public void run() {
		int num=5;
		for(int i=1;i<=10;i++) {
			System.out.println(num+"\t*\t"+i+"\t=\t"+num*i);
		}
	}

}
