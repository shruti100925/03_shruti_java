package com.assignment;

import java.util.Scanner;

public class Sum_avg_5 {
	public static void main(String[] args) {
		
		Scanner number=new Scanner(System.in);
		
		int n;
		int m=0;
		System.out.println("Enter any 5 number:");
		
		for(int i=0;i<=4;i++) {
			n=number.nextInt();
			m+=n;
		}
		double avg=m/5;
		System.out.println("Sum="+ m);
		System.out.println("Average="+ avg);
	}
}
