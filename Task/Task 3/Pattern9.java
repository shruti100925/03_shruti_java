package com.a3;

public class Pattern9 
{
	public static void main(String[] args) 
	{
		int count=1;
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			
			System.out.print("\n");
		}

	}

}
