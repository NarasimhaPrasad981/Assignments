package com.ThoughtFocus.Arrays;

public class Customer {
      CustomerDetails[] customerDetails = new customerDetails[4];
      int index=0;
      public void addElements(CustomerDetails details) {
    	  customerDetails[index]=details;
    	  index++;
      }
      
}
