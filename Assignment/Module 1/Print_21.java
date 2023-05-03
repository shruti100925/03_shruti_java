package com.assignment;
class Printnumber
{
	void printn(int a) 
	{
		System.out.println(a);

	}
	void printn(float b) 
	{
		System.out.println(b);

	}
	void printn(double c) 
	{
		System.out.println(c);

	}
	void printn(char d) 
	{
		System.out.println(d);
	}
	
}
public class Print_21
{


	public static void main(String[] args)
	{
		Printnumber p=new Printnumber();
		
		p.printn(25);
		p.printn('A');
		p.printn(1000000);
		p.printn(1.5);
		
	}
}
