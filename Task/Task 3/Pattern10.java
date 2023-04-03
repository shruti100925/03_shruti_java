package com.a3;

public class Pattern10 
{
	public static void main(String[] args)
	{

		int count=1;
		
		for(int i=1;i<=5;i++) 
		{
			
			for(int j=1;j<=i;j++) 
			{
				
				if (count == 1)
				{
					count = 0;
				}
				else
				{
					count = 1;
				}
				System.out.print(count);
			}
			
			System.out.print("\n");
		}
	}

}
