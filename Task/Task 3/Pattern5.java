package com.a3;

public class Pattern5 
{

	public static void main(String[] args)
	{
		int j;
		for(int i=1;i<=5;i++) 
		{
			
			for( j=0;j!=(5-i);j++) 
			{
				System.out.print(" ");
			}
			
			for(int k=5;k>j;k--) 
			{
				
				System.out.print(k-j);
			
			}
			System.out.print("\n");
		}
	}
}
