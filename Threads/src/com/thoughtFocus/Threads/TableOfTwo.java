package com.thoughtFocus.Threads;

public class TableOfTwo extends Thread {
      @Override
      public void run() {
    	  int num=2;
    	  for(int i=1;i<=10;i++) {
    		  System.out.println(num+"\t*\t"+i+"\t=\t"+num*i);
    	  }
      }
}
