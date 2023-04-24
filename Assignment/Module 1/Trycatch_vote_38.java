package com.assignment;

public class Trycatch_vote_38
{
	
		
		static void validate(int age)
		{
			if(age>=18)
			{
				System.out.println("Welcome to vote");
			}
			else
			{
				throw new ArithmeticException("Not valid");
			}
		}
		
		public static void main(String[] args) 
		{
			
			//call static method
			
			validate(15);
			
		}
	

}
