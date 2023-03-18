package com.a2;

import java.util.Scanner;

public class Prime_number2 
{
	public static void main(String[] args) 
	{
		int i, flag=0;
		
		Scanner a1= new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int no=a1.nextInt();
		
		for (i = 2; i <= no / 2; ++i) {
			if (no % i == 0) {
				flag=1;
				break;
			}
			
		}
		
			
		if(flag==0) {
			System.out.println("Prime number");
		}
		else{
			System.out.println("Not Prime number");
		}
		
		
	}

}
