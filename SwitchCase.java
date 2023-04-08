package com.java;

public class SwitchCase {

	public static void main(String[] args) {
		 Double isPresent=Math.random()*3;
		 int empwage=20; 
		 switch(isPresent)
		 {
		 case 1:(isPresent<0);
			 System.out.println("Employee is present");
			 empwage=empwage*8;
			 break;
			 
		 case 2:(isPresent>0 && isPresent<1);
			 System.out.println("Employee worked half time");
		     empwage=empwage*4;
		     break;
		     
		 case 3:(isPresent>1);
		 System.out.println("Employee is absent");
		 empwage=empwage*0;
		 break;
		 
		 }

	}

}
