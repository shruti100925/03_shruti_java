package com.a2;

import java.util.Scanner;

public class Nested_if 
{
	public static void main(String[] args) 
	{
		int a=2, b=18, c=16;
	
		if(a>b) {
			if(a>c) {
				System.out.println("MAx is A");
			}
		}
		if(b>c) {
			if(b>a) {
				System.out.println("MAx is B");
			}
		}
		if(c>a) {
			if(c>b) {
				System.out.println("MAx is C");
			}
		}
		
	}
	
}
