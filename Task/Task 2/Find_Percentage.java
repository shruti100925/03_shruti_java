package com.a2;

import java.util.Scanner;

public class Find_Percentage {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter given below marks.");
		
		System.out.println("English:");
		int sub1=sc.nextInt();
		
		System.out.println("Maths");
		int sub2=sc.nextInt();
		
		System.out.println("Gujarati");
		int sub3=sc.nextInt();
		
		System.out.println("Hindi");
		int sub4=sc.nextInt();
		
		System.out.println("Social science");
		int sub5=sc.nextInt();
		
		double total=sub1+sub2+sub3+sub4+sub5;
		
		double per= (total/500)*100;
		
		System.out.println("Percentage: "+ per);
		
		if(per>=75) {
			System.out.println("Distinction");
		}
		else if(per>=60) {
			System.out.println("First class");
		}
		else if(per>=50) {
			System.out.println("Second class");
		}
		else if(per>=35) {
			System.out.println("Pass class");
		}
		else {
			System.out.println("Fail");
		}
	}

}
