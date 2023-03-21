package com.assignment;

import java.util.Scanner;

public class greatestnumber_1 
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		System.out.println("Num 1:");
		int no1=sc.nextInt();
		
		System.out.println("Num 2:");
		int no2=sc.nextInt();
		
		System.out.println("Num 3:");
		int no3=sc.nextInt();
		
		if(no1>no2&&no1>no3) {
			System.out.println("Max number 1 is "+no1);
			
		}
		if(no2>no1&&no2>no3) {
			System.out.println("Max number 2 is "+no2);
			
		}
		if(no3>no1&&no3>no2) {
			System.out.println("Max number 3 is "+no3);
		}
		
		
		
	}

}
