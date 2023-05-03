package com.assignment;
class print
{
	void ab(int a,char b)
	{
		System.out.println(a+""+b);
	}
	void xy(char x,int y)
	{
		System.out.println(x+""+y);
	}
	
}
public class Para_22 
{
	public static void main(String[] args) 
	{
		print p= new print();
		
		p.ab(5, 'A');
		p.xy('B', 2);
	}
}
