package com.assignment;

public class Area_23 
{
	static int sq(int s) {
		
		return s*s;
	}
	static int rect(int h,int b) {
		
		return (h*b)/2;
	}
	
	public static void main(String[] args) {
		
		System.out.println(rect(4,5));
		System.out.println(sq(12));
	}
}
