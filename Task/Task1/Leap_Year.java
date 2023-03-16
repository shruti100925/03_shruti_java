package com.a1;

public class Leap_Year 
{
	public static void main(String[] args) {
		
		int year =2001;
		
		if(year % 400==0) {
			
			System.out.println("Leap year.");
		}
		
		else if((year % 4 == 0)&&(year % 100 != 0)){
			
			System.out.println("Not Leap year.");
			
		}
		else {
			System.out.println("Not a Leap year");
		}
	}

}
