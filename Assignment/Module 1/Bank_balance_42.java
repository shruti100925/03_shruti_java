package com.assignment;

import java.util.Scanner;

public class Bank_balance_42 
{

	int balance;
	
	class Exceptioninsufficientbalance extends Exception
	{
	public Exceptioninsufficientbalance(String message ) 
	{
		// TODO Auto-generated constructor stub
		super(message);
		
	}
	}
	public Bank_balance_42(int balance) 
	{
		// TODO Auto-generated constructor stub
		this.balance=balance;
	}


	void withdraw(int amount) throws Exceptioninsufficientbalance
	{
		if (amount > balance) 
    	{
			int a=amount-balance;
            throw new Exceptioninsufficientbalance("Insufficient balance, you need more "+a+"Rs to perform this transaction");
        }
    	
    	  
          System.out.println("Amount"+amount+"has been withdrawn successfully.");
	}
	
	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount to withdraw");
		int amount= sc.nextInt();
		Bank_balance_42 a=new Bank_balance_42(2000);
		
			try 
			{
				a.withdraw(amount);
			}
			catch(Exception e)
			{
				  System.out.println(e.getMessage());
				  
			}
		
	}
}
