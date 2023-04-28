package com.assignment;

class Bankbalance
{
	void getbalance()
	{
		
	}
}
class BankA extends Bankbalance
{
	void getbalance()
	{
		System.out.println("$100");
	}
}
class BankB extends Bankbalance
{
	void getbalance()
	{
		System.out.println("$150");
	}
}
class BankC extends Bankbalance
{
	void getbalance()
	{
		System.out.println("$200");
	}
}




public class Bankbalance_30
{
	public static void main(String[] args) 
	{
		
		Bankbalance a; 
		
		a =new BankA();
		a.getbalance();
		a=new BankB();
		a.getbalance();
		a=new BankC();
		a.getbalance();
		
		
	}

}
