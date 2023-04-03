package com.assignment;

import java.util.Scanner;

public class Positivenum_8 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int num=sc.nextInt();
		
		if(num < 1000000000 && num>0) 
		{
			int count=0;
			
			while(num != 0) 
			{
				num=num/10;
				++count;
			}
			System.out.println("Number of digits:"+ count);
		}
		else {
			System.out.println("Enter valid number.");
		}
	}

}
