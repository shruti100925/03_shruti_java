package com.a2;

import java.util.Scanner;

public class Area 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose from below");
		System.out.println("1.Area of Triangle \n2.Area of Reactangle \n3.Area of circle");
		int choice=sc.nextInt();
		
		if(choice==1) {
		
		System.out.println("Enter Base:");
		int b=sc.nextInt();
		System.out.println("Height");
		int h=sc.nextInt();
		int area=(b*h)/2;
		System.out.println("Area="+area);
		}
		if(choice==2) {
			System.out.println("Enter width:");
			int w=sc.nextInt();
			System.out.println("Height");
			int h=sc.nextInt();
			int area= h*w;
			System.out.println("Area="+area+" mtrsq");
		}
		if(choice==3) {
			System.out.println("Enter radius");
			int r=sc.nextInt();
			double area=3.14*r*r;
			System.out.println("Area="+area);
		}
	
	}
}
