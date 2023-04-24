package com.assignment;
import java.util.Scanner;
public class Factorial_32
{
	 public static void main(String args[])
	 {
	    Factorial_32 a= new Factorial_32();
	    a.factorial();
		 
	     
	 }
	 
	 void factorial()
	 {
		 int i, fact=1, number;
	       
		 System.out.println("Enter the number to which you need to find the factorial:");
	     Scanner sc = new Scanner(System.in);
	     number = sc.nextInt();

	      for(i = 1; i<=number; i++)
	      {
	            fact = fact * i;
	      }
	      System.out.println("Factorial of the given number is:: "+fact);
	         
	 }
	   
}


