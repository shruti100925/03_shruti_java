package com.a2;

import java.util.Scanner;

public class Arithmetic_Switch {

	public static void main(String[] args) 
	{
		Scanner no=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		System.out.println("A:");
		int a= no.nextInt();
		
		System.out.println("B:");
		int b=no.nextInt();
		 
		System.out.println("Select any from below options. \n1.Addition \n2.Substraction \n3.Multiplication \n4.Division" );
		
		int num=no.nextInt();
		
		switch(num) {
		case 1:
			int c=a+b;
			System.out.println("Addition of numbers="+ c );
			break;
		case 2:
			 c=a-b;
			System.out.println("Subtraction of numbers="+ c );
			break;
		case 3:
			 c=a*b;
			System.out.println("Multiplication of numbers="+ c );
			break;
		case 4:
			 c=a/b;
			System.out.println("Division of numbers="+ c );
			break;
		default: 
			System.out.println("Invalid choice.");
			break;
		}
		
		
	}
}
