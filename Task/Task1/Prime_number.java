package com.a1;

public class Prime_number {
	
	public static void main(String[] args) {
		
		int no=22,i,flag=0;
		
		
		
		for (i = 2; i <= no / 2; ++i) {
			if (no % i == 0) {
				flag=1;
				break;
			}
			
		}
		
			
		if(flag==0) {
			System.out.println("Prime number");
		}
		else{
			System.out.println("Not Prime number");
		}
		
	}

}
