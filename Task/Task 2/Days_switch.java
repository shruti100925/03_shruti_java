package com.a2;

import java.util.Scanner;

public class Days_switch {
	
		public static void main(String[] args) 
		{
			Scanner sc =new Scanner(System.in);
			System.out.print("Enter the days:");
			int day=sc.nextInt();
			switch(day)
			{
			case 1: 
	            System.out.println("Monday");
	            break;
			case 2: 
	            System.out.println("Monday\nTuesday");
	            break;
			case 3: 
	            System.out.println("Monday\nTuesday\nWednesday");
	            break;
			case 4: 
	            System.out.println("Monday\nTuesday\nWednesday\nThursday");
	            break;
			case 5: 
	            System.out.println("Monday\nTuesday\nWednesday\nThursday\nFriday");
	            break;
			case 6: 
	            System.out.println("Monday\nTuesday\nWednesday\nThursday\nFriday\nSaturday");
	            break;
			case 7: 
	            System.out.println("Monday\nTuesday\nWednesday\nThursday\nFriday\nSaturday\nSunday");
	            break;
			default:
				System.out.println("Invalid Choice\n");
				break;
	        
			}
			
		}
	
}
